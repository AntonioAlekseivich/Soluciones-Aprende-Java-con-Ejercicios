<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Seleccionar Ejercicio</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            color: #333;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .container {
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 400px;
            width: 100%;
            text-align: center;
        }
        h2 {
            color: #5a5a5a;
        }
        .exercise-link {
            display: block;
            margin: 10px 0;
            padding: 10px;
            background-color: #28a745;
            color: white;
            text-decoration: none;
            border-radius: 5px;
        }
        .exercise-link:hover {
            background-color: #218838;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Seleccionar Ejercicio</h2>
        <a href="ejercicios/piramide.jsp" class="exercise-link">Pirámide</a>
        <a href="ejercicios/tresEnRaya.jsp" class="exercise-link">Tres en Raya</a>
        <a href="ejercicios/dado.jsp" class="exercise-link">Tercer Ejercicio</a>
    </div>
</body>
</html>
