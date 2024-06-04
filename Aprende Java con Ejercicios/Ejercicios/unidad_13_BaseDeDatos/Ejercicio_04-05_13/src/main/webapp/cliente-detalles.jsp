 <%@ page import="com.example.banco.model.Cliente"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Detalles del Cliente</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #333;
        }
        .container {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 600px;
            text-align: center;
        }
        h2 {
            color: #0066cc;
            margin-bottom: 20px;
        }
        table {
            border-collapse: collapse;
            width: 100%;
            margin-bottom: 20px;
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
        form {
            margin-top: 20px;
        }
        input[type="submit"] {
            background-color: #0066cc;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }
        input[type="submit"]:hover {
            background-color: #004999;
        }
    </style>
</head>
<body>
<%
Cliente cliente = (Cliente)request.getAttribute("cliente");
%>

    <div class="container">
        <h2>Detalles del Cliente</h2>
        <table>
            <tr>
                <th>ID</th>
                <th>Nombre Completo</th>
                <th>Dirección</th>
                <th>Teléfono</th>
                <th>Fecha de Nacimiento</th>
            </tr>
            <tr>
    <td><%= cliente.getId() %></td>
    <td><%= cliente.getNombreCompleto() %></td>
    <td><%= cliente.getDireccion() %></td>
    <td><%= cliente.getTelefono() %></td>
    <td><%= cliente.getFechaNacimiento() %></td>
</tr>
        </table>
        <form action="index.jsp">
            <input type="submit" value="Aceptar">
        </form>
    </div>
</body>
</html> 