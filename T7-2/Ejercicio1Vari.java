/*
 * Ejercicio1.java
 * Introduce el array que se ve en el enunciado, con variable
  
 * @ autoria RSA
 
 */
public class Ejercicio1Vari {
    public static void main (String[] args) {
        int fila = 3;
        int columna = 6;
      
        int [][] num = new int[fila][columna];
  
      num[0][0] = 0;
      num[0][1] = 30;
      num[0][2] = 2;
      num[0][5] = 5;
      num[1][0] = 75;
      num[1][4] = 0;
      num[2][2] = -2;
      num[2][3] = 9;
      num[2][5] = 11; 

      int f, c;
  
  
      for(f = 0; f < fila; f++) {
        System.out.print("Fila " + f +":");
          for(c = 0; c < columna; c++) {
            System.out.printf("%10d ", num[f][c]);
         }
         System.out.println();
  
      }
   }
  }
  