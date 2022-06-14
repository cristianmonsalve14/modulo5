package cl.grupodos.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.grupodos.lista.ListaCapacitacion;

/**
 * Servlet implementation class CrearCapacitacion
 */
@WebServlet("/CrearCapacitacion")
public class CrearCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/views/Capacitacion.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String nombre = request.getParameter("nombre"); 
		String apellido = request.getParameter("apellido");
		String email = request.getParameter("email");
		String tipoCurso = request.getParameter("tipoCurso");
		String fecha = request.getParameter("fecha");
		String lugar = request.getParameter("lugar");
		
		ListaCapacitacion.getInstance().getList().add(tipoCurso);
		ListaCapacitacion.getInstance().getList().add(fecha);
		ListaCapacitacion.getInstance().getList().add(lugar);
		
		Cookie cNombre = new Cookie ("nombre", nombre);
		Cookie cApellido = new Cookie ("apellido", apellido);
		Cookie cEmail = new Cookie ("email", email);
		
		
		HttpSession session = request.getSession();
		
		session.setAttribute("tipoCurso", tipoCurso);
		session.setAttribute("fecha", fecha);
		session.setAttribute("lugar", lugar);
		
		
		response.addCookie(cNombre);
		response.addCookie(cApellido);
		response.addCookie(cEmail);
		
				
		pw.println("<html><body>");
		pw.println("<h1>Capacitacion Creada </h1>");		
		pw.println("<p> Nombre y Apellido: "+ nombre + " " + apellido  + "</p>");
		pw.println("<p> Email: "+  email + "</p>");
		pw.println("<p>Nombre Capacitacion: "+ tipoCurso + "</p>");
		pw.println("<p> Fecha a Realizar: "+ fecha + "</p>");
		pw.println("<p> Lugar: "+ lugar + "</p>");
		pw.println("<p>"+ "Su capacitacion fue agregada exitosamente" +"</p>");
		pw.println("</body><html>");
		
		pw.close();
	}

}
