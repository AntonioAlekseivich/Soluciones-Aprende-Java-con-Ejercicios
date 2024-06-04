<!--Hecho por chatGpt-->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Saludo</title>
</head>
<body>
    <%
        // Obtener el nombre del parámetro del formulario
        String nombre = request.getParameter("nombre");

        // Mostrar el saludo
        if (nombre != null && !nombre.isEmpty()) {
    %>
        <h1>Hola, <%= nombre %>!</h1>
    <%
        } else {
    %>
        <p>No se ha proporcionado un nombre.</p>
    <%
        }
    %>
</body>
</html>
