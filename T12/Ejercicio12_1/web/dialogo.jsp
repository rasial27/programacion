<%-- 
    Document   : dialogo
    Created on : 21 may. 2023, 16:34:00
    Author     : RSA
--%>
<%@page import="daw1.Personajes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    String nombrePersonaje1 = request.getParameter("nombrePersonaje1");
    String nombrePersonaje2 = request.getParameter("nombrePersonaje2");
    
    Personajes personaje1 = new Personajes(nombrePersonaje1, "personaje1.png");
    Personajes personaje2 = new Personajes(nombrePersonaje2, "personaje2.png");
    
    personaje1.setFrase("Buenas tardes, como le anda");
    personaje2.setFrase("Soy el Kun Agüero");
    
    String[] frases1 = {
        "Que miras bobo",
        "El partdio de ayer fue muy malo por tu parte",
        "Este partido lo ganamos"
    };
    
    String[] frases2 = {
        "Vamo a juga",
        "El partido de Cristiano de ayer fue mejor que tu partido",
        "Mañana marco dos goles de falta"
    };
    
    String fraseAleatoria1a = frases1[(int)(Math.random()* frases1.length)];
    String fraseAleatoria1b = frases1[(int)(Math.random()* frases1.length)];
    
    String fraseAleatoria2a = frases2[(int)(Math.random()* frases2.length)];
    String fraseAleatoria2b = frases2[(int)(Math.random()* frases2.length)];
    
%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Diálogo</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }
        
        h1, h2 {
            text-align: center;
            margin-bottom: 10px;
        }
        
        img {
            display: block;
            margin: 0 auto;
            max-width: 200px;
            max-height: 200px;
            margin-bottom: 20px;
        }
        
        p {
            text-align: center;
            font-size: 18px;
            margin-bottom: 10px;
        }
        
        /* Estilos para los bocadillos de los jugadores */
        .bocadillo-jugador1 {
            background-color: #FFD700;
            color: #000;
            padding: 10px;
            margin-right: 50px;
            display: inline-block;
            border-radius: 10px;
        }
        
        .bocadillo-jugador2 {
            background-color: #00BFFF;
            color: #FFF;
            padding: 10px;
            margin-left: 50px;
            display: inline-block;
            border-radius: 10px;
        }
        
        /* Estilos para la sección de nombre y presentación */
        .seccion-personaje {
            background-color: #333;
            color: #FFF;
            padding: 20px;
            margin-bottom: 20px;
        }
        
        .seccion-personaje h2 {
            font-size: 24px;
            margin-bottom: 5px;
        }
        
        .seccion-personaje p {
            font-size: 18px;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <div class="seccion-personaje">
        <h2>Personaje 1:</h2>
        <h3>Nombre: <%= personaje1.getNombre() %></h3>
        <p>Frase de presentación: <%= personaje1.getFrase() %></p>
        <img src="<%= personaje1.getImagen() %>" alt="Imagen 1">
    </div>
    
    <div class="seccion-personaje">
        <h2>Personaje 2:</h2>
        <h3>Nombre: <%= personaje2.getNombre() %></h3>
        <p>Frase de presentación: <%= personaje2.getFrase() %></p>
        <img src="<%= personaje2.getImagen() %>" alt="Imagen 2">
    </div>
    
    <h2>Conversación</h2>
    
    <p><span class="bocadillo-jugador1"><%= personaje1.getNombre() %>: <%= fraseAleatoria1a %></span></p>
    <p><span class="bocadillo-jugador2"><%= personaje2.getNombre() %>: <%= fraseAleatoria2a %></span></p>
    <p><span class="bocadillo-jugador1"><%= personaje1.getNombre() %>: <%= fraseAleatoria1b %></span></p>
    <p><span class="bocadillo-jugador2"><%= personaje2.getNombre() %>: <%= fraseAleatoria2b %></span></p>
</body>
</html>



