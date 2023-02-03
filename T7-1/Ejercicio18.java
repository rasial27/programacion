/*
 * Ejercicio10.java
 * Genera 20 numeros aleatorios entre 0 y 100 y luego ordena primero los pares y luego los impares
  
 * @ autoria RSA
 
 */
public class Ejercicio18 {
    public static void main (String[] args) {
      
      int a = 10; 
      int num[] = new int[a];
      int mayor[] = new int[a];
      int menor[] = new int[a];
      
      int i;
      int mayores = 0;
      int menores = 0;
  
      for (i = 0; i < a; i++) {
        num[i] = (int)(Math.random()*201);

        if (num[i] > 100) {
          mayor[mayores++] = num[i]; 
        } else {
          menor[menores++] = num[i]; 
        }
      }

      System.out.println("Primer array: ");
      for (i = 0; i < a; i++) {
        System.out.print(num[i] +" ");    
      }
      System.out.println();

      for (i = 0; i < a; i+=2) {
        if (mayores > 100) {
          num[i] = mayor[mayores-1];
          mayores--;
        } else {
          num[i] = menor[menores-1];
          menores--;
        }
      }
      for (i = 1; i < a; i+=2) {
        if (menores > 0) {
          num[i] = menor[menores-1];
          menores--;
        } else {
          num[i] = mayor[mayores-1];
          mayores--;
        }
      }

      System.out.println("Array ordenado: ");
      for (i = 0; i < a; i++) {
        System.out.print(num[i] +" ");
      }
    }
      
  }