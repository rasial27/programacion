/*
 * Ejercicio4.java
 * Igual que el ejercico anterior pero ahora el resultado sale retardado
  
 * @ autoria RSA
 
 */
public class Ejercicio4 {
    public static void main (String[] args) 
      throws InterruptedException{
      int fila = 4;
      int columna = 5;
  
      int [][] num = new int[fila][columna];
      int f;
      int c;
  
      System.out.println("Se generan 20 numeros enteros ");
      for(f = 0; f < fila; f++){
        for(c = 0; c < columna; c++){
          num[f][c] = (int)(Math.random()*900) + 100;
        }
        
      }
  
      int sumC, sum = 0;
      int sumF = 0;
  
      for (f = 0; f < fila; f++ ) {
        for (c = 0; c < columna; c++) {
          System.out.printf("%5d", num[f][c]);
          sum += num[f][c];
          sumF += num[f][c];
        }
        System.out.println("  |  " +sum);
        Thread.sleep(1000);
        sum = 0;
      }
  
      System.out.println("----------------------------------" );
      for (c = 0; c < columna; c++ ) {
        for (f = 0; f < fila; f++) {
          sum += num[f][c];
        }
        System.out.printf("%5d", sum);
        Thread.sleep(1000);
        sum = 0;
      }
  
      System.out.printf("%8d", sumF);
      Thread.sleep(1000);

      }
      
    }
  

  