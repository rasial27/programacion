/*
 *Ejemplo3.java
 *Calcula y muestra la suma y el producto de los diez primeros numeros naturales
 
 *@ autoria RSA

*/

public class Ejemplo3 {
  public static void main (String[] args) {
   
    //suma
    int suma = 0;
    
    
    for (int cont = 0; cont <= 10; cont++) {
      suma = suma + cont;  
    }
    
    //producto
    int producto = 1;
    
    for (int cont = 1; cont <= 10; cont++) {
      producto = producto * cont;  
    }
    
    System.out.print("La suma es: " +suma +" y el productos es: " +producto);
    
    }
   }   
     
