package T8;
import T8.misFunciones.Geometria;
import java.util.Scanner;

public class Ejercicio7_2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduce los datos para calcular la area y el perimetro  de un rectangulo");
    System.out.print("\nIntroduce la altura: ");
    double h = s.nextDouble();
    System.out.print("Introduce la base: ");
    double b = s.nextDouble();
    System.out.print("El area del rectangulo es: " +Geometria.areaRectangulo(b, h));
    System.out.print("\nEl perimetro del rectangulo es: " +Geometria.perimetroRectangulo(b, h));

  }
}