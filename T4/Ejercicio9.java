import java.util.Scanner;
/*
 *Ejercicio9.java
 *Calcula una ecuacion del tipo ax^2 + bx + c = 0
 
 *@ autoria RSA
 
*/

public class Ejercicio9 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    double x1;
    double x2;
    
    System.out.print("Introduce el  valor de a: ");
    double a = s.nextDouble();
    System.out.print("Introduce el  valor de b: ");
    double b = s.nextDouble();
    System.out.print("Introduce el  valor de c: ");
    double c = s.nextDouble();
    
    // a, b y c son 0
    if ((a == 0) && (b == 0) && (c == 0)){
      System.out.print("La solucion es infinita");
    }
    
    // b y c no son 0
    if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = " + (-c / b));
      System.out.println("x2 = " + (-c / b));
    }
    
    // c no es 0
    if ((a == 0) && (b == 0) && (c != 0)) {
	  System.out.print("La ecuacion no tiene solucion");
	}
	
	// a y b no es 0
	if ((a != 0) && (b != 0) && (c == 0)) {
	  System.out.println("x1 = 0");
	  System.out.print("x2 = " + (-b / a));
	}
	
	// a, b y c no son 0
	if ((a != 0) && (b != 0) && (c != 0)) {
	  double raiz = b * b -(4 * a * c);
	  
	  if (raiz < 0) {
	    System.out.print("Esta solucion no es posible");
	  } else {
		System.out.println("x1 = " +(-b +Math.sqrt(raiz))/(2 * a));
		System.out.println("x2 = " +(-b -Math.sqrt(raiz))/(2 * a));
	  }
	}  	
		    	  
    
    }
   }   
        
    
     
