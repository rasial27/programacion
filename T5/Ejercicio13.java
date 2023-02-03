import java.util.Scanner;
/* 
 *Ejercicio13.java
 *Contador de positivos y negativos introducidos por teclado
 
 *@ autoria RSA
 
*/

public class Ejercicio13 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduzca 10 numeros: ");
    
    int numPo = 0;
    int numNe = 0;
    
    for (int i = 0; i < 10; i++) {
      if((s.nextInt()) < 0) {
        numNe++;
      } else {
        numPo++;
      }
    }
    
    System.out.print("Has introducido " +numPo +" numeros positivos y " +numNe +" numeros negativos");
    
    }
   }       
        
