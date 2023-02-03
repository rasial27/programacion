import java.util.Scanner;
/*
 * Ejercicio19.java
 * Se crea un programa donde te deja introducir un numero en un array ya creado 
  
 * @ autoria RSA
 
 */
public class Ejercicio19 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    int a = 12;
    int num[] = new int[a];
    int i;

    for (i = 0; i < a; i++) {
      num[i] = (int)(Math.random()*201);
    }

    System.out.println("Array original: ");
    for (i = 0; i < a; i++ ) {
      System.out.print(num[i] + " ");
    }
    System.out.println();

    System.out.print("Seleccione el numero que va a introducir en el array: ");
    int numero = s.nextInt();
    System.out.print("Seleccione la posicion del array que va a cambiar: ");
    int pos = s.nextInt();
    
    for (i = 11; i > pos; i--) {
      num[i] = num[i - 1];
    }
    num[pos] = numero;

    System.out.println("Nuevo array con el numero introducido: ");
    for (i = 0; i < a; i++){
      System.out.print(num[i] +" ");
    }
    
  }
    
}
