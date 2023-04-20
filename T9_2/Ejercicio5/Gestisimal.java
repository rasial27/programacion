package T9_2.Ejercicio5;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Gestisimal {
  static Scanner s = new Scanner(System.in);
  static Articulo[] listaArticulos = new Articulo[100];
  static int numArticulos = 0;

  public static void main(String[] args) {
    int opcion;

    do {
      System.out.println("MENU");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificacion");
      System.out.println("5. Entrada de mercancia");
      System.out.println("6. Salida de mercancia");
      System.out.println("7.Salir");
      System.out.print("\nElige una opcion: ");
      opcion = s.nextInt();

      switch(opcion) {
        case 1:
          listarArticulos();
          break;
        case 2:
          altaArticulos();
          break;
        case 3:
          bajaArticulos();
          break;
        case 4:
          modificarArticulos();
          break;
        case 5:
          entradaMercancia();
          break;
        case 6:
          salidaMercancia();
          break;
        case 7:
          System.out.println("\nHasta pronto");
          break;
        default:
          System.out.println("\nOpcion no valida");
          break;
      }
    } while (opcion!= 7);
  }

  static void listarArticulos() {
    if (numArticulos == 0) {
      System.out.println("\nNo hay articulos en el almacen");
    } else {
      System.out.println("\nLista de articulos");
      for (int i = 0; i < numArticulos; i++) {
        System.out.println(listaArticulos[i]);
      }
    }
  }
  
  static void altaArticulos() {
    if (numArticulos == 100) {
      System.out.println("\nNo se pueden agregar mas articulos");
    } else {
      System.out.println("\nAlta de articulos");
      System.out.print("Codigo: ");
      String codigo = s.next();
      System.out.print("Descripcion: ");
      String descripcion = s.next();
      System.out.print("Precio de compra: ");
      double precioCompra = s.nextDouble();
      System.out.print("Precio de venta: ");
      double precioVenta = s.nextDouble();
      System.out.print("Stock: ");
      int stock = s.nextInt();

      listaArticulos[numArticulos] = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
      numArticulos++;

      System.out.println("\nArticulo agregado correctamente");
    }
  }

  static void bajaArticulos() {
    System.out.print("\nBaja de articulos");
    System.out.print("Introduce el codigo del articulo que va a eliminar: ");
    String codigo = s.next();

    boolean encontrado = false;

    for (int i = 0; i < numArticulos; i++) {
      if (listaArticulos[i].getCodigo().equals(codigo)) {
        for (int j = i; j < numArticulos - 1; j++) {
          listaArticulos[j] = listaArticulos[j+1];
        }
        numArticulos--;
        encontrado = true;
        System.out.println("\nArticulo eliminado correctamente");
        break;
      }
    }

    if (!encontrado) {
      System.out.println("\nArticulo no encontrado");
    }
  }

  static void modificarArticulos() {
    System.out.println("\nModificacion de articulos");
    System.out.print("Introduce el codigo del articulo que va a modificar: ");
    String codigo = s.next();

    boolean encontrado = false;

    for(int i = 0; i < numArticulos; i++) {
      if (listaArticulos[i].getCodigo().equals(codigo)) {
        System.out.println("\nIntroduce los nuevos datos del articulo:");
        System.out.print("Descripcion (" + listaArticulos[i].getDescripcion() + "): ");
        String descripcion = s.next();
        if(!descripcion.isEmpty()) {
          listaArticulos[i].setDescripcion(descripcion);
        }

        System.out.print("Precio de compra (" + listaArticulos[i].getPrecioCompra() +"): ");
        String sPrecioCompra = s.next();
        if (!sPrecioCompra.isEmpty()) {
          double precioCompra = s.nextDouble();
          listaArticulos[i].setPrecioCompra(precioCompra);
        }

        System.out.print("Precio de venta (" + listaArticulos[i].getPrecioVenta() + "): ");
        String sPrecioVenta = s.next();
        if (!sPrecioVenta.isEmpty()) {
          double precioVenta = s.nextDouble();
          listaArticulos[i].setPrecioVenta(precioVenta);
        }

        System.out.print("Stock (" + listaArticulos[i].getStock() + "): ");
        String sStock = s.next();
        if (!sStock.isEmpty()) {
          int stock = s.nextInt();
          listaArticulos[i].setStock(stock);
        }

        encontrado = true;
        System.out.println("\nArticulo modificado correctamente");
        break;
      }
    }

    if (!encontrado) {
      System.out.println("\nArticulo no encontrado");
    }

  }

  static void entradaMercancia() {
    System.out.println("\nEntrada de mercancia");
    System.out.print("Introduce el codigo del articulo: ");
    String codigo = s.next();

    boolean encontrado = false;

    for (int i = 0; i < numArticulos; i++) {
      if (listaArticulos[i].getCodigo().equals(codigo)) {
        System.out.print("Introduce la cantidad a ingresar: ");
        int cantidad = s.nextInt();
        listaArticulos[i].setStock(listaArticulos[i].getStock() + cantidad);
        encontrado = true;
        System.out.println("\nArticulo ingresado correctamente");
        break;
      }
    }

    if (!encontrado) {
      System.out.println("\nArticulo no encontrado");
    }
  }

  static void salidaMercancia() {
    System.out.println("\nSalida de mercancia");
    System.out.print("Introduce el codigo del articulo: ");
    String codigo = s.next();

    boolean encontrado = false;

    for (int i = 0; i < numArticulos; i++) {
      if (listaArticulos[i].getCodigo().equals(codigo)) {
        encontrado = true;

        System.out.print("Introduce la cantidad a retirar: ");
        int cantidad = s.nextInt();

        if (cantidad > listaArticulos[i].getStock()) {
          System.out.print("No hay suficiente stock");
          return;
        }

        listaArticulos[i].setStock(listaArticulos[i].getStock() - cantidad);
        System.out.println("Se ha retirado " + cantidad + " articulos");
        break;
      }
    }

    if (!encontrado) {
      System.out.println("\nArticulo no encontrado");
    }
  }

  static void salir() {
    System.out.println("\nHasta pronto");
  }

}
