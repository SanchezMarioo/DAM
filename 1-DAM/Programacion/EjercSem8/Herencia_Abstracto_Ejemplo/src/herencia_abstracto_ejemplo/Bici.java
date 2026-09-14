/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_abstracto_ejemplo;

/**
 *
 * @author mario.sanper.2
 */
public class Bici extends Vehiculo{

    public Bici(String marca) {
        super(marca);
    }
    
    

    @Override
    public void moverse() {
        System.out.println("Moviendose");
    }
    
}
