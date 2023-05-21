<%@ page import="daw1.Jugadores" %>
<!DOCTYPE html>
<html>
<head>
    <title>Juego de Piedra, Papel o Tijera</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        text-align: center;
        background-color: #f2f2f2;
        padding-top: 50px;
    }

    h1 {
        color: #333333;
        font-size: 28px;
        margin-bottom: 20px;
        text-transform: uppercase;
        letter-spacing: 2px;
    }

    .juego {
        display: flex;
        justify-content: center;
        align-items: center;
        margin-bottom: 30px;
    }

    .jugador {
        margin: 20px;
    }

    .imagen {
        width: 200px;
        height: 200px;
        border-radius: 50%;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
    }

    .nombreJugador {
        margin-top: 10px;
        font-size: 24px;
        color: #555555;
    }

    .puntos {
        margin-top: 10px;
        font-size: 20px;
        color: #777777;
        letter-spacing: 1px;
    }

    .ganador {
        font-size: 48px;
        color: #4CAF50;
        margin-bottom: 30px;
        text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.2);
    }

    .fraseGanador {
        margin-top: 10px;
        font-size: 24px;
        font-weight: bold;
        color: #2196F3;
    }
</style>

</head>
<body>
    <h1>Inicio de la partida</h1><br>
    <h1>Juego del piedra, papel o tijeras</h1>
    <%
        String[] jugada = {"Piedra", "Papel", "Tijera"};
        Jugadores jugador1 = new Jugadores("Jugador 1", "jugador1.png");
        Jugadores jugador2 = new Jugadores("Jugador 2", "jugador2.png");
        
        jugador1.setFrase("Como estan los maquinas");
        jugador2.setFrase("Siiuuuuu");
        
        int puntos1 = 0;
        int puntos2 = 0;
        
        while(puntos1 < 5 && puntos2 < 5) {
          String jugadaJugador1 = generarJugada(jugada);
          String jugadaJugador2 = generarJugada(jugada);
          
          int resultado = result(jugadaJugador1, jugadaJugador2);
          if (resultado == 1){
          puntos1++;
          } else if (resultado == 2) {
            puntos2++;
          }
          
          %>
          <div class ="juego">
              <div class ="jugador">
                  <img src="<%= jugador1.getImagen() %>" class ="imagen">
                  <div class ="nombreJugador"><%= jugador1.getNombre() %></div>
              </div>
              <div class ="jugador">
                  <img src="<%= jugador2.getImagen() %>" class ="imagen">
                  <div class ="nombreJugador"><%= jugador2.getNombre() %></div>
              </div>
          </div>
          <div class="puntos">
              Jugador 1: <%= jugadaJugador1 %> Puntos: <%= puntos1 %><br>
              Jugador 2: <%= jugadaJugador2 %> Puntos: <%= puntos2 %><br>
          </div>    
          <%
        }
        
        String ganador;
        String fraseGanador; 
        String imagenGanador;
        if (puntos1 == 5) {
          ganador = jugador1.getNombre();
          fraseGanador = jugador1.getFrase();
          imagenGanador = jugador1.getImagen();
        } else {
          ganador = jugador2.getNombre();
          fraseGanador = jugador2.getFrase();
          imagenGanador = jugador2.getImagen();
        }
        %>
        
        <h2 class ="ganador">Ganador: <%= ganador %></h2>
        <div class="jugador">
            <img src="<%= imagenGanador %>" class="imagen">
            <div class="fraseGanador"><%= fraseGanador %>
        </div>
        
        <%!
            public String generarJugada(String[] jugada) {
              int jugadaAl = (int)(Math.random() * jugada.length);
              return jugada[jugadaAl];
            }

            public int result(String jugadaJugador1, String jugadaJugador2) {
              if (jugadaJugador1.equals(jugadaJugador2)) {
                return 0;
              } else if (jugadaJugador1.equals("Piedra") && jugadaJugador2.equals("Tijera") ||
                         jugadaJugador1.equals("Papel") && jugadaJugador2.equals("Piedra") ||
                         jugadaJugador1.equals("Tijera") && jugadaJugador2.equals("Papel")) {
                return 1;
                } else {
                    return 2;
                  }
            }
            %>
</body>
</html>
