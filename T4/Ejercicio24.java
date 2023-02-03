import java.util.Scanner;
/*
 *Ejercicio24.java
 *Genera la nomina de un trabajador
 
 *@ autoria RSA
 
*/

public class Ejercicio24 {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);
    
    System.out.println("1. Programador junior");
    System.out.println("2. Programador senior");
    System.out.println("3. Jefe de proyecto");
    System.out.print("Introduce cargo (1-3): ");
    int cargo = s.nextInt();
    
    System.out.print("Dias que estuvo visitando clientes: ");
    int dias = s.nextInt();
    
    System.out.print("Introduce si es soltero o casado (1.soltero / 2.casado): ");
    int estado = s.nextInt();
    
    double sueldoBase = 0;
    
    switch (cargo) {
      case 1:
        sueldoBase = 950;
        break;
      
      case 2:
        sueldoBase = 1200;
        break;
      
      case 3:
        sueldoBase = 1600;
        break;
        
    }
    
    double sueldoDietas = (dias * 30);
    
    double sueldoBruto = (sueldoBase + sueldoDietas);
    
    double irpf = 0;
    
    if (estado == 1) {
      irpf = 25;
    } else if (estado == 2) {
      irpf = 20;
    }
    
    double irpfTotal = (sueldoBruto * irpf) / 100;
    
    double sueldoNeto = (sueldoBruto - irpfTotal);
    
    System.out.println("Sueldo base:                " +sueldoBase);
    System.out.println("Dietas: (" +dias +" viajes)           " +sueldoDietas);
    System.out.println("Sueldo Bruto:               " +sueldoBruto);
    System.out.println("Retencion irpf: (" +irpf +" %)     " +irpfTotal);
    System.out.println("Sueldo neto:                " +sueldoNeto);
    
    }
   }     
    
             
