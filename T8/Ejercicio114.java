package T8;
import T8.misFunciones.Varias;
import java.util.Scanner;
/*
 * Ejercicio 114.java
 * Primeros ejercicios
  
 * @ autoria RSA
 
 */
public class Ejercicio114 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Ejercicio 1");
    System.out.print("\nIntroduce un numero y te dire si es capicio: ");
    int c = s.nextInt();

    if (Varias.esCapicua(c)) {
      System.out.print(c +" es capicuo");
    } else{
      System.out.print(c +" no es capicuo");
    }

    System.out.println();
    
    System.out.println("Ejercicio 2 y 3");
    System.out.print("Introduce un numero y te dire si es primo, si no es primo te mostrare el siguiente: ");
    int p = s.nextInt();

    if (Varias.esPrimo(p)) {
      System.out.print(p +" es primo");
    } else {
      System.out.print(p +" no es primo, el siguiente seria: " +Varias.sigPrimo(p));
    }

    System.out.println();

    System.out.println("Ejercicio 4");
    System.out.print("Introduce base y exponente y te calculare la potencia: ");
    int b = s.nextInt();
    int e = s.nextInt();

    System.out.print("La potencia de base " +b +" y exponente " +e +" seria: " +Varias.potencia(b, e));

    System.out.println();

    System.out.println("Ejercicio 5");
    System.out.print("Introduce un numero y te dire cuantos digitos tiene: ");
    int d = s.nextInt();

    System.out.print("Tu numero " +d +" tiene " +Varias.digitos(d) +" digitos");

    System.out.println();

    System.out.println("Ejercicio 6");
    System.out.print("Introduce un numero y te lo volteare: ");
    int v = s.nextInt();

    System.out.print("Tu numero " +v +" volteado seria " +Varias.voltea(v));

   

  }
 
    
}
