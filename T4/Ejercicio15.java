import java.util.Scanner;
/*
 *Ejercicio15.java
 *Imprime por pantalla una piramide que nosotros elegiremos para donde esta el vertice con el caracter que seleccionemos
 
 *@ autoria RSA
 
*/

public class Ejercicio15 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el caracter seleccionado: ");
    String car = s.nextLine();
    System.out.println("1 vertice para arriba");
    System.out.println("2 vertice para abajo");
    System.out.println("3 vertice para derecha");
    System.out.println("4 vertice para izquierda");
    int num = s.nextInt();
    
    switch (num) {
      case 1:
        System.out.println("  " + car);
        System.out.println(" " + car + car + car);
        System.out.println(car + car + car + car + car);
        break;
        
      case 2:
        System.out.println(car + car + car + car + car);
        System.out.println(" " + car + car + car);
        System.out.println("  " + car);
        break;
        
      case 3:
        System.out.println(car);
        System.out.println(car + " " + car);
        System.out.println(car + " " + car + " " + car);
        System.out.println(car + " " + car);
        System.out.println(car);  
        break;
        
      case 4:
        System.out.println("    " + car);
        System.out.println("  " + car + " " + car);
        System.out.println(car + " " + car + " " + car);
        System.out.println("  " + car + " " + car);
        System.out.println("    " + car);
        break;
        
      }
      
      }
     }     
    
    
     
