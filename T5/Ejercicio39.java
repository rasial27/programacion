import java.util.Scanner;
/* 
 *Ejercicio39.java
 *Introduces un numero y te muestra desde 1 al numero introducido los numeros con su factorial
 
 *@ autoria RSA
 
*/

public class Ejercicio39 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero: ");
    int num = s.nextInt();
    
    for (int i = 1; i <= num; i++) {
      
      int factorial = i;
      
      for (int j = 1; j < i; j++) {
        factorial *= j;
      }
      
      System.out.println(i +" ! = " +factorial);
    }
    
    }
   }     
