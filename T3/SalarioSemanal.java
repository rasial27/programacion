import java.util.Scanner;
/*
 *SalarioSemanal.java
 *Calcula el salario semanal de un empleado
 
 *@ autoria RSA
 
*/

public class SalarioSemanal {
  public static void main (String[] args) { 
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce las horas trabajadas esta semana: ");
    int horas = s.nextInt();
    
    int salario = (horas * 12);
    
    System.out.print("Tu salario semanal es " +salario);
    
    }
   } 
    
    
