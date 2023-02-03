/*
 *Ejemplo1.java
 *Ejemplo 1 de array
 
 *@ autoria RSA
 
*/

public class Ejemplo1 {
  public static void main (String[] args) {
    
    int[] num = new int[10];
    
    num[0] = 1;
    num[1] = 2;
    num[2] = 2*2;
    num[3] = 2*2*2;
    num[4] = 2*2*2*2;
    num[5] = 2*2*2*2*2;
    num[6] = num[2] * 10;
    num[7] = num[2] / 10;
    num[8] = num[0] + num[1] + num[2];
    num[9] = num[8];
    
    System.out.println("El array sum contiene los siguientes elementos:");
    
    for (int i = 0; i < 10; i++) {
      System.out.println(num[i]);
    }
    
    System.out.print("Introduce un numero de 1 al 9 para saber numero del array:");
    int indice = Integer.parseInt(System.console().readLine());
    System.out.print("El elemento que se encuentra en la posicion " + indice);
    System.out.println(" es el " + num[indice]);
    
    int suma = num[1] + num[3] + num[5] + num[7] + num[9];
    
    System.out.print("La suma de los elementos pares es: " +suma);
    
    }
   }   
