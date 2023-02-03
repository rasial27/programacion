import java.util.Scanner;
/*
 * Ejercicio5.java
 * Introduces 10 numeros por teclado y aparece maximo y minimo en el que le corresponda
 
 * @ autoria RSA
 
 */
public class Ejercicio5 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int[] num = new int[10];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int i;

    System.out.println("Introducce 10 numeros: ");

    for(i = 0; i < 10; i++) {
      num[i] = s.nextInt();

      if (num[i] < min) {
        min = num[i];
      }

      if (num[i] > max) {
        max = num[i];
      }
    }

    System.out.println();

    for(i = 0; i < 10; i++) {
      System.out.print(num[i]);
      if (num[i] == max) {
        System.out.print(" maximo");
      }
      if (num[i] == min) {
        System.out.print(" minimo");
      }
      System.out.println();
    }
  }
    
}
