/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author Mario
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion cancion1 = new Cancion();
        cancion1.mostrarInformacion();
        cancion1.setArtista("Loreen");
        cancion1.setTitulo("Tattoo");
        // cancion1.duracion = 183;
        cancion1.setDuracion(-3);
        cancion1.mostrarInformacion();
        cancion1.setDuracion(183);
        cancion1.mostrarInformacion();
        
    }
    
}
