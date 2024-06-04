package servlet;

import com.example.banco.dao.AlmacenDAO;
import com.example.banco.model.Articulo;

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
import java.util.ArrayList;
import java.util.List;

public class ArticuloServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private AlmacenDAO almacenDAO;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ArticuloServlet() {
		super();

	}

    
    public void init() {
        almacenDAO = new AlmacenDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        try {
            switch (action) {
                case "new":
                    showNewForm(request, response);
                    break;
                case "insert":
                    insertArticulo(request, response);
                    break;
                case "delete":
                    deleteArticulo(request, response);
                    break;
                case "edit":
                    showEditForm(request, response);
                    break;
                case "update":
                	updateArticulo(request, response);
                    break;
                case "increaseStock":
                	increaseStock(request, response);
                    break;
                case "descreaseStock":
                	decreaseStock(request, response);
                    break;
                default:
                    listArticulos(request, response);
                    break;
            }
        } catch (SQLException ex) {
            System.out.println("*ArticuloServlet* Excepcion en switch");
        }
    }

    private void listArticulos(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
 try {
	 List<Articulo> listArticulos = almacenDAO.getAllArticulos();
	 System.out.println("*ArticuloServlet* parametros en listArticulos:"+listArticulos);
     request.setAttribute("listArticulos", listArticulos);
     RequestDispatcher dispatcher = request.getRequestDispatcher("list-articulo.jsp");
     dispatcher.forward(request, response);
} catch (Exception e) {
	System.out.println("*ArticuloServlet* Excepcion en listArticulos");
}	
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("articulo-form.jsp");
        dispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        Articulo articulo = almacenDAO.getArticulo(codigo);
        
        System.out.println("*ArticuloServlet-showEditForm*\n"+
        		"pCompra: "+articulo.getPrecioDeCompra()+"\n"+
        		"pVenta: "+articulo.getPrecioDeVenta());
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("articulo-form.jsp");
        request.setAttribute("articulo", articulo);
        dispatcher.forward(request, response);
    }

    private void insertArticulo(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
    	
    	System.out.println("*ServletArticulo-ArticuloServlet* Parametros introducidos: \n"
    			+ request.getParameter("codigo") +"\n"
    					+ request.getParameter("descripcion") +"\n"
    							+ request.getParameter("pCompra") +"\n"
    									+ request.getParameter("pVenta") +"\n"
    											+ request.getParameter("stock") +"\n");
    

    	String descripcion = request.getParameter("descripcion");
        double precioDeCompra = Double.parseDouble(request.getParameter("pCompra"));
        double precioDeVenta = Double.parseDouble(request.getParameter("pVenta"));
        int stock = Integer.parseInt(request.getParameter("stock"));

        Articulo newArticulo = new Articulo();

        newArticulo.setDescripcion(descripcion);
        newArticulo.setPrecioDeCompra(precioDeCompra);
        newArticulo.setPrecioDeVenta(precioDeVenta);
        newArticulo.setStock(stock);
        
        System.out.println("*ClienteServlet//insertArticulo* Articulo creado: " + newArticulo);
        almacenDAO.addArticulo(newArticulo);
        listArticulos(request, response);
    }


    private void updateArticulo(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        String descripcion = request.getParameter("descripcion");
        double precioDeCompra = Double.parseDouble(request.getParameter("pCompra"));
        double precioDeVenta = Double.parseDouble(request.getParameter("pVenta"));
        int stock = Integer.parseInt(request.getParameter("stock"));

        Articulo articulo = new Articulo();
        articulo.setCodigo(codigo);
        articulo.setDescripcion(descripcion);
        articulo.setPrecioDeCompra(precioDeCompra);
        articulo.setPrecioDeVenta(precioDeVenta);
        articulo.setStock(stock);
        
        almacenDAO.updateArticulo(articulo);
        listArticulos(request, response);
    }

    private void deleteArticulo(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
        almacenDAO.deleteArticulo(codigo);
        response.sendRedirect("index.jsp");
    }
    
    private void increaseStock(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
       List <Articulo> articulos = almacenDAO.searchArticulosByCodigo(codigo);
      System.out.println("*ArticuloServlet-increaseStock*Articulos pasado: "+articulos); 
       for (Articulo articulo : articulos) {
    	   int stock = articulo.getStock()+1;
		almacenDAO.updateStock(articulo,stock);
	}
       listArticulos(request, response);
    }
    
    private void decreaseStock(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        int codigo = Integer.parseInt(request.getParameter("codigo"));
       List <Articulo> articulos = almacenDAO.searchArticulosByCodigo(codigo);
       
       for (Articulo articulo : articulos) {
    	   if(articulo.getStock()>0)
		almacenDAO.updateStock(articulo,articulo.getStock()-1);
	}
       listArticulos(request, response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
