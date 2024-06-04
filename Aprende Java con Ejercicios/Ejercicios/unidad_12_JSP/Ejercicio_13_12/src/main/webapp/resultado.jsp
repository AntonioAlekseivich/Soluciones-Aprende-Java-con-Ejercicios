<!--Hecho por chatGpt-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado del Test de Infidelidad</title>
</head>
<body>
    <h1>Resultado del Test de Infidelidad</h1>

    <%
        // Obtener las respuestas del formulario
        String[] preguntas = {"p1", "p2", "p3", "p4", "p5"};
        int puntuacion = 0;

        for (String pregunta : preguntas) {
            String respuesta = request.getParameter(pregunta);
            if ("si".equals(respuesta)) {
                puntuacion++;
            }
        }

        // Determinar el resultado basado en la puntuacion
        String resultado;
        if (puntuacion == 0) {
            resultado = "Su pareja parece ser completamente fiel.";
        } else if (puntuacion <= 2) {
            resultado = "Hay algunas senales preocupantes, pero nada concluyente.";
        } else if (puntuacion <= 4) {
            resultado = "Hay muchas senales de alerta. Es posible que algo no vaya bien.";
        } else {
            resultado = "Es muy probable que su pareja este siendo infiel.";
        }

        // Mostrar el resultado
        out.println("<p>Ha respondido 'Si' a " + puntuacion + " preguntas.</p>");
        out.println("<p>" + resultado + "</p>");
    %>
</body>
</html>
