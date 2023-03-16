package T9_2.Ejercicio1;
import java.util.Scanner;

public class DatosGatos {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Gato2[] gatos = new Gato2[4];

    for (int i = 0; i < 4; i++) {
      System.out.print("Introduce el nombre del gato " +(i + 1) +": ");
      String nombre = s.next();
      System.out.print("Introduce la edad del gato " +(i + 1) +": ");
      int edad = s.nextInt();
      System.out.print("Introduce la raza del gato " +(i + 1) +": ");
      String raza = s.next();
      gatos[i] = new Gato2(nombre, edad, raza);
    }

    for (int i = 0; i < 4; i++) {
      System.out.println("Gato " +(i + 1) + ": ");
      System.out.println("Nombre: " + gatos[i].getNombre());
      System.out.println("Edad: " + gatos[i].getEdad());
      System.out.println("Raza: " + gatos[i].getRaza());
      System.out.println();
    }
  }
}
