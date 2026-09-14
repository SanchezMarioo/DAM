/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_entrega_paquetes;

/**
 *
 * @author MARIO
 */
public class Paquete {
    
    private String codPaquete;
    private String nombreDestinatario;
    private double peso;
    private EstadoPaquete estado;
    
    public Paquete(String codPaquete, String nombreDestinatario, double peso, EstadoPaquete estado) {
        if (comprobarCodigo(codPaquete) && nombreDestinatario(nombreDestinatario) && pesoMayor0(peso) && estado.esValido(estado)) {
            this.codPaquete = codPaquete;
            this.nombreDestinatario = nombreDestinatario;
            this.peso = peso;
            this.estado = estado;
        } else {
            System.out.println("ERROR: NO se ha pasado todas las comprobaciones. ERROR al instaciar el objeto");
        }
        
    }
    
    private boolean comprobarCodigo(String codigo) {
        return codigo.matches("PKG-\\d{4}-[A-Z]{2}");
    }
    
    private boolean nombreDestinatario(String nombre) {
        return nombre.matches("[AZaz]+");
    }
    
    private boolean pesoMayor0(double peso) {
        return peso > 0.0;
    }
    
}
