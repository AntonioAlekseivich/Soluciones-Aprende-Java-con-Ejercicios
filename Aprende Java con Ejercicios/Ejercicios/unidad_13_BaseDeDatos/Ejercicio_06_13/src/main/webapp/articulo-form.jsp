<%@ page import="java.util.List"%>
<%@ page import="com.example.banco.model.Articulo"%>

<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Formulario de Cliente</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f8ff;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #333;
        }
        .container {
            background-color: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            width: 300px;
            text-align: center;
        }
        h2 {
            color: #0066cc;
            margin-bottom: 20px;
        }
        label {
            display: block;
            margin-top: 10px;
            text-align: left;
        }
        input[type="text"] {
            width: calc(100% - 20px);
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            background-color: #0066cc;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            margin-top: 20px;
            transition: background-color 0.3s ease;
        }
        input[type="submit"]:hover {
            background-color: #004999;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            color: #0066cc;
        }
        a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
<% 
Articulo articulo = (Articulo) request.getAttribute("listArticulos");
    %>
    <div class="container">
        <h2>${articulo != null ? 'Editar articulo' : 'Agregar articulo'}</h2>
        <form action="ArticuloServlet?action=${articulo != null ? 'update' : 'insert'}" method="post">

            <input type="hidden" name="codigo" value="${articulo != null ? articulo.getCodigo() : ''}" >
            
            <label for="descripcion">Descripcion:</label>
            <input type="text" name="descripcion" id="descripcion" value="${articulo != null ? articulo.getDescripcion() : ''}" required>
            
            <label for="pCompra">Precio de compra:</label>
            <input type="number" name="pCompra" id="pCompra" value="${articulo != null ? articulo.getPrecioDeCompra() : ''}">
            
            <label for="pVenta">Precio de venta:</label>
            <input type="number" name="pVenta" id="pVenta" value="${articulo != null ? articulo.getPrecioDeVenta() : ''}">
            
            <label for="stock">Stock:</label>
            <input type="number" name="stock" id="stock" value="${articulo != null ? articulo.getStock() : ''}">
            
            <input type="submit" value="${articulo != null ? 'Actualizar' : 'Agregar'}">
        </form>
        <a href="index.jsp">Cancelar</a>
    </div>
</body>
</html>
