package T9.Ejercicio3;

public class Animal {

  private static int animalesCreados = 0;
  private static int comidasTotales = 0;

  private int comidasRealizadas;

  public Animal() {
    this.comidasRealizadas = 0;

  }

  public int getComidasRealizadas() {
    return this.comidasRealizadas;
  }

  public static int getComidasTotales() {
    return Animal.comidasTotales;
  }

  public void come(int c) {
    this.comidasRealizadas += c;
    Animal.comidasTotales += c;
  }
  
  
}
