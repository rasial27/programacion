/*
 *PesetasEurosTeclado.java
 *Introduce las pesetas por pantalla y te muestra su conversion a euros
 
 *@ autoria RSA
 
*/

public class PesetasEurosTeclado {
  public static void main (String[] args) {
  
    String linea;
    
    System.out.print("Cuantas pesetas tienes ");
    linea = System.console().readLine();
    int pesetas;
    pesetas = Integer.parseInt( linea );
    
    double euros;
    euros = (double)(pesetas / 166.386);
    
    System.out.print("Tus " + pesetas + " son " + euros);
    
}
}
