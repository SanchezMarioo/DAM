/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author Mario
 */
public class Satelite {

    private String id;
    private int altura;
    private double velocidadOrbital;
    private boolean estaActivo;
    private int porcentajeEnergia;

    public Satelite(String id, int altura, double velocidadOrbital, boolean estaActivo, int porcentajeEnergia) {
        this.id = id;
        this.altura = altura;
        this.velocidadOrbital = velocidadOrbital;
        this.estaActivo = estaActivo;
        this.porcentajeEnergia = porcentajeEnergia;
    }

    public String getId() {
        return id;
    }

    public int getAltura() {
        return altura;
    }

    public double getVelocidadOrbital() {
        return velocidadOrbital;
    }

    public boolean isEstaActivo() {
        return estaActivo;
    }

    public int getPorcentajeEnergia() {
        return porcentajeEnergia;
    }
    

    @Override
    public String toString() {
        String estado;
        if(estaActivo){
            estado = "ACTIVO";
        } else{
            estado = "INACTIVO";
        }
        return String.format("Satelite [%s] | Altura [%,d] | Velocidad Orbital [%.2f] | Esta activo [%s] | Porcentaje de la bateria [%,d] ", 
               id, altura, velocidadOrbital, estado, porcentajeEnergia);
    }
    

}
