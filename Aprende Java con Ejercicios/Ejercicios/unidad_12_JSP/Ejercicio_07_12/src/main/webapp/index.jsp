<!--ChatGPT-->

<!DOCTYPE html>
<html>
<head>
    <title>Conversor de Divisas</title>
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
        img {
            max-width: 100%;
            height: auto;
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
        <h1>Conversor de Divisas</h1>
        <img src="currency.png" alt="Divisas">

        <form action="convertir.jsp" method="post">

            <label for="cantidad">Cantidad:</label>
            <input type="number" id="cantidad" name="cantidad" step="0.01" required><br><br>
            <label for="conversion">Convertir:</label>

            <select id="conversion" name="conversion">
                <option value="eurToPts">Euros a Pesetas</option>
                <option value="ptsToEur">Pesetas a Euros</option>
            </select><br><br>
            <input type="submit" value="Convertir">
        </form>
    </div>
</body>
</html>
