package org.example;

public class LibroEscolar extends Producto {
    private String curso;
    private String asignatura;

    public LibroEscolar(String nombre, double precioBase, String curso, String asignatura) {
        super(nombre, precioBase);
        this.curso = curso;
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return curso + " | " +
                asignatura + " | " +
                super.toString();
    }
}
