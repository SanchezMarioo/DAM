/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulacroexamen;

/**
 *
 * @author mario.sanper.2
 */
public class Equipo {

    private int numeroEquipo;
    private String tipo;
    private String marca;
    private String aula;
    private double precio;

    public Equipo(int numeroEquipo, String tipo, String marca, String aula, double precio) {
        this.numeroEquipo = numeroEquipo;
        this.tipo = tipo;
        this.marca = marca;
        this.aula = aula;
        this.precio = precio;
    }

    public int getNumeroEquipo() {
        return numeroEquipo;
    }

    public void setNumeroEquipo(int numeroEquipo) {
        this.numeroEquipo = numeroEquipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Equipo{" + "numeroEquipo=" + numeroEquipo + ", tipo=" + tipo + ", marca=" + marca + ", aula=" + aula + ", precio=" + precio + '}';
    }
    
}
