package T8;
import T8.misFunciones.Varias;
import java.util.Scanner;
/*
 * Ejercicio2_2.java
 * Introduces dos numeros y te dice el menor de los dos
  
 * @ autoria RSA
 
 */

public class Ejercicio2_2 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("\nIntroduce el primer numero: ");
    int a = s.nextInt();
    System.out.print("Introduce el segundo numero: ");
    int b = s.nextInt();
    System.out.println("El menor es: " +T8.misFunciones.Varias.menor(a, b));


  }
}