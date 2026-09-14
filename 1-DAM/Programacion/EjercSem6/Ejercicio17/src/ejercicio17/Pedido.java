/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17;

/**
 *
 * @author mario.sanper.2
 */
public class Pedido {

    private int id;
    private EstadoPedido estadoPedido;

    /**
     * El estado incial siempre sera PENDIENTE
     *
     * @param id
     */
    public Pedido(int id) {
        this.id = id;
        estadoPedido = estadoPedido.PENDIENTE;
    }

    /**
     *
     * @param estadoPedido ENUM que recibe una serie de parametros
     */
    public void cambiarEstado(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public void mostrarEstado() {
        switch (estadoPedido) {
            case PENDIENTE -> {
                System.out.println("El pedido " + id + " está pendiente de envío");
            }
            case CANCELADO -> {
                System.out.println("El pedido " + id + " ha sido cancelado");
            }
            case ENTREGADO -> {
                System.out.println("El pedido " + id + " ha sido entregado");
            }
            case ENVIADO -> {
                System.out.println("El pedido " + id + " ha sido enviado");
            }
        }
    }
}
