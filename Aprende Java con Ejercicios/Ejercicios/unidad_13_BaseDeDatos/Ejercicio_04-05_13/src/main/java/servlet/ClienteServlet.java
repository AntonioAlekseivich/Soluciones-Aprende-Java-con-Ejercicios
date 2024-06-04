package servlet;

import com.example.banco.dao.ClienteDAO;
import com.example.banco.model.Cliente;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class ClienteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private ClienteDAO clienteDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ClienteServlet() {
		super();

	}

    
    public void init() {
        clienteDAO = new ClienteDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            switch (action) {
                case "new":
                    showNewForm(request, response);
                    break;
                case "insert":
                    insertCliente(request, response);
                    break;
                case "delete":
                    deleteCliente(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "update":
                    updateCliente(request, response);
                    break;
                case "search":
                    searchCliente(request, response);
                    break;
                case "view":
                    viewClient(request, response);
                    break;
                default:
                    listClientes(request, response);
                    break;
            }
        } catch (SQLException ex) {
            System.out.println("*ClienteServlet* Excepcion en switch");
        }
    }

    private void viewClient(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
    	Cliente clienteAux = clienteDAO.getCliente(Integer.parseInt(request.getParameter("id")));
    	request.setAttribute("cliente", clienteAux);
    	  request.getRequestDispatcher("cliente-detalles.jsp").forward(request, response);
    }
    
    private void searchCliente(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String searchName = request.getParameter("searchName");
        List<Cliente> searchResults = clienteDAO.searchClientesByName(searchName);
        
        if (searchResults.size() == 1) {
            Cliente cliente = searchResults.get(0);
            System.out.println("*Cliente pasado en searchCliente*:"+cliente);
            request.setAttribute("cliente", cliente);
            request.getRequestDispatcher("cliente-detalles.jsp").forward(request, response);
        } else {
            request.setAttribute("listClientes", searchResults);
            request.getRequestDispatcher("list-cliente.jsp").forward(request, response);
        }
    }

    private void listClientes(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
 try {
	 List<Cliente> listClientes = clienteDAO.getAllClientes();
	 System.out.println("*ClienteServlet* parametros en listClientes:"+listClientes);
     request.setAttribute("listClientes", listClientes);
     RequestDispatcher dispatcher = request.getRequestDispatcher("list-cliente.jsp");
     dispatcher.forward(request, response);
} catch (Exception e) {
	System.out.println("*ClienteServlet* Excepcion en listClientes");
}	
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("cliente-form.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Cliente existingCliente = clienteDAO.getCliente(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("cliente-form.jsp");
        request.setAttribute("cliente", existingCliente);
        dispatcher.forward(request, response);
    }

    private void insertCliente(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String nombreCompleto = request.getParameter("nombreCompleto");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String fechaNacimiento = request.getParameter("fechaNacimiento");

        Cliente newCliente = new Cliente();
        newCliente.setNombreCompleto(nombreCompleto);
        newCliente.setDireccion(direccion);
        newCliente.setTelefono(telefono);
        newCliente.setFechaNacimiento(fechaNacimiento);
        System.out.println("*ClienteServlet//insertCliente* Cliente: "+newCliente);
        clienteDAO.addCliente(newCliente);
        response.sendRedirect("index.jsp");
    }

    private void updateCliente(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String nombreCompleto = request.getParameter("nombreCompleto");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String fechaNacimiento = request.getParameter("fechaNacimiento");
       
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNombreCompleto(nombreCompleto);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        cliente.setFechaNacimiento(fechaNacimiento);
        clienteDAO.updateCliente(cliente);
        response.sendRedirect("index.jsp");
    }

    private void deleteCliente(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        clienteDAO.deleteCliente(id);
        response.sendRedirect("index.jsp");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
