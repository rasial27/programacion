import java.util.Scanner;
/* 
 *Ejercicio34.java
 *Introduce dos numeros y los mezcla, luego enseña los pares e impares de la mezcla en un orden
 
 *@ autoria RSA
 
*/

public class Ejercicio34 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el primer numero: ");
    long num1 = s.nextLong();
    
    System.out.print("Introduce el siguiente numero: ");
    long num2 = s.nextLong();
    
    long numero = num1;
    long volteado1 = 0;
    int longitud = 0;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado1 = (volteado1 * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    }
    
    numero = num2;
    long volteado2 = 0;
    
    while (numero > 0) {
      volteado2 = (volteado2 * 10) + (numero % 10);
      numero /= 10;
    } 
    
    long resultadoPar = 0;
    long resultadoImpar = 0;
    int digito;
    
    for (int i=0; i<longitud; i++) {
		
      digito = (int)(volteado1 % 10);
      
      if ((digito % 2) == 0) {
        resultadoPar = resultadoPar * 10 + digito;
      } else {
        resultadoImpar = resultadoImpar * 10 + digito;
      }
      
      digito = (int)(volteado2 % 10);
      
      if ((digito % 2) == 0) {
        resultadoPar = resultadoPar * 10 + digito;
      } else {
        resultadoImpar = resultadoImpar * 10 + digito;
      }
      
      volteado1 /= 10;
      volteado2 /= 10;
    }
    
    System.out.println("El numero que se forma con los pares es: " +resultadoPar);
    System.out.println("El numero que se forma con los impares es: " +resultadoImpar);
    
    }
   } 
          
        
        
        
             
