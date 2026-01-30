package com.biblioteca.gestion.service;
import java.util.ArrayList;
import com.biblioteca.gestion.model.Libro;

public class LibroService {
    private ArrayList<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("libro agregado correctamente");
    }

    public void listarLibros(){
        if (libros.isEmpty()) {
            System.out.println("no hay libros registrados");
            return;
        }
        for(Libro l : libros){
            System.out.println(l.resumen());
        }
    }

    public void eliminarLibro(String isbn){
        for(int i=0;i<libros.size();i++){
            if(libros.get(i).getIsbn().equals(isbn)){
                libros.remove(i);
                System.out.println("libro eliminado");
                return;
            }
        }
        System.out.println("libro no encontrado");
    }

    public void consultarLibro(String valor){
        for (Libro l : libros) {
            if(l.getIsbn().equals(valor)){
                System.out.println(l.resumen());
                return;
            }
            //equalsIgnoreCase: distingue entre mayusculas y minusculas
            if(l.getTitulo().equalsIgnoreCase(valor)){
                System.out.println(l.resumen());
                return;
            }
            if(l.getAutor().equals(valor)){
                System.out.println(l.resumen());
                return;
            }
        }
        System.out.println("libro no encontrado");
    }
}
