import java.util.Scanner;
/*
 *Ejercicio10.java
 *Hace la media de los numeros introducidos por teclado hasta que se introduzca un numero negativo
 
 *@ autoria RSA
 
*/

public class Ejercicio10 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    double num = 0;
    double suma = 0;
    double numIntroducido = 0;
    
    System.out.print("Introduce un numero: ");
    
    while (numIntroducido >= 0) { 
      numIntroducido = s.nextDouble();
      num++;
      suma += numIntroducido;
    }
    
    double media = (suma - numIntroducido) / (num - 1);
    
    System.out.print("La media de los numeros introducidos es: " +media);
    
    }
   }   
