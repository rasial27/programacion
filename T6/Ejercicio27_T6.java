import java.util.Scanner;
/*
 * Ejercicio 27.java
 * Juego de piedra, papel y tijeras, primero elige el usuario y luego al azar el ordenador
  
 * @ autoria RSA
 
 */
public class Ejercicio27_T6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Ingrese eleccion de piedra, papel o tijera: ");
    String persona = s.nextLine();

    int elec = (int)(Math.random()* 3);
    String pc = "";

    switch (elec) {
      case 0:
        pc = "piedra";
        break;
      case 1:
        pc = "papel";
        break; 
      case 2:
        pc = "tijera";
        break; 
      default:    
    }

    System.out.println("Eleccion del ordenador: " +pc);

    if (persona.equals(pc)) {
      System.out.print("Empate");
    } else {
      int ganador = 2;
      switch (persona) {
        case "piedra":
          if (pc.equals("tijera")) {
            ganador = 1;
          }
          break;
        case "papel":
          if (pc.equals("piedra")) {
            ganador = 1;
          }
          break; 
        case "tijera":
          if (pc.equals("papel")) {
            ganador = 1;
          }
          break; 
        default:    
      }

      if (ganador == 1) {
        System.out.println("Gana la persona");
      } else {
        System.out.print("Gana la maquina");
      }
    }
  }
}
