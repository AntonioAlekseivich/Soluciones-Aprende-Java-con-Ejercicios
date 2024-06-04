<!DOCTYPE html>
<html>
<head>
    <title>Generador de Calendario</title>
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
            width: 400px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }
        h1 {
            color: #4CAF50;
        }
        label {
            display: block;
            margin: 10px 0 5px;
        }
        input, select {
            width: calc(100% - 20px);
            padding: 10px;
            margin: 5px 0 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Generador de Calendario</h1>
        <form action="calendario.jsp" method="post">
            <label for="mes">Nombre del mes:</label>
            <input type="text" id="mes" name="mes" required>

            <label for="anio">Año:</label>
            <input type="number" id="anio" name="anio" required>

            <label for="texto">Texto sobre el calendario:</label>
            <input type="text" id="texto" name="texto" required>

            <label for="diaSemana">Día de la semana del 1 (0=Dom, 1=Lun, ... 6=Sab):</label>
            <input type="number" id="diaSemana" name="diaSemana" min="0" max="6" required>

            <label for="numDias">Número de días del mes:</label>
            <input type="number" id="numDias" name="numDias" min="28" max="31" required>

            <input type="submit" value="Generar Calendario">
        </form>
    </div>
</body>
</html>
