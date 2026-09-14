/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("========== PERSONAJE =========");
        Personaje p = new Personaje("Argorn",20);
        p.atacar();
        System.out.println("========== MAGO =============");
        Mago m = new Mago(40, "Gandalf", 20);
        m.atacar();
        
        System.out.println(" ============ MAGO OSCURO ============");
        MagoOscuro mo = new MagoOscuro("Sombra Eterna", 80, "Saruman", 20);
        mo.atacar();
    }
    
}
