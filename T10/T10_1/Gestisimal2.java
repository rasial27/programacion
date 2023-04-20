
/*
 * Gestisimal.java
 * Crea un menu y utiliza un arraylist para guardar los datos
 * 
 * @author RSA
 */

 package T10.T10_1;
 import java.util.ArrayList;
 import java.util.Scanner;
 
 public class Gestisimal2 {
   static Scanner s = new Scanner(System.in);
   static ArrayList<Articulo> listaArticulos = new ArrayList<Articulo>(); //creacion del arraylist
   
 
   public static void main(String[] args) {
     int opcion;
 
     do { //bucle para seleccionar en el menu
       System.out.println("MENU");
       System.out.println("1. Listado");
       System.out.println("2. Alta");
       System.out.println("3. Baja");
       System.out.println("4. Modificacion");
       System.out.println("5. Entrada de mercancia");
       System.out.println("6. Salida de mercancia");
       System.out.println("7. Salir");
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
 
   static void listarArticulos() { //metodo para listar la lista de los articulos
     if (listaArticulos.size() == 0) {
       System.out.println("\nNo hay articulos en el almacen");
     } else {
       System.out.println("\nLista de articulos");
       for (Articulo articulo : listaArticulos) {
         System.out.println(articulo);
       }
     }
   }
   
   static void altaArticulos() { //metodo para  introducir ariculos
     if (listaArticulos.size() == 100) {
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
 
       Articulo articulo = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);
       listaArticulos.add(articulo);
 
       System.out.println("\nArticulo agregado correctamente");
     }
   }
 
   static void bajaArticulos() { //metodo para quitar un articulo
     System.out.print("\nBaja de articulos");
     System.out.print("Introduce el codigo del articulo que va a eliminar: ");
     String codigo = s.next();
 
     boolean encontrado = false;
 
     for (int i = 0; i < listaArticulos.size(); i++) {
       if (listaArticulos.get(i).getCodigo().equals(codigo)) {
         listaArticulos.remove(i);
         encontrado = true;
         System.out.println("\nArticulo eliminado correctamente");
         break;
       }
     }
 
     if (!encontrado) {
       System.out.println("\nArticulo no encontrado");
     }
   }
 
   static void modificarArticulos() { //metodo para modificar los datos de un articulo
     System.out.println("\nModificacion de articulos");
     System.out.print("Introduce el codigo del articulo que va a modificar: ");
     String codigo = s.next();
 
     boolean encontrado = false;
 
     for (Articulo articulo : listaArticulos) {
       if (articulo.getCodigo().equals(codigo)) {
         encontrado = true;
         System.out.println("\nArticulo encontrado: ");
         System.out.println(articulo);
 
         System.out.print("\nIntroduce el nuevo precio de compra (0 para no modificar): ");
         double precioCompra = s.nextDouble();
         if (precioCompra != 0) {
           articulo.setPrecioCompra(precioCompra);
         }
 
         System.out.print("\nIntroduce el nuevo precio de venta (0 para no modificar): ");
         double precioVenta = s.nextDouble();
         if (precioVenta != 0) {
           articulo.setPrecioVenta(precioVenta);
         }
         
         System.out.print("\nIntroduce el nuevo stock (0 para no modificar): ");
         int stock = s.nextInt();
         if (stock != 0) {
           articulo.setStock(stock);
         }
 
         System.out.println("\nArticulo modificado correctamente");
         System.out.println(articulo);
         break;
         
       }
     }
 
     if (!encontrado) {
       System.out.println("\nArticulo no encontrado");
     }
 
   }
 
   static void entradaMercancia() { //metodo para introducir mercancia
     System.out.println("\nEntrada de mercancia");
     System.out.print("Introduce el codigo del articulo: ");
     String codigo = s.next();
 
     boolean encontrado = false;
 
     for (Articulo articulo : listaArticulos) {
       if (articulo.getCodigo().equals(codigo)) {
         encontrado = true;
         System.out.print("Introduce la cantidad a ingresar: ");
         int cantidad = s.nextInt();
         articulo.setStock(articulo.getStock() + cantidad);;
         System.out.println("\nArticulo ingresado correctamente");
         break;
       }
     }
 
     if (!encontrado) {
       System.out.println("\nArticulo no encontrado");
     }
   }
 
   static void salidaMercancia() { //metodo para la salida de mercancia
     System.out.println("\nSalida de mercancia");
     System.out.print("Introduce el codigo del articulo: ");
     String codigo = s.next();
 
     boolean encontrado = false;
 
     for (Articulo articulo : listaArticulos) {
       if (articulo.getCodigo().equals(codigo)) {
         encontrado = true;
 
         System.out.print("Introduce la cantidad a retirar: ");
         int cantidad = s.nextInt();
 
         if (cantidad <=articulo.getStock()) {
           articulo.setStock(articulo.getStock() - cantidad);
           System.out.println("\nSalida de mercancia correctamente");
         } else {
           System.out.println("\nNo hay stock");
         }
       }
     }
 
     if (!encontrado) {
       System.out.println("\nArticulo no encontrado");
     }
   }
 
   static void salir() { //metodo para parar el programa 
     System.out.println("\nHasta pronto");
   }
 
 }
