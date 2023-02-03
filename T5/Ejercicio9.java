import java.util.Scanner;
/*
 *Ejercicio9.java
 *Introduces un numero por pantalla y te dice cuantos digitos tiene
 
 *@ autoria RSA
 
*/

public class Ejercicio9 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero: ");
    int numero = s.nextInt();
    
    int n = numero;
    int digitos = 1;
    
    while (n > 10) {
      digitos++;
      n = n / 10; 
    }  
    
    System.out.print("Tu numero " +numero +" tiene " +digitos +" digitos");
    
    }
   } 
