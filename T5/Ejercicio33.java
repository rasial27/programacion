import java.util.Scanner;
/* 
 *Ejercicio33.java
 *Hace una U donde tu eliges la altura
 
 *@ autoria RSA
 
*/

public class Ejercicio33 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la altura: ");
    int alt = s.nextInt();
    
    for (int i= 1; i < alt; i++) {
      System.out.print("* ");
      for (int j = 2; j < alt; j++) {
        System.out.print("  ");
      }
      
      System.out.println("*");
    }
    
    System.out.print("  ");
    for(int i = 2; i < alt; i++) {
      System.out.print("* ");
    }
    
    }
   }       
      
