package com.empresa.gestion.app;
import com.empresa.gestion.model.*;
import com.empresa.gestion.service.NominaService;
public class Main {
    public static void main(String[] args){
        Empleado empleado1 = new Empleado("Juan", 30, true, 'M', 5000.00, 160);
        Gerente gerente1 = new Gerente("Ana", 61, true, 'F', 10000.00, 160, 2000.00, "Ventas");
        empleado1.presentarse();
        gerente1.presentarse();
        NominaService nomina = new NominaService();

        System.out.println("=== EMPLEADO ===");
        empleado1.mostrarInfoBasica();
        System.out.println("SALARIO: "+empleado1.calcularSalarioMensual());
        System.out.println("Salario anual Empleados: $" + nomina.calcularSalarioAnual(empleado1));
        System.out.println("¿Puede Trabajar "+empleado1.puedeTrabajar());
        System.out.println("¿Puede Trabajar "+empleado1.clasificarEmpleado());
        System.out.println("Genero "+empleado1.obtenerTipoEmpleado());

        System.out.println("=== GERENTE ===");
        gerente1.mostrarInfoBasica();
        System.out.println("SALARIO: "+gerente1.calcularSalarioMensual());
        System.out.println("Salario anual Gerentes: $" + nomina.calcularSalarioAnual(gerente1));
        System.out.println("¿Puede Trabajar "+gerente1.puedeTrabajar());
        System.out.println("¿Puede Trabajar "+gerente1.clasificarEmpleado());
        System.out.println("Genero "+gerente1.obtenerTipoEmpleado());

        
        double[] salarios = {2000.00, 1000.00, 5000.00};
        System.out.println("Calcular Total Nomina: "+nomina.calcularTotalNomina(salarios));

        int meses = 3;
        nomina.simularPagos(meses);

    }
    
}
