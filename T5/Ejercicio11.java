import java.util.Scanner;
/* 
 *Ejercicio11.java
 *Enseña en tres columnas el cuadrado y el cubo de 5 numeros enteros empezando por el introducido por teclado
 
 *@ autoria RSA
 
*/

public class Ejercicio11 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero entero: ");
    int num = s.nextInt();
    
    for (int i = num; i < num + 5; i++) {
      System.out.println(i +" | " +(i * i) + " " +" | " +(i*i*i));
    }
    
    }
   }   
