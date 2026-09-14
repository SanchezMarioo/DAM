/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here+
        Pedido pedido1 = new Pedido(1);
        pedido1.mostrarEstado();
        pedido1.cambiarEstado(EstadoPedido.ENTREGADO);
        pedido1.mostrarEstado();
    }
    
}
