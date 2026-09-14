/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author MARIO
 */
public class ClienteEsporadico extends Cliente {

    private double descuento;
    private String direccion;
    private String telefono;

    public ClienteEsporadico(double descuento, String direccion, String telefono, String idCliente, String nombre) {
        super(idCliente, nombre);
        this.descuento = descuento;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    
    @Override
    public String getTipoCliente() {
        return "ClienteEsporadico";
    }
    
}
