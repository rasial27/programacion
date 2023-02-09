package T8;
import T8.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio9_2 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce primer numero: ");
    int a = s.nextInt();
    System.out.print("Introduce segundo numero: ");
    int b = s.nextInt();
    System.out.print("Introduce tercer numero: ");
    int c = s.nextInt();

    int mayor = Varias.maxDoble(Varias.maxDoble(a, b), c);
    System.out.print("El mayor es el : " +mayor);
    
  }

    
}
