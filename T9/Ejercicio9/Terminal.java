package T9.Ejercicio9;

public class Terminal {
  
  private final String numero;
  private int tiempoConversaciones;

  public Terminal(String numero) {
    this.numero = numero;
    this.tiempoConversaciones = 0;
  }

  public String getNumero() {
    return numero;
  }

  public int getTiempoConversaciones() {
    return tiempoConversaciones;
  }

  public void llama(Terminal terminal, int tiempo) {
    this.tiempoConversaciones += tiempo;
    terminal.tiempoConversaciones += tiempo;
  }

  @Override
  public String toString() {
    return "Nº " + numero + " - " + tiempoConversaciones + " s de conversacion";
  }
}
