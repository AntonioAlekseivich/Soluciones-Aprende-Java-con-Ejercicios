<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resumen del Pedido</title>
</head>
<body>
    <h1>Resumen del Pedido</h1>

    <%
        // Precios de los productos
        double precioQuinoa = 6.95;
        double precioHamburguesa = 6.20;
        double precioPizza = 4.90;
        double precioEnsalada = 5.50;
        double precioAgua = 1.00;
        double precioCerveza = 1.50;
        double precioRefresco = 1.40;

        // Cantidades solicitadas
        int cantidadQuinoa = Integer.parseInt(request.getParameter("quinoa"));
        int cantidadHamburguesa = Integer.parseInt(request.getParameter("hamburguesa"));
        int cantidadPizza = Integer.parseInt(request.getParameter("pizza"));
        int cantidadEnsalada = Integer.parseInt(request.getParameter("ensalada"));
        int cantidadAgua = Integer.parseInt(request.getParameter("agua"));
        int cantidadCerveza = Integer.parseInt(request.getParameter("cerveza"));
        int cantidadRefresco = Integer.parseInt(request.getParameter("refresco"));

        // Calcular el total
        double total = (cantidadQuinoa * precioQuinoa) +
                       (cantidadHamburguesa * precioHamburguesa) +
                       (cantidadPizza * precioPizza) +
                       (cantidadEnsalada * precioEnsalada) +
                       (cantidadAgua * precioAgua) +
                       (cantidadCerveza * precioCerveza) +
                       (cantidadRefresco * precioRefresco);

        // Mostrar resumen del pedido
        if (total > 0) {
            out.println("<p>Has pedido:</p>");
            out.println("<ul>");
            if (cantidadQuinoa > 0) out.println("<li>" + cantidadQuinoa + " Quinoa con verdura: €" + (cantidadQuinoa * precioQuinoa) + "</li>");
            if (cantidadHamburguesa > 0) out.println("<li>" + cantidadHamburguesa + " Hamburguesa vegetariana: €" + (cantidadHamburguesa * precioHamburguesa) + "</li>");
            if (cantidadPizza > 0) out.println("<li>" + cantidadPizza + " Pizza caprese: €" + (cantidadPizza * precioPizza) + "</li>");
            if (cantidadEnsalada > 0) out.println("<li>" + cantidadEnsalada + " Ensalada de garbanzos: €" + (cantidadEnsalada * precioEnsalada) + "</li>");
            if (cantidadAgua > 0) out.println("<li>" + cantidadAgua + " Botellín de agua: €" + (cantidadAgua * precioAgua) + "</li>");
            if (cantidadCerveza > 0) out.println("<li>" + cantidadCerveza + " Cerveza: €" + (cantidadCerveza * precioCerveza) + "</li>");
            if (cantidadRefresco > 0) out.println("<li>" + cantidadRefresco + " Refresco: €" + (cantidadRefresco * precioRefresco) + "</li>");
            out.println("</ul>");
            out.println("<p>Total: €" + total + "</p>");
        } else {
            out.println("<p>No has pedido nada.</p>");
        }
    %>
    <a href="index.jsp">Volver</a>
</body>
</html>
