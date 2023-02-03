package T8;
import T8.misFunciones.Varias;
import java.util.Scanner;
/*
 * Ejercicio3_2.java
 * Introduces un numero y te dice si es negativo, igual a cero o positivo
  
 * @ autoria RSA
 
 */

public class Ejercicio3_2 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Ejercicio3");
    System.out.print("\nIntroduce un numero: ");
    int num = s.nextInt();
    int signo = T8.misFunciones.Varias.dimeSigno(num);
        if (signo == -1) {
            System.out.println("El número es negativo");
        } else if (signo == 0) {
            System.out.println("El número es cero");
          } else {
            System.out.println("El numero es positivo");
        } 

  }
}