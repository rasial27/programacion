package T8;
import java.util.Scanner;
/*
 * Ejercicio2028.java
 * Crea las funciones de los ejercicios 20 al 28
  
 * @ autoria RSA
 
 */
public class Ejercicio2028 {

  public static int[] generaArrayInt(int n, int min, int max) {
   
    int[] num = new int[n];

    for( int i = 0; i < n; i++) {
      num[i] = (int)(Math.random()*(max+1-min)) +min;
    }
    return num;

    
  }

  public static int minimoArrayInt(int[] x) {
    int min = Integer.MAX_VALUE;
    
    for(int i = 0; i < x.length; i++){
      if (x[i] < min) {
        min = x[i];
      }
    }
    return min;
  }

  public static int maximoArrayInt(int[] x) {
    int max = Integer.MIN_VALUE;
    
    for(int i = 0; i < x.length; i++) {
    if (x[i] < max) {
      max = x[i];
      }
    }
      
    return max;
  }

  public static double




}


  
    

