package T8.misFunciones;

public class FunciArray {
    
  public static int sumaArray(int[] array) {
    int suma = 0;
    for (int i = 0; i <array.length; i++){
        suma += array[i];
    }
    return suma;
  }

  public static double mediaArray(int[] array) {
    return (double)sumaArray(array)/array.length;
  }

  
}
