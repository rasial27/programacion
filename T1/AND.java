/*
 *AND.java
 * Imprime por pantalla los valores del operador logico AND
 
 * @ autoria RSA
 
*/

public class AND {
  public static void main (String[] args) {
  
  boolean a=true;
  boolean b=true;
  boolean c=false;
  boolean d=false;
  
  System.out.println ("true Y true ="  +(a && b) ) ;
  System.out.println ("true Y false ="  +(a && c) );
  System.out.println ("false Y true ="  +(c && a) );
  System.out.println ("false Y false ="  +(c && d) );
  
  }
 }
