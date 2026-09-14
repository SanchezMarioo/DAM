package org.example;

public abstract class Contenido {
    private final String id;
    private String titulo;
    private int duracionBase;
    private final String REGEXP_ID = "[A-Z]{2}-[0-9]{5}";
    private Estado estado;

    public Contenido(String id, String titulo, int duracionBase,Estado estado) {
        if (!id.matches(REGEXP_ID)) throw new ValidationError("El id no cumple el formato correcto");
        this.id = id;
        if(titulo.isBlank() || titulo == null) throw new ValidationError("El titulo no puede ser nulo o vacio");
        this.titulo = titulo;
        if (duracionBase <= 0) throw new ValidationError("La duracion no puede ser negativa");
        this.duracionBase = duracionBase;
        if(estado == null) throw new ValidationError("El estado no puede ser nulo");
        this.estado = estado;

    }
    public abstract void simularReproduccion();

}
