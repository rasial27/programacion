package T9.Ejercicio2;

public class Coche extends Vehiculo {

  private int cilindrada; 

  public Coche(int c) {
    super();
    this.cilindrada = c;
  }

  public void quemaRueda() {
    System.out.println("Fiaaauuuuuunnn");
  }

  public void encederLuces() {
    System.out.println("Se encienden las luces");
  }

  public void apagarLuces() {
    System.out.println("Se apagan las luces");
  }
}