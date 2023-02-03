import java.util.Scanner;
/* 
 *Ejercicio16.java
 *Introduce un numero por teclado y te dice si es primo
 
 *@ autoria RSA
 
*/

public class Ejercicio16 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero: ");
    int num = s.nextInt();
    
    boolean primo = true;
    
    for(int i = 2; i < num; i++) {
      if ((num % i) == 0) {
        primo = false;
      }
    }
    
    if (primo) {
      System.out.print("Tu numero es primo");
    } else {
      System.out.print("Tu numero no es primo");
    }
    
    }
   }          
