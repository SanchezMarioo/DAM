/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author mario
 */
public class Escultura {

    private String titulo;
    private String autor;
    private int anio;
    private String material;

    public Escultura(String titulo, String autor, int anio, String material) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.material = material;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnio() {
        return anio;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return titulo + " - " + autor + " (" + anio + ") [" + material + "]";
    }

}
