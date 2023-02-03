/*
 *EurosPesetasTeclado.java
 *Introduce los euros por pantalla y te enseña su conversion a pesetas
 
 *@ autoria RSA
 
*/

public class EurosPesetasTeclado {
  public static void main (String[] args) {
    
    String linea;
    
    System.out.print("Cuantos euros tienes ");
    linea = System.console().readLine();
    double euros;
    euros = Integer.parseInt( linea );
    
    int pesetas;
    pesetas = (int)(euros * 166.386);
    
    System.out.print("Tus " + euros + " son " + pesetas);
    
    }
   } 
    
