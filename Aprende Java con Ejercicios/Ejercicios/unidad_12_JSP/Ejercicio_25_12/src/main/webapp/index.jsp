<!--Chatgpt-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tiradas de Dados</title>
</head>
<body>
    <h1>Tiradas de Dados</h1>

    <%
        // Inicializar variables
        boolean mismaTirada = false;
        int dado1 = 0, dado2 = 0, dado3 = 0;
        int tirada = 0;

        out.println("<table border='1'>");
        out.println("<tr><th>Tirada</th><th>Dado 1</th><th>Dado 2</th><th>Dado 3</th></tr>");

        // Generar tiradas hasta que los tres dados tengan el mismo valor
        while (!mismaTirada) {
            dado1 = (int) (Math.random() * 6) + 1;
            dado2 = (int) (Math.random() * 6) + 1;
            dado3 = (int) (Math.random() * 6) + 1;
            tirada++;

            out.println("<tr><td>" + tirada + "</td><td>" + dado1 + "</td><td>" + dado2 + "</td><td>" + dado3 + "</td></tr>");

            // Verificar si los tres dados tienen el mismo valor
            if (dado1 == dado2 && dado2 == dado3) {
                mismaTirada = true;
            }
        }

        out.println("</table>");
        out.println("<h2>¡Se logró que los tres dados tengan el mismo valor en la tirada " + tirada + "!</h2>");
    %>

</body>
</html>
