import java.util.Scanner;
/* 
 *Ejercicio25.java
 *Introduces un numero por teclado y luego te lo enseña al reves
 
 *@ autoria RSA
 
*/

public class Ejercicio25 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero: ");
    int numero = s.nextInt();
    
    int num = numero; //Variable para guardar el numero introducido
    int reves = 0;
    
    while (num > 0) {
      reves = (reves * 10) + (num % 10);
      num /= 10;
    }
    
    System.out.print("Tu numero es " +numero +" y al reves es " +reves);
    
    }
   }   
