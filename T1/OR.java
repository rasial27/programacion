/*
 *OR.java
 *Imprime por pantalla los valores del opereador logico OR
 
 * @ autoria RSA
 
*/

public class OR {
  public static void main (String[] args) {
  
  boolean a=true;
  boolean b=true;
  boolean c=false;
  boolean d=false;
  
  System.out.println ("true O true ="  +(a || b) ) ;
  System.out.println ("true O false ="  +(a || c) );
  System.out.println ("false O true ="  +(c || a) );
  System.out.println ("false O false ="  +(c || d) ); 
  
  }
 } 
