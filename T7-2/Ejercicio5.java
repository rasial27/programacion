/*
 * Ejercicio5.java
 * Se rellena un array de 6 filas y 10 columnas de manera aleatoria con numeros del 0 al 1000, luego se muestra el valor maximo
 * minimo y la posicion donde se encuentran
  
 * @ autoria RSA
 
 */
public class Ejercicio5 {
  public static void main (String[] args) {
    int fila = 6;
    int columna = 10;
    int [][] num = new int[fila][columna];

    int f;
    int c;

    int min = Integer.MAX_VALUE;
    int filaMin = 0;
    int colMin = 0;

    int max = Integer.MIN_VALUE;
    int filaMax = 0;
    int colMax = 0;

    for (f = 0; f < fila; f++){  //generacion de numeros
      for(c = 0; c < columna; c++){
        num[f][c] = (int)(Math.random()*1001);

        if (num[f][c] > max) { //guarda num maximo
          max = num[f][c];
          filaMax = f;
          colMax = c;
        }

        if (num[f][c] < min) { //guarda num minimo
          min = num[f][c];
          filaMin = f;
          colMin = c;    
        }
      }
    }

    System.out.print("   "); //impresion por pantalla
    for (f = 0; f < columna; f++) {
      System.out.printf("%5d ", f);
    }
    System.out.println();

    System.out.print("   ");
    for (f = 0; f < columna; f++ ) {
      System.out.printf("------");
    }   
    System.out.println();  
    for (f = 0; f < fila; f++) {
      System.out.printf("%d | ", f);
      for (c = 0; c < columna; c++) {
        System.out.printf("%5d ", num[f][c]);
      }
      System.out.println(" |");
    }

    System.out.println("El numero maximo es " +max +" y se encuentra en la posicion (" +filaMax +"," +colMax +")");
    System.out.println("El numero minimo es " +min +" y se encuentra en la posicion (" +filaMin +"," +colMin +")");


  }
}