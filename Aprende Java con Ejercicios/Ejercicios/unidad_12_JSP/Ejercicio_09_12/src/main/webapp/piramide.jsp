<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Pirámide de Imágenes</title>
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
        .pyramid {
            margin: 20px auto;
        }
        .pyramid img {
            width: 30px;
            height: 30px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Pirámide Generada</h1>
        <%
            // Obtener la altura desde el formulario
            String alturaStr = request.getParameter("altura");

            // Convertir la altura a número
            int altura = Integer.parseInt(alturaStr);

            // Generar la pirámide
            out.println("<div class='pyramid'>");
            for (int i = 1; i <= altura; i++) {
                for (int j = 1; j <= i; j++) {
                    out.println("<img src='bola.png' alt='Bolita'>");
                }
                out.println("<br>");
            }
            out.println("</div>");
        %>
        <a href="index.jsp">Generar otra pirámide</a>
    </div>
</body>
</html>
