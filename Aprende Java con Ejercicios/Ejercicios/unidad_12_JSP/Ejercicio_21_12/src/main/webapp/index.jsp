<!--ChatGpt-->

<!DOCTYPE html>
<html>
<head>
    <title>Maquina de Helados</title>
</head>
<body>
    <h1>Maquina de Helados</h1>
    <form action="helado.jsp" method="post">
        <label for="chocolate">Porcentaje de Chocolate:</label>
        <input type="number" id="chocolate" name="chocolate" min="0" max="100" required>
        <br>
        <label for="fresa">Porcentaje de Fresa:</label>
        <input type="number" id="fresa" name="fresa" min="0" max="100" required>
        <br>
        <label for="vainilla">Porcentaje de Vainilla:</label>
        <input type="number" id="vainilla" name="vainilla" min="0" max="100" required>
        <br><br>
        <input type="submit" value="Generar Helado">
    </form>
</body>
</html>
