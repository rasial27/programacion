/*
 * Ejercicio 19.java
 * Muestra 50 numeros aleatorios comprendidos entre el -100 y el 200 ambos incluidos,
   luego  te muestra el minimo de los impares y el maximo de los pares y la media de todos los numeros.
 
 * @ autoria RSA
  
 */
public class Ejercicio19_T6 {
  public static void main(String[] args) {

    int maxPar = Integer.MIN_VALUE;
    int minImpar = Integer.MAX_VALUE;
    int suma = 0;

    for (int i = 0; i < 50; i++) {
      int num = (int) (Math.random() * 301) - 100;
      System.out.print(num + " ");

      if (num % 2 == 0 && num > maxPar) {
        maxPar = num;
      } else if (num % 2 != 0 && num < minImpar) {
        minImpar = num;
      }

      suma += num;  
    }

    double media = (double)(suma / 50);
    
    System.out.println("\nEl maximo par es: " +maxPar);
    System.out.println("El minimo impar es: " +minImpar);
    System.out.println("La media de los numeros generados es: " +media);
  }
}
