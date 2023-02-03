/*
 *Ejemplo2.java
 *Muestra 15 numeros random 
 
 *@ autoria RSA
 
*/

public class Ejemplo2 {
  public static void main (String[] args) {
  
    System.out.println("Muestra 15 numeros aleatorios sin llegar a 10 con decimales ");
    
    for (int i =1; i <= 15; i++) {
      System.out.println( Math.random()*10);
    }
    
    }
   }   
