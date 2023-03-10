package T9.Ejercicio11;

public class TarjetaRegalo {
  String numero;
  double saldo;

  public TarjetaRegalo(double saldo) {
    this.saldo = saldo;

    this.numero = "";
    for (int i = 0; i < 5; i++) {
      this.numero += (int)(Math.random() * 10);
    }
  }

  @Override
  public String toString() {
    return "Tarjeta nº " + numero + " - Saldo " + String.format("%.2f", saldo) + " euros";
  }

  public void gasta(double gasto) { 
    if (gasto > saldo) {
        System.out.printf("No tiene suficiente saldo para gastar %.2f euros\n", gasto);
    } else {
      saldo -= gasto;
    }
  }

  public TarjetaRegalo fusionaCon(TarjetaRegalo otraTarjeta) {
    TarjetaRegalo nuevaTarjeta = new TarjetaRegalo(saldo + otraTarjeta.saldo);
    saldo = 0;
    otraTarjeta.saldo = 0;
    return nuevaTarjeta;
  }
}

        
      
  



