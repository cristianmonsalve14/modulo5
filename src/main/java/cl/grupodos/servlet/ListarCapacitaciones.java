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
 * Servlet implementation class ListarCapacitaciones
 */
@WebServlet("/ListarCapacitaciones")
public class ListarCapacitaciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCapacitaciones() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		Cookie[] cookies = request.getCookies();
		
		HttpSession session = request.getSession();
		
		
		String tipoCurso = (String) session.getAttribute("tipoCurso");
		String fecha = (String) session.getAttribute("fecha");
		String lugar = (String) session.getAttribute("lugar");
	
		
		
		pw.println("<html><body>");
		pw.println("<h1> Listado de Capacitaciones </h1>");
		
		for (Cookie ck: cookies) {		
			pw.println("<p>" + ck.getName() + " " + ck.getValue()+ "</p>");
	    	}
		
		pw.println("<p> Capacitacion: " + tipoCurso + "</p>");
		pw.println("<p> Fecha: " + fecha + "</p>");	
		pw.println("<p> Lugar: " + lugar + "</p>");
		
		for(String nom: ListaCapacitacion.getInstance().getList()) {
			pw.println("<p> capacitaciones creadas: " + nom + "</p>");
		}
		
			
		pw.println("</body><html>");
			
		pw.close();	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
