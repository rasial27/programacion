/*
 * Ej2_10.java
 * Ejercico 1 de la relacion de la tarea 10.1
 * 
 * @author RSA
 */
package T10.T10_2;

import java.util.ArrayList;

public class Ej2_10 {
  public static void main(String[] args) {
    producto producto1 = new producto("Leche", 20); //creacion de los productos
    producto producto2 = new producto("Cereal", 40);
    producto producto3 = new producto("Cafe", 70);
    producto producto4 = new producto("Pan", 15);
    producto producto5 = new producto("Jamon", 33);

    ArrayList<producto> listaProductos = new ArrayList<producto>();//creacion del arraylist
    listaProductos.add(producto1);//añade el producto al arraylist
    listaProductos.add(producto2);
    listaProductos.add(producto3);
    listaProductos.add(producto4);
    listaProductos.add(producto5);

    System.out.println("Produstos del array: ");//bucle para mostrar los productos
    for (int i = 0; i < listaProductos.size(); i++) {
      producto producto = listaProductos.get(i);
      System.out.println(producto.getNombre() + " , " + producto.getCantidad());
    }

    listaProductos.remove(0);//borrar productos
    listaProductos.remove(2);

    producto producto6 = new producto("Mantequilla", 41);//añade nuevo producto
    listaProductos.add(0, producto6);

    System.out.println("\nProdustos del array: ");//bucle para mostrar de nuevo los productos
    for (int i = 0; i < listaProductos.size(); i++) {
      producto producto = listaProductos.get(i);
      System.out.println(producto.getNombre() + " , " + producto.getCantidad());
    }

    listaProductos.clear();//eliminacion de los productos

  }
}
