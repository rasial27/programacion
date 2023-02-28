import java.util.Scanner;
/*
 * Ejercicio 17.java
 * Pinta por pantalla una pecera y se le pide al usario el ancho y el alto de la pecera, y aleatoriamente se
   pinta la posicion del pescado

 * @ autoria RSA
  
 */
public class Ejercicio17_T6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Ingrese la altura de la pecera(como minimo sera 4): ");
    int h = s.nextInt();

    System.out.print("Ingrese el ancho de la pecera(como minimo sera 4): ");
    int a = s.nextInt();

    int pezAncho = (int)(Math.random()* (a - 2)) + 2;
    int pezAlto = (int)(Math.random()* (h - 2)) + 2;

    for (int i = 1; i <= h; i++){
      for (int j = 1; j <= a; j++){
        if (i == pezAlto && j == pezAncho){
          System.out.print("&");
        } else if (i == 1 || i == h || j == 1 || j == a) { //Si estamos en la primera o última fila, o en la primera o última columna, pintamos un asterisco
          System.out.print("*");
        } else { //Si no se deja un espacio en blanco
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
