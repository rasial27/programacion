<%-- 
    Document   : index
    Created on : 19 may. 2023, 10:25:12
    Author     : RSA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Introducción de nombres</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
            text-align: center;
        }
        
        h1 {
            color: #333;
            margin-top: 50px;
        }
        
        form {
            display: inline-block;
            margin-top: 30px;
        }
        
        label {
            font-size: 18px;
            color: #333;
            display: block;
            margin-bottom: 10px;
        }
        
        input[type="text"] {
            padding: 10px;
            font-size: 16px;
            border-radius: 5px;
            border: 1px solid #ccc;
            width: 250px;
        }
        
        input[type="submit"] {
            padding: 10px 20px;
            font-size: 16px;
            background-color: #333;
            color: #FFF;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        
        input[type="submit"]:hover {
            background-color: #555;
        }
    </style>
</head>
<body>
    <h1>Introducción de nombres</h1>
    
    <form action="dialogo.jsp" method="post">
        <label for="nombrePersonaje1">Nombre del personaje 1:</label>
        <br>
        <input type="text" id="nombrePersonaje1" name="nombrePersonaje1">
        <br>
        <br>
        <label for="nombrePersonaje2">Nombre del personaje 2:</label>
        <br>
        <input type="text" id="nombrePersonaje2" name="nombrePersonaje2">
        <br>
        <br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>

