<!--Chatgpt-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Partida Finalizada de Tres en Raya</title>
    <style>
        table {
            border-collapse: collapse;
            margin: 20px auto;
        }
        td {
            width: 60px;
            height: 60px;
            border: 1px solid #000;
            text-align: center;
            font-size: 2em;
        }
    </style>
</head>
<body>
    <h1>Partida Finalizada de Tres en Raya</h1>

    <%
        // Crear el tablero vacío
        String[][] tablero = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = "";
            }
        }

        // Generar posiciones únicas para los círculos y cruces
        java.util.Random rand = new java.util.Random();
        int[] posiciones = new int[6];
        for (int i = 0; i < 6; i++) {
            int pos;
            boolean repetido;
            do {
                repetido = false;
                pos = rand.nextInt(9);
                for (int j = 0; j < i; j++) {
                    if (posiciones[j] == pos) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            posiciones[i] = pos;
        }

        // Asignar círculos y cruces a las posiciones generadas
        for (int i = 0; i < 3; i++) {
            int fila = posiciones[i] / 3;
            int columna = posiciones[i] % 3;
            tablero[fila][columna] = "O";
        }
        for (int i = 3; i < 6; i++) {
            int fila = posiciones[i] / 3;
            int columna = posiciones[i] % 3;
            tablero[fila][columna] = "X";
        }

        // Mostrar el tablero
    %>
    <table>
        <%
            for (int i = 0; i < 3; i++) {
                out.println("<tr>");
                for (int j = 0; j < 3; j++) {
                    out.println("<td>" + tablero[i][j] + "</td>");
                }
                out.println("</tr>");
            }
        %>
    </table>
</body>
</html>
