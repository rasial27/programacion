import java.util.Scanner;
/*
 * Ejercicio20.java
 * Pinta por pantalla un cubo donde el usuario ingresa la capacidad y el programa pinta el contenido de manera aleatoria
 
 * @ autoria RSA

 */
public class Ejercicio20_T6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce la capacidad de la cuba: ");
    int cap = s.nextInt();

    int l = (int)(Math.random()*(cap + 1));

    for (int i = 0; i < cap; i++) {
      if (i < (cap - l)) {
        System.out.println("*    *");
      } else {
        System.out.println("*====*");
      }
    }
    
    System.out.println("******");
    System.out.print("La cuba tiene una capacidad de " +cap + " litros y contiene " +l + " litros");
  }
}
