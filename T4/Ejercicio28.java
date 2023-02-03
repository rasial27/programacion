import java.util.Scanner;
/*
 *Ejercicio28.java
 *Juego de piedra, papel o tijeras
 
 *@ autoria RSA
 
*/

public class Ejercicio28 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca piedra, papel o tijera: ");
    String jugador1 = s.nextLine();
    System.out.print("Turno del jugador 2. Introduzca piedra, papel o tijera: ");
    String jugador2 = s.nextLine();
    
    int vencedor = 2;
    
    if (jugador1.equals(jugador2)) {
      System.out.print("empate");
    } else {
      switch (jugador1) {
        case "piedra":
          if (jugador2.equals("tijera")) {
            vencedor = 1;
          }
          break; 
          
        case "tijera":
          if (jugador2.equals("papel")) {
            vencedor = 1;
          }
          break;  
          
        case "papel":
          if (jugador2.equals("piedra")) {
            vencedor = 1;
          }
          break; 
      }
    }  
      
    System.out.print("El ganador es el jugador " +vencedor);
      
    }
   }            
