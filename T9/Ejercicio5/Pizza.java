package T9.Ejercicio5;

public class Pizza {
  
  private static int totalPed = 0;
  private static int totalServ = 0;

  private String tam;
  private String sabor;
  private String estado;

  public Pizza(String sabor, String tam) {
    this.sabor = sabor;
    this.tam = tam;
    this.estado = "pedida";
    Pizza.totalPed++;
  }

  public String toString() {
    return "pizza " + this.sabor+ " " + this.tam + " , " + this.estado;
  }

  public static int getTotalPedidas() {
    return Pizza.totalPed;
  }

  public static int getTotalServidas() {
    return Pizza.totalServ;
  }

  public void sirve() {
    if (this.estado.equals("pedida")) {
      this.estado = "servida";
      Pizza.totalServ++;
    } else {
      System.out.println("esa pizza ya se ha servido");
    }
  }

}
