package T8.misFunciones;

public class Geometria {
  
  public static double areaRectangulo(double b, double h) {
    double area = b * h;

    return area;

  }

  public static double perimetroRectangulo(double b, double h) {
    double peri = 2*b + 2*h;

    return peri;
  }

  public static double circunferencia(double r) {
    return (2 * Math.PI * r);

  }

  public static double area(double r) {
    return (Math.PI * r * r);

  }

  public static double volumen(double r){
    return ((4/3) * Math.PI * r * r * r);
  }
    
}
