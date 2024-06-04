<!--Chatgpt-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Serie de Fibonacci</title>
</head>
<body>
    <h2>Mostrar los n primeros términos de la serie de Fibonacci</h2>
    <form method="post">
        Introduce el número de términos: <input type="number" name="n" required>
        <input type="submit" value="Mostrar">
    </form>

    <%
        // Obtener el valor de n desde el formulario
        String nStr = request.getParameter("n");
        if (nStr != null) {
            int n = Integer.parseInt(nStr);

            if (n >= 1) {
                // Array para almacenar los términos de la serie de Fibonacci
                long[] fibonacciSeries = new long[n];

                // Inicializar los primeros términos
                if (n > 0) fibonacciSeries[0] = 0;
                if (n > 1) fibonacciSeries[1] = 1;

                // Calcular el resto de términos de la serie
                for (int i = 2; i < n; i++) {
                    fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
                }

                // Mostrar los términos de la serie
                out.println("<h3>Los primeros " + n + " términos de la serie de Fibonacci son:</h3>");
                out.println("<ul>");
                for (int i = 0; i < n; i++) {
                    out.println("<li>" + fibonacciSeries[i] + "</li>");
                }
                out.println("</ul>");
            } else {
                out.println("<p>Por favor, introduce un número mayor o igual a 1.</p>");
            }
        }
    %>
</body>
</html>
