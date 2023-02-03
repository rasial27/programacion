import java.util.Scanner;
/*
 *KbMb.java
 *Conversor de Kb a Mb
 
 *@ autoria RSA
 
*/

public class KbMb {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime los Mb que tienes: ");
    double Kb = s.nextDouble(); 
    
    double Mb = (Kb / 1000);
    
    System.out.print("Tus " +Kb +" Kb son " +Mb +" Mb");
    
    }
   } 
    
