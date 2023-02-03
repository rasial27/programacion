/*
 *Ejercicio1.java
 *Muestra la tirada de tres dados y la suma de las tres tiradas
 
 *@ autoria RSA

*/

public class Ejercicio1 {
  public static void main (String[] args) {
    
    System.out.println("Lanza el dado tres veces: ");
    
    int lanzamiento;
    int suma = 0;
    
    for (int i = 1; i <= 3; i++) {
      lanzamiento = (int)((Math.random()*6) + 1);
      System.out.println(lanzamiento);
      suma += lanzamiento;
    }
    
    System.out.print("La suma de las tres tiradas es: " +suma);
    }
   }    
