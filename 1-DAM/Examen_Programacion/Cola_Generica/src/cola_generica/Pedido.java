/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cola_generica;

/**
 *
 * @author MARIO
 */
public class Pedido {

    private String id;
    private String descripcion;

    public Pedido(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }

}
