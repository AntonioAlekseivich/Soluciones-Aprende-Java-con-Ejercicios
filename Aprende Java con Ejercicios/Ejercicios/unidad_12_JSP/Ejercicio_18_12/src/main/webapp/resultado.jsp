<!--Chatgpt-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado de El Trile</title>
</head>
<body>
    <h1>Resultado de El Trile</h1>

    <%
        // Obtener la selección del usuario
        String seleccionStr = request.getParameter("cubilete");
        int seleccionUsuario = Integer.parseInt(seleccionStr);

        // Generar aleatoriamente la posición de la bolita (1, 2 o 3)
        int posicionBolita = (int) (Math.random() * 3) + 1;

        // Mostrar los cubiletes levantados
        out.println("<p>Has seleccionado el cubilete " + seleccionUsuario + ".</p>");
        out.println("<p>Levantando los cubiletes...</p>");
        out.println("<ul>");
        for (int i = 1; i <= 3; i++) {
            if (i == posicionBolita) {
                out.println("<li>Cubilete " + i + ": Bolita</li>");
            } else {
                out.println("<li>Cubilete " + i + ": Vacío</li>");
            }
        }
        out.println("</ul>");

        // Determinar si el usuario ha acertado
        if (seleccionUsuario == posicionBolita) {
            out.println("<p>¡Enhorabuena!, has encontrado la bolita.</p>");
        } else {
            out.println("<p>Lo siento, no has acertado. La bolita estaba en el cubilete " + posicionBolita + ".</p>");
        }
    %>

    <form action="index.jsp" method="post">
        <input type="submit" value="Jugar de nuevo">
    </form>
</body>
</html>
