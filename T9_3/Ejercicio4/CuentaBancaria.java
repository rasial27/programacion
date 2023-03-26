package T9_3.Ejercicio4;

abstract class CuentaBancaria {
  protected String iban;
  protected double saldo;
  protected static double interesAnualBasico = 0.05;

  public CuentaBancaria(String iban, double saldo) {
      this.iban = iban;
      this.saldo = saldo;
  }

  public String getIban() {
      return iban;
  }

  public double getSaldo() {
      return saldo;
  }

  public void ingresar(double cantidad) {
      añadir(cantidad);
  }

  public void retirar(double cantidad) {
      añadir(-cantidad);
  }

  public void transferir(CuentaBancaria destino, double cantidad) {
      if (cantidad > saldo) {
          System.out.println("No hay suficiente saldo para realizar la transferencia.");
      } else {
          retirar(cantidad);
          destino.ingresar(cantidad);
          System.out.println("Transferencia realizada con éxito.");
      }
  }

  protected void añadir(double cantidad) {
      saldo += cantidad;
  }

  public abstract double calcularIntereses();

  public void mostrarDatos() {
      System.out.println("Cuenta bancaria con IBAN " + iban);
      System.out.println("Saldo: " + saldo + " euros");
  }
}