package cl.grupodos;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Validacion
 */
@WebServlet("/Validacion")
public class Validacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Validacion() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/views/validacion.html").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (PrintWriter out = response.getWriter()){
			String usuario = "admin";
            String clave = "1234";
            String user=request.getParameter("usuario");
            String pass=request.getParameter("clave");
            
            if(user.length() > 0){
                if( usuario.equals(user)){
                    if(pass.length() > 0){
                        if(pass.equals(clave)){                           
                            out.println("<script>alert(\"siii\");</script>");                       
                            getServletContext().getRequestDispatcher("/views/Formulario.html").forward(request, response);
                           
                        }else{ 
                        	getServletContext().getRequestDispatcher("/views/validacion.html").forward(request, response);
                        	out.println("<script type=\"text/javascript\">\r\n" + "    alert('Contraseña Incorrecta');\r\n"
                        			+ "</script>");
                            
                            
                           
                        }
                    }else{                            
                            out.println("Debe ingresar una contraseña");                            
                            getServletContext().getRequestDispatcher("/views/validacion.html").forward(request, response);
                           
                    }
                }else{
                   ;
                    out.println("Usuario incorrecta");                   
                    getServletContext().getRequestDispatcher("/views/validacion.html").forward(request, response);
                    
                }
            }else{
                
                out.println("Debe ingresar un usuario");                
                getServletContext().getRequestDispatcher("/views/validacion.html").forward(request, response);
                
            }
        }
    }
                            
                            
	
	 
	
}
