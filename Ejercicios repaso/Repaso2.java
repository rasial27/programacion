import java.util.Scanner;
public class Repaso2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el numero de filas: ");
    int f = s.nextInt();
    System.out.print("Introduce el numero de columnas: ");
    int c = s.nextInt();
    int[][] num = new int[f][c];
    int fila, col;
    int suma = 0;
    int[][] tres = new int[f][c];
    int multiplo = 0;

    for (fila = 0; fila < f; fila++){
      for(col = 0; col < c; col++){
       // num[fila][col] = (int)(Math.random()*101)+100;
       num[fila][col] = suma ;
       suma += 2;
      
      }
    }

    for (fila = 0; fila < f; fila++) {
      for (col = 0; col < c; col++) {
        if (num[fila][col] % 3 == 0) {
          if (num[fila][col] % 2 == 0) {
            tres[fila][col] = num[fila][col];
          }
          multiplo++;
        }
      }
    }
    
    System.out.println("Array original: ");
    for (fila = 0; fila < f; fila++){
      for(col = 0; col < c; col++){
        System.out.printf("%3d ", num[fila][col]); 
      }
      System.out.println();
    }

    System.out.println("Array multiplos de tres: ");
    for (fila = 0; fila < f; fila++){
      for(col = 0; col < c; col++){
        System.out.printf("%3d ", tres[fila][col]); 
      }
      System.out.println();
    }

  }
    
}
