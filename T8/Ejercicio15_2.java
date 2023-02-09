package T8;
import T8.misFunciones.FunciArray;

public class Ejercicio15_2 {
  public static void main(String[] args){
    int t = 100;
    int[] array = new int[t];

    for(int i = 0; i < t; i++){
      array[i] = i + 1;
    }

    System.out.println("La suma total es: " +FunciArray.sumaArray(array));
    System.out.println("La media es: " +FunciArray.mediaArray(array));
  }
    
}
