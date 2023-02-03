/*
 * Ejercicio4.java
 * Define tres arrays de 20 numeros, se utilizan numeros aleatorios, esos generados se guardan en el array  numero, luego 
   se crea un array cuadrado donde se guardan los cuadrados de los numeros guardados anteriormente y por ultimo se repite el 
   proceso pero con los cubos

 * @ autoria RSA
  
 */
public class Ejercicio4 {
  public static void main (String[] args) {
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];

    int i;

    for(i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random()*101);
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];
    }
    System.out.println("Se van a mostrar 20 numeros aleatorios del 0 al 100 en tres columnas, siendo la primera columna el mumero generado, la segunda el cuadrado y la tercera el cubo");
    System.out.println("  n  |  n^2  | n^3 ");
    System.out.println("----------------------");
    for (i = 0; i < 20; i++) {
      System.out.printf("%4d | %5d |%8d\n", numero[i], cuadrado[i], cubo[i]);
    }
  }    
    
}
