/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author mario.sanper.2
 */
public class LibroEscolar extends Tienda {

    private String curso;
    private String asignatura;

    public LibroEscolar(String nombre, double precioBase, String curso, String asignatura) {
        super(nombre, precioBase);
        this.curso = curso;
        this.asignatura = asignatura;
    }

    public LibroEscolar(String nombre, double precioBase, String asignatura) {
        super(nombre, precioBase);
        this.asignatura = asignatura;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Precio base: " + getPrecioBase() + " ?");
        System.out.println("Curso: " + curso);
        System.out.println("Asignatura: " + asignatura);
    }

}
