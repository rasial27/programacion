import java.util.Scanner;
/*
 *Ejercicio17.java
 *Introduce un numero por pantalla y te dice cual es la ultima cifra de un numero entero
 
 *@ autoria RSA
 
*/

public class Ejercicio17 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero entero: ");
    int numero = s.nextInt();
    
    int resultado = numero % 10;
    
    System.out.print("La ultima cifra del numero " +numero +" es " +resultado);
    
    }
   }  
