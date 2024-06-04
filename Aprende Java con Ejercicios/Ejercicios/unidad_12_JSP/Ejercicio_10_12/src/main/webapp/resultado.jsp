<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado del Cuestionario</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
        }
        .container {
            background-color: white;
            padding: 20px;
            margin: 50px auto;
            width: 300px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }
        h1 {
            color: #4CAF50;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Resultado del Cuestionario</h1>
        <%
            // Respuestas correctas
            String[] respuestasCorrectas = {"b", "b", "c", "a", "c", "a", "c", "b", "a", "a"};

            // Contador de respuestas correctas
            int puntuacion = 0;

            // Verificar respuestas
            for (int i = 0; i < respuestasCorrectas.length; i++) {
                String respuesta = request.getParameter("q" + (i + 1));
                if (respuestasCorrectas[i].equals(respuesta)) {
                    puntuacion++;
                }
            }

            // Mostrar calificación
            out.println("<p>Tu calificación es: " + puntuacion + " / 10</p>");
        %>
        <a href="index.jsp">Volver al Cuestionario</a>
    </div>
</body>
</html>
