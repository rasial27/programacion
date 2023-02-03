import java.util.Scanner;
/*
 *Ejercicio10.java
 *Introduce tu dia y mes de nacimiento y te dice que horoscopo eres
 
 *@ autoria RSA
 
*/

public class Ejercicio10 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    String horoscopo = "";
    
    System.out.print("Introduce el numero de tu mes de nacimiento: ");
    int mes = s.nextInt();
    
    System.out.print("Introduce tu dia de nacimiento: ");
    int dia = s.nextInt();
    
    switch (mes) {
      case 1:
        if (dia < 21) {
          horoscopo = "Capricornio";
        } else {
          horoscopo = "Acuario";
        }
        break;  
       
      case 2:
        if (dia < 20) {
          horoscopo = "Acuario";
        } else {
          horoscopo = "Piscis";
        }
        break; 
        
      case 3:
        if (dia < 21) {
          horoscopo = "Piscis";
        } else {
          horoscopo = "Aries";
        }
        break; 
        
      case 4:
        if (dia < 21) {
          horoscopo = "Aries";
        } else {
          horoscopo = "Tauro";
        }
        break; 
        
      case 5:
        if (dia < 20) {
          horoscopo = "Tauro";
        } else {
          horoscopo = "Geminis";
        }
        break;   
        
      case 6:
        if (dia < 22) {
          horoscopo = "Geminis";
        } else {
          horoscopo = "Cancer";
        }
        break;  
        
        case 7:
        if (dia < 22) {
          horoscopo = "Cancer";
        } else {
          horoscopo = "Leo";
        }
        break;  
        
        case 8:
        if (dia < 24) {
          horoscopo = "Leo";
        } else {
          horoscopo = "Virgo";
        }
        break;
        
        case 9:
        if (dia < 23) {
          horoscopo = "Virgo";
        } else {
          horoscopo = "Libra";
        }
        break;
        
        case 10:
        if (dia < 23) {
          horoscopo = "Libra";
        } else {
          horoscopo = "Escorpio";
        }
        break;
        
        case 11:
        if (dia < 23) {
          horoscopo = "Escorpio";
        } else {
          horoscopo = "Sagitario";
        }
        break;
        
        case 12:
        if (dia < 21) {
          horoscopo = "Sagitario";
        } else {
          horoscopo = "Capricornio";
        }
        break;
        
      }
      
      System.out.print("Nacido el dia " +dia +" del mes " +mes +" eres " +horoscopo);
      
  }
}  
           
    
    
   
  
  
