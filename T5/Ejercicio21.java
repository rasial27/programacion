import java.util.Scanner;
/* 
 *Ejercicio21.java
 *Introduces numeros hasta que se introduzaca uno negativo. Nos dira el total de numeros introducidos, el mayor par y la media de los impares
 
 *@ autoria RSA
 
*/

public class Ejercicio21 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce numeros, para parar introduce un numero negativo: ");
    
    int num;
    int maxPar = 0;
    int sumaImpar = 0;
    int numIntroducido = 0;
    int numIntroducidoImpar = 0;
    
    do {
      num = s.nextInt();
      
      if (num >= 0) {
        numIntroducido++;
        if ((num % 2) == 1) {
          sumaImpar += num;
          numIntroducidoImpar++;
        } else {
          if (num > maxPar) 
            maxPar = num;
        }
      }
    } while (num >= 0);
    
    System.out.println("Total de numeros introducidos: " +numIntroducido);
    System.out.println("La media de los impares es : " +(sumaImpar / numIntroducidoImpar));
    System.out.println("El mayor numero par introducido es: " +maxPar);
    
    }
   }     
              
          
      
    
    
    
