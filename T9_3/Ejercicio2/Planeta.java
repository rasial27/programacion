package T9_3.Ejercicio2;

class Planeta extends CuerpoCeleste {
  private Satelite[] satelites;
  private int numSatelites;

  public Planeta(double masa, double diametroMedio, double periodoRotacion, double periodoTranslacion, double distanciaMedia) {
      super(masa, diametroMedio, periodoRotacion, periodoTranslacion, distanciaMedia);
      satelites = new Satelite[10]; // Inicialmente se asigna espacio para 10 satélites
      numSatelites = 0;
  }

  public void agregarSatelite(Satelite satelite) {
      if (numSatelites < 10) {
          satelites[numSatelites] = satelite;
          numSatelites++;
      }
  }

  public void mostrarInformacion() {
      super.mostrarInformacion();
      System.out.println("Número de satélites: " + numSatelites);
      for (int i = 0; i < numSatelites; i++) {
          System.out.println("Satélite " + (i + 1) + ":");
          satelites[i].mostrarInformacion();
      }
  }
}