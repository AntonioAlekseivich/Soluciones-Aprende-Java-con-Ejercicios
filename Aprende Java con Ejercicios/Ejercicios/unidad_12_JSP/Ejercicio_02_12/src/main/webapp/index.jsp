<!--Hecho por chatGpt-->
<--En un principio lo monto con un servlet que mandaba el texto html con el nombre.
pero no lo mostraba en una pagina. Tube que especificar esto.
Tambien tuve problemas localizando los archivos y poniendo correctamente los nombres de archivos.-->

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Saludo</title>
</head>
<body>
    <h2>Introduce tu nombre:</h2>
    <form action="saludo.jsp" method="post">
        <input type="text" name="nombre">
        <button type="submit">Enviar</button>
    </form>
</body>
</html>
