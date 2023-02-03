import java.util.Scanner;
/* 
 *Ejercicio15.java
 *Escribe por pantalla todas las potencias con los numeros introducidos por pantalla
 
 *@ autoria RSA
 
*/

public class Ejercicio15 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca la base: ");
    int base = s.nextInt();
    
    System.out.print("Introduzca el exponente maximo: ");
    int expMax = s.nextInt();
    
    int pot;
    int exp;
    
    for (int i = 1; i <= expMax; i++) {
      
      pot = 1;
      exp = i;
      
      for (int j = 0; j < exp; j++) {
        pot *= base;
      }
      
      System.out.println(base + " ^ " +i +" = " +pot);
    }
    
    }
   }     
        
      
