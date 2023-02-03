/*
 *OperacionesTeclado.java
 *Lee por pantalla dos valores y suma, resta, multiplica y divide los valores
 
 *@ autoria RSA
 
*/

public class OperacionesTeclado {
  public static void main (String[] args) {
  
    String linea;
    
    System.out.print("Dime el primer valor: ");
    linea = System.console().readLine();
    double numero1;
    numero1 = Integer.parseInt( linea );
    
    System.out.print("Dime el segundo valor: ");
    linea = System.console().readLine();
    double numero2;
    numero2 = Integer.parseInt( linea );
    
    double suma;
    double resta;
    double multiplicacion;
    double division;
    
    suma = (numero1 + numero2);
    resta = (numero1 - numero2);
    multiplicacion = (numero1 * numero2);
    division = (numero1 / numero2);
    
    System.out.println("La suma de " + numero1 +" " +"y " + numero2 +" es: " +suma);
    System.out.println("La resta de " + numero1 +" " +"y " + numero2 +" es: " +resta);
    System.out.println("La multiplicacion de " + numero1 +" " +"y " + numero2 +" es: " +multiplicacion);
    System.out.println("La division de " + numero1 +" " +"y " + numero2 +" es: " +division);
    
    }
   } 
