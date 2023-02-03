import java.util.Scanner;
/*
 *Ejercicio8.java
 *Imprime la tabla de multiplicar de un numero introducido por teclado
 
 *@ autoria RSA
 
*/

public class Ejercicio8 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero: ");
    int num = s.nextInt();
    
    for(int i = 0; i <= 10; i++) {
      System.out.println(num +" * " +i +" = " +(num * i));
    }
    
    }
   }  
