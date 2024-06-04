<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tienda Online</title>
</head>
<body>

<%


List<Producto> catalogo = new ArrayList<>();
catalogo.add(new Producto("Producto 1", 10.0, "producto1.jpg"));
catalogo.add(new Producto("Producto 2", 20.0, "producto2.jpg"));
catalogo.add(new Producto("Producto 3", 30.0, "producto3.jpg"));
catalogo.add(new Producto("Producto 4", 40.0, "producto4.jpg"));

session.setAttribute("catalogo", catalogo);

// Obtener el carrito de la compra de la sesión
List<Producto> carrito = (List<Producto>) session.getAttribute("carrito");
if (carrito == null) {
    carrito = new ArrayList<>();
    session.setAttribute("carrito", carrito);
}

// Añadir un producto al carrito
String comprar = request.getParameter("comprar");
if (comprar != null) {
    int index = Integer.parseInt(comprar);
    Producto producto = catalogo.get(index);
    carrito.add(producto);
    session.setAttribute("carrito", carrito);
    response.sendRedirect("index.jsp");
    return;
}
%>

<h1>Catálogo de Productos</h1>
<% for (int i = 0; i < catalogo.size(); i++) { 
    Producto p = catalogo.get(i); %>
    <div>
        <h3><%= p.getNombre() %></h3>
        <img src="<%= p.getImagen() %>" alt="<%= p.getNombre() %>" width="100">
        <p>Precio: <%= p.getPrecio() %> €</p>
        <form method="get">
            <button type="submit" name="comprar" value="<%= i %>">Comprar</button>
        </form>
    </div>
<% } %>

<a href="cart.jsp">Ver Carrito</a>

</body>
</html>
