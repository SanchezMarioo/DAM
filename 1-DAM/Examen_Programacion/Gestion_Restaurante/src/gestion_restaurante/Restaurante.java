/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion_restaurante;

/**
 *
 * @author Mario
 */
public class Restaurante {

    private final int NUMERO_OCUPACION = 6;
    private Mesa[] mesa = new Mesa[NUMERO_OCUPACION];
    private Cliente[] cliente = new Cliente[NUMERO_OCUPACION];

    public Restaurante() {
        for (int i = 0; i < mesa.length; i++) {
            mesa[i] = new Mesa();
        }
    }

    public Mesa buscarMesa() {
        for (int i = 0; i < mesa.length; i++) {
            if (!mesa[i].isOcupada()) {
                mesa[i].setOcupada(true);
                return mesa[i];
            }
        }
        return null;
    }

    public void desocuparMesa(Mesa mesa) {
        mesa.setOcupada(false);
    }

}
