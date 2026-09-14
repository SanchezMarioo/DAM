/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author mario.sanper.2
 */
public class Mago extends Personaje{
    private int mana;

    public Mago(int mana, String nombre, int nivel) {
        super(nombre, nivel);
        this.mana = mana;
    }
    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre()  + " lanza un hechizo usando " + mana + " puntos de mana.");
        
    }
    
}
