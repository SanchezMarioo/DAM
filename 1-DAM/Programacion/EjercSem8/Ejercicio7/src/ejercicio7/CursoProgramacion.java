/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author mario.sanper.2
 */
public class CursoProgramacion extends Curso {

    private String lenguaje;
    private final int LIMITE = 30;

    public CursoProgramacion(String titulo, int duracionHoras, String lenguaje) {
        super(titulo, duracionHoras);
        this.lenguaje = lenguaje;
    }

    @Override
    public void mostrarCurso() {
        super.mostrarCurso();
        System.out.println("Lenguaje: " + lenguaje);
    }

    public boolean esAvanzado() {
        return getDuracionHoras() > LIMITE;
    }

}
