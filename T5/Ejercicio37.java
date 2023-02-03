import java.util.Scanner;
/* 
 *Ejercicio37.java
 *Conversor del sistema decimal al de palotes
 
 *@ autoria RSA
 
*/

public class Ejercicio37 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    int num;
    
    do {
      System.out.print("Introduce un numero entero positivo: ");
      num = s.nextInt();
      
    } while (num < 1);
    System.out.print(num +" = ");
    
    int aux = num;
    int numDigito = 0;
    int numReves = 0;
    
    while (aux > 0) {
      numReves = ((numReves * 10) + (aux % 10));
      aux /= 10;
      numDigito++;
    }
    
    int cifra = 0;
    
    for (int i = 0; i < numDigito; i++) {
      cifra = (numReves % 10);
      numReves /= 10;
      
      for (int j = 0; j < cifra; j++) {
        System.out.print("|");
      }
      
      if (i < (numDigito - 1)) {
        System.out.print("-");
      }
    }
    
    }
   }      
    
    
    
    
    
      
       
