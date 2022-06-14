package cl.grupodos.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Contacto
 */
@WebServlet("/Contacto")
public class Contacto extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contacto() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/views/Formulario.html").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String nombre = request.getParameter("nombres"); 
		String apellido = request.getParameter("apellidos");
		String email = request.getParameter("email");
		
		PrintWriter salida;
		response.setContentType("text/html");
		salida = response.getWriter();
		
		salida.println("<html><body>");
		salida.println("<h1> Contacto </h1>");
		salida.println("<p> Sr/a: "+nombre+ " " +apellido+ " "  +"</p>");
		salida.println("<p> Correo electronico: "+ email +"</p>");
		salida.println("<spam>"+ "Gracias por comunicarte con nosotros, a la brevedad nos comunicaremos contigo" +"</spam>");
		salida.println("</body><html>");
		
		salida.close();
	}

}
