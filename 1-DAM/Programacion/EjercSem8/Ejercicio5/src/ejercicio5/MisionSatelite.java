/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author mario.sanper.2
 */
public class MisionSatelite extends Mision {

    private String tipoOrbita;

    public MisionSatelite(String tipoOrbita, String nombre, int duracionEstimada, int presupuestoAsignado) {
        super(nombre, duracionEstimada, presupuestoAsignado);
        this.tipoOrbita = tipoOrbita;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Tipo de orbita " + tipoOrbita);
    }

    @Override
    public String toString() {
        return "MisionSatelite{" + "tipoOrbita=" + tipoOrbita + '}';
    }

    
    
    

}
