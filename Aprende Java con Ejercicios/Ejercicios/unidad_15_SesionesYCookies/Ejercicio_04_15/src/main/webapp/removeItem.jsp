<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
int index = Integer.parseInt(request.getParameter("index"));
List<Producto> carrito = (List<Producto>) session.getAttribute("carrito");

if (carrito != null && index >= 0 && index < carrito.size()) {
    carrito.remove(index);
    session.setAttribute("carrito", carrito);
}

response.sendRedirect("cart.jsp");
%>
