/*
 * Ejercicio8.java
 * Genera numeros aleatorios pares hasta 100 y no para hasta sacar el 24, te dice cuantos numeros sacaste
  
 * @ autoria RSA
 
 */
public class Ejercicio9 {
    public static void main(String[] args) {
      int n = 0;
      int cuentaNumeros = 0;
      
      while (n != 24) {
        n = (int)(Math.random() * 51) * 2;
        System.out.print(n + " ");
        cuentaNumeros++;
      }
      System.out.println("\nSe han generado " + cuentaNumeros + " numeros.");
    }
  }