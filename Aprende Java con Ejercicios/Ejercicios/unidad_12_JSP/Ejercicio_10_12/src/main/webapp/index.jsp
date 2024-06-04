<!DOCTYPE html>
<html>
<head>
    <title>Cuestionario del Curso</title>
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
            width: 600px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
            text-align: left;
        }
        h1 {
            text-align: center;
        }
        .question {
            margin-bottom: 20px;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            display: block;
            margin: 0 auto;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Cuestionario del Curso</h1>
        <form action="resultado.jsp" method="post">
            <div class="question">
                <p>1. ¿Cuál es el lenguaje principal utilizado en desarrollo web front-end?</p>
                <input type="radio" name="q1" value="a" required> HTML<br>
                <input type="radio" name="q1" value="b"> JavaScript<br>
                <input type="radio" name="q1" value="c"> CSS<br>
                <input type="radio" name="q1" value="d"> PHP<br>
            </div>
            <div class="question">
                <p>2. ¿Cuál es el paradigma de programación principal en Java?</p>
                <input type="radio" name="q2" value="a" required> Funcional<br>
                <input type="radio" name="q2" value="b"> Orientado a objetos<br>
                <input type="radio" name="q2" value="c"> Procedural<br>
                <input type="radio" name="q2" value="d"> Declarativo<br>
            </div>
            <div class="question">
                <p>3. ¿Qué es SQL utilizado para?</p>
                <input type="radio" name="q3" value="a" required> Estilos de página<br>
                <input type="radio" name="q3" value="b"> Programación lógica<br>
                <input type="radio" name="q3" value="c"> Consultar bases de datos<br>
                <input type="radio" name="q3" value="d"> Crear animaciones<br>
            </div>
            <div class="question">
                <p>4. ¿Qué significa 'CSS'?</p>
                <input type="radio" name="q4" value="a" required> Cascading Style Sheets<br>
                <input type="radio" name="q4" value="b"> Central Style Sheets<br>
                <input type="radio" name="q4" value="c"> Centralized Style Sheets<br>
                <input type="radio" name="q4" value="d"> Cascading Simple Sheets<br>
            </div>
            <div class="question">
                <p>5. ¿Cuál es el resultado de 2+2 en JavaScript?</p>
                <input type="radio" name="q5" value="a" required> 22<br>
                <input type="radio" name="q5" value="b"> "22"<br>
                <input type="radio" name="q5" value="c"> 4<br>
                <input type="radio" name="q5" value="d"> "4"<br>
            </div>
            <div class="question">
                <p>6. ¿Qué es un objeto en programación orientada a objetos?</p>
                <input type="radio" name="q6" value="a" required> Una instancia de una clase<br>
                <input type="radio" name="q6" value="b"> Un tipo de dato<br>
                <input type="radio" name="q6" value="c"> Una función<br>
                <input type="radio" name="q6" value="d"> Una variable<br>
            </div>
            <div class="question">
                <p>7. ¿Qué es una base de datos relacional?</p>
                <input type="radio" name="q7" value="a" required> Un tipo de archivo<br>
                <input type="radio" name="q7" value="b"> Una hoja de cálculo<br>
                <input type="radio" name="q7" value="c"> Un sistema de organización de datos en tablas<br>
                <input type="radio" name="q7" value="d"> Un lenguaje de programación<br>
            </div>
            <div class="question">
                <p>8. ¿Qué lenguaje se utiliza principalmente para el desarrollo de aplicaciones de Android?</p>
                <input type="radio" name="q8" value="a" required> Swift<br>
                <input type="radio" name="q8" value="b"> Kotlin<br>
                <input type="radio" name="q8" value="c"> Java<br>
                <input type="radio" name="q8" value="d"> Python<br>
            </div>
            <div class="question">
                <p>9. ¿Qué es una función en programación?</p>
                <input type="radio" name="q9" value="a" required> Un bloque de código reutilizable que realiza una tarea específica<br>
                <input type="radio" name="q9" value="b"> Una variable<br>
                <input type="radio" name="q9" value="c"> Una clase<br>
                <input type="radio" name="q9" value="d"> Un archivo<br>
            </div>
            <div class="question">
                <p>10. ¿Cuál es el lenguaje de marcado estándar para crear páginas web?</p>
                <input type="radio" name="q10" value="a" required> HTML<br>
                <input type="radio" name="q10" value="b"> XML<br>
                <input type="radio" name="q10" value="c"> CSS<br>
                <input type="radio" name="q10" value="d"> SQL<br>
            </div>
            <input type="submit" value="Enviar Cuestionario">
        </form>
    </div>
</body>
</html>
