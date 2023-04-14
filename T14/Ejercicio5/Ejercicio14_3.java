/*
 * Ejercicio14_3.java
 * Ejercicio donde de manera aleatoria aparece uno de los siguientes errores : NumberFormatException, IOException, FileNotFoundException,
   IndexOutOfBoundsException y ArithmeticException.

 *@author RSA
*/

package T14.Ejercicio5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio14_3 {
  public static void main(String[] args){
    
    int error = (int)(Math.random() * 5);

    try{
      if(error == 0) {
        throw new NumberFormatException();
      }

      if(error == 1) {
        throw new IOException();
      }

      if(error == 2) {
        throw new FileNotFoundException();
      }

      if(error == 3) {
        throw new IndexOutOfBoundsException();
      }

      if(error == 4) {
        throw new ArithmeticException();
      }
    } catch (Exception e) {
        System.out.println("Error: " + e);
      } 
  }
}
