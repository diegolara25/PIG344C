package com.biblioteca.gestion.model;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;

    public Libro(String isbn, String titulo, String autor){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
    }

    
// get para mostrar y set para modificar
    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getIsbn() {
        return isbn;
    }

    public String resumen(){
        return "ISBN: "+ isbn +
                "| Titulo: "+ titulo +
                "| Autor: "+ autor;
    }
}
