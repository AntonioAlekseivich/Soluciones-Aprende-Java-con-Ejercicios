<!--chatGpt-->


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Configurador de Interior de Vehículo</title>
    <style>
        .interior {
            width: 400px;
            height: 200px;
            background-color: #f0f0f0;
            border: 1px solid #ccc;
            margin-bottom: 20px;
        }
        .tapiceria {
            display: flex;
            justify-content: space-between;
            margin-bottom: 10px;
        }
        .molduras {
            display: flex;
            justify-content: space-between;
        }
        .boton {
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
    <h1>Configurador de Interior de Vehículo</h1>
    <form action="configurar.jsp" method="post">
        <div class="tapiceria">
            <label for="color-tapiceria">Color de Tapicería:</label>
            <select id="color-tapiceria" name="colorTapiceria">
                <option value="blanco">Blanco</option>
                <option value="negro">Negro</option>
                <option value="berenjena">Berenjena</option>
            </select>
        </div>
        <div class="molduras">
            <label for="material-molduras">Material de Molduras:</label>
            <select id="material-molduras" name="materialMolduras">
                <option value="madera">Madera</option>
                <option value="carbono">Carbono</option>
            </select>
        </div>
        <button type="submit" class="boton">Configurar Interior</button>
    </form>
</body>
</html>
