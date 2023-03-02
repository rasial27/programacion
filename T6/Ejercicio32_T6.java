import java.util.Scanner;
/*
 * Ejercicio32.java
 * Se crea un sendero con la longitud introducida por teclado y en el sedero van ocurrioendo cosas aleatorias
  
 * @ autoria RSA
 
 */
public class Ejercicio32_T6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Ingrese la longitud del sendero en metros: ");
    int lon = s.nextInt();
    int espacios = 6;

    for (int i = 0; i < lon; i++) {
      for (int j = 0; j < espacios; j++) {
        System.out.print(' ');
      }

      System.out.print('|');
      int posObstaculo = -1;
      char obstaculo = '*'; 

      if ((int) (Math.random() * 2) == 0) { 
        posObstaculo = (int) (Math.random() * 4);
        if ((int) (Math.random() * 2) == 0) { 
          obstaculo = 'O';
        }
      }

      for (int j = 0; j < 4; j++) {
        if (j == posObstaculo) {
          System.out.print(obstaculo);
        } else {
          System.out.print(' ');
        }
      }

      System.out.println('|');
      espacios += (int) (Math.random() * 3) - 1;
    }
  }
}
   

  
  

