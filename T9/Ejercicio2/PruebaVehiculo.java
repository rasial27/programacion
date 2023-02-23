package T9.Ejercicio2;

public class PruebaVehiculo {

  public static void main(String[] args) {

    int opcion = 0;
    int km;
    
    Bicicleta bhSpeedrom = new Bicicleta(9);
    Coche saab93 = new Coche(1900);

    while (opcion != 10) {
      System.out.println("\n1. Anda con la bicicleta");
      System.out.println("2. Frena la bicicleta en seco");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Enciende las luces del coche");
      System.out.println("6. Apaga las luces del coche");
      System.out.println("7. Ver kilometraje de la bicicleta");
      System.out.println("8. Ver kilometraje del coche");
      System.out.println("9. Ver kilometraje total");
      System.out.println("10. Salir");
      System.out.println("Elige una opción (1-10): ");
      
      opcion = Integer.parseInt(System.console().readLine());
      
      switch (opcion) {
        case 1:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(System.console().readLine());
          bhSpeedrom.recorre(km);
          break;
        case 2:
          bhSpeedrom.frenaBicicleta();
          break;
        case 3:
          System.out.print("¿Cuántos kilómetros quiere recorrer? ");
          km = Integer.parseInt(System.console().readLine());
          saab93.recorre(km);
          break;
        case 4:
          saab93.quemaRueda();
          break;
        case 5:
          System.out.print("La bicicleta lleva recorridos ");
          System.out.println(bhSpeedrom.getKilometrosRecorridos() + " Km");
          break;
        case 6:
          System.out.print("El coche lleva recorridos ");
          System.out.println(saab93.getKilometrosRecorridos() + " Km");
          break;
        case 7:
          System.out.print("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
        default:
      } 
    } 
  }
}
