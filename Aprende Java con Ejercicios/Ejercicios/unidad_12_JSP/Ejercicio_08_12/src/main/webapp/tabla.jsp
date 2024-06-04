<!--Chatgpt-->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Tabla de Multiplicar</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            background-color: #f0f0f0;
        }
        .container {
            background-color: white;
            padding: 20px;
            margin: 50px auto;
            width: 300px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }
        table {
            width: 50%;
            margin: 20px auto;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Tabla de Multiplicar</h1>
        <%
            // Obtener el número desde el formulario
            String numeroStr = request.getParameter("numero");

            // Convertir la cantidad a número
            int numero = Integer.parseInt(numeroStr);

            // Generar la tabla de multiplicar
            out.println("<table>");
            out.println("<tr><th>Multiplicador</th><th>Resultado</th></tr>");
            for (int i = 1; i <= 10; i++) {
                out.println("<tr>");
                out.println("<td>" + numero + " x " + i + "</td>");
                out.println("<td>" + (numero * i) + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
        %>
        <a href="index.jsp">Calcular otra tabla</a>
    </div>
</body>
</html>
