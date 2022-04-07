package com.example.proyectoasosiacion.Datos;

public class Listas
{
    private String titulo;
    private int imagen;

    public int posicion = 0;

    public Listas(String titulo)
    {
        this.titulo = titulo;
    }

    public Listas(String titulo, int img)
    {
        this.titulo = titulo;
        imagen = img;
    }

    public Listas(String titulo, int img, int pos)
    {
        this.titulo = titulo;
        imagen = img;
        posicion = pos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
