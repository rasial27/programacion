package T9.Ejercicio9;
import java.text.DecimalFormat;

public class Movil extends Terminal {
  private String tarifa;
  private double costeLlamada;
  

  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
    this.costeLlamada = 0;
  }

  @Override
  public void llama(Terminal t, int segundosDeLlamada) {
    super.llama(t, segundosDeLlamada);
    double minutos = (double) segundosDeLlamada / 60;

    switch(this.tarifa) {
      case "rata":
        this.costeLlamada += minutos * 0.06;
        break;
      case "mono":
        this.costeLlamada += minutos * 0.12;
        break;
      case "bisonte":
        this.costeLlamada += minutos * 0.30;
        break;
      default:
    }
  }

  @Override
  public String toString() {
    DecimalFormat formato = new DecimalFormat("0.00");
    return "Nº " +this.getNumero() + " - " +this.getTiempoConversaciones() +"s de conversacion - tarificados " +formato.format(this.costeLlamada) + " euros";
  }

}
