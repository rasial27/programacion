/*
 * Se rellena un array de 15 con numeros aleatorios y luego se cincueriza el array se va comprobando si los numeros son
 * multiplos de 5 y si no lo son se cambia por el proximo multiplo de 5 de ese numero
  
 * @ autoria RSA
 
 */
public class Ejercicio21 {
  public static void main (String[] args) {

    int a = 15;
    int num[] = new int[a]; 
    int i;

    for ( i = 0; i < a; i++) {
      num[i] = (int)(Math.random()*501);
    }

    System.out.println("Array original: ");
    for( i = 0; i < a; i++) {
      System.out.print(num[i] +" ");
    }
    System.out.println();

    for ( i = 0; i < a; i++){
      int n = num[i];
      if (n % 5 != 0) {
        n = (n / 5 + 1) * 5;
        num[i] = n;
      }
    }

    System.out.println("Array cincuerizado: ");
    for ( i = 0; i < a; i++){
      System.out.print(num[i] +" ");
    }

  }
    
}
