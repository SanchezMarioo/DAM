/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author MARIO
 */
public class ClienteHabitual extends Cliente {

    public ClienteHabitual(String idCliente, String nombre) {
        super(idCliente, nombre);
    }

    @Override
    public String getTipoCliente() {
        return "ClienteHabitual";
    }
    
}
