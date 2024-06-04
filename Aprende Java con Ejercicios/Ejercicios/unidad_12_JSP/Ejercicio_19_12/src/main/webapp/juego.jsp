<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado de Apuesta y Gana</title>
</head>
<body>
    <h1>Resultado de Apuesta y Gana</h1>

    <%
        // Obtener la cantidad de dinero del usuario
        String dineroStr = request.getParameter("dinero");
        double dinero = Double.parseDouble(dineroStr);

        // Generar una imagen aleatoria (1: calavera, 2: medio limón, 3: gato de la suerte)
        int resultado = (int) (Math.random() * 3) + 1;
        String imagen = "";
        String mensaje = "";

        if (resultado == 1) {
            imagen = "calavera.png"; // El nombre del archivo de la imagen de la calavera
            dinero = 0;
            mensaje = "Lo siento, has perdido todo tu dinero.";
        } else if (resultado == 2) {
            imagen = "medio_limon.png"; // El nombre del archivo de la imagen del medio limón
            dinero /= 2;
            mensaje = "Has perdido la mitad de tu dinero. Puedes seguir jugando o dejar de jugar.";
        } else if (resultado == 3) {
            imagen = "gato_suerte.png"; // El nombre del archivo de la imagen del gato de la suerte
            dinero *= 2;
            mensaje = "¡Enhorabuena! Has duplicado tu dinero. Puedes seguir jugando o dejar de jugar.";
        }
    %>

    <img src="<%= imagen %>" alt="Resultado">
    <p><%= mensaje %></p>
    <p>Dinero actual: <%= dinero %></p>

    <% if (dinero > 0 && resultado != 1) { %>
        <form action="juego.jsp" method="post">
            <input type="hidden" name="dinero" value="<%= dinero %>">
            <input type="submit" value="Seguir jugando">
        </form>
    <% } %>

    <form action="index.jsp" method="post">
        <input type="submit" value="Terminar juego">
    </form>
</body>
</html>
