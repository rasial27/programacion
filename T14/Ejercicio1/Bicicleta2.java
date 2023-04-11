package T14.Ejercicio1;

public class Bicicleta2 extends Vehiculo2 {

  private int pinones; // número de piñones
  
  public Bicicleta2(int p) {
    super();
    this.pinones = p;
  }

  public void hazCaballito() {
    System.out.println("Estoy haciendo el caballito");
  }
}