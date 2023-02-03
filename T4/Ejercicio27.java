import java.util.Scanner;
/*
 *Ejercicio27.java
 *Crea presupuestos para una pasteleria
 
 *@ autoria RSA
 
*/

public class Ejercicio27 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Selecciona un sabor (manzana, fresa o chocolate): ");
    String sabor = s.nextLine();
    
    double precioNata = 0;
    double precioSabor = 0;
    double precioNombre = 0;
    String tipoChoco = "";
    
    switch (sabor) {
      case "manzana":
        precioSabor = 18;
        break;
      
      case "fresa":
        precioSabor = 16;
        break;
      
      case "chocolate":
        System.out.print("Tipo de chocolate (negro o blanco): ");
        tipoChoco = s.nextLine();
        if (tipoChoco.equals("negro")) {
          precioSabor = 14;
        } else if (tipoChoco.equals("blanco")) {
          precioSabor = 15;
        } 
        break;
    }    
    System.out.print("Con nata (si o no): ");
    boolean nata = s.nextLine().equals("si");
        
    System.out.print("Con nombre (si o no): ");
    boolean nombre = s.nextLine().equals("si");
        
    System.out.print("Tarta de " +sabor);
        
    if (sabor.equals("chocolate")) {
      System.out.print(" " +tipoChoco);
    }
        
    System.out.println(" " +precioSabor +" euros ");
        
    if (nata) {
      precioNata = 2.5;
      System.out.println("Con nata: " +precioNata +" euros ");
    }
        
    if (nombre) {
      precioNombre = 2.75;
      System.out.println("Con nombre: " +precioNombre +" euros ");
    }
        
    double total = precioSabor + precioNata + precioNombre;
        
    System.out.println("Total: " +total +" euros");
        
    }
   } 
        
          
          
        
          
           
            
          
        
        
        
        
             
