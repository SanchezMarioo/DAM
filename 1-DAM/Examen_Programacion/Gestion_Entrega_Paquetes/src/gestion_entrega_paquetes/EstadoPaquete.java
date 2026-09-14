/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package gestion_entrega_paquetes;

/**
 *
 * @author MARIO
 */
public enum EstadoPaquete {
    PENDIENTE, ENVIADO, ENTREGADO;
    
    public boolean esValido(EstadoPaquete estado){
        for (EstadoPaquete e : estado.values()) {
            if(e.equals(estado)){
                return true;
            }
        }
        return false;
    }
}
