<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="back.usuarios.Usuario" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Gestión de Usuarios</title>
    <style>
       body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            color: #333;
        }
        h2 {
            color: #5a5a5a;
        }
        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            margin: auto;
        }
        label {
            display: block;
            margin: 10px 0 5px;
        }
        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 5px 0px 10px -10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            background-color: #28a745;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #218838;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        table, th, td {
            border: 1px solid #ddd;
        }
        th, td {
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h2>Gestión de Usuarios</h2>
    <form action="RegisterServlet" method="post">
        <label for="username">Nuevo Usuario:</label>
        <input type="text" id="username" name="username" required><br>
        <label for="password">Nueva Contrasenia:</label>
        <input type="password" id="password" name="password" required><br>
        <input type="submit" value="Registrar">
    </form>

    <h2>Lista de Usuarios</h2>
    
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Usuario</th>
                <th>Contrasenia</th>
                <th>Baneado</th>
            </tr>
        </thead>
    <%
        HashMap<Integer, Usuario> usuarios = (HashMap<Integer, Usuario>) request.getAttribute("usuarios");
        if (usuarios != null) {
            %><h1>Usuarios exists</h1><%
            for (Map.Entry<Integer, Usuario> entry : usuarios.entrySet()) {
                Usuario usuario = entry.getValue();
    %>
    
        <tbody>
            <tr>
                <td><%= usuario.getId() %></td>
                <td><%= usuario.getNombre() %></td>
                <td><%= usuario.getContrasenia() %></td>
                <td><%= usuario.isBaneado() ? "Sí" : "No" %></td>
            </tr>
    <%
            }
        } else {
    %>
        <h1>No users found</h1>
    <%
        }
    %>
        </tbody>
    </table>
</body>
</html>

