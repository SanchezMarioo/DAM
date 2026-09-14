/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author mario.sanper.2
 */
public class Curso {
    private String titulo;
    private int duracionHoras;

    public Curso(String titulo, int duracionHoras) {
        this.titulo = titulo;
        this.duracionHoras = duracionHoras;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }
    
    public void mostrarCurso(){
        System.out.println("Curso: " + titulo);
        System.out.println("Duracion: " + duracionHoras + " horas");
    }
}
