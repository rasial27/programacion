package T8;
import T8.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio17_2 {
  public static void main (String[] args){
    Scanner s = new Scanner (System.in);

    System.out.print("Introduce un numero entero (0 para parar el programa): ");
    int num = s.nextInt();

    while (num != 0) {
      if (Varias.esPrimo(num)) {
        System.out.println("El " +num +" es primo");
      } else {
        System.out.println("El " +num +" no es primo");
      }
      System.out.print("Introduce un numero entero (0 para parar el programa): ");
     num = s.nextInt();
    }
  }
    
}
