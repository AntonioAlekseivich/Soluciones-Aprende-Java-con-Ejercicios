<!--Hecho por chatGpt-->
<!DOCTYPE html>
<html>
<head>
    <title>Calcular Media de Notas</title>
</head>
<body>
    <h1>Calcular Media de Tres Notas</h1>
    <form action="calcular.jsp" method="post">
        <label for="nota1">Nota 1:</label>
        <input type="number" id="nota1" name="nota1" step="0.01" required><br><br>
        <label for="nota2">Nota 2:</label>
        <input type="number" id="nota2" name="nota2" step="0.01" required><br><br>
        <label for="nota3">Nota 3:</label>
        <input type="number" id="nota3" name="nota3" step="0.01" required><br><br>
        <input type="submit" value="Calcular Media">
    </form>
</body>
</html>