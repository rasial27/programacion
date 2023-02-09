package T8.misFunciones;

public class Varias {
  /*
   * Multiplcas dos numeros
   * 
   * @ param num1 primer numero introducido
   * @ param num2 segundo numero introducido
   * @ return resultado de la operacion
   */
  public static double multiplicacion(double num1, double num2) {
    double multi = num1 * num2;

    return multi;

  }

  /*
   * Te dice de dos numeros cual es el menor
   * 
   * @ param a primer numero introducido
   * @ param b segundo numero introducido
   * @ return a si primer numero es menor
   * @ return b si segundo numero es menor
   */
  public static int menor(int a, int b) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  }
  
  /*
   * Te dice si un numero es negativo, positivo o igual a 0
   * 
   * @ param a numero entero
   * @ return -1 si es negativo
   * @ return 0 si es igua a 0
   * @ return 1 si es positivo
   */
  public static int dimeSigno(int a){
    if (a < 0) {
      return -1;
    } else if (a == 0) {
      return 0;
    } else {
      return 1;
    }
  }

  public static int voltea(int num) {
    int numVolteado;
    numVolteado = 0;
    int resto;
    resto = 1;

    while (num > 0) {
      resto = num % 10;
      numVolteado = numVolteado * 10 + resto;
      num /= 10;
    }
    return numVolteado;
  }

  public static boolean esCapicua(int num) {
    int numVolteado;
    numVolteado = voltea(num);

    if (num == numVolteado){
      return true;
    }
    return false;
  }

  public static boolean esPrimo(int num){
    int n;

    for (n = 2; n < num; n++) {
      if ((num % n) == 0){
        return false;
      }
    }
    return true;

  }

  public static int sigPrimo(int num){
    num++;
    while (!esPrimo(num)) {
      num++;
    }
    return num;
  }

  public static int potencia (int b, int e) {
    int resul = 1;
    for(int i = 0; i < e; i++) {
      resul *= b;
    }
    return resul;
  }

  public static int digitos(int num) {
    int numDigi = 0;

    while (num > 0) {
      num /= 10;
      numDigi++;
    }
    return numDigi;
  }

  public static int suma1aN(int num) {
    int suma = 0;
    for (int i = 1; i <= num; i++){
      suma += i;
    }
    return suma;
  }

  public static int producto1aN(int num) {
    int producto = 1;
    for (int i = 1; i <= num; i++){
      producto *= i;
    }
    return producto;
  }

  public static double intermedio1aN(int num) {
    return (double)((1 + num) / 2);
  }

  public static int maxDoble(int a, int b) {
    if (a > b) {
      return a; 
    } else {
      return b;
    }
  }

  public static void tablaMulti (int x) {
    for (int i = 1; i < 11; i++) {
      System.out.println(x +" X " +i +" = " +x * i);
    }
  }

  public static void creaTriangulo( String a, int b) {
    int planta = 1;
    int blanco = b - 1;
    
    while (planta <= b) {
      for (int i = 1; i <= blanco; i++) {
        System.out.print(" ");
      }
      
      for (int j = 1; j <= (2*planta-1); j++) {
        System.out.print(a);
      }
      
      planta++;
      blanco--;
      System.out.println();

    }
  }


}