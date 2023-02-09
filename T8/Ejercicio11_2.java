package T8;
import T8.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio11_2 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el numero de la tabla que quieres: ");
    int num = s.nextInt();

    System.out.println("Tabla de multiplicar del numero: " +num);
    Varias.tablaMulti(num);
  }
    
}
