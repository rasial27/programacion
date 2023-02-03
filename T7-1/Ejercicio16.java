import java.util.Scanner;
/*
 * Ejercicio16.java
 * Rellena un array de 20 elementos con numeros aleatorios del 0 al 400, luego te pregunta si quieres resaltar los multiplos de 5 o 7
  
 * @ autoria RSA
 
 */
public class Ejercicio16 {
  public static void main (String[] args) {
    
    Scanner s = new Scanner(System.in);
    int num[] = new int[20];
    int i;
    
    for (i = 0; i < 20; i++){
      num[i] = (int)(Math.random()*401);
      System.out.print(num[i] +" ");
    }

    System.out.print("\nSelecciona que quieres resaltar, 1- multiplos de 5 o 2- multiplos de 7: ");
    int seleccion = s.nextInt();

    int multiplo = (seleccion == 1) ? 5 : 7;

    for (int elemento : num) {
      if (elemento % multiplo == 0) {
        System.out.print("[" + elemento + "] ");
      } else {
        System.out.print(elemento +" ");
      }

    }
  }
    
}
