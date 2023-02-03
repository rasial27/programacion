/*
 * Ejercicio13.java
 * Calcula la estatura media, minima y maxima de diferentes paises, las estaturas se guardan en un array 4x10 las estauras se
 * generan de manera aleatoria de valores de 140 a 210
  
 * @ autoria RSA
 
 */
public class Ejercicio13 {
  public static void main (String[] args) {
    String[] pais = {"Spain", "Rusia", "Japon", "Australia"};
    int fila = 4;
    int col = 10;
    int num[][] = new int[fila][col];
    int f, c;
    int min[] = new int[4];
    int max[] = new int[4];
    int suma[] = new int[4];
    int media[] = new int[4];

    for (f = 0; f < fila; f++) {
      for (c = 0; c < col; c++) {
        num[f][c] = (int)(Math.random()*71) + 140;
        suma[f] += num[f][c];
      }
    }

    for (f = 0; f < fila; f++) {
      max[f] = 140;
      min[f] = 210;
      for (c = 0; c < col; c++) {
        if (num[f][c] < min[f]) {
          min[f] = num[f][c];
        }
        if (num[f][c] > max[f]) {
            max[f] = num[f][c];
        }
        media[f] = suma[f] / 10;
      }
    }

    for (f = 0; f < fila; f++) {
      System.out.println("Pais: " +pais[f]);    
      System.out.println("Estatura minima: " +min[f] +" cm");
      System.out.println("Estatura maxima: " +max[f] +" cm");
      System.out.println("Estatura media: " +media[f] +" cm");
      System.out.println();
    }

  }
    
}
