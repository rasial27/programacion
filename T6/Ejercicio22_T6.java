import java.util.Scanner;
/*
 * Ejercicio22.java
 * Pinta una serpiente con la longitud que se ingresa y el serpenteo que se dice en el enunciado
  
 * @ autoria RSA
 
 */
public class Ejercicio22_T6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce la longitud de la serpiente(se cuenta la cabeza de la serpiente): ");
    int lon = s.nextInt();

    int posActual = 13; // posición actual de la cabeza de la serpiente
    int direccion; // dirección del siguiente carácter de la serpiente

    for (int i = 0; i < 12; i++) {
      System.out.print(" ");
    }
    System.out.println("@");

    for (int i = 1; i < lon; i++) {
      direccion = (int) (Math.random() * 3);
      if (direccion == 0) {
        posActual--;
        for(int j = 0; j <posActual; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
      } else if (direccion == 1) {
        for (int j = 0; j < posActual; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
      } else {
        posActual++;
        for (int j = 0; j < posActual; j++) {
          System.out.print(" ");
        }
        System.out.println("*");
      }
    }
  }
}



  
  

