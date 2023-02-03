import java.util.Scanner;
/*
 *Ejercicio13.java
 *Ordena tres numeros introducidos por teclado
 
 *@ autoria RSA
 
*/

public class Ejercicio13 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    //Variable para guardar el orden
    int orden;
    
    System.out.print("Introduce el primer numero: ");
    int a = s.nextInt();
    System.out.print("Introduce el segundo numero: ");
    int b = s.nextInt(); 
    System.out.print("Introduce el tercer numero: ");
    int c = s.nextInt();
    
    //Se ordenan los dos primeros numeros
    if (a > b) {
      orden = a;
      a = b;
      b = orden;
    } 
    
    //Se ordenan los dos ultimos numeros 
    if (b > c) {
      orden = b;
      b = c;
      c = orden;
    }
    
    //Se vuelven a ordenar los dos primeros
    if (a > b) {
      orden = a;
      a = b;
      b = orden;
    }
    
    System.out.print("Los numeros introducidos de menor a mayor son: " +a +" , " +b +" y " +c);
    
}
}
