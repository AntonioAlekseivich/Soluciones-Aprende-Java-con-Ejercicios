<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tablero de Ajedrez</title>
    <style>
        table {
            border-collapse: collapse;
            width: 400px;
            height: 400px;
        }
        td {
            width: 50px;
            height: 50px;
            text-align: center;
            vertical-align: middle;
            font-size: 24px;
        }
        .white {
            background-color: #ffffff;
        }
        .black {
            background-color: #000000;
            color: #ffffff;
        }
    </style>
</head>
<body>
    <h1>Tablero de Ajedrez</h1>

    <%
        // Generar posiciones aleatorias para el alfil y el caballo
        int alfilRow, alfilCol, caballoRow, caballoCol;
        do {
            alfilRow = (int) (Math.random() * 8);
            alfilCol = (int) (Math.random() * 8);
            caballoRow = (int) (Math.random() * 8);
            caballoCol = (int) (Math.random() * 8);
        } while (alfilRow == caballoRow && alfilCol == caballoCol);

        // Array de letras para las columnas
        char[] columnLabels = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
    %>

    <table border="1">
        <tr>
            <th></th>
            <% for (int col = 0; col < 8; col++) { %>
                <th><%= columnLabels[col] %></th>
            <% } %>
        </tr>
        <% for (int row = 0; row < 8; row++) { %>
            <tr>
                <th><%= row + 1 %></th>
                <% for (int col = 0; col < 8; col++) { %>
                    <td class="<%= (row + col) % 2 == 0 ? "white" : "black" %>">
                        <% if (row == alfilRow && col == alfilCol) { %>
                            &#9815; <!-- Unicode para el alfil blanco -->
                        <% } else if (row == caballoRow && col == caballoCol) { %>
                            &#9816; <!-- Unicode para el caballo blanco -->
                        <% } %>
                    </td>
                <% } %>
            </tr>
        <% } %>
    </table>
</body>
</html>
