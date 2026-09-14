/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_abstracto_ejemplo;

/**
 *
 * @author mario.sanper.2
 */
public class Avion extends Vehiculo {

    private int altura;

    public Avion(String marca) {
        super(marca);
    }

    public void volar(int altitud) {
        this.altura = altitud;
        System.out.println("El avion alcanza la altitud de " + altura + " metros ");
    }

    @Override
    public void moverse() {
        System.out.println("El avion esta despegando");
    }

}
