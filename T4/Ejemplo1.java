/*
 *Ejemplo1.java
 *Enseña una fruta
 
 *@ autoria RSA
 
*/

public class Ejemplo1 {
  public static void main (String[] args) {
    String miFruta = "\033[91m naranja \033[39;49ma";
    
    if ("naranja".equals(miFruta)) {
      System.out.println("\033[91m iguales \033[39;49m");
    } else {
      System.out.println("\033[91m distinta \033[39;49m");
    }
    
    }
   }      
