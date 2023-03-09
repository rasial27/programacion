package T9.Ejercicio7;
import java.util.Scanner;

public class Expo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Zonas salaPrincipal = new Zonas(1000);
    Zonas compraVenta = new Zonas(200);
    Zonas vip = new Zonas(25);

    int opcion;

    do {
      System.out.println("Seleccione una opción: ");
      System.out.println("1. Mostrar numero de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      opcion = s.nextInt();

      switch(opcion){
        case 1:
          System.out.println("Entrdas disponibles en cada zona:");
          System.out.println("Sala principal: " +salaPrincipal.getEntradasPorVender());
          System.out.println("Crompa venta: " +compraVenta.getEntradasPorVender());
          System.out.println("Vip: " +vip.getEntradasPorVender());
          break;
        case 2:
          System.out.println("Seleccione la zona:");
          System.out.println("1. Sala principal");
          System.out.println("2. Crompa venta");
          System.out.println("3. Vip");

          int zona = s.nextInt();
          System.out.println("Introduzca el numero de entradas que desea comprar:");
          int n = s.nextInt();

          switch(zona) {
            case 1:
              salaPrincipal.vender(n);
              break;
            case 2:
              compraVenta.vender(n);
              break; 
            case 3:
              vip.vender(n);
              break;
            default:
              System.out.println("Opcion no valida");
              break; 
          }
          break;  
        case 3:
          System.out.println("Hasta luego");
          break;
        default:
          break;
      }
    } while (opcion!= 3);
  }
}
