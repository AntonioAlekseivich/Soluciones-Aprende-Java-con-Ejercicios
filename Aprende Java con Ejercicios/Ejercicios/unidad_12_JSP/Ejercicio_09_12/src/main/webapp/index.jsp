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
        <h1>Generar Pirámide</h1>
        <form action="piramide.jsp" method="post">
            <label for="altura">Altura de la pirámide:</label>
            <input type="number" id="altura" name="altura" min="1" required><br><br>
            <input type="submit" value="Generar Pirámide">
        </form>
    </div>
</body>
</html>
