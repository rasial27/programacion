import java.util.Scanner;
/*
 *Ejercicio25.java
 *Calcula el precio de unas banderas segun los requistos que se seleccionen
 
 *@ autoria RSA

*/

public class Ejercicio25 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la altura: ");
    double alt = s.nextDouble();
    System.out.print("Introduce la anchura: ");
    double anch = s.nextDouble(); 
    System.out.print("Con o sin bordado (si/no): ");
    boolean conEscudo = (System.console().readLine().equals("si"));
    
    double lon = (anch * alt); 
    double precioBandera = (anch * alt) / 100;
    
    String escudo;
    double precioEscudo;
    
    if (conEscudo) {
      escudo = "Con escudo";
      precioEscudo = 2.50;
    } else {
      escudo = "Sin escudo";
      precioEscudo = 0;
    }
    
    double gastos = 3.25;
    
    double totalCompra = (precioBandera + precioEscudo + gastos);
    
    System.out.print("Tu bandera de " +(int)lon +" cm2 cuesta: " +totalCompra);
    
    }
   } 
    
    
    
    
    
     
