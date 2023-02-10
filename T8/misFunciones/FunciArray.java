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

  public static int[] generaArrayInt(int n, int minimo, int maximo) {
    int[] array = new int[n];
    for (int i = 0; i < array.length; i++) {
       array[i] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
    }
    return array;
  }

  public static int minimoArrayInt(int[] x) {
    int min = Integer.MAX_VALUE;
  
    for(int i = 0; i < x.length; i++){
      if (x[i] < min) {
        min = x[i];
      }
    }
    return min;
  }

  public static int maximoArrayInt(int[] x) {
    int max = Integer.MIN_VALUE;
    
    for(int i = 0; i < x.length; i++) {
    if (x[i] > max) {
      max = x[i];
      }
    }
      
    return max;
  }

  public static boolean estaEnArrayInt(int[] array, int numero) {
    for (int i = 0; i < array.length; i++) {
       if (array[i] == numero) {
          return true;
       }
    }
    return false;
  }

  public static int posicionEnArray(int[] array, int numero) {
    for (int i = 0; i < array.length; i++) {
       if (array[i] == numero) {
          return i;
       }
    }
    return -1;
  }

  public static void volteaArrayInt(int[] array) {
    int aux;
    for (int i = 0; i < array.length / 2; i++) {
       aux = array[i];
       array[i] = array[array.length - i - 1];
       array[array.length - i - 1] = aux;
    }
  }

  public static void rotaDerechaArrayInt(int[] array, int posiciones) {
    int aux = array[array.length - 1];
    for (int i = array.length - 1; i > 0; i--) {
       array[i] = array[i - 1];
    }
    array[0] = aux;
    if (posiciones > 1) {
       rotaDerechaArrayInt(array, posiciones - 1);
    }
  }

  public static int[] rotaIzquierdaArrayInt(int[] array, int n) {
    int[] result = new int[array.length];

    for (int i = 0; i < array.length; i++) {
        result[(i + array.length - n) % array.length] = array[i];
    }
    return result;
  }

  
}
