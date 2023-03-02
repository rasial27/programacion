import java.util.Scanner;
/*
 * Ejercicio31.java
 * Realiza el juego del craps
  
 * @ autoria RSA
 
 */
public class Ejercicio31_T6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int dinero = 0;
    int apuesta = 0;
    int dado1, dado2, suma;
    boolean continuar = true;

    System.out.print("Ingrese su cantidad de dinero: ");
    dinero = s.nextInt();

    while (continuar && dinero > 0) {
      System.out.print("Ingrese su apuesta: ");
      apuesta = s.nextInt();

      dado1 = (int)(Math.random() * 6) + 1;
      dado2 = (int)(Math.random() * 6) + 1;
      suma = dado1 + dado2;

      System.out.println("Tirada de dados: " +dado1 + " + " +dado2 + " = " +suma);

      if (suma == 7 || suma == 11) {
        dinero += apuesta;
        System.out.println("Felicidades has ganado: " +apuesta +" euros, su saldo es de: " +dinero +" euros");
      } else if (suma == 2 || suma == 3 || suma == 12) {
        dinero -= apuesta;
        System.out.println("Perdiste tu apuesta, su saldo es de: " +dinero +" euros");
      } else {
        System.out.println("Ha sacado " +suma +" , debe repetir la tirada, para ganar saque el mismo numero y para perder saque un 7");

        int nuevaTirada;
        do {
          dado1 = (int)(Math.random() * 6) + 1;
          dado2 = (int)(Math.random() * 6) + 1;
          nuevaTirada =dado1 + dado2;
          System.out.println("Nueva tirada de dados: " +dado1 + " + " +dado2 + " = " +nuevaTirada);
        } while (nuevaTirada != suma && nuevaTirada != 7);

        if (nuevaTirada == suma) {
          dinero += apuesta;
          System.out.println("Felicidades has ganado: " +apuesta +" euros, su saldo es de: " +dinero +" euros");
        } else {
          dinero -= apuesta;
          System.out.println("Perdiste tu apuesta, su saldo es de: " +dinero +" euros");
        }
      }

      System.out.print("¿Quiere seguir jugando? (s/n): ");
      String respuesta = s.next();
      continuar = respuesta.equalsIgnoreCase("s");
      
    }
    System.out.println("Gracias por jugar. Su saldo final es de " + dinero + "€");

  }
}
