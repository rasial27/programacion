/*
 * EjercicioPizarra.java
 * Crea un array con el orden de la pizarra donde hay 6 filas y 4 columnas
 
 * @ autoria RSA
 
 */
public class EjercicioPizarra {
  public static void main (String[] args) {
    int fila = 6; 
    int columna = 4;
    int [][] num = new int[fila][columna];

    int aux = 1;
    int f , c;


    for (c = 0; c < columna; c++) {
      for (f = 0; f < fila; f++) {
        num[f][c] = aux;
        aux = aux + 1;
      }
    }
    for(f = 0; f < fila; f++) {
        System.out.print("fila " + f +":");
          for(c = 0; c < columna; c++) {
            System.out.printf("%10d ", num[f][c]);
        }
    System.out.println();
    }

}
}
