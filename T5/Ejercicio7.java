import java.util.Scanner;
/*
 *Ejercicio7.java
 *Caja fuerte con cuatro intentos
 
 *@ autoria RSA
 
*/

public class Ejercicio7 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    int intentos = 4;
    int numIntroducido;
    boolean correcto = false;
    
    do {
      System.out.print("Introduce la clave: ");
      numIntroducido = s.nextInt();
      
      if (numIntroducido == 3499) {
        correcto = true;
      } else {
        System.out.println("La clave es incorrecta");
      }
      
      intentos = intentos - 1;
      
    } while ((intentos > 0) && (correcto == false));
    
    if (correcto) {
      System.out.println("Clave correcta");
    } else {
      System.out.println("Has gastado los 4 intentos");
    }
    
    }
   } 
