import java.util.Scanner;
public class Repaso {
  public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el numero de array: ");
    int f = s.nextInt();
    int[] num = new int[f];
    int[] par = new int[f];
    int pares;
    int i;
    int max = Integer.MIN_VALUE;
    
    for (i = 0; i < f; i++) {
      num[i] = (int)(Math.random()*11)+50;
      if (num[i] > max) {
        max = num[i];
      }
    }

    pares = f;

    for(i = 0; i < f; i++){
      if (num[i] % 2 == 0){
        par[pares-1] = num[i];
        pares--;
      }
    }

    for(i = 0; i < f; i++){
      if (max == num[i]){
        System.out.print(" *" +num[i] +"* ");
      }else {
        System.out.printf("%3d", num[i]);
      }

    }

    System.out.println();

    for(i = 0; i < f; i++){
      System.out.printf("%3d", par[i]);
        
  
      }
    
    
 }

}
    

