import java.util.Scanner;
/*
 *Ejercicio20.java
 *Introduces un numero entero positivo y te dice si es capicuo
 
 *@ autoria RSA
 
*/

public class Ejercicio20 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero entero positivo hasta 5 cifras: ");
    int num = s.nextInt();
    
    boolean capicua = false;
    
    if (num <10) {
      capicua = true;
    }
    
    if ((num >= 10) && (num < 100)) {
      if ((num / 10) == (num % 10)) {
        capicua = true;
      }
    }
    
    if ((num >= 100) && (num < 1000)) {
      if ((num / 100) == (num % 10)) {
        capicua = true;
      }
    }
    
    if ((num >= 1000) && (num < 100000)) {
      if (((num / 1000) == (num % 10)) && (((num / 100) % 10) == ((num / 10) % 10))) {
        capicua = true;
      }
    }
    
     if (num >= 10000) {
      if (((num / 10000) == (num % 10)) && (((num / 1000) % 10) == ((num / 10) % 10))) {
        capicua = true;
      }
    }
    
    if (capicua) {
      System.out.println("Tu numero es capicuo: " +num);
    } else {
      System.out.println("Tu numero no es capicuo: " +num);
    }
    
    }  
   }   
      
          
