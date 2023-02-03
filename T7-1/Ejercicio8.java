import java.util.Scanner;
/*
 * Ejercicio8.java
 * Pide la temperatura media de cada mes y dibuja un diagrama de barras con los resultados
  
 * @ autoria RSA
 
 */
public class Ejercicio8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    int[] temp = new int[12];
    char icono = '*';
    int i;
    int j;

    for (i = 0; i < 12; i++) {
      System.out.print("Introduce la temperatura de " +mes[i] +" : ");
      temp[i] = s.nextInt(); 
    }

    System.out.println();

    for (i = 0; i < 12; i++) {
        System.out.printf("%12s "  + "-> ", mes[i]);
      for (j = 0; j < temp[i]; j++) {
        System.out.print(icono);
      }

      System.out.println(" " +temp[i] + " grado");
       
      
    }

  } 
}
