package T9_3.Ejercicio4;

public class Banco {
  public static void main(String[] args) {
      CuentaCorriente cc1 = new CuentaCorriente("ES12345678901234567890", 1000);
      CuentaAhorro ca1 = new CuentaAhorro("ES09876543210987654321", 2000);

      cc1.mostrarDatos();
      System.out.println("Intereses de la cuenta corriente: " + cc1.calcularIntereses() + " euros");
      ca1.mostrarDatos();
      System.out.println("Intereses de la cuenta de ahorro: " + ca1.calcularIntereses() + " euros");

      cc1.ingresar(500);
      ca1.retirar(1000);
      cc1.transferir(ca1, 300);

      cc1.mostrarDatos();
      ca1.mostrarDatos();
  }
}