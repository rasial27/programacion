import java.util.Scanner;
/*
 *Ejercicio5.java
 *Calcula ecuaciones de primer grado
 
 *@ autoria RSA
 
*/

public class Ejercicio5 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Vamos a calcular ecuaciones del tipo ax + b = 0");
    System.out.println("Introduce el valor de a: ");
    double a = s.nextDouble(); 
    System.out.print("Introduce el valor de b: ");
    double b = s.nextDouble();
    
    if (a == 0) {
      System.out.print("La operacion no se puede realizar");
    } else {
      System.out.print(" x = " + (-b/a));
    }
    
    }
   }     
    
