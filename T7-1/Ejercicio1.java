/*
 *Ejercicio1.java
 *Define un array de 12 elementos mostrados en la tabla del enunciado
 
 *@ autoria RSA
 
*/

public class Ejercicio1 {
  public static void main (String[] args) { 
    int[] num = new int[12];
    
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    System.out.println("El array sum contiene los siguientes elementos:");
    
    for (int i = 0; i < 12; i++) {
      System.out.println(num[i]);
    }
    
}
}
    
