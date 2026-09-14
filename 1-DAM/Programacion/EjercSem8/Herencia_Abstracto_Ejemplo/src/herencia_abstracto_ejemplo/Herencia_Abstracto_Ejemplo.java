/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia_abstracto_ejemplo;

/**
 *
 * @author mario.sanper.2
 */
public class Herencia_Abstracto_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo v1 = new Coche("Toyota");
        Vehiculo v2 = new Bici("Orbea");
        
        
        v1.acelarar(30);
        v1.moverse();
        
        v2.acelarar(30);
        v2.moverse();
        
        Avion v3 = new Avion("Airbus");
        v3.moverse();
        v3.volar(1000);
    }
    
}
