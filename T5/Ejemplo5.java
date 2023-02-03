import java.util.Scanner;
/*
 *Ejemplo5.java
 *Calcula el valor de A elevado a B con las variables introducidas por pantalla
 
 *@ autoria RSA

*/

public class Ejemplo5 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la base: ");
    int base = s.nextInt();
    System.out.print("Introduce el exponente: ");
    int exp = s.nextInt();
    
    int resultado = 1;
    
    for (int cont = 1; cont <= exp; cont++) {
      resultado = resultado * base;
    }
    
    System.out.print("La potencia de " +base +" elevado a " +exp +" es: " +resultado);
    
    }
   }   
     
