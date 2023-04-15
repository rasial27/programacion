/*
 * ProbarExcepciones.java
 * Crea un menu donde puedes elegir 5 funciones donde hay un error especifico
 * 
 * @author RSA
 */

package T14.Ejercicio3;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProbarExcepciones {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int opcion;

    do {
      System.out.println("Menu para seleccion de las funciones con error:");
      System.out.println("1. Provoca un error 'StackOverFlowError':");
      System.out.println("2. Provoca un error 'NumberFormatException':");
      System.out.println("3. Provoca un error 'ArrayIndexOutOfBoundsException':");
      System.out.println("4. Provoca un error 'FileNotFoundException':");
      System.out.println("5. Provoca un error 'ArithmeticException':");
      System.out.println("6. Salir");

      opcion = s.nextInt();

      try {
        switch (opcion) {
          case 1:
            funcionError1();
            break;
          case 2:
            funcionError2();
            break;
          case 3:
            funcionError3();
            break;
          case 4:
            funcionError4();
            break;
          case 5:
            funcionError5();
            break;
          default:
        }
      } catch (StackOverflowError e) {
        System.out.println(e.getClass());
        System.out.println(e.getMessage());
      } catch (NumberFormatException e) {
        System.out.println(e.getClass());
        System.out.println(e.getMessage());
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getClass());
        System.out.println(e.getMessage());
      } catch (FileNotFoundException e) {
        System.out.println(e.getClass());
        System.out.println(e.getMessage());
      } catch (ArithmeticException e) {
        System.out.println(e.getClass());
        System.out.println(e.getMessage());
      }
    } while (opcion != 6);
  }

  public static void funcionError1() throws StackOverflowError{//funcion que se llama a ella misma todo el rato
    funcionError1();
  }

  public static void funcionError2() throws NumberFormatException{//funcion que convierte un String en un int
    String a = "Rafael";
    int numero = Integer.parseInt(a);
  }

  public static void funcionError3() throws ArrayIndexOutOfBoundsException{//funcion donde se crea un array de 1 elemento y se intena llamar el elmento 2
    int[] x = new int[1];
    int y = x[2];
  }

  public static void funcionError4() throws FileNotFoundException{//funcion que intenta abrir el archivo ejemplo.txt
    java.io.FileReader texto = new java.io.FileReader("ejemplo.txt");
  }

  public static void funcionError5() throws ArithmeticException{//funcion que divide 25/0
    int division = 25 / 0;
  }
  
}
