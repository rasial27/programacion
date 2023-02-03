import java.util.Scanner;
/*
 *Ejercicio41.java
 *Dice cuantos digitos pares e impares hay en un numero introducido por teclado
 
 *@ autoria RSA
 
*/

public class Ejercicio41 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero: ");
    long num = s.nextLong();
    
    long numero = num;
    int digitoPar = 0;
    int digitoImpar = 0;
    
    while (numero > 0) {
      if ((numero % 2) == 0) {
        digitoPar++;
      } else {
        digitoImpar++;
      }
      numero /= 10;
    }
    
    System.out.print("El numero introducido " +num +" tiene " +digitoPar +" digitos pares y " +digitoImpar +" digitos impares");
    
    }
   }     
         
