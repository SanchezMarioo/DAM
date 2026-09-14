/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author MARIO
 */
public class Alumno {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota) throws NotaNoValidaException {
        this.nombre = nombre;
        setNota(nota);
    }

    public void setNota(double nota) throws NotaNoValidaException {
        if(nota < 0 || nota > 10){
            throw new NotaNoValidaException("La nota valida tiene que estar entre 0 y 10");
        }
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public String toFile(){
        return nombre + ";" + nota + "\n";
    }
}
