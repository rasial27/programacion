package T9_3.Ejercicio5;

class Empleado {
    private final String nombre;
    private final String dni;
    private double sueldoBruto;
    private int edad;
    private String telefono;
    private String direccion;

    public Empleado(String nombre, String dni, double sueldoBruto) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBruto = sueldoBruto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Sueldo bruto mensual: " + sueldoBruto);
        if (edad != 0) {
            System.out.println("Edad: " + edad);
        }
        if (telefono != null) {
            System.out.println("Teléfono: " + telefono);
        }
        if (direccion != null) {
            System.out.println("Dirección: " + direccion);
        }
    }

    public double calcularSueldoNeto() {
        double sueldoBrutoAnual = sueldoBruto * 12;
        double irpf;
        if (sueldoBrutoAnual < 12000) {
            irpf = 0.2;
        } else if (sueldoBrutoAnual < 25000) {
            irpf = 0.3;
        } else {
            irpf = 0.4;
        }
        double sueldoNetoAnual = sueldoBrutoAnual * (1 - irpf);
        return sueldoNetoAnual / 12;
    }
}
