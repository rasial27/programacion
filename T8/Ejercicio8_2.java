package T8;
import T8.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio8_2 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce un valor y te hare el sumatorio desde 1 hasta tu numero, el factorial de 1 hasta tu numero y por ultimo el valor intermedio de 1 hasta tu numero: ");
    int n = s.nextInt();

    System.out.print("La suma de 1 hasta " +n +" es: " +Varias.suma1aN(n));
    System.out.print("\nEl factorial de 1 hasta " +n +" es:" +Varias.producto1aN(n));
    System.out.print("\nEl numero intermedio de 1 hasta " +n +" es:" +Varias.intermedio1aN(n));
  }
    
}
