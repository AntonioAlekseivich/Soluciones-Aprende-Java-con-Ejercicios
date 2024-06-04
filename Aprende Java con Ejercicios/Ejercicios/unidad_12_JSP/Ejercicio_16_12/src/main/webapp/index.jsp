<!--Chatgpt-->

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tirada de Dados de Póker</title>
    <style>
        img {
            width: 100px;
            height: 100px;
            margin: 10px;
        }
    </style>
</head>
<body>
    <h1>Tirada de Dados de Póker</h1>
    <div id="dados">
        <img id="dado1" src="dado-1.png" alt="Dado 1">
        <img id="dado2" src="dado-1.png" alt="Dado 2">
        <img id="dado3" src="dado-1.png" alt="Dado 3">
    </div>

    <button onclick="tirarDados()">Tirar Dados</button>

    <script>
        function tirarDados() {
            var dado1 = document.getElementById("dado1");
            var dado2 = document.getElementById("dado2");
            var dado3 = document.getElementById("dado3");

            var resultado1 = Math.floor(Math.random() * 6) + 1;
            var resultado2 = Math.floor(Math.random() * 6) + 1;
            var resultado3 = Math.floor(Math.random() * 6) + 1;

            dado1.src = "dado-" + resultado1 + ".png";
            dado2.src = "dado-" + resultado2 + ".png";
            dado3.src = "dado-" + resultado3 + ".png";
        }
    </script>
</body>
</html>
