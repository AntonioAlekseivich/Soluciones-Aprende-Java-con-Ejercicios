package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

import back.usuarios.Administrador;
import back.usuarios.Usuario;

/**
 * Servlet implementation class ApplyPrivilegesServlet
 */
public class ApplyPrivilegesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ApplyPrivilegesServlet() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userId =  Integer.parseInt(request.getParameter("userId"));

		boolean[] permissions = new boolean[3]; // assuming there are 3 permissions
		permissions[0] = Boolean.parseBoolean(request.getParameter("permission_piramide"));
		permissions[1] = Boolean.parseBoolean(request.getParameter("permission_tres_en_raya"));
		permissions[2] = Boolean.parseBoolean(request.getParameter("permission_dado"));
		
		boolean permissionValue;

			try {
				Administrador.applyPermissions((Usuario) Usuario.buscarPersona(userId), permissions);
			} catch (SQLException e) {
				System.out.println("Error en applyPermissions del Servlet");
				e.printStackTrace();
			}

		// Now you have the permissions array updated with the values submitted from the form
		// You can proceed to use these values as needed

		RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
		dispatcher.forward(request, response);
	}
}
