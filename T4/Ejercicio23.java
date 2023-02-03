import java.util.Scanner;
/*
 *Ejercicio23.java
 *Calcula la factura total teniendo en cuenta diferentes variables
 
 *@ autoria RSA
 
*/

public class Ejercicio23 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la base imponible: ");
    double baseImponible = s.nextDouble();
    
    System.out.print("Introduce el IVA(general, reducido o superreducido): ");
    String tipoIva = System.console().readLine();
    
    System.out.print("Introduce el codigo promocional(nopro, mitad, meno5 o 5porc): "); 
    String promo = System.console().readLine();
    
    int tipoIvaNum = 0;
    
    switch (tipoIva) {
      case "general": 
        tipoIvaNum = 21;
        break;
        
      case "reducido":
        tipoIvaNum = 10;
        break;
        
      case "superreducido":
        tipoIvaNum = 4;
        break;
    
    }
    
    double iva = (baseImponible * tipoIvaNum) / 100;
    double precioSinDesc = baseImponible + iva;
    
    double descuento = 0;
    
	switch (promo) {
	  case "nopro":
	    break;
	    
	  case "mitad":
	    descuento = precioSinDesc / 2;
	    break;
	    
	  case "meno5":
	    descuento = 5;
	    break;
	    
	  case "5porc":
	    descuento = precioSinDesc * 0.05;
	    break;
	    
	}
	
	double total = precioSinDesc - descuento;
	
	System.out.println("Base imponible: " +baseImponible +" euros");
	System.out.println("IVA del " +tipoIvaNum +" % : " +iva +" euros");
	System.out.println("Precio con Iva: " +precioSinDesc +" euros");
	System.out.println("Codigo promocional " +promo +" con descuento de: - " +descuento +" euros");
	System.out.println("Total: " +total +" euros");
	
    }
   }
	          
	  
    
    
    
    
    
            
