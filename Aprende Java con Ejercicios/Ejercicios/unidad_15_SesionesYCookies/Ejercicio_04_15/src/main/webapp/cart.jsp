<%@page import="java.util.List"%>
<%@page import="model.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Carrito de la Compra</title>
</head>
<body>

<h1>Carrito de la Compra</h1>

<%
// Obtener el carrito de la compra de la sesión
List<Producto> carrito = (List<Producto>) session.getAttribute("carrito");

if (carrito == null || carrito.isEmpty()) {
    out.println("<p>El carrito está vacío.</p>");
} else {
    double total = 0;
    for (int i = 0; i < carrito.size(); i++) {
        Producto p = carrito.get(i);
        total += p.getPrecio();
%>
        <div>
            <h3><%= p.getNombre() %></h3>
            <img src="<%= p.getImagen() %>" alt="<%= p.getNombre() %>" width="100">
            <p>Precio: <%= p.getPrecio() %> €</p>
            <form action="removeItem.jsp" method="post">
                <input type="hidden" name="index" value="<%= i %>">
                <button type="submit">Eliminar</button>
            </form>
        </div>
<%  }
    out.println("<h3>Total: " + total + " €</h3>");
} %>

<a href="index.jsp">Seguir comprando</a>

</body>
</html>
