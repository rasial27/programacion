import java.util.Scanner;
/*
 *Ejercicio14.java
 *Introduces un numero y te dice si  es par y si es divisble entre 5
 
 *@ autoria RSA
 
*/

public class Ejercicio14 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero: ");
    int numero = s.nextInt();
    
    if ((numero % 2) == 0) {
      System.out.print("El numero es par");
    } else {
      System.out.print("El numero es impar");
    }
    
    if ((numero % 5) == 0) {
      System.out.print(" y es divisible entre 5");
    } else {
      System.out.print(" y no es divisible entre 5");
    }
    
    }
   } 
         
