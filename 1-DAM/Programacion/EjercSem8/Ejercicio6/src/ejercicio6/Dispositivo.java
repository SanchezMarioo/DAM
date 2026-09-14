/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author Mario
 */
public class Dispositivo {

    private int bateria;

    public Dispositivo(int bateriaInicial) {
        this.bateria = bateriaInicial;
    }

    // Método Getter para que las subclases y el exterior accedan al valor
    public int getBateria() {
        return bateria;
    }

    // Método Setter para modificar el estado de forma segura
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void mostrarBateria() {
        System.out.println("Batería del dispositivo: " + getBateria() + "%");
    }
}
