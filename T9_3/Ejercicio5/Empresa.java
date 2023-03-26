package T9_3.Ejercicio5;

class Empresa {
    private final String nombre;
    private final String cif;
    private String telefono;
    private String direccion;
    private Empleado[] empleados;
    private int cantidadEmpleados;
  
    public Empresa(String nombre, String cif) {
      this.nombre = nombre;
      this.cif = cif;
      this.empleados = new Empleado[100];
    }
  
    public String getNombre() {
      return nombre;
    }
  
    public String getCif() {
      return cif;
    }
  
    public String getTelefono() {
      return telefono;
    }
  
    public void setTelefono(String telefono) {
      this.telefono = telefono;
    }
  
    public String getDireccion() {
      return direccion;
    }
  
    public void setDireccion(String direccion) {
      this.direccion = direccion;
    }
  
    public void anadirEmpleado(Empleado empleado) {
      empleados[cantidadEmpleados] = empleado;
      cantidadEmpleados++;
    }
  
    public void eliminarEmpleado(String dni) {
      for (int i = 0; i < cantidadEmpleados; i++) {
        if (empleados[i].getDni().equals(dni)) {
          for (int j = i; j < cantidadEmpleados - 1; j++) {
            empleados[j] = empleados[j + 1];
          }
          cantidadEmpleados--;
          return;
        }
      }
    }
  
    public void imprimirEmpleados() {
      for (int i = 0; i < cantidadEmpleados; i++) {
        empleados[i].imprimirInformacion();
        System.out.println("----------------------");
      }
    }
  
    public double calcularSueldos() {
      double sueldos = 0;
      for (int i = 0; i < cantidadEmpleados; i++) {
        sueldos += empleados[i].calcularSueldoNeto();
      }
      return sueldos;
    }
  
    public int getCantidadEmpleados() {
      return cantidadEmpleados;
    }
    
    public Empleado[] obtenerEmpleados() {
      Empleado[] listaEmpleados = new Empleado[cantidadEmpleados];
      for (int i = 0; i < cantidadEmpleados; i++) {
        listaEmpleados[i] = empleados[i];
      }
      return listaEmpleados;
    }
  }

