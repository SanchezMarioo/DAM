package org.example;

public class Incidencia {
    private String id;
    private String descripcion;
    private String usuario;
    private int nivelPrioridad;
    private String validarID = "INC-[0-9]{4}";

    public Incidencia(String id, String descripcion, String usuario, int nivelPrioridad) {
        if(!id.matches(validarID)){
            throw new ExceptionFormatInvalid("El ID no es valido");
        }

        this.id = id;
        if(descripcion.length() < 10){
           throw new ExceptionFormatInvalid("La descripcion debe de ser mayor a 10 caracteres.");
        }
        this.descripcion = descripcion;
        this.usuario = usuario;
        if(nivelPrioridad < 1 || nivelPrioridad > 5){
            throw new ExceptionFormatInvalid("La descripcion debe de ser mayor a 10 caracteres.");
        }
        this.nivelPrioridad = nivelPrioridad;
    }
}
