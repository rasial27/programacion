/*
 *Factura.java
 *Imprime por pantalla una factura con iva
 
 *@ autoria RSA
 
*/

public class Factura {
  public static void main (String[] args) {
  
    double baseImponible = 250;
    double iva = (baseImponible * 0.21);
    double total = (iva + baseImponible);
    
    System.out.println("El precio inicial era:" + baseImponible);
    System.out.println("El total de tu factura es:" + total);
    
    }
   } 	 
