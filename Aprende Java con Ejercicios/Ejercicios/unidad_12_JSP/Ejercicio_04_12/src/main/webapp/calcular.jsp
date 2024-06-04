<!--Hecho por chatGpt-->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado de la Media</title>
</head>
<body>
    <h1>Resultado de la Media</h1>
    <%
        // Obtener las notas desde el formulario
        String nota1Str = request.getParameter("nota1");
        String nota2Str = request.getParameter("nota2");
        String nota3Str = request.getParameter("nota3");

        // Convertir las notas a números
        double nota1 = Double.parseDouble(nota1Str);
        double nota2 = Double.parseDouble(nota2Str);
        double nota3 = Double.parseDouble(nota3Str);

        // Calcular la media
        double media = (nota1 + nota2 + nota3) / 3;

        // Mostrar el resultado
        out.println("<p>Nota 1: " + nota1 + "</p>");
        out.println("<p>Nota 2: " + nota2 + "</p>");
        out.println("<p>Nota 3: " + nota3 + "</p>");
        out.println("<h2>La media es: " + media + "</h2>");
    %>
    <a href="index.jsp">Calcular otra media</a>
</body>
</html>
