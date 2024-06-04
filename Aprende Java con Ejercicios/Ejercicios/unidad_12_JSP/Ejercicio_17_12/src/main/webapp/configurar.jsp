<!--chatGpt-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Interior de Vehículo Configurado</title>
    <style>
        .interior {
            width: 400px;
            height: 200px;
            border: 1px solid #ccc;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <h1>Interior de Vehículo Configurado</h1>
    <div class="interior" style="background-color: <%= request.getParameter("colorTapiceria") %>;">
        <p>Color de Tapicería: <%= request.getParameter("colorTapiceria") %></p>
        <p>Material de Molduras: <%= request.getParameter("materialMolduras") %></p>
    </div>
</body>
</html>
