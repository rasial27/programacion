/*
 *Ejercicio4.java
 *Muestra 20 numeros enteros aleatorios entre 0 y 10 separados por espacios
 
 *@ autoria RSA

*/

public class Ejercicio4_T6 {
  public static void main (String[] args) {
  
    System.out.print("Tus 20 numeros aleatorios son: ");
  
    for (int i = 1; i <= 20; i++) {
      System.out.print( (int)(Math.random()*11) + " ");
    }
  
    System.out.println();
    
    }
   } 
    
