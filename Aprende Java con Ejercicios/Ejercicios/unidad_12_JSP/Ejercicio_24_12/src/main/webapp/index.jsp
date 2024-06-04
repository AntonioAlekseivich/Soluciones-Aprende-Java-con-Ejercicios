<!DOCTYPE html>
<html>
<head>
    <title>Votación de Elecciones</title>
</head>
<body>
    <h1>Introduce los Votos para los Partidos Políticos</h1>
    <form action="result.jsp" method="post">
        <label for="partido1">Partido 1:</label>
        <input type="number" id="partido1" name="partido1" min="0" required>
        <br>
        <label for="partido2">Partido 2:</label>
        <input type="number" id="partido2" name="partido2" min="0" required>
        <br>
        <label for="partido3">Partido 3:</label>
        <input type="number" id="partido3" name="partido3" min="0" required>
        <br>
        <label for="partido4">Partido 4:</label>
        <input type="number" id="partido4" name="partido4" min="0" required>
        <br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>
