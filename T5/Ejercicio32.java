import java.util.Scanner;
/* 
 *Ejercicio32.java
 *Introduce un numero entero positivo y te dice cuales y cuantos suman los numeros pares. Los pares se deben mostran por pantalla
 
 *@ autoria RSA
 
*/

public class Ejercicio32 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero entero positivo: ");
    long num = s.nextLong();
    
    long numIntroducido = num;
    long volteado = 0;
    int longitud = 0;
    
    if (numIntroducido == 0) {
      longitud = 1;
    }
    
    while (numIntroducido > 0) {
      volteado = (volteado * 10) + (numIntroducido % 10);
      numIntroducido /= 10;
      longitud++;
    }
    
    System.out.print("Los numeros pares: ");
    
    int digito;
    int sumaPar = 0;
    
    for (int i = 0; i < longitud; i++) {
      
      digito = (int)(volteado % 10);
      
      if ((digito % 2) == 0) {
		System.out.print(digito + " ");
		sumaPar += digito;  
    }
    
    volteado /= 10;
}
    
    System.out.println("\nSuma de los digitos pares: " +sumaPar);
    
    }
   }        
    
