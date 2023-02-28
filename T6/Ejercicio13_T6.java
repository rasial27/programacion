/*
 * Ejercicio13.java
 * Lanza dos dados y para cuando saquen el mismo resultado
  
 * @ autoria RSA
 
 */
public class Ejercicio13_T6 {
    public static void main(String[] args) {
  
      int dado1, dado2;
      
      do {
        dado1 = (int)(Math.random() * 6) + 1;
        dado2 = (int)(Math.random() * 6) + 1;
        System.out.println(dado1 + " " + dado2);
      } while (dado1 != dado2);
    }
  }