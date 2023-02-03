import java.util.Scanner;
/*
 * Ejercicio9.java
 * Introduces 8 numeros y al lado de los numeros saldra si es par o impar 
  
 * @ autoria RSA
 
 */
public class Ejercicio9 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    
    int num[] = new int[8];
    int i;

    System.out.println("Introduce los 8 numeros: ");

    for (i = 0; i < 8; i++) {
      num[i] = s.nextInt();
    }

    System.out.println();

    for (i = 0; i < 8; i++) {
      if (num[i] %2 == 0 ) {
        System.out.println(num[i] +" par");
      } else {
        System.out.println(num[i] + " impar");
      }
    }
 }
    
}
