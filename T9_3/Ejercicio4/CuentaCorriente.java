package T9_3.Ejercicio4;

class CuentaCorriente extends CuentaBancaria {
  public CuentaCorriente(String iban, double saldo) {
      super(iban, saldo);
  }

  @Override
  public double calcularIntereses() {
      double intereses = saldo * interesAnualBasico / 12;
      añadir(intereses);
      return intereses;
  }
}

class CuentaAhorro extends CuentaBancaria {
  protected static double saldoMinimo = 1000;

  public CuentaAhorro(String iban, double saldo) {
      super(iban, saldo);
  }

  @Override
  public double calcularIntereses() {
      double intereses;
      if (saldo < saldoMinimo) {
          intereses = saldo * interesAnualBasico / 24;
      } else {
          intereses = saldo * interesAnualBasico / 12;
      }
      añadir(intereses);
      return intereses;
  }
}
