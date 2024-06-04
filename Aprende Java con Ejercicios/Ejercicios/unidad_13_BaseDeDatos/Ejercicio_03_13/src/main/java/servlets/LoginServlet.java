package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import back.dao.DAOPersona;
import back.usuarios.Persona;
import back.usuarios.Usuario;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
        	 response.setContentType("text/html");
             PrintWriter out = response.getWriter();
             RequestDispatcher rd;
        	 if (Persona.buscarPersona(username, password)!=null) {//Si encuentra a una persona con esas credenciales
        		   Persona personaAux = Persona.buscarPersona(username, password);
        		 
        		   if (personaAux instanceof Usuario) {
        			// Set the username as a request attribute
        	            request.setAttribute("username", username);
        			    rd = request.getRequestDispatcher("selectExcercise.jsp");
        			    
        		   }   else
        			    rd = request.getRequestDispatcher("/UserListServlet");
                 
        		 rd.forward(request, response);
        		 
        }else { 
           out.println("<h1>Login failed</h1>");
           out.println("<a href='index.jsp'>Try again!</a>");
        	 }
        	 
        } catch (Exception e) {
            System.out.println("Error en LoginServlet.");
          }
    }
}

