<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="jakarta.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Aplicación de Colores</title>
<style>
<%
    // Leer las cookies para obtener los colores seleccionados
    String backgroundColor = "#ffffff"; // Color de fondo por defecto
    String textColor = "#000000"; // Color de texto por defecto

    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
        	System.out.println(cookie.getName());
            if (cookie.getName().equals("backgroundColor")) {
                backgroundColor = cookie.getValue();
            } else if (cookie.getName().equals("textColor")) {
                textColor = cookie.getValue();
            }
        }
    }

    // Guardar los colores seleccionados en cookies
    String newBackgroundColor = request.getParameter("backgroundColor");
    String newTextColor = request.getParameter("textColor");

    if (newBackgroundColor != null && newTextColor != null) {
        backgroundColor = newBackgroundColor;
        textColor = newTextColor;

        Cookie bgColorCookie = new Cookie("backgroundColor", backgroundColor);
        bgColorCookie.setMaxAge(60*60*24*30); // La cookie dura 30 días
        response.addCookie(bgColorCookie);

        Cookie textColorCookie = new Cookie("textColor", textColor);
        textColorCookie.setMaxAge(60*60*24*30); // La cookie dura 30 días
        response.addCookie(textColorCookie);
    }
%>
    body {
        background-color: <%= backgroundColor %>;
        color: <%= textColor %>;
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
    }
    .container {
        text-align: center;
    }
    form {
        margin-top: 20px;
    }
    input[type="color"] {
        margin: 5px;
    }
    button {
        padding: 10px 20px;
        border: none;
        background-color: #5cb85c;
        color: white;
        cursor: pointer;
        border-radius: 4px;
        transition: background-color 0.3s ease;
    }
    button:hover {
        background-color: #4cae4c;
    }
</style>
</head>
<body>

<div class="container">
    <h1>Aplicación de Colores</h1>
    <p>Seleccione los colores de fondo y de la fuente:</p>
    <form method="get">
        <label for="backgroundColor">Color de fondo:</label>
        <input type="color" id="backgroundColor" name="backgroundColor" value="<%= backgroundColor %>">
        <br>
        <label for="textColor">Color de la fuente:</label>
        <input type="color" id="textColor" name="textColor" value="<%= textColor %>">
        <br>
        <button type="submit">Guardar Colores</button>
    </form>
</div>

</body>
</html>
