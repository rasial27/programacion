/*
 * Ejercicio11.java
 * Se rellena un array de 10x10 de numeros aleatorios entre 200 y 300, luego el programa muestra los numeros de la diagonal
 * que va desde la esquina superior izquierda a la inferior derecha y de esa diagonal saca el maximo, minimo y la media de los numeros
  
 * @ autoria RSA
  
 */
public class Ejercicio11 {
  public static void main (String[] args){
    int fila = 10;
    int col = 10;
    int num[][] = new int[fila][col];

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int suma = 0;
    int f, c; 
    
    for (f = 0; f < fila; f++) {
      for (c = 0; c < col; c++) {
        num[f][c] = (int)(Math.random()*101) + 200;
      }
    }
    System.out.println("Array generado: ");
    for (f = 0; f < fila; f++) {
        for (c = 0; c < col; c++) {
          System.out.printf("%4d", num[f][c]);
        }
    System.out.println();
    } 

    System.out.println("Muestra lo numeros que tiene mismo numero de fila y columna: ");
    for(int i = 0; i < 10; i++) {
        int n = num[i][i];
        System.out.print(n + " ");

        if ( n > max) {
          max = n;
        }

        if (n < min) {
          min = n;
        }
        suma = n + suma;
        
    }

    int media = suma /10;

    System.out.println("\nEl numero maximo de la diagonal es: " +max);
    System.out.println("El numero minimo de la diagonal es: " +min);
    System.out.println("La media de la diagonal es: " +media);

  }
    
}
