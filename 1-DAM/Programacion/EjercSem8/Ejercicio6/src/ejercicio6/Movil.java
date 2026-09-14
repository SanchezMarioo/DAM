/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author Mario
 */
public class Movil extends Dispositivo {

    // Eliminamos el atributo 'bateria' aquí para evitar la ocultación
    public Movil() {
        // Llamamos al constructor de la superclase
        super(80);
    }

    @Override
    public void mostrarBateria() {
        // Aplicamos el consumo adicional del 10% solicitado
        // Se reduce el valor actual en un 10%
        int nivelActual = getBateria();
        int consumo = (int) (nivelActual * 0.10);
        setBateria(nivelActual - consumo);

        System.out.println("Batería del móvil (tras consumo del 10%): " + getBateria() + "%");
    }
}
