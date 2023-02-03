/*
 *PesetaEuro.java
 *Imprime por pantalla un conversor de pesetas a euros
 
 *@autoria RSA
 
*/

public class PesetaEuro {
  public static void main (String[] args) {
  
    int pesetas = 1000000;
    double euros = (double)(pesetas/166.38); 
    
    System.out.print(pesetas +" pesetas son " +euros +" euros");
    
    }
   } 
