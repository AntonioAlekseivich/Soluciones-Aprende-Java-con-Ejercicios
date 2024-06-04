<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calendario Generado</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
        }
        .container {
            background-color: white;
            padding: 20px;
            margin: 50px auto;
            width: 600px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }
        h1 {
            color: #4CAF50;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1><%= request.getParameter("texto") %></h1>
        <p><%= request.getParameter("mes") %> <%= request.getParameter("anio") %></p>

        <%
            // Obtener los datos del formulario
            String mes = request.getParameter("mes");
            int anio = Integer.parseInt(request.getParameter("anio"));
            int diaSemana = Integer.parseInt(request.getParameter("diaSemana"));
            int numDias = Integer.parseInt(request.getParameter("numDias"));

            // Arrays para los días de la semana y nombres de los meses
            String[] diasSemana = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};

            // Generar el calendario
            out.println("<table>");
            out.println("<tr>");
            for (String dia : diasSemana) {
                out.println("<th>" + dia + "</th>");
            }
            out.println("</tr>");

            int diaActual = 1;
            boolean iniciado = false;

            for (int i = 0; i < 6; i++) {  // Máximo de 6 semanas en un mes
                out.println("<tr>");
                for (int j = 0; j < 7; j++) {
                    if (i == 0 && j < diaSemana) {
                        out.println("<td></td>");  // Celdas vacías hasta el día 1 del mes
                    } else if (diaActual <= numDias) {
                        out.println("<td>" + diaActual + "</td>");
                        diaActual++;
                    } else {
                        out.println("<td></td>");  // Celdas vacías después del último día del mes
                    }
                }
                out.println("</tr>");
                if (diaActual > numDias) break;
            }

            out.println("</table>");
        %>

        <a href="index.jsp">Generar otro calendario</a>
    </div>
</body>
</html>
