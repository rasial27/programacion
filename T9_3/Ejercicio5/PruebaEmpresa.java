package T9_3.Ejercicio5;

public class PruebaEmpresa {
    public static void main(String[] args) {
      // Creamos dos empleados
      Empleado emp1 = new Empleado("Juan Pérez", "12345678A", 2000.0);
      emp1.setEdad(35);
      emp1.setTelefono("123456789");
      emp1.setDireccion("Calle Falsa 123");
  
      Empleado emp2 = new Empleado("María Gómez", "87654321B", 2500.0);
      emp2.setEdad(28);
      emp2.setDireccion("Avenida Imaginaria 456");
  
      // Creamos una empresa
      Empresa empresa = new Empresa("Mi Empresa", "01234567X");
      empresa.setTelefono("987654321");
      empresa.setDireccion("Plaza Real 789");
  
      // Añadimos los empleados a la empresa
      empresa.anadirEmpleado(emp1);
      empresa.anadirEmpleado(emp2);
  
      // Imprimimos información de la empresa y sus empleados
      System.out.println("Información de la empresa:");
      System.out.println("  Nombre: " + empresa.getNombre());
      System.out.println("  CIF: " + empresa.getCif());
      System.out.println("  Teléfono: " + empresa.getTelefono());
      System.out.println("  Dirección: " + empresa.getDireccion());
  
      System.out.println("\nInformación de los empleados:");
      for (Empleado empleado : empresa.obtenerEmpleados()) {
        empleado.imprimirInformacion();
        System.out.println("  Sueldo neto mensual: " + empleado.calcularSueldoNeto() + "\n");
      }
    }
  }
  


