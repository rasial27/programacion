
public class prueba {
    public static void main (String[] args) {
      
      int f = 10;
      int c = 5;
      
      int[][] num = new int[f][c];
      int fila, col;
      int pos = 1;
      
      
      System.out.println("Boleto Primitiva"); //Genera el array con el boleto de loteria
      for (fila = 0; fila < f; fila++) {
        for (col = 0; col < c; col++) {
          num[fila][col] = pos;
          pos++;
          System.out.printf("%4d", num[fila][col]);
        }
        
        System.out.println();
      }
      
      int[] apuesta = new int[6];
      int i ;
      int guardado;
  
      
      System.out.println();
      System.out.print("Apuesta: ");  //Genera la apuesta
      for (i = 0; i < 6; i++) {
        apuesta[i] = (int)(Math.random()*50)+1;
        
        System.out.print(apuesta[i] +" ");
      }
     
      
  
      System.out.println();
      int apu = 1;
      System.out.println("\nBoleto apuesta");  //Genera el array con la apuesta
      for (fila = 0; fila < f; fila++) {
        for (col = 0; col < c; col++) {
          num[fila][col] = apu;
          apu++; 
          
          if (apuesta[i] == num[fila][col]) {
            System.out.print("*" +num[fila][col] +"*");
          } else {
            System.out.printf("%4d", num[fila][col]);
          }
        }
      System.out.println();  
      }        
      
    }
    
  } 