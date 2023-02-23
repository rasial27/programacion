package T9.Ejercicio2;

public class Bicicleta extends Vehiculo {

  private int pinones; 
  
  public Bicicleta(int p) {
    super();
    this.pinones = p;
  }

  public void frenaBicicleta() {
    System.out.println("Screeeech");
  }
}