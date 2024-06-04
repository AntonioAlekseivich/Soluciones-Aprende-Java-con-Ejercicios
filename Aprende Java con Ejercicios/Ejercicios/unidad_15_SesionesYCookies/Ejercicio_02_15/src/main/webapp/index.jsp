<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calcular Media</title>
</head>
<body>

<%
    // Obtener el número introducido por el usuario
    String numStr = request.getParameter("numero");
    List<Integer> numeros = (List<Integer>) session.getAttribute("numeros");
    
    // Inicializar la lista de números si es la primera vez
    if (numeros == null) {
        numeros = new ArrayList<>();
    }

    if (numStr != null) {
        try {
            int numero = Integer.parseInt(numStr);
            if (numero >= 0) {
                numeros.add(numero);
            } else {
                // Calcular la media si se introduce un número negativo
                int suma = 0;
                for (int num : numeros) {
                    suma += num;
                }
                double media = numeros.isEmpty() ? 0 : (double) suma / numeros.size();
                session.invalidate();  // Limpiar la sesión para empezar de nuevo
                out.println("<h2>Media de los números introducidos: " + media + "</h2>");
                numeros = null;
            }
        } catch (NumberFormatException e) {
            out.println("<p style='color:red;'>Por favor, introduce un número válido.</p>");
        }
    }

    if (numeros != null) {
        session.setAttribute("numeros", numeros);
    }
%>

<% if (numeros != null) { %>
    <form method="get">
        <label for="numero">Introduce un número positivo (o un número negativo para terminar):</label>
        <input type="text" id="numero" name="numero" required>
        <button type="submit">Enviar</button>
    </form>
    <h2>Números introducidos: <%= numeros %></h2>
<% } else { %>
    <form method="get">
        <label for="numero">Introduce un número positivo para comenzar:</label>
        <input type="text" id="numero" name="numero" required>
        <button type="submit">Enviar</button>
    </form>
<% } %>

</body>
</html>
