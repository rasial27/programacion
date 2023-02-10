package T8;
import java.util.Scanner;
import T8.misFunciones.FunciArray;
/*
 * Ejercicio2028.java
 * Crea las funciones de los ejercicios 20 al 28
  
 * @ autoria RSA
 
 */
public class Ejercicio2028 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, min, max, num;
    int[] array;
          
    System.out.print("Introduce el tamaño del array: ");
    n = sc.nextInt();
          
    System.out.print("Introduce el mínimo valor para los números aleatorios: ");
    min = sc.nextInt();
          
    System.out.print("Introduce el máximo valor para los números aleatorios: ");
    max = sc.nextInt();
          
    array = FunciArray.generaArrayInt(n, min, max);
    System.out.print("El array generado es: ");
    for(int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    
          
    System.out.println("\nEl mínimo valor del array es: " + FunciArray.minimoArrayInt(array));
    System.out.println("El máximo valor del array es: " + FunciArray.maximoArrayInt(array));
    System.out.println("La media del array es: " + FunciArray.mediaArray(array));
          
    System.out.print("Introduce un número a buscar en el array: ");
    num = sc.nextInt();
    if (FunciArray.estaEnArrayInt(array, num)) {
      System.out.println("El número está en el array en la posición: " + FunciArray.posicionEnArray(array, num));
      } else {
        System.out.println("El número no está en el array");
        }
          
  System.out.println("\nArray original: ");
    for(int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  FunciArray.volteaArrayInt(array);
  System.out.println("\nArray volteado: ");
    for(int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
       
  System.out.print("\nIntroduce el número de posiciones a rotar a la derecha: ");
  int posDerecha = sc.nextInt();
  FunciArray.rotaDerechaArrayInt(array, posDerecha);
  System.out.print("\nEl array generado es: ");
    for(int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
          
  System.out.print("\nIntroduce el número de posiciones a rotar a la izquierda: ");
  int posIzquierda = sc.nextInt();
  FunciArray.rotaIzquierdaArrayInt(array, posIzquierda);
  System.out.print("\nEl array generado es: ");
    for(int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  
  }
}
  


  
    

