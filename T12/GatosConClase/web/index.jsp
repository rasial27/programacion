<%-- 
    Document   : index.jsp
    Created on : 11 may. 2023, 19:39:50
    Author     : RSA
--%>

<%-- index.jsp (proyecto GatosConClase) --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="daw1.Gato"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Gatos con clase y bocadillos</title>
<link rel="stylesheet" type="text/css" href="estilos.css" />
</head>
<body>
<h1>Gatos con clase</h1>
<hr>
<form method="post" action="frase.jsp">
Introduzca el nombre del primer personaje:
<input type="text" name="cadenaIntro1">
<br>
<br>
Introduzca el nombre del segundo personaje:
<input type="text" name="cadenaIntro2">
<br>
<br>
Introduzca el nombre del terer personaje:
<input type="text" name="cadenaIntro3">
<br>
<input type="submit" value="OK">
</form>
</body>
</html>