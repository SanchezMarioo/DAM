/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author MARIO
 */
public class Cliente {
    private String nombre;
    private Estado_Cliente estadoCliente ;
    private Restaurante restaurante;
    private Mesa mesa;
    public Cliente(String nombre,Restaurante restaurante){
        this.nombre = nombre;
        estadoCliente = Estado_Cliente.ESPERANDO;
        this.restaurante = restaurante;
    }
    
}
