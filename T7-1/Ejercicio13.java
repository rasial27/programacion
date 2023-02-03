import java.util.Scanner;
/*
 * Ejercicio13.java
 * Se rellena un array de 100 elementos con numeros aleatorios del 0 al 500 y luego se pregunta que se quiere remarcar si 
   si el numero maximo o el minimo
 
 * @ autoria RSA
 
 */
public class Ejercicio13 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int[] num = new int[100];
    int i;
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (i = 0; i < 100; i++) {
      num[i] = (int)(Math.random()*501);

      if (num[i] < min) {
        min = num[i];
      }

      if (num[i] > max) {
        max = num[i];
      }
    }

    for (int elemento : num) {
      System.out.print(elemento +" ");
    }

    System.out.print("\nSelecciona maximo o minimo (1- maximo / 2- minimo): ");
    int seleccion = s.nextInt();

    int destacado;

    if (seleccion == 1) {
      destacado = max;
    } else {
      destacado = min;
    }

    System.out.println();

    for (int elemento : num) {
      if (elemento == destacado) {
        System.out.print(" **" +elemento +"** ");
      } else {
        System.out.print(elemento + " ");
      }
    }
  }
}