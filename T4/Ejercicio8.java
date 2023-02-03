import java.util.Scanner;
/*
 *Ejercicio8.java
 *Calcula la media de tres notas y te dice si es insuficiente, suficiente, bien, notable o sobresaliente
 *@ autoria RSA
 
*/

public class Ejercicio8 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("Las notas deben ser de 0 a 10");
    System.out.print("Introduce tu primera nota: ");
    double nota1 = s.nextDouble();
    System.out.print("Introduce tu segunda nota: ");
    double nota2 = s.nextDouble();
    System.out.print("Introduce tu tercera nota: ");
    double nota3 = s.nextDouble();
    
    double media = (nota1 + nota2 + nota3)/3;
    
    if (media < 5) {
      System.out.print("Tu media es de insuficiente");
    }
    
    if ((media >= 5) && (media < 6)) {
      System.out.print("Tu media es de suficiente");
    }
    
    if ((media >= 6) && (media < 7)) {
	  System.out.print("Tu media es de bien");
	}
	
	if ((media >= 7) && (media < 9)) {
	  System.out.print("Tu media es de notable");
	}
	
	if ((media >=9) && (media <= 10)) {
	  System.out.print("Tu media es de sobresaliente");
	}       	
    
    
    }
   }    
