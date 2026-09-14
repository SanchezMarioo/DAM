/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author MARIO
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Videojuego videojuego1 = new Videojuego("Super Mario Bros", "Nintendo");
        Videojuego videojuego2 = new Videojuego("Mario Kart", "Nintendo", 69.99);
        Videojuego videojuego3 = new Videojuego("GTA V", "Playstation");
        Videojuego videojuego4 = new Videojuego("Clash Royale", "Movil",0);
        videojuego1.aplicarDescuento(20);
        videojuego1.setPrecio(-2);
        System.out.println(videojuego1.toString());
        System.out.println(videojuego2.toString());
        System.out.println(videojuego3.toString());
        System.out.println(videojuego4.toString());
        Videojuego.getContadorVidejuegos();
    }

}
