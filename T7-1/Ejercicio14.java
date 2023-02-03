import java.util.Scanner;
/*
 * Ejercicio14.java
 * Introduces 8 palabras y los almacena en un array, si la palabra es un color se pondra en las primeras posiciones, 
 * los colores estan guardados en otro array
  
 * @ autoria RSA
 
 */
public class Ejercicio14 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    String[] color = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

    String[] palabra = new String[8];
    String[] resultado = new String[8];
    
    System.out.println("Introduce 8 palabras: ");

    int j = 0;

    for (int i = 0; i < 8; i++) {
      palabra[i] = s.nextLine();

    //guarda la palabra
    for (String c : color) {
      if (palabra[i].equals(c)) {
        resultado[j++] = c;
        }
      }  
    }
     //mete las palabras que no son colores al final del array
    for (int i =0; i < 8; i++) {
      boolean esColor = false;

      for (String c : color) { 
        if (palabra[i].equals(c)) {
          esColor = true;
        }
      }

      if (!esColor) { 
        resultado[j++] = palabra[i];
      }
    }

    System.out.println("Primer array: ");
    System.out.println("\n-------------------------------------------------------------------------");
    for (int i = 0; i < 8; i++) {
      System.out.printf("|   %d    ", i);
    }
    System.out.println("\n-------------------------------------------------------------------------");
   
    for (String p : palabra) {
      System.out.printf("|%-8s", p);
    }
    System.out.println("\n-------------------------------------------------------------------------");

    System.out.println("Array ordenado: ");
    System.out.println("\n-------------------------------------------------------------------------");
    for (int i = 0; i < 8; i++) {
      System.out.printf("|   %d    ", i);
    }
    System.out.println("\n-------------------------------------------------------------------------");

    for (String r : resultado) {
      System.out.printf("|%-8s", r);
    }
    System.out.println("\n-------------------------------------------------------------------------");

  }
    
}
