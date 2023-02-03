import java.util.Scanner;
/* 
 *Ejercicio11.java
 *Introduces una hora en horas y minutos y te dice los segundos que faltan para medianoche
 
 *@ autoria RSA
 
*/

public class Ejercicio11 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce la hora: ");
    int hora = s.nextInt();
    System.out.print("Introduce los minutos: ");
    int minutos = s.nextInt();
    
    //Se calcula los segundos que ya han pasado
    int segundosPasados = (hora * 3600) + (minutos * 60);
    //Ahora se calculan los segundos que faltan hasta medianoche
    int segundosMedianoche = (24 * 3600) - segundosPasados;
    
    System.out.print("Si es la hora " +hora + ":" +minutos + " faltan estos segundos para medianoche: " +segundosMedianoche);
    
    }
   }  
