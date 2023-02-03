/*
 * EjercicioPizarra2.java
 * Crea un array con el orden de la pizarra donde hay 4 filas y 6 columnas
 
 * @ autoria RSA
 
 */
public class EjercicioPizarra2 {
  public static void main (String[] args) {
    int fila = 4; 
    int columna = 6;
    int [][] num = new int[fila][columna];
  
    int aux = 1;
    
    int f , c;
  
    for (f = 0; f < fila; f++) {
      for (c = 0; c < columna; c++) {
        num[f][c] = aux;
        aux = aux + 1;
      }
    }

    for(f = 0; f < fila; f++) {
      System.out.print("fila " + f +":");
      for(c = 0; c < 6; c++) {
        System.out.printf("%10d ", num[f][c]);
      }
    System.out.println();
    }
  
  }
  }
  



