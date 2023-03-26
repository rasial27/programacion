package T9_3.Ejercicio2;

public class SistemaSolar {
  public static void main(String[] args) {
  // Crear un planeta y algunos satélites
  Planeta tierra = new Planeta(5.97E24, 12756, 24, 365, 149.6E6);
  Satelite luna = new Satelite(7.34E22, 3475, 27.3, 27.3, 384400, tierra);
  Satelite fobos = new Satelite(1.07E16, 22, 0.32, 0.32, 9377, new Planeta(1.06E16, 23, 0.32, 1.26, 9377));
  Satelite deimos = new Satelite(2.4E15, 13, 1.26, 1.26, 23460, new Planeta(1.06E16, 23, 0.32, 1.26, 9377));
  // Agregar los satélites a la lista de satélites de la Tierra
  tierra.agregarSatelite(luna);
  tierra.agregarSatelite(fobos);
  tierra.agregarSatelite(deimos);
  
  // Mostrar información del planeta Tierra y sus satélites
  tierra.mostrarInformacion();
  }
}  
