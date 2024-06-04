<!--ChatGPT-->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado de la Conversión</title>
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
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Resultado de la Conversión</h1>
        <%
            // Obtener la cantidad y el tipo de conversión desde el formulario
            String cantidadStr = request.getParameter("cantidad");
            String conversion = request.getParameter("conversion");

            // Convertir la cantidad a número
            double cantidad = Double.parseDouble(cantidadStr);

            // Definir la tasa de conversión
            double conversionRate = 166.386;
            double resultado = 0.0;
            String conversionTipo = "";

            // Realizar la conversión basada en la opción seleccionada
            if ("eurToPts".equals(conversion)) {
                resultado = cantidad * conversionRate;
                conversionTipo = "pesetas";
                out.println("<p>Cantidad en Euros: " + cantidad + "</p>");
            } else if ("ptsToEur".equals(conversion)) {
                resultado = cantidad / conversionRate;
                conversionTipo = "euros";
                out.println("<p>Cantidad en Pesetas: " + cantidad + "</p>");
            }

            // Mostrar el resultado
            out.println("<h2>Equivale a: " + resultado + " " + conversionTipo + "</h2>");
        %>
        <a href="index.jsp">Realizar otra conversión</a>
    </div>
</body>
</html>
