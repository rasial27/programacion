import java.util.Scanner;
/*
 *EjemploEstaciones.java
 *Introduces un numero del mes y te dice en que estacion esta el mes
 
 *@ autoria RSA
 
*/

public class EjemploEstaciones {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce un numero: ");
    int mes = s.nextInt();
    String estacion = "";
    
    switch (mes) {
	  //Invierno	
      case 1 , 2 , 12:
      estacion = "invierno";
      break;
      
      //Primavera
      case 3 , 4 , 5:
      estacion = "primavera";
      break;
      
      //Verano
      case 6 , 7 , 8:
      estacion = "verano";
      break;
      
      //Otoño
      case 9 , 10 , 11:
      estacion = "otoño";
      break;
  
  }
      System.out.print("Mes " +mes +": " +estacion);
      
      }
     }  
