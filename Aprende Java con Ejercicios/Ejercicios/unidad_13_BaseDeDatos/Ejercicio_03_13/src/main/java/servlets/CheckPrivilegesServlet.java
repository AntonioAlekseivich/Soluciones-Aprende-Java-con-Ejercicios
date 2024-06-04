package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import back.dao.DAOPersona;
import back.usuarios.Persona;
import back.usuarios.Usuario;

public class CheckPrivilegesServlet extends HttpServlet {
	//TODO The servlet should retrieve the permissions from a user and send them back
    private static final long serialVersionUID = 1L;

    public CheckPrivilegesServlet() {
        super();
    }

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
        request.setAttribute("usuario", usuarioAux);
        request.setAttribute("permissions", permissions);
           
                request.getRequestDispatcher("permisos.jsp").forward(request, response);
          
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}

