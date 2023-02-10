package T8;
import T8.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio18_2 {
  public static void main (String[] args){
    Scanner s = new Scanner (System.in);
    
    System.out.print("Introduce tu DNI: ");
    int dni = s.nextInt();

    System.out.print("La letra de tu dni es: " +Varias.obtenerDNI(dni));
  }
    
}
