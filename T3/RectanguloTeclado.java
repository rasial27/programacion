/*
 *RectanguloTeclado.java
 *Lee por pantalla los lados de un rectangulo y calcula su area
 
 * @ autoria RSA
 
*/

public class RectanguloTeclado {
  public static void main (String[] args) {
  
    String linea;
    
    System.out.print("Dime la base: ");
    linea = System.console().readLine();
    double base;
    base = Integer.parseInt( linea );
    
    System.out.print("Dime la altura: ");
    linea = System.console().readLine();
    double altura;
    altura = Integer.parseInt( linea );
    
    double area;
    area = (base * altura);
    
    System.out.print("Tu rectangulo con base " +base +" y altura " +altura +" tiene de area " +area);
    
    }
   } 
    
    
    
    
    
      
