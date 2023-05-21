<%-- 
    Document   : presentacion
    Created on : 12 may. 2023, 18:54:56
    Author     : RSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Presentacion</title>
</head>
<body>
<% request.setCharacterEncoding("UTF-8"); %>
<% out.print(request.getParameter("cadenaIntro1"));%>
,soy el entrenador del FC Barcelona
<br>
<br>
<% out.print(request.getParameter("cadenaIntro2"));%>
,soy el entrenador del Real Madrid
<br>
<br>
<% out.print(request.getParameter("cadenaIntro3"));%>
,soy el entrenador del Atletico de madrid
</body>
</html>
