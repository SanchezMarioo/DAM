/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author mario.sanper.2
 */
public class MagoOscuro extends Mago{
    private String tipoMaldicion;

    public MagoOscuro(String tipoMaldicion, int mana, String nombre, int nivel) {
        super(mana, nombre, nivel);
        this.tipoMaldicion = tipoMaldicion;
    }
    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre() + " desata la maldicion: "+ tipoMaldicion);
    }
}
