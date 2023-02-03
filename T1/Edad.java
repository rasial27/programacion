/*
 * Edad.java
 * Imprime por pantalla mi año de nacimineto y el de mi compañero, la suma de los años y si son iguales, mayores, menores o diferentes
 
 * @ autoria RSA
 
*/

public class  Edad {
  public static void main (String[] args) {
  
  int FechaRafa= 1999;
  int FechaCristobal= 2001;
  int suma;
  char Rafa= 'R';
  char Cristobal= 'C';
  suma= FechaRafa + FechaCristobal;
  
  System.out.println("la fecha de nacimiento de Rafa es=" +(FechaRafa));
  System.out.println("la fecha de nacimiento de Cristobal es=" +(FechaCristobal));
  System.out.println("La suma de las fechas de nacimientos es="  +(suma)) ;
  System.out.println("La fecha de Rafa es mayor que la de Cristobal="  +(FechaRafa > FechaCristobal)) ;
  System.out.println("La fecha de Rafa es menor que la de Cristobal="  +(FechaRafa < FechaCristobal)) ;
  System.out.println("La fecha de Rafa es igual que la de Cristobal="  +(FechaRafa == FechaCristobal)) ;
  System.out.println("La fecha de Rafa es diferente que la de Cristobal="  +(FechaRafa != FechaCristobal)) ;
  System.out.println ("La inicial de Rafa es mayor que la de Cristobal="  + (Rafa > Cristobal));
  
  }
 } 
 
