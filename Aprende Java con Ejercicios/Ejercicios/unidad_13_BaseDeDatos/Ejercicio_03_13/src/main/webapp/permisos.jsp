<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="back.usuarios.Usuario"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Permissions</title>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f9;
    color: #333;
}

h2 {
    color: #5a5a5a;
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
    <h2>User Permissions</h2>
    <%
        Usuario usuario = (Usuario) request.getAttribute("usuario");
        boolean[] permissions = (boolean[]) request.getAttribute("permissions");
        if (usuario != null && permissions != null) {
    %>
        <h3>User Details</h3>
        <p>ID: <%= usuario.getId() %></p>
        <p>Nombre: <%= usuario.getNombre() %></p>
        <p>Contraseña: <%= usuario.getContrasenia() %></p>
        <p>Baneado: <%= usuario.isBaneado() ? "Sí" : "No" %></p>

        <h3>Permissions</h3>
        <form action="ApplyPrivilegesServlet" method="post">
            <input type="hidden" name="userId" value="<%= usuario.getId() %>">
            <table>
                <thead>
                    <tr>
                        <th>Permission</th>
                        <th>Granted</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Piramide</td>
                        <td>
                          <input type="checkbox" name="permission_piramide" value="true" <%= permissions[0] ? "checked" : "" %>>


                        </td>
                    </tr>
                    <tr>
                        <td>Tres en raya</td>
                        <td>
                          <input type="checkbox" name="permission_tres_en_raya" value="true" <%= permissions[1] ? "checked" : "" %>>

                        </td>
                    </tr>
                    <tr>
                        <td>Dado</td>
                        <td>
                          <input type="checkbox" name="permission_dado" value="true" <%= permissions[2] ? "checked" : "" %>>

                        </td>
                    </tr>
                </tbody>
            </table>
            <button type="submit">Apply</button>
        </form>
    <%
        } else {
    %>
        <p>No user or permissions data found.</p>
    <%
        }
    %>
</body>
</html>