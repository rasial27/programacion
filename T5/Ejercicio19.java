import java.util.Scanner;
/* 
 *Ejercicio19.java
 *Pinta una piramide por pantalla
 
 *@ autoria RSA
 
*/

public class Ejercicio19 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la altura de la piramide: ");
    int altura = s.nextInt();
    
    System.out.print("Introduce el caracter de relleno de la piramide: ");
    String relleno = s.next();
    
    int planta = 1;
    int blanco = altura - 1;
    
    while (planta <= altura) {
      for (int i = 1; i <= blanco; i++) {
        System.out.print(" ");
      }
      
      for (int j = 1; j <= (2*planta-1); j++) {
        System.out.print(relleno);
      }
      
      planta++;
      blanco--;
      System.out.println();
    }
    
    }
   }   
          
       
