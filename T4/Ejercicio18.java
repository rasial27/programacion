import java.util.Scanner;
/*
 *Ejercicio18.java
 *Introduce un numero y te dice la primera cifra, se perimiten hasta 5 cifras
 
 *@ autoria RSA
 
*/

public class Ejercicio18 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero entero de hasta 5 cifras: ");
    int num = s.nextInt();
    
    int primer = 0;
    
    if (num < 10) {
	  primer = num;
	}
	
	if ((num >= 10) && (num < 100)) {
	  primer = num / 10;
	}
	
	if ((num >= 100) && (num < 1000)) {
	  primer = num / 100;
	}
	
	if ((num >= 1000) && (num <10000)) {
	  primer = num / 1000;
	}
	
	if (num >=10000) {
	  primer = num / 10000;
	}
	
	System.out.print("La primera cifra del numero " +num +" es " +primer);       
    
}
}
    
     
