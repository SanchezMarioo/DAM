/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_abstracto_ejemplo;

/**
 *
 * @author mario.sanper.2
 */
public class Coche extends Vehiculo{

    public Coche(String marca) {
        super(marca);
    }
    
    @Override
    public void moverse() {
        System.out.println("El coche ya se mueve");
    }
    
}
