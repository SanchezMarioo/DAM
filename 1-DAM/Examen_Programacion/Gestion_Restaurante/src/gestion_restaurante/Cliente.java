/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_restaurante;

/**
 *
 * @author Mario
 */
public class Cliente {
    private String nombre;
    private Mesa mesa;
    private Restaurante restaurante;
    public Cliente(String nombre){
        this.nombre = nombre;
    }
    public void asignarRestaurante(Restaurante restaurante){
        this.restaurante = restaurante;
    }
    public void pedirMesa(){
        this.mesa = restaurante.buscarMesa();
        if(this.mesa == null){
            System.out.println("No ha encontrado mesa");
        }
    }
    public void desocuparMesa(){
        this.mesa = null;
    }
    
}
