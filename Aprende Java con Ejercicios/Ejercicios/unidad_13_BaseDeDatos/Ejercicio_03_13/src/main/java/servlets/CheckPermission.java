package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import back.usuarios.Usuario;

/**
 * Servlet implementation class CheckPermission
 */
public class CheckPermission extends HttpServlet {
	//TODO The servlet should recieve a user and an excercise, and grant permission accordingly
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckPermission() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = (request.getParameter("username"));
        System.out.println("*CheckPrivileges* Username: "+username);
        
        Usuario usuarioAux = Usuario.buscarPersona(username); 
        
        String nombre = usuarioAux.getNombre();
        String contrasenia = usuarioAux.getContrasenia();
        boolean baneado = usuarioAux.isBaneado();

        boolean[] permissions = usuarioAux.getPermisos();
        System.out.println("Permisos pasados en CheckPrivilegesServlet:");
        for (boolean b : permissions) {
            System.out.println(b);
        }
        
        // Add the user and permissions to the request
        request.setAttribute("username", usuarioAux.getNombre());
        request.setAttribute("permissions", permissions);
		
		// Extract the requested exercise from the request parameters
        String exercise = request.getParameter("exercise");
        System.out.println("Ejercicio pasado en CheckPrivileges: "+exercise);
        
        // Check permissions for the requested exercise
        boolean hasPermission = false;
        if (exercise != null) {
            switch (exercise) {
                case "piramid":
                    hasPermission = permissions[0];
                    break;
                case "tresEnRaya":
                    hasPermission = permissions[1];
                    break;
                case "dado":
                    hasPermission = permissions[2];
                    break;
                default:
                    // Invalid exercise requested
                    break;
            }
        }

        // Forward to the appropriate page based on the permissions
        if (hasPermission) {
            request.getRequestDispatcher("ejercicios/"+exercise + ".jsp").forward(request, response);
        } else {
        	// Set a request attribute to indicate the absence of permissions
            request.setAttribute("noPermissions", true);
            
            // Forward to selectExcercise.jsp
            request.getRequestDispatcher("selectExcercise.jsp").forward(request, response);
        }
	}

}
