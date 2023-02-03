import java.util.Scanner;
/*
 * Ejercicio7.java
 * Genera 100 numeros del 0 al 20 y luego pide dos numeros por teclado, cambia el primer numero y el segundo en las ocurrencias anteriores
 
 * @ autoria RSA
 
 */
public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int[] num = new int[100];
    int i;

    for(i = 0; i < 100; i++) {
      num[i] = (int)(Math.random()*21); 
      System.out.print(num[i]+ " ");
    }

    int num1;
    int num2;

    System.out.print("\nIntroduce el primer numero: "); //valor que se quiere sustituir
    num1 = s.nextInt();
    System.out.print("Introduce tu segundo numero: "); //valor por el que se sustituye
    num2 = s.nextInt();

    for(i = 0; i < 100; i++) {
      if (num[i] == num1) {
        num[i] = num2;
      }
      if (num[i] == num2){
        System.out.print("\"" +num[i] +"\" ");
      } else {
        System.out.print(num[i]+ " ");
      }
      
    }

  }
}
