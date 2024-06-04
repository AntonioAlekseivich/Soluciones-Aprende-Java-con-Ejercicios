<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Conectando a la bd</title>
    <style>
        /* Your existing styles here */
    </style>
    <script>
        // JavaScript function to redirect to the servlet after a delay
        function redirectToServlet() {
            setTimeout(function() {
                window.location.href = "InitServlet";
            }, 3000); // 3000 milliseconds = 3 seconds
        }
    </script>
</head>
<body onload="redirectToServlet()">
    <h1>Connecting</h1>
    <%@ page session="true" %>

<%
    // Set a session attribute indicating the source page
    session.setAttribute("sourcePage", "index.jsp");
%>
</body>
</html>
