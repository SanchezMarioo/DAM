package org.example;

public class Pelicula extends Contenido {
    private String genero;

    public Pelicula(String id, String titulo, int duracionBase, Estado estado, String genero) {
        super(id, titulo, duracionBase, estado);
        if (genero.isBlank() || genero == null) throw new ValidationError("Debes de introducir un genero");
        this.genero = genero;
    }

    @Override
    public void simularReproduccion() {

    }
}
