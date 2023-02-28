/*
 * Ejercicio21.java
 * Se genera una secuencia de 5 monedas lanzadas al aire 
 
 * @ autoria RSA
 
 */
public class Ejercicio21_T6 {
  public static void main(String[] args) {
    int[] valores = {1, 2, 5, 10, 20, 50, 100, 200}; //100 y 200 representan las monedas de 1 y 2 €
    String[] caras = {"cara", "cruz"};

    for (int i= 0; i < 5; i++) {
      int valor = valores[(int)(Math.random()* valores.length)];
      String cara = caras[(int)(Math.random()* caras.length)];
      System.out.println(valor + " centimos - " + cara);
    }
  }
}
