import java.util.Scanner;
/*
 *Ejercicio1.java
 *Introduce un dia de la semana y te dice que hay ese dia a primera hora
 
 *@ autoria RSA
 
*/

public class Ejercicio1 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    String asignatura = "";
    System.out.print("Introduce un dia de la semana: ");
    String dia = s.nextLine();
    
    
    switch (dia) {
      case "lunes":
      asignatura = "FOL";
      break;
      
      case "martes":
      asignatura = "BD";
      break;
      
      case "miercoles":
      asignatura = "BD";
      break;
      
      case "jueves":
      asignatura = "SI";
      break;
      
      case "viernes":
      asignatura = "LM";
      break;
      
    }
    
    System.out.print("El " +dia +" hay: " +asignatura);
    
    }
   }   
