package T8;
import T8.misFunciones.Varias;
import java.util.Scanner;
/*
 * Ejercicio1_2.java
 * Introduces dos numeros y te los multiplica
  
 * @ autoria RSA
 
 */

public class Ejercicio1_2 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("\nIntroduce el primer numero: ");
    double num1 = s.nextDouble();
    System.out.print("Introduce el segundo numero: ");
    double num2 = s.nextDouble();
    System.out.println("El resultado de la multiplicacion es: " +T8.misFunciones.Varias.multiplicacion(num1, num2));

  }

}

