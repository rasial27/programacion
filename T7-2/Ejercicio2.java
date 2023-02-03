import java.util.Scanner;
/*
 * Ejercicio2.java
 * Introduce 20 numeros enteros, que se introducen en un array de 4 filas y 5 columnas, luego sumara las filas y columnas
   las enseñara como si fuera excel

 * @ autoria RSA
   
 */
public class Ejercicio2 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    int fila = 4;
    int columna = 5;

    int [][] num = new int[fila][columna];
    int f;
    int c;

    System.out.println("Introduce 20 numeros enteros ");
    for(f = 0; f < fila; f++){
      for(c = 0; c < columna; c++){
        System.out.print("Introduce el numero para la fila " +f +" y la columna " +c +": ");
        num[f][c] = s.nextInt();
      }
      
    }

    int sumC, sum = 0;
    int sumF = 0;

    for (f = 0; f < fila; f++ ) {
      for (c = 0; c < columna; c++) {
        System.out.printf("%5d", num[f][c]);
        sum += num[f][c];
        sumF += num[f][c];
      }
      System.out.println("  |  " +sum);
      sum = 0;
    }

    System.out.println("----------------------------------" );
    for (c = 0; c < columna; c++ ) {
      for (f = 0; f < fila; f++) {
        sum += num[f][c];
      }
      System.out.printf("%5d", sum);
      sum = 0;
    }

    System.out.printf("%8d", sumF);

  }

}
