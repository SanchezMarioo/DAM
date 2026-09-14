/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author MARIO
 */
public class Mesa {
    private boolean estaLibre; 
    private Cliente cliente;
    public Mesa(){
        this.estaLibre = true;
    }
    public boolean estaLibre(){
        return !estaLibre;
    }
    public Mesa ocuparMesa(Cliente cliente){
        estaLibre = false;
        this.cliente = cliente;
        return this;
    }
    public void desocuparMesa(){
        estaLibre = true;
        this.cliente = null;
    }
    
}
