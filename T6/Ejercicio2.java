/*
 * Ejercicio2.java
 * Muestra al azar una carta de de la baraja francesa
  
 * @ autoria RSA
 
 */
public class Ejercicio2 {
  public static void main (String [] args) {
    String carta = "";
    String palo = "";

    int numCarta = (int)(Math.random()*13) + 1;
    
    switch(numCarta) {
      case 1:
        carta = "As";
        break;
      case 11:
        carta = "J";
        break;
      case 12:
        carta = "Q";
        break;
      case 13:
        carta = "K";
        break;
      default:
        carta = String.valueOf(numCarta);        
    }

    int numPalo = (int)(Math.random()*4) + 1;

    switch(numPalo) {
        case 1:
          palo = "treboles";
          break;
        case 2:
          palo = "diamantes";
          break;
        case 3:
          palo = "picas";
          break;
        case 4:
          palo = "corazones";
          break;
        default:        
    }

    System.out.println("Tu carta es: "+carta +" de " +palo);
  }
    
}
