package com.biblioteca.gestion.app;
import java.util.InputMismatchException; //para manejar excepciones
import java.util.Scanner;
import com.biblioteca.gestion.model.Libro;
import com.biblioteca.gestion.service.LibroService;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        LibroService service = new LibroService();
        int opcion = -1;
        System.out.println("=== SISTEMA DE GESTION DE LIBROS ===");
        do{
            try {

                mostrarMenu();
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        agregarLibro(sc, service);
                        break;
                    case 2:
                        service.listarLibros();
                        break;
                    case 3:
                        System.out.println("ingrese titulo o autor o isbn a consultar");
                        sc.nextLine();
                        service.consultarLibro(sc.nextLine());
                        break;
                    case 4:
                        System.out.println("ingrese el ISBN  a eliminar");
                        sc.nextLine();
                        service.eliminarLibro(sc.nextLine());
                        break;
                    case 0:
                        System.out.println("saliendo del sistema...");
                        break;
                    
                
                    default:
                        System.out.println("opcion invalida");
                        
                }


                
            } catch (InputMismatchException e) {
                System.out.println("Error debe ingresar un numero");
                sc.nextLine();
            } catch(Exception e){
                System.out.println("Error inesperado"+ e.getMessage());
                sc.nextLine();
            }

        } while (opcion != 0);
        sc.close();
        System.out.println("=== PROGRAMA FINALIZADO ===");
    }

    //FUNCIONES ESTATICAS SOLO SE IMPLEMENTAN EN LA CLASE DONDE ESTE EL STATICA MAIN
    //esta funciono tiene la responsabilidad de mostrarnos el menu solamente
    private static void mostrarMenu(){

        System.out.println("\n=== MENU DE LIBROS ===");
        System.out.println("1. Agregar Libro");
        System.out.println("2. Listar Libro");
        System.out.println("3. Consultar Libro");
        System.out.println("4. Eliminar Libro");
        System.out.println("0. Salir");
        System.out.println("Seleccione una opción");

    }
    private static void agregarLibro(Scanner sc, LibroService service){
        try {
            sc.nextLine();
            System.out.println("ISBN");
            String isbn = sc.nextLine();
            System.out.println("TITULO");
            String titulo = sc.nextLine();
            System.out.println("AUTOR");
            String autor = sc.nextLine();

            Libro libro = new Libro(isbn,titulo,autor);
            service.agregarLibro(libro);
            System.out.println("Libro agregado correctamente");

        } catch (InputMismatchException e) {
            System.out.println("Datos invalidos");
            sc.nextLine();
        }
    }
}
