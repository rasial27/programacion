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


}