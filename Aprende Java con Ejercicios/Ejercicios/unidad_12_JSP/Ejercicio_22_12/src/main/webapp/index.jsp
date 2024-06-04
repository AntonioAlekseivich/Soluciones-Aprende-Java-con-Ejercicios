<!DOCTYPE html>
<html>
<head>
    <title>Pedido de Comida Vegetariana</title>
</head>
<body>
    <h1>Pedido de Comida Vegetariana</h1>
    <form action="pedido.jsp" method="post">
        <h2>Comidas</h2>
        <label for="quinoa">Quinoa con verdura (€6.95):</label>
        <input type="number" id="quinoa" name="quinoa" min="0" value="0">
        <br>
        <label for="hamburguesa">Hamburguesa vegetariana (€6.20):</label>
        <input type="number" id="hamburguesa" name="hamburguesa" min="0" value="0">
        <br>
        <label for="pizza">Pizza caprese (€4.90):</label>
        <input type="number" id="pizza" name="pizza" min="0" value="0">
        <br>
        <label for="ensalada">Ensalada de garbanzos (€5.50):</label>
        <input type="number" id="ensalada" name="ensalada" min="0" value="0">
        <br><br>

        <h2>Bebidas</h2>
        <label for="agua">Botellín de agua (€1.00):</label>
        <input type="number" id="agua" name="agua" min="0" value="0">
        <br>
        <label for="cerveza">Cerveza (€1.50):</label>
        <input type="number" id="cerveza" name="cerveza" min="0" value="0">
        <br>
        <label for="refresco">Refresco (€1.40):</label>
        <input type="number" id="refresco" name="refresco" min="0" value="0">
        <br><br>

        <input type="submit" value="Realizar Pedido">
    </form>
</body>
</html>
