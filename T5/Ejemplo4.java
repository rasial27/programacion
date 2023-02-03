/*
 *Ejemplo4.java
 *Muestra la suma de los pares y los impares comprendidios entre 100 y 200 independiente
 
 *@ autoria RSA
 
*/

public class Ejemplo4 {
  public static void main (String[] args) {
    
    //pares
    int pares = 0;
    
    for (int cont = 100; cont <= 200; cont = cont + 2) {
      pares = pares + cont;
    }
    
    //impares
    int impares = 0;
    
    for (int cont = 101; cont < 200; cont = cont + 2) {
      impares = impares + cont;
    }
    
    System.out.print("La suma de los pares es: " +pares +" y los impares son: " +impares);
    
    }
   }    
