<%@ page import="java.util.List"%>
<%@ page import="com.example.banco.model.Cliente"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Lista de Clientes</title>
    <style>
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
    <h2>Lista de Clientes</h2>
    <a href="ClienteServlet?action=new">Agregar Cliente</a>
    
    <!-- Formulario de búsqueda -->
    <form action="ClienteServlet" method="get">
        <input type="hidden" name="action" value="search">
        <label for="searchName">Buscar por nombre:</label>
        <input type="text" name="searchName" id="searchName" required>
        <input type="submit" value="Buscar">
    </form>

    <table>
        <tr>
            <th>ID</th>
            <th>Nombre Completo</th>
            <th>Detalles</th>
        </tr>
        <%
        // Assume listClientes is an attribute set in the request scope
                List<Cliente> listClientes = (List<Cliente>) request.getAttribute("listClientes");
                if (listClientes != null) {
                    for (Cliente cliente : listClientes) {
        %>
        <tr>
            <td><%= cliente.getId() %></td>
            <td><%= cliente.getNombreCompleto() %></td>        
            <td>
                <form action="ClienteServlet" method="post">
        <input type="hidden" name="action" value="view">
        <input type="hidden" name="id" value="<%= cliente.getId() %>">
        <button type="submit">Ver Detalles</button>
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

