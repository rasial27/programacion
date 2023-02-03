import java.util.Scanner;
/*
 *Ejercicio12.java
 *Cuestionario que suma las puntuaciones
 
 *@ autoria RSA
 
*/

public class Ejercicio12 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    int puntos = 0;
    String respuesta;
    
    System.out.println("Cuestionario de 10 preguntas");
    
    System.out.println("1. Cual se utiliza para utilizar AND");
    System.out.println("a) || ");
    System.out.println("b) && ");
    respuesta = s.nextLine();
    if (respuesta.equals("b")) {
	  puntos = puntos + 1;
	  System.out.println("Correcto");
	} else {
	  System.out.println("Incorrecto");
	} 
	
	System.out.println("2. Cual se utiliza para utilizar OR");
    System.out.println("a) || ");
    System.out.println("b) && ");
    respuesta = s.nextLine();
    if (respuesta.equals("a")) {
	  puntos = puntos + 1;
	  System.out.println("Correcto");
	} else {
	  System.out.println("Incorrecto");
	}
	
	System.out.println("3. Cuantas comillas utiliza el char");
    System.out.println("a) Comillas simples ");
    System.out.println("b) Doble comillas ");
    respuesta = s.nextLine();
    if (respuesta.equals("a")) {
	  puntos = puntos + 1;
	  System.out.println("Correcto");
	} else {
	  System.out.println("Incorrecto");
	}
	
	System.out.println("4. En la variable Int se pueden utilizar decimales");
    System.out.println("a) Si ");
    System.out.println("b) No ");
    respuesta = s.nextLine();
    if (respuesta.equals("b")) {
	  puntos = puntos + 1;
	  System.out.println("Correcto");
	} else {
	  System.out.println("Incorrecto");
	} 
	
	System.out.println("5. Cuantos espacios se dejan de sangria utilizando el estander de Google");
    System.out.println("a) 3 ");
    System.out.println("b) 2 ");
    respuesta = s.nextLine();
    if (respuesta.equals("b")) {
	  puntos = puntos + 1;
	  System.out.println("Correcto");
	} else {
	  System.out.println("Incorrecto");
	}
	
	System.out.println("6. Que significa este operador != ");
    System.out.println("a) Mayor que ");
    System.out.println("b) Distinto que ");
    respuesta = s.nextLine();
    if (respuesta.equals("b")) {
	  puntos = puntos + 1;
	  System.out.println("Correcto");
	} else {
	  System.out.println("Incorrecto");
	}
	
	System.out.println("7. Como se utiliza la salida formateada");
    System.out.println("a) printf ");
    System.out.println("b) println ");
    respuesta = s.nextLine();
    if (respuesta.equals("a")) {
	  puntos = puntos + 1;
	  System.out.println("Correcto");
	} else {
	  System.out.println("Incorrecto");
	}
	
	System.out.println("8. En Html que hace esto <b>");
    System.out.println("a) Pone el texto en cursiva ");
    System.out.println("b) Pone el texto en negrita ");
    respuesta = s.nextLine();
    if (respuesta.equals("b")) {
	  puntos = puntos + 1;
	  System.out.println("Correcto");
	} else {
	  System.out.println("Incorrecto");
	}
	
	System.out.println("9. Una pantalla tactil es un dispositivo de entrada/salida ");
    System.out.println("a) Verdadero ");
    System.out.println("b) Falso ");
    respuesta = s.nextLine();
    if (respuesta.equals("a")) {
	  puntos = puntos + 1;
	  System.out.println("Correcto");
	} else {
	  System.out.println("Incorrecto");
	}
	
	System.out.println("10. Que significa PK");
    System.out.println("a) Clave foranea ");
    System.out.println("b) Clave primaria ");
    respuesta = s.nextLine();
    if (respuesta.equals("b")) {
	  puntos = puntos + 1;
	  System.out.println("Correcto");
	} else {
	  System.out.println("Incorrecto");
	}
	
	System.out.println("Has obtenido " +puntos +" puntos");   
    
}
}
 
 
