import java.util.Scanner;
/* 
 *Ejercicio31.java
 *Pinta una L hecha con *
 
 *@ autoria RSA
 
*/

public class Ejercicio31 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la altura de la L: ");
    int altura = s.nextInt();
    
    for (int i = 0; i < altura; i++) { //Bucle para el palo de la L
      System.out.println("*");
    } 
    
    for (int i = 0; i < (altura / 2 + 1); i++) { //Bucle para la base de la L
      System.out.print("* ");
    }
    
    }
   }    
