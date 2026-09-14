/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitales_v1;

/**
 *
 * @author mario.sanper.2
 */
public class Capital {
    private String nombre;
    private String pais;
    private double numeroHabitantes;
    public Capital(String nombre, String pais, double numeroHabitantes) {
        this.nombre = nombre;
        this.pais = pais;
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public double getNumeroHabitantes() {
        return numeroHabitantes;
    }
    
}
