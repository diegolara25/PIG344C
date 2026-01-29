package com.empresa.gestion.app;
import com.empresa.gestion.model.Empleado;
import com.empresa.gestion.service.EmpleadoService;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        EmpleadoService service = new EmpleadoService();
        int opcion;
        do{
            System.out.println("\n === MENÚ DE EMPLEADOS ===");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Listar Empleado");
            System.out.println("3. Consultar Empleado");
            System.out.println("4. Eliminar Empleado");
            System.out.println("0: salir");
            System.out.println("seleccione una opcion");
            opcion = sc.nextInt();

            // leer todo siempre con sc.nextLine() y luego convertirlo a número usando Integer.parseInt(sc.nextLine())
            // Así te olvidas para siempre del problema del buffer.
            //sc.nextLine() siempre consume el carácter de nueva línea (\n), dejando el buffer vacío para la siguiente pregunta.
            switch (opcion) {
                case 1: 
                    System.out.println("Id: ");
                    int id = sc.nextInt();
                    //int id = Integer.parseInt(sc.nextLine());

                    System.out.println("Nombre: ");
                    sc.nextLine(); //limpiar antes dew volver a cargar es opcional
                    String nombre = sc.nextLine();

                    System.out.println("Edad: ");
                    int edad = sc.nextInt();

                    System.out.println("Activo: ");
                    boolean activo = sc.nextBoolean();
                    //boolean activo = Boolean.parseBoolean(sc.nextLine());

                    System.out.println("genero: ");
                    char genero = sc.next().charAt(0);
                    //char genero = sc.nextLine().charAt(0);

                    System.out.println("salario: ");
                    double salario = sc.nextDouble();

                    System.out.println("Horas Trabajadas: ");
                    int horasTrabajadas = sc.nextInt();

                    Empleado emp = new Empleado(id, nombre, edad, activo, genero, salario, horasTrabajadas);
                    service.agregarEmpleado(emp);
                    break;

                case 2:
                    service.listarEmpleados();
                    break;
                
                case 3:
                    System.out.println("ID del empleado a consultar: ");
                    service.consultarEmpleado(sc.nextInt());
                    break;

                case 4:
                    System.out.println("ID del empleado a eliminar: ");
                    service.eliminarEmpleado(sc.nextInt());
                    break;

                case 0:
                    System.out.println("saliendo del sistema...");
                    break;
            
                default:
                    System.out.println("opción invalida");
                    
            }

        } while(opcion!=0);
        sc.close();
    }
}
