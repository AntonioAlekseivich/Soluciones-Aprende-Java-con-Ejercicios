<!--Chatgpt-->



<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultados de las Elecciones</title>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>
    <h1>Resultados de las Elecciones</h1>

    <%
        // Obtener los votos de los parámetros del formulario
        int votosPartido1 = Integer.parseInt(request.getParameter("partido1"));
        int votosPartido2 = Integer.parseInt(request.getParameter("partido2"));
        int votosPartido3 = Integer.parseInt(request.getParameter("partido3"));
        int votosPartido4 = Integer.parseInt(request.getParameter("partido4"));

        // Calcular el total de votos
        int totalVotos = votosPartido1 + votosPartido2 + votosPartido3 + votosPartido4;

        // Calcular los porcentajes
        double porcentajePartido1 = (double) votosPartido1 / totalVotos * 100;
        double porcentajePartido2 = (double) votosPartido2 / totalVotos * 100;
        double porcentajePartido3 = (double) votosPartido3 / totalVotos * 100;
        double porcentajePartido4 = (double) votosPartido4 / totalVotos * 100;
    %>

    <h2>Gráfica de Resultados</h2>
    <canvas id="graficaVotos" width="400" height="400"></canvas>
    <script>
        var ctx = document.getElementById('graficaVotos').getContext('2d');
        var graficaVotos = new Chart(ctx, {
            type: 'pie',
            data: {
                labels: ['Partido 1', 'Partido 2', 'Partido 3', 'Partido 4'],
                datasets: [{
                    label: 'Votos',
                    data: [
                        <%= votosPartido1 %>,
                        <%= votosPartido2 %>,
                        <%= votosPartido3 %>,
                        <%= votosPartido4 %>
                    ],
                    backgroundColor: [
                        'rgba(255, 99, 132, 0.2)',
                        'rgba(54, 162, 235, 0.2)',
                        'rgba(255, 206, 86, 0.2)',
                        'rgba(75, 192, 192, 0.2)'
                    ],
                    borderColor: [
                        'rgba(255, 99, 132, 1)',
                        'rgba(54, 162, 235, 1)',
                        'rgba(255, 206, 86, 1)',
                        'rgba(75, 192, 192, 1)'
                    ],
                    borderWidth: 1
                }]
            },
            options: {
                responsive: true,
                plugins: {
                    legend: {
                        position: 'top',
                    },
                    tooltip: {
                        callbacks: {
                            label: function(context) {
                                let label = context.label || '';
                                let value = context.raw || 0;
                                let percentage = (value / <%= totalVotos %> * 100).toFixed(2) + '%';
                                return label + ': ' + value + ' votos (' + percentage + ')';
                            }
                        }
                    }
                }
            }
        });
    </script>

    <h2>Tabla de Resultados</h2>
    <table border="1">
        <tr>
            <th>Partido</th>
            <th>Votos</th>
            <th>Porcentaje</th>
        </tr>
        <tr>
            <td>Partido 1</td>
            <td><%= votosPartido1 %></td>
            <td><%= String.format("%.2f", porcentajePartido1) %> %</td>
        </tr>
        <tr>
            <td>Partido 2</td>
            <td><%= votosPartido2 %></td>
            <td><%= String.format("%.2f", porcentajePartido2) %> %</td>
        </tr>
        <tr>
            <td>Partido 3</td>
            <td><%= votosPartido3 %></td>
            <td><%= String.format("%.2f", porcentajePartido3) %> %</td>
        </tr>
        <tr>
            <td>Partido 4</td>
            <td><%= votosPartido4 %></td>
            <td><%= String.format("%.2f", porcentajePartido4) %> %</td>
        </tr>
    </table>

    <br>
    <a href="index.jsp">Volver</a>
</body>
</html>
