<!--Chatgpt-->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado de la Conversión</title>
</head>
<body>
    <h1>Resultado de la Conversión</h1>
    <%
        // Obtener la cantidad en euros desde el formulario
        String eurosStr = request.getParameter("euros");

        // Convertir la cantidad a número
        double euros = Double.parseDouble(eurosStr);

        // Definir la tasa de conversión: 1 euro = 166.386 pesetas
        double conversionRate = 166.386;

        // Calcular la cantidad en pesetas
        double pesetas = euros * conversionRate;

        // Mostrar el resultado
        out.println("<p>Cantidad en Euros: " + euros + "</p>");
        out.println("<h2>Equivale a: " + pesetas + " pesetas</h2>");
    %>
    <a href="index.jsp">Realizar otra conversión</a>
</body>
</html>
