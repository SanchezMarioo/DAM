/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante;

/**
 *
 * @author MARIO
 */
public class Restaurante {

    private int MAX_MESAS = 6;
    private Mesa mesas = new Mesa();
    private Cliente clientes[] = new Cliente[6];
    private int contadorClientes = 0;
    private boolean[] estadoMesa = new boolean[MAX_MESAS];

    public int asignarMesa() {
        if (mesas.verSiHayMesa(estadoMesa) != -1) {
            return mesas.verSiHayMesa(estadoMesa);
        } else {
            return -1;
        }
    }

    public void asignarClienteRestaurante() {
        
    }

}
