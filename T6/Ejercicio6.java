import java.util.Scanner;
/*
 * Ejercicio6.java
 * El programa piensa un numero y el usuario tiene 5 intentos para adivinarlo
  
 * @ autoria RSA
 
 */
public class Ejercicio6 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    int intentos = 5;
    int numIngresado;

    int num = (int)(Math.random()*101);

    for (intentos = 5; intentos > 0; intentos--) {
      System.out.print("Adivina el numero entre 0 y 100: ");
      numIngresado = s.nextInt();

      if (num == numIngresado) {
        System.out.println("Has acertado el numero secreto");
      } else {
        if (numIngresado < num) {
          System.out.println("El numero ingresado es menor. Te quedan " +intentos +" intentos");
        } else {
            System.out.println("El numero ingresado es mayor. Te quedan " +intentos +" intentos");
        }
      }
    }
    System.out.println("Te quedste sin intentos, el numero era: " +num);


  }
    
}
