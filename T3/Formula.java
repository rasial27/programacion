import java.util.Scanner;
/*
 *Formula.java
 *Calcula la formula
 
 *@ autoria RSA
 
*/


public class Formula {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduce las variables para calcular la formula");
    System.out.print("Introduce el dato para el radio: ");
    double r = s.nextDouble();
    System.out.print("Introduce el dato para la altura: ");
    double h = s.nextDouble();
    final double pi = 3.14;
    
    double formula = ((1.0/3.0)* pi * r * r * h);
    
    System.out.print("El resultado de tu formula es: " +formula);
    
    }
   }   
     
