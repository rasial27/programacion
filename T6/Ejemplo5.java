/*
 *Ejemplo5.java
 *Muestra 15 numeros random pero en formato int
 
 *@ autoria RSA
 
*/

public class Ejemplo5 {
  public static void main (String[] args) {
  
    System.out.println("Muestra 15 numeros aleatorios del 50 al 60 sin decimales ");
    
    for (int i =1; i <= 15; i++) {
      System.out.print((int)( Math.random()*11 + 50) +" ");
    }
    
    System.out.println();
    }
   }   
