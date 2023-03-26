package T9_3.Ejercicio2;

class CuerpoCeleste {
  private double masa;
  private double diametroMedio;
  private double periodoRotacion;
  private double periodoTranslacion;
  private double distanciaMedia;

  public CuerpoCeleste(double masa, double diametroMedio, double periodoRotacion, double periodoTranslacion, double distanciaMedia) {
      this.masa = masa;
      this.diametroMedio = diametroMedio;
      this.periodoRotacion = periodoRotacion;
      this.periodoTranslacion = periodoTranslacion;
      this.distanciaMedia = distanciaMedia;
  }

  public double getMasa() {
      return masa;
  }

  public double getDiametroMedio() {
      return diametroMedio;
  }

  public double getPeriodoRotacion() {
      return periodoRotacion;
  }

  public double getPeriodoTranslacion() {
      return periodoTranslacion;
  }

  public double getDistanciaMedia() {
      return distanciaMedia;
  }

  public void setMasa(double masa) {
      this.masa = masa;
  }

  public void setDiametroMedio(double diametroMedio) {
      this.diametroMedio = diametroMedio;
  }

  public void setPeriodoRotacion(double periodoRotacion) {
      this.periodoRotacion = periodoRotacion;
  }

  public void setPeriodoTranslacion(double periodoTranslacion) {
      this.periodoTranslacion = periodoTranslacion;
  }

  public void setDistanciaMedia(double distanciaMedia) {
      this.distanciaMedia = distanciaMedia;
  }

  public void mostrarInformacion() {
      System.out.println("Masa: " + masa);
      System.out.println("Diámetro medio: " + diametroMedio);
      System.out.println("Periodo de rotación: " + periodoRotacion);
      System.out.println("Periodo de traslación: " + periodoTranslacion);
      System.out.println("Distancia media: " + distanciaMedia);
  }
}