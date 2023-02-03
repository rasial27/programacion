import java.util.Scanner;
/*
 *Ejercicio7.java
 *Calcula la media de tres notas
 
 *@ autoria RSA
 
*/

public class Ejercicio7 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Las notas deben ser de 0 a 10");
    System.out.print("Introduce tu primera nota: ");
    double nota1 = s.nextDouble();
    System.out.print("Introduce tu segunda nota: ");
    double nota2 = s.nextDouble();
    System.out.print("Introduce tu tercera nota: ");
    double nota3 = s.nextDouble();
    
    double media = (nota1 + nota2 + nota3)/3;
    
    System.out.print("La media de tus tres notas es: " +media);
    
    }
   } 
