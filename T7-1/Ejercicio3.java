import java.util.Scanner;
/*
 *Ejercicio3.java
 *Lee 10 numeros por teclado y los muestra en orden inverso
 
 *@ autoria RSA
 
*/

public class Ejercicio3 {
  public static void main (String[] args) {
    int[] num = new int[10];
    Scanner s = new Scanner(System.in);
    int i;
    
    System.out.println("Introduce 10 numeros: ");
    
    for (i = 0; i < 10; i++) {
      num[i] = s.nextInt();
    }
    
    System.out.println("Los numeros introducidos al reves son: ");
    for (i = 9; i >= 0; i--) {
      System.out.println(num[i]);
    }

  }
}
