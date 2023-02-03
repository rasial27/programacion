/*
 *LeeNumeros.java
 *Lee dos numeros por pantalla
 
 *@ autoria RSA
 
*/

public class LeeNumeros {
  public static void main (String[] args) {
  
    String linea; //Define una variable string con nombre linea
    
    System.out.print("Por favor, introduce un numero: "); //Enseña por pantalla el texto escrito
    linea = System.console().readLine(); //Lee por teclado el primer numero
    int primerNumero; //Crea una vaariable para el primer numero
    primerNumero = Integer.parseInt( linea ); //Mete el primer numero en el string linea
    
    System.out.print("Introduce otro, por favor: "); //Enseña por pantalla el texto escrito
    linea = System.console().readLine(); //Lee por teclado el segundo numero
    int segundoNumero; //Crea la variable para el segundo nummero
    segundoNumero = Integer.parseInt( linea ); //Introduce el segundo numero en el string linea
    
    int total; //Crea la variable total
    total = (2 * primerNumero) + segundoNumero; //Calcula la variable total
    
    System.out.print("El primer numero introducido es " + primerNumero); //Enseña por pantalla el texto escrito mas el primer numero introducido
    System.out.println(" y el segundo es " + segundoNumero); //Enseña por pantalla el texto escrito mas el segundo numero introducido
    System.out.print("El doble del primer numero mas el segundo es "); //Enseña por pantalla el texto escrito
    System.out.print(total); //Enseña por pantalla el total calculado
    
}
}
