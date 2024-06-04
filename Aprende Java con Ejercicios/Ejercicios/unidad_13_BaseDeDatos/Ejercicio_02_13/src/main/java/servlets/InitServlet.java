package servlets;

import java.io.IOException;
import back.dao.DAOPersona;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class InitServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void init() throws ServletException {
        super.init();
        
        // Initialize DAO with user and administrator data
        DAOPersona.getListasPersonas();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward the request to the example JSP page
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}
