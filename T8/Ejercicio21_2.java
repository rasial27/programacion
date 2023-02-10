package T8;
import T8.misFunciones.Varias;
import T8.misFunciones.Geometria;


public class Ejercicio21_2 {
  public static void main (String[] args) {

    int opcion;
    double radio;

    do {
      opcion = Varias.menu();

      switch (opcion) {
        case 1:
          radio = Varias.pideRadio();
          System.out.println("La circunferencia es: " + Geometria.circunferencia(radio));
          break;
        case 2:
          radio = Varias.pideRadio();
          System.out.println("El area es: " + Geometria.area(radio));
          break;
        case 3:
          radio = Varias.pideRadio();
          System.out.println("El volumen es: " + Geometria.volumen(radio));
          break;
        case 4:
          radio = Varias.pideRadio();
          System.out.println("La circunferencia es: " + Geometria.circunferencia(radio));
          System.out.println("El area es: " + Geometria.area(radio));
          System.out.println("El volumen es: " + Geometria.volumen(radio));
          break;
        case 5:
          System.out.println("Termina el programa");
          break;
        default:
          System.out.println("Opcion invalida. Por favor, seleccione de nuevo.");
          break;
        }
    } while (opcion != 5);
  }
    
}
