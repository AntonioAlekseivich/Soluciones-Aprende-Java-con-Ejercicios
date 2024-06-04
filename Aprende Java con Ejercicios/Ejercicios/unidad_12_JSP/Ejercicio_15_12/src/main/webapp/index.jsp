<!--Hecho por chatGpt-->
<!--En un principio ponia el metodo isPrime dento del bloque jsp y por eso el servidor lanzaba la excepcion 500
Ademas primeramente la pagina contenia span con css. Cosa que quite al no admitir css la version gratuita de intellij.-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Números Aleatorios con Primos Destacados</title>
</head>
<body>
    <h2>100 Números Aleatorios del 1 al 200</h2>

    <%!
        // Método para comprobar si un número es primo
        boolean isPrime(int num) {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }
    %>

    <%
        // Generar 100 números aleatorios y mostrarlos
        int[] randomNumbers = new int[100];
        for (int i = 0; i < 100; i++) {
            randomNumbers[i] = 1 + (int)(Math.random() * 200);
        }

        out.println("<div>");
        for (int i = 0; i < 100; i++) {
            int currentNum = randomNumbers[i];
            if (isPrime(currentNum)) {
                out.println("<p>primo: " + currentNum + "</p>");
            } else {
                out.println("<p>no primo: " + currentNum + "</p>");
            }
            if (i != 99) {
                out.print(", "); // Separar los números por comas
            }
        }
        out.println("</div>");
    %>
</body>
</html>
