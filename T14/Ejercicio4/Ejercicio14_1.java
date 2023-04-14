/*
 * Ejercicio14_1.java
 * Nos pide crear un progrma donde se introduzcan 6 numeros enteros(si no da error) y nos guarde el maximo introducido
 * 
 * @author RSA
 */

package T14.Ejercicio4;
import java.util.Scanner;

public class Ejercicio14_1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int max = Integer.MIN_VALUE;//variable para guardar el numero maximo
    int contador = 1;//variable contador para guardar los seis numeros

    while (contador < 7) {
      System.out.println("Introduce los seis numeros: ");
      try {
        int num = Integer.parseInt(s.nextLine());
        if (num > max) {
          max = num;
        }
        contador++;
      } catch (Exception e) {
        System.out.println("Dato incorrecto: " +e.getMessage());
        System.out.println("Dato incorrecto: " +e.getClass());
      }
    }

    System.out.println("El numero maximo de los seis numeros es: " +max);

  }
  
}
