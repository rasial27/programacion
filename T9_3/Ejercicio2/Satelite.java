package T9_3.Ejercicio2;

class Satelite extends CuerpoCeleste {
  private Planeta planeta;

  public Satelite(double masa, double diametroMedio, double periodoRotacion, double periodoTranslacion, double distanciaMedia, Planeta planeta) {
      super(masa, diametroMedio, periodoRotacion, periodoTranslacion, distanciaMedia);
      this.planeta = planeta;
  }

  public Planeta getPlaneta() {
      return planeta;
  }

  public void setPlaneta(Planeta planeta) {
      this.planeta = planeta;
  }

  public void mostrarInformacion() {
      super.mostrarInformacion();
      System.out.println("Planeta que orbita: " + planeta);
  }
}

