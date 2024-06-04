<!--ChatGpt-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tarrina de Helado</title>
    <style>
        .container {
            width: 300px;
            border: 1px solid #000;
            padding: 10px;
        }
        .chocolate {
            background-color: #7B3F00;
            color: #FFF;
        }
        .fresa {
            background-color: #FF6384;
            color: #FFF;
        }
        .vainilla {
            background-color: #F3E5AB;
            color: #000;
        }
        .hueco {
            background-color: #E0E0E0;
        }
    </style>
</head>
<body>
    <h1>Tarrina de Helado</h1>

    <%
        int chocolate = Integer.parseInt(request.getParameter("chocolate"));
        int fresa = Integer.parseInt(request.getParameter("fresa"));
        int vainilla = Integer.parseInt(request.getParameter("vainilla"));
        int total = chocolate + fresa + vainilla;

        if (total > 100) {
            out.println("<p style='color:red;'>La suma de los porcentajes debe ser menor o igual que 100. Por favor, introduzca de nuevo los porcentajes.</p>");
            out.println("<a href='index.jsp'>Volver</a>");
        } else {
    %>
        <div class="container">
            <% if (chocolate > 0) { %>
                <div class="chocolate" style="height: <%= chocolate %>px;">Chocolate: <%= chocolate %>%</div>
            <% } %>
            <% if (fresa > 0) { %>
                <div class="fresa" style="height: <%= fresa %>px;">Fresa: <%= fresa %>%</div>
            <% } %>
            <% if (vainilla > 0) { %>
                <div class="vainilla" style="height: <%= vainilla %>px;">Vainilla: <%= vainilla %>%</div>
            <% } %>
            <% if (total < 100) { %>
                <div class="hueco" style="height: <%= 100 - total %>px;">Hueco: <%= 100 - total %>%</div>
            <% } %>
        </div>
        <a href="index.jsp">Volver</a>
    <%
        }
    %>
</body>
</html>
