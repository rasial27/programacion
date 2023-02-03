/*
 * Ejercicio3.java
 * Se generan 20 numeros enteros aleatoriamente comprendidos entre el 100 y el 999, que se introducen en un array de 4 filas y 
   5 columnas, luego sumara las filas y columnas las enseñara como si fuera excel
  
 * @ autoria RSA
 
 */
public class Ejercicio3 {
    public static void main (String[] args) {
      
      int fila = 4;
      int columna = 5;
  
      int [][] num = new int[fila][columna];
      int f;
      int c;
  
      System.out.println("Se generan 20 numeros enteros ");
      for(f = 0; f < fila; f++){
        for(c = 0; c < columna; c++){
          num[f][c] = (int)(Math.random()*900) + 100;
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
  