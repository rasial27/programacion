import java.util.Scanner;
/*
 *Ejercicio21.java
 *Calcula la media de programcaion
 
 *@ autoria RSA
 
*/

public class Ejercicio21 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    
    
    System.out.print("Introduce nota del primer examen: ");
    double nota1 = s.nextDouble();
    System.out.print("Introduce nota del segundo examen: ");
    double nota2 = s.nextDouble();
    
    double media = (nota1 + nota2) / 2;
    
    if (media < 5) {
      System.out.print("Apto o no apto en la recuperacion: ");
      String recu = System.console().readLine();
	  if (recu.equals("apto")) {
	    media = 5;
	  }
	}
	
	System.out.print("Tu nota media de progrmacion es: " +media);
	
	}
   }	 
	
