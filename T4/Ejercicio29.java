import java.util.Scanner;
/*
 *Ejercicio29.java
 *Calcuala el precio del desayuno
 
 *@ autoria RSA
 
*/

public class Ejercicio29 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    double precioComida = 0;
    double precioBebida = 0;
    String resultado = "";
    String pitufo = "";
    
    System.out.print("Que has comido (palmera, donut o pitufo): ");
    String comida = s.nextLine();
    
    if (comida.equals("pitufo")) {
      System.out.print("De que fue el pitufo (aceite o tortilla): ");
      pitufo = s.nextLine();
      
      if (pitufo.equals("aceite")) {
        resultado = "Pitufo con aceite: 1.20 euros ";
        precioComida = 1.20;
      } else if (pitufo.equals("tortilla")) {
        resultado = "Pitufo con tortilla: 1.60 euros ";
        precioComida = 1.60;
      }
    } else if (comida.equals("palmera")) {
      resultado = "Palmera: 1.40 euros ";
      precioComida = 1.40;
    } else if (comida.equals("donut")) {
      resultado = "Donut: 1.00 euros ";
      precioComida = 1.00;
    }    
    
    System.out.print("Que has bebido (zumo o cafe): ");
    String bebida = s.nextLine();
    
    if (bebida.equals("zumo")) {
      resultado += ("y zumo: 1.50 euros ");
      precioBebida = 1.50;
    } else if (bebida.equals("cafe")) {
      resultado += ("y cafe: 1.20 euros ");
      precioBebida = 1.20;
    }
    
    double total = precioComida + precioBebida;
    
    System.out.println(resultado);
    System.out.println("Total del desayuno: " +total +" euros ");
    
    }
   }   
      
        
      
    
    
    
    
    
           
