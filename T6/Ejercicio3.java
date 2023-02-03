/*
 * Ejercicio3.java
 * Muestra al azar una carta de de la baraja española
  
 * @ autoria RSA
 
 */
public class Ejercicio3 {
    public static void main (String [] args) {
      String carta = "";
      String palo = "";
  
      int numCarta = (int)(Math.random()*11) + 1;
      
      switch(numCarta) {
        case 1:
          carta = "As";
          break;
        case 8:
          carta = "sota";
          break;
        case 9:
          carta = "caballo";
          break;
        case 10:
          carta = "rey";
          break;
        default:
          carta = String.valueOf(numCarta);        
      }
  
      int numPalo = (int)(Math.random()*4) + 1;
  
      switch(numPalo) {
          case 1:
            palo = "espadas";
            break;
          case 2:
            palo = "oros";
            break;
          case 3:
            palo = "copas";
            break;
          case 4:
            palo = "bastos";
            break;
          default:        
      }
  
      System.out.println("Tu carta es: " +carta +" de " +palo);
    }
      
  }
  