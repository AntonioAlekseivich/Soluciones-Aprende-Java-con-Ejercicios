<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Seleccionar Ejercicio</title>
    <style>
        .container {
            max-width: 600px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 10px;
            background-color: #f9f9f9;
        }

        h2 {
            text-align: center;
        }

        .exercise-option {
            display: block;
            margin: 10px 0;
        }

        .submit-btn {
            display: block;
            width: 100%;
            padding: 10px;
            margin-top: 20px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .submit-btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<%-- Check if the noPermissions attribute is set --%>
    <% if (request.getAttribute("noPermissions") != null && (boolean) request.getAttribute("noPermissions")) { %>
        <p>You have no permissions to access this exercise.</p>
    <% } %>
    
    <div class="container">
        <h2>Seleccionar Ejercicio</h2>
        <form action="CheckPermission" method="post">
            <div class="exercise-option">
              <input type="hidden" name="username" value="<%= request.getAttribute("username") %>">
                <input type="radio" id="piramide" name="exercise" value="piramid" required>
                <label for="piramide">Pirámide</label>
            </div>
            <div class="exercise-option">
                <input type="radio" id="tresEnRaya" name="exercise" value="tresEnRaya">
                <label for="tresEnRaya">Tres en Raya</label>
            </div>
            <div class="exercise-option">
                <input type="radio" id="dado" name="exercise" value="dado">
                <label for="dado">Tercer Ejercicio</label>
            </div>
            <button type="submit" class="submit-btn">Seleccionar</button>
        </form>
    </div>
</body>
</html>
