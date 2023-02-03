/*
 *Ejercicio5.java
 *Muestra 50 numeros enteros aleatorios entre 100 y 199 separados por espacios, ademas se muestra tambien el numero maximo, minimo y la media de esos numeros
 
 *@ autoria RSA

*/

public class Ejercicio5 {
  public static void main (String[] args) {

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int suma = 0;


    int i ; 
    int num;

    for (i = 0; i < 51; i++) {
      num =(int)(Math.random()*100)+100;
      System.out.print(num + " ");
      suma += num;
      if (num < min) {
        min = num;
      }
      if (num > max) {
        max = num;
      }
    }

    int media = suma/50;
    
    System.out.println("\nTu numero maximo es: " +max);
    System.out.println("Tu numero minimo es: " +min);
    System.out.println("La media de tus numeros es: " +media);

  }

}
  
