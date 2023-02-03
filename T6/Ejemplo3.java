/*
 *Ejemplo3.java
 *Muestra 15 numeros random pero en formato int
 
 *@ autoria RSA
 
*/

public class Ejemplo3 {
  public static void main (String[] args) {
  
    System.out.println("Muestra 15 numeros aleatorios sin llegar a 10 sin decimales ");
    
    for (int i =1; i <= 15; i++) {
      System.out.print((int)( Math.random()*10) +" ");
    }
    
    System.out.println();
    }
   }   
