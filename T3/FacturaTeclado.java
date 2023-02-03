/*
 *FacturaTeclado.java
 *Calcula el total de la factura a partir de la base imponible leida por teclado
 
 *@ autoria RSA
 
*/

public class FacturaTeclado {
  public static void main (String[] args) {
  
    String linea;
  
    System.out.print("Dime la base imponible de tu factura: ");
    linea = System.console().readLine();
    double baseImponible;
    baseImponible = Integer.parseInt( linea);
    
    double iva = (baseImponible * 0.21);
    double total = (iva + baseImponible);
    
    System.out.print("El total de tu factura es " +total);
    
    }
   }  
