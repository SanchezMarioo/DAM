/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author mario.sanper.2
 */
public class Documentos {
    private String titulo; 
    private int numPaginas;

    public Documentos(String titulo, int numPaginas) {
        this.titulo = titulo;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Documentos{" + "titulo=" + titulo + ", numPaginas=" + numPaginas + '}';
    }
    
    
}
