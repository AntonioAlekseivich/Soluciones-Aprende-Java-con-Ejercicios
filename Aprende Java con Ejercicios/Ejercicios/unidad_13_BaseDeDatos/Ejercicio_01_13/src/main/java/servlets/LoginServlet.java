package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","SYSTEM","Admin2023");
		String u=request.getParameter("username");
		String p=request.getParameter("password");
		
		PreparedStatement ps = con.prepareStatement("SELECT * FROM persona WHERE nombre = ? and contrasenia = ?");
		ps.setString(1,u);
		ps.setString(2,p);
		
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			RequestDispatcher rd= request.getRequestDispatcher("piramide.jsp");
			rd.forward(request, response);
		} else {
			response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<h1>Login failed</h1>");
            out.println("<a href='index.jsp'>Try again!</a>");
		}
			
		
		}catch (ClassNotFoundException e){
			
			e.printStackTrace();
			
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	

}
