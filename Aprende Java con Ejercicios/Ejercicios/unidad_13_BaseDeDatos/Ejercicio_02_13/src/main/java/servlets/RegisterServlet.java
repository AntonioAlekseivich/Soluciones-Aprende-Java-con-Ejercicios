package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import back.usuarios.Persona;
import back.usuarios.Usuario;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            if (!Persona.loginNoEncontrado(password)) {
                out.println("<h1>Username already exists</h1>");
                out.println("<a href='register.jsp'>Try again!</a>");
            } else {
            	Usuario usuarioNuevo = new Usuario(Persona.idDisponible(),username,password,false);
            	Usuario usuarioRegistrado = Usuario.registrarse(usuarioNuevo);
            	
                if (usuarioRegistrado!=null) {
                    out.println("<h1>Registration successful</h1>");
                    out.println("<a href='index.jsp'>Login now</a>");
                } else {
                	
                    out.println("<h1>Registration failed</h1>");
                    out.println("<a href='register.jsp'>Try again!</a>");
                }
            }

        } catch (Exception e) {
            System.out.println("Error en RegisterServlet.");
          }
    }
}
