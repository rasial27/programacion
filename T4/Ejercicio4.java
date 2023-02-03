import java.util.Scanner;
/*
 *Ejercicio4.java
 *Calcula el salario semanal teniendo en cuenta las horas trabajadas
 
 *@ autoria RSA

*/

public class Ejercicio4 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime cuantas horas has trabajado esta semana: ");
    int horas = s.nextInt();
    int sueldoSemanal;
    
    if (horas <= 40) {
      sueldoSemanal = (12 * horas);
    } else {
      sueldoSemanal = ((40 * 12) + ((horas - 40)*16));
    }
    System.out.print("Tu sueldo semanal es de " +sueldoSemanal +" euros");
    
    }
   }       
