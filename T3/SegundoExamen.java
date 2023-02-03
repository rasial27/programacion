import java.util.Scanner;
/*
 *SegundoExamen.java
 *Calcula la nota que tendrias que sacar en el segundo examen para conseguir la media deseada
 
 *@ autoria RSA
 
*/ 

public class SegundoExamen {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = s.nextDouble();
    
    System.out.print("Dime la media que quieres sacar en el trimestre: ");
    double notafinal = s.nextDouble();
    
    double nota2 = ((notafinal * 100) - (nota1 * 40)) / 60;
    
    System.out.print("Para sacar un " +notafinal +" en el trimestre necesita sacar un " +nota2 +" en el segundo examen");
    
    }
   } 
