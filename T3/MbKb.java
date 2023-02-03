import java.util.Scanner;
/*
 *MbKb.java
 *Conversor de Mb a Kb
 
 *@ autoria RSA
 
*/

public class MbKb {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Dime los Mb que tienes: ");
    double Mb = s.nextDouble(); 
    
    double Kb = (Mb * 1000);
    
    System.out.print("Tus " +Mb +" Mb son " +Kb +" Kb");
    
    }
   } 
    
 
