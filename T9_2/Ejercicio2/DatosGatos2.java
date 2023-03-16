package T9_2.Ejercicio2;

public class DatosGatos2 {
  public static void main(String[] args) {
    Gato2[] gatos = new Gato2[4];

    gatos[0] = new Gato2("Lucas", 12, "Siames");
    gatos[1] = new Gato2("Zara", 10, "Persa");
    gatos[2] = new Gato2("Lucky", 6, "Bengali");
    gatos[3] = new Gato2("Lenin", 14, "Americano de pelo duro");

    for (int i = 0; i < 4; i++) {
      System.out.println("Gato " +(i + 1) + ": ");
      System.out.println("Nombre: " + gatos[i].getNombre());
      System.out.println("Edad: " + gatos[i].getEdad());
      System.out.println("Raza: " + gatos[i].getRaza());
      System.out.println();
    }
  }
}
