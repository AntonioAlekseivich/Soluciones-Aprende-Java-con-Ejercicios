<%@ page import="java.util.List"%>
<%@ page import="com.example.banco.model.Articulo"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Lista de Articulos</title>
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-icons/1.10.3/font/bootstrap-icons.min.css">
    <style>
    .btn-icon {
            display: flex;
            align-items: center;
            justify-content: center;
        }
        .btn-icon i {
            margin-right: 8px;
            font-size: 5em; /* Adjust the size of the icon */
        }
        .btn-lg i {
            font-size: 4em; /* Adjust the size of the icon for large buttons */
        }
        
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            color: #333;
        }
        h2 {
            color: #0066cc;
            margin-bottom: 20px;
        }
        a {
            display: inline-block;
            margin-bottom: 20px;
            padding: 10px 20px;
            text-decoration: none;
            background-color: #0066cc;
            color: #ffffff;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        a:hover {
            background-color: #004999;
        }
        table {
            border-collapse: collapse;
            width: 80%;
            margin-bottom: 20px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #0066cc;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #ddd;
        }
    </style>
</head>
<body>
    <h2>Lista de Articulos</h2>
    <a href="ArticuloServlet?action=new">Agregar Articulo</a>
    

    <table>
        <tr>
            <th>Codigo</th>
            <th>Descripcion</th>
            <th>Precio de compra</th>
            <th>Precio de venta</th>
            <th>Stock</th>
            <th colspan=4>Actions</th>
        </tr>
        <%
        // Assume listClientes is an attribute set in the request scope
                List<Articulo> listArticulos = (List<Articulo>) request.getAttribute("listArticulos");
                if (listArticulos != null) {
                    for (Articulo articulo : listArticulos) {
        %>
        <tr>
            <td><%= articulo.getCodigo() %></td>
            <td><%= articulo.getDescripcion() %></td>        
            <td><%= articulo.getPrecioDeCompra() %></td>
            <td><%= articulo.getPrecioDeVenta() %></td>
            <td><%= articulo.getStock() %></td>
            
            <td>
                <form action="ArticuloServlet" method="post">
        <input type="hidden" name="action" value="delete">
        <input type="hidden" name="codigo" value="<%= articulo.getCodigo() %>">
        <button type="submit"> <i class="bi bi-trash"></i></button>
    </form>
    </td>
    
    <td>
                <form action="ArticuloServlet" method="post">
        <input type="hidden" name="action" value="edit">
        <input type="hidden" name="codigo" value="<%= articulo.getCodigo() %>">
        <button type="submit"><i class="bi bi-pencil"></i></button>
    </form>
    </td>
    
    <td>
                <form action="ArticuloServlet" method="post">
        <input type="hidden" name="action" value="increaseStock">
        <input type="hidden" name="codigo" value="<%= articulo.getCodigo() %>">
        <button type="submit"><i class="bi bi-plus"></i> </button>
   </form>
    </td>
    
    <td>
                <form action="ArticuloServlet" method="post">
        <input type="hidden" name="action" value="descreaseStock">
        <input type="hidden" name="codigo" value="<%= articulo.getCodigo() %>">
        <button type="submit"><i class="bi bi-dash"></i> </button>
   </form>
    </td>
    
        </tr>
        <%
            }
        } else {
        %>
        <tr>
            <td colspan="6">No hay clientes disponibles</td>
        </tr>
        <%
        }
        %>
    </table>
</body>
</html>

