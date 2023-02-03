/*
 *DosNumerosMultiplicacion.java
 *Lee por pantalla dos numeros y calcula su multiplicacion
 
 *@autoria RSA
 
*/

public class DosNumerosMultiplicacion {
  public static void main (String[] args) {
  
    String linea;
    
    System.out.print("Por favor introduce un numero: ");
    linea = System.console().readLine();
    int primerNumero;
    primerNumero = Integer.parseInt( linea );
    
    System.out.print("Introduce el segundo numero: ");
    linea = System.console().readLine();
    int segundoNumero;
    segundoNumero = Integer.parseInt( linea );
    
    int total;
    total = (primerNumero * segundoNumero);
    
    System.out.print("El primer numero introducido es " + primerNumero);
    System.out.println(" y el segundo numero es " + segundoNumero);
    System.out.print("La multiplicacion de ambos es " + total);
    
}
}
    
