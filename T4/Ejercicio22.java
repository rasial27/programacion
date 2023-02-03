import java.util.Scanner;
/*
 *Ejercicio22.java
 *Dado un dia de la semana y una hora te dice cuanto falta para el fin de semana
 
 *@ autoria RSA
 
*/

public class Ejercicio22 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce el dia de la semana: ");
    String dia = s.nextLine();
    
    int diaNum = 0;
    
    switch (dia) {
	  case "lunes":
	    diaNum = 0;
	    break;
	    
	  case "martes":
	    diaNum = 1;
	    break;
	  
	  case "miercoles":
	    diaNum = 2;
	    break;    
	  
	  case "jueves":
	    diaNum = 3;
	    break;
    
      case "viernes":
	    diaNum = 4;
	    break;
	
    }
    System.out.print("Introduce la hora: ");
    int hora = s.nextInt();
    System.out.print("Introduce los minutos: ");
    int min = s.nextInt();
    
    //Cuatro dias completos y el viernes hasta las 15
    int minTotal = (4 * 24 * 60) + (15 * 60);
    int minActual = (diaNum * 24 * 60) + (hora * 60) + min;
    int minFin = minTotal - minActual;
    
    System.out.print("Para llegar a fin de semana faltan " +minFin +" minutos");    
    
    
    }
   }  
