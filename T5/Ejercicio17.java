import java.util.Scanner;
/* 
 *Ejercicio17.java
 *Suma los siguientes cien numeros a uno introducido por teclado
 
 *@ autoria RSA
 
*/

public class Ejercicio17 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    int num = 0;
    
    do {
      System.out.print("Introduce un numero entero positivo: ");
      num = s.nextInt();
      
      if (num < 0) {
        System.out.print("El numero introducido no es correcto. Introduzca otro: ");
      }
      
    } while (num < 0);
    
    int suma = 0;
    
    for(int i = num; i < num + 100 ; i++) {
      suma += i;
    }
    
    System.out.print("La suma de los 100 siguientes numero introducidos al tuyo es: " +suma);
    
    }
   }       
        
