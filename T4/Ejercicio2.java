import java.util.Scanner;
/*
 *Ejercicio2.java
 *Introduces una hora por teclado y te saluda depende de la hora introducida
 
 *@ autoria RSA
 
*/

public class Ejercicio2 {
  public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    
    System.out.print("Dime la hora: ");
    int hora = s.nextInt();
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.print("Buenos dias");
    }
    
    if ((hora >= 13) && (hora <= 20)) {
      System.out.print("Buenas tardes");
    }
    
    if (((hora >= 21) && (hora < 24)) || ((hora <= 5) && (hora >= 0))) {
      System.out.print("Buenas noches");
    }  
    
    }
   }       
  
  
      
