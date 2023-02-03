/*
 *Ejemplo2.java
 *Ejemplo con pais e idioma oficial
 
 *@ autoria RSA
 
*/

public class Ejemplo2 {
  public static void main (String[] args) {
    System.out.print("Cual es el idioma oficial de Italia: ");
    String respuesta = System.console().readLine();
    
    if ( respuesta.equals("Italiano")) {
      System.out.println("La respuesta es correcta");
    } else {
      System.out.println("Lo siento, la respuesta es incorrecto.");
    }
    
    }
   }     
