<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
    <title>Pirámide</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f9;
            color: #333;
            text-align: center;
            margin-top: 50px;
        }
        h1 {
            color: #5a5a5a;
        }
        .pyramid {
            display: inline-block;
            text-align: left;
        }
    </style>
</head>
<body>
    <h1>Pirámide</h1>
    <div class="pyramid">
    <%
        int altura = 5;  // Puedes cambiar la altura de la pirámide aquí
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                out.print("&nbsp;&nbsp;");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                out.print("*");
            }
            out.println("<br>");
        }
    %>
    </div>
</body>
</html>
