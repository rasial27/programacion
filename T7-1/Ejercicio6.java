import java.util.Scanner;
/*
 * Ejercicio6.java
 * Introduce por pantalla 15 numeros, los numeros avanzan una posicion y el ultimo pasa a ser el primero
  
 * @ autoria RSA
 
 */
public class Ejercicio6 {
  public static void main(String[] atgs) {
    Scanner s = new Scanner(System.in);

    int[] num = new int[15];
    int i;
    
    System.out.print("Introduce 15 numeros: ");

    for(i = 0; i < 15; i++) {
      num[i] = s.nextInt();
    }

    System.out.println();

    System.out.println("Original:");
  

    for (i = 0; i < 15; i++) {
      System.out.printf("|%3d ", num[i]);
    }

    System.out.println("|");

    int aux = num[14];
    for (i = 14; i > 0; i--) {
      num[i] = num[i-1];
    }

    num[0] = aux;

    System.out.println("\nrotado :");
   
    for (i = 0; i < 15; i++) {
      System.out.printf("|%3d ", num[i]);
    }
    
    System.out.println("|");


  }
}
