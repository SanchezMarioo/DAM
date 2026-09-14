/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author mario.sanper.2
 */
public class MisionTripulada extends Mision {

    private int numeroAstronautas;

    public MisionTripulada(int numeroAstronautas, String nombre, int duracionEstimada, int presupuestoAsignado) {
        super(nombre, duracionEstimada, presupuestoAsignado);
        this.numeroAstronautas = numeroAstronautas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de astronautas: " + numeroAstronautas);
    }

    @Override
    public String toString() {
        return "MisionTripulada{" + "numeroAstronautas=" + numeroAstronautas + '}';
    }
    

}
