import java.util.Scanner;
/* 
 *Ejercicio18.java
 *Introduces dos numeros y te mostrara los numeros enteros comprendidios entre los introducidos de 7 en 7
 
 *@ autoria RSA
 
*/

public class Ejercicio18 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    int primerNum;
    int segundoNum;
    
    do {
      System.out.print("Introduce el primer numero: ");
      primerNum = s.nextInt();
      System.out.print("Introduce el segundo numero: ");
      segundoNum = s.nextInt();
      
      if (primerNum == segundoNum) {
        System.out.print("Los numeros no son validos. Introducelos de nuevo");
      }
    } while (primerNum == segundoNum);
    
    if (primerNum > segundoNum) {
      int aux = primerNum;
      primerNum = segundoNum;
      segundoNum = aux;
    }
    
    for (int i = primerNum; i < segundoNum; i += 7) {
      System.out.print(i + " ");
    }
    System.out.println();
    
    }
   }         
