import java.util.Scanner;
/* 
 *Ejercicio12.java
 *Serie de Fibonacci
 
 *@ autoria RSA
 
*/

public class Ejercicio12 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero: ");
    int num = s.nextInt();
    
    switch (num) {
      case 1:
        System.out.print("0");
        break;
      
      case 2:
        System.out.print("0 1");
        break;
        
      default:
        System.out.print("0 1");
        int f1 = 0;
        int f2 = 1;
        int aux;
        
        while (num > 2) {
          aux = f1;
          f1 = f2;
          f2 = aux + f1;
          System.out.print(" " + f2);
          num--;
        }
    }
    
    System.out.println();
    
    }
   }         
