/*
 *PreguntaNombre.java
 *Pregunta por pantalla cual es tu nombre
 
 *@ autoria RSA
 
*/

public class PreguntaNombre {
  public static void main (String[] args) {
  
    String nombre;
    String apellido;
    
    System.out.print("Por favor, dime tu nombre:");
    nombre = System.console().readLine();
    
    System.out.print("Dime tu primer apellido:");
    apellido = System.console().readLine();
    
    System.out.println("Hola " + nombre +" " + apellido + " ,encantado de conocerte");
    
    }
   }  
