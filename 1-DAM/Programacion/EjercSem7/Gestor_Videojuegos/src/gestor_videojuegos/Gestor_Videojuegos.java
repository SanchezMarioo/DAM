/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestor_videojuegos;

/**
 *
 * @author Mario
 */
public class Gestor_Videojuegos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Catalogo catalogo = new Catalogo();
        catalogo.crearCatalogoDefecto();
        catalogo.init();
    }
    
}
