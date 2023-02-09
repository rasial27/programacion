package T8;
import T8.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio14_2 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce el caracter del que quieras que se forme la piramide: ");
    String c = s.nextLine();
    System.out.print("Introduce la altura de la piramide: ");
    int n = s.nextInt();

    Varias.creaTriangulo(c, n);
  }
    
}
