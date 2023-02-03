import java.util.Scanner;
/* 
 *Ejercicio23.java
 *Introduces numeros hasta que la suma de los numeross introducidos sea 10000. Luego muestra el total de numeros, la acumulacion y la media
 
 *@ autoria RSA
 
*/

public class Ejercicio23 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.print("Introduce numeros hasta que la suma sea 10000: ");
    
    int num;
    int suma = 0;
    int numIntroducido = 0;
    
    do {
      num = s.nextInt();
      suma += num;
      numIntroducido++;
    } while (suma <= 10000);
    
    System.out.println("Ha introducido " +numIntroducido +" numeros");
    System.out.println("La suma es: " +suma);
    System.out.println("La media es: " +(suma / (double) numIntroducido ));
    
}
}
    
    
      
      
     
    
    
