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
    <div class="container">
        <h2>${cliente != null ? 'Editar Cliente' : 'Agregar Cliente'}</h2>
        <form action="ClienteServlet?action=${cliente != null ? 'update' : 'insert'}" method="post">
            <input type="hidden" name="id" value="${cliente != null ? cliente.id : ''}">
            <label for="nombreCompleto">Nombre Completo:</label>
            <input type="text" name="nombreCompleto" id="nombreCompleto" value="${cliente != null ? cliente.nombreCompleto : ''}" required>
            
            <label for="direccion">Dirección:</label>
            <input type="text" name="direccion" id="direccion" value="${cliente != null ? cliente.direccion : ''}" required>
            
            <label for="telefono">Teléfono:</label>
            <input type="text" name="telefono" id="telefono" value="${cliente != null ? cliente.telefono : ''}">
            
            <label for="fechaNacimiento">Fecha de Nacimiento:</label>
            <input type="text" name="fechaNacimiento" id="fechaNacimiento" value="${cliente != null ? cliente.fechaNacimiento : ''}" required>
            
            <input type="submit" value="${cliente != null ? 'Actualizar' : 'Agregar'}">
        </form>
        <a href="index.jsp">Cancelar</a>
    </div>
</body>
</html>
