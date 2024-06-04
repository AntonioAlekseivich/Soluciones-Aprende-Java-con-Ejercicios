<%@page import="java.util.Collections"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html> 
<html> 
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contador de visitas</title> 
</head> 
<body> 
<%
if ("reset".equals(request.getParameter("action"))) {
    session.invalidate();
    session = request.getSession(true);
    response.sendRedirect(request.getRequestURI());
    return;
}

Integer counter = (Integer) session.getAttribute("n");
if (counter == null) {
    counter = 1;
} else {
    counter += 1;
}
session.setAttribute("n", counter);
%>
<h1><%=counter %></h1>

<form method="get">
    <button type="submit" name="action" value="reset">Reiniciar contador</button>
</form>
    
</body> 
</html>