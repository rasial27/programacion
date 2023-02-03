import java.util.Scanner;
/*
 *Ejemplo2.java
 *Muestra por pantalla todos los numeros naturales hasta uno que se introdujo previamente
 
 *@ autoria RSA
 
*/

public class Ejemplo2 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero: ");
    int cont = s.nextInt();
    
    for (int i = 0; i <= cont; i++) {
      System.out.println(i);
    }
    
    }
   }    
