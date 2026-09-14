/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import transporte.Vehiculo;

/**
 *
 * @author mario.sanper.2
 */
public class Coche extends Vehiculo{

    public Coche(int velocidad,String marca) {
        this.marca = marca;
        this.velocidad = velocidad;
    }
    public void mostrarInformacion(){
        System.out.println(marca);
        System.out.println(velocidad);
    }
    
}
