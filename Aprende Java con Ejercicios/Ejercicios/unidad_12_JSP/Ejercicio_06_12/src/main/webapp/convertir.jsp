<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado de la Conversión</title>
</head>
<body>
    <h1>Resultado de la Conversión</h1>
    <%
        // Obtener la cantidad en pesetas desde el formulario
        String pesetasStr = request.getParameter("pesetas");

        // Convertir la cantidad a número
        double pesetas = Double.parseDouble(pesetasStr);

        // Definir la tasa de conversión: 1 euro = 166.386 pesetas
        double conversionRate = 166.386;

        // Calcular la cantidad en euros
        double euros = pesetas / conversionRate;

        // Mostrar el resultado
        out.println("<p>Cantidad en Pesetas: " + pesetas + "</p>");
        out.println("<h2>Equivale a: " + euros + " euros</h2>");
    %>
    <a href="index.jsp">Realizar otra conversión</a>
</body>
</html>
