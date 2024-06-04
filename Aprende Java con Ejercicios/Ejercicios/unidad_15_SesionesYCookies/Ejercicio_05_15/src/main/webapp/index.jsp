<%@ page import="java.util.Locale" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Aplicación Multilingüe</title>
<link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>

<%
    // Leer la cookie de idioma
    Cookie[] cookies = request.getCookies();
    String idiomaSeleccionado = "es"; // Idioma por defecto

    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("idioma")) {
                idiomaSeleccionado = cookie.getValue();
                break;
            }
        }
    }

    // Guardar el idioma seleccionado en una cookie
    String idioma = request.getParameter("idioma");
    if (idioma != null) {
        idiomaSeleccionado = idioma;
        Cookie cookie = new Cookie("idioma", idiomaSeleccionado);
        cookie.setMaxAge(60*60*24*30); // La cookie dura 30 días
        response.addCookie(cookie);
    }

    // Traducciones
    String titulo = "Aplicación Multilingüe";
    String parrafo = "Esta es una aplicación que permite elegir el idioma.";

    if (idiomaSeleccionado.equals("en")) {
        titulo = "Multilingual Application";
        parrafo = "This is an application that allows you to choose the language.";
    } else if (idiomaSeleccionado.equals("fr")) {
        titulo = "Application Multilingue";
        parrafo = "Ceci est une application qui vous permet de choisir la langue.";
    }
%>

<div class="container">
    <h1><%= titulo %></h1>
    <p><%= parrafo %></p>

    <form method="get">
        <label for="idioma">Selecciona el idioma:</label>
        <select name="idioma" id="idioma">
            <option value="es" <%= "es".equals(idiomaSeleccionado) ? "selected" : "" %>>Español</option>
            <option value="en" <%= "en".equals(idiomaSeleccionado) ? "selected" : "" %>>English</option>
            <option value="fr" <%= "fr".equals(idiomaSeleccionado) ? "selected" : "" %>>Français</option>
        </select>
        <button type="submit">Cambiar Idioma</button>
    </form>
</div>

</body>
</html>

</body>
</html>