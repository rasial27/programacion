import java.util.Scanner;
/*
 *Ejercicio3.java
 *Introduce un numero del 1 al 7 y te dice que dia de la  semana es 
 
 *@ autoria RSA
 
*/

public class Ejercicio3 {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    
    String dia = "";
    System.out.print("Introduce un numero del 1 al 7: ");
    int numero = s.nextInt();
    
    switch (numero) {
      case 1:
      dia = "Lunes";
      break;
      
      case 2:
      dia = "Martes";
      break;
      
      case 3: 
      dia = "Miercoles";
      break;
      
      case 4:
      dia = "Jueves";
      break;
      
      case 5:
      dia = "Viernes";
      break;
      
      case 6:
      dia = "Sabado";
      break;
      
      case 7:
      dia = "Domingo";
      break;
      
      
      
    }
    
    System.out.print("El numero " +numero +" es el dia " +dia);
    
    }
   }   
