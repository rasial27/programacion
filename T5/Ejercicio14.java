import java.util.Scanner;
/* 
 *Ejercicio14.java
 *Introduces base y exponente y calcula la potencia
 
 *@ autoria RSA
 
*/

public class Ejercicio14 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la base: ");
    int base = s.nextInt();
    System.out.print("Introduce el exponente: ");
    int exp = s.nextInt();
    
    int pot = 1;
    
    if (exp == 0) {
      pot = 1;
    }
    
    if (exp > 0) {
      for (int i = 0; i < exp; i++) {
        pot *= base;
      }
    }
    
    if (exp < 0) {
      for (int i = 0; i < -exp; i++) {
        pot *= base;
      }
      
      pot = 1 / pot;
    }
    
    System.out.println(base +" ^ " +exp +" = " +pot);
    
    }
   }   
      
      
      
        
                
