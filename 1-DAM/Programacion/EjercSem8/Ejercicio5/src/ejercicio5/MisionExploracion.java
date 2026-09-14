/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author mario.sanper.2
 */
public class MisionExploracion extends Mision{
    private String destino;

    public MisionExploracion(String destino, String nombre, int duracionEstimada, double par1) {
        super(nombre, duracionEstimada, duracionEstimada);
        this.destino = destino;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Destino: " + destino);
    }

    @Override
    public String toString() {
        return "MisionExploracion{" + "destino=" + destino + '}';
    }
    
}
