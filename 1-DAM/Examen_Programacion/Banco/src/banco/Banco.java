/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Mario
 */
public class Banco {

    private Cliente[] clientes;
    private int contador;
    private final int MAX_CLIENTES = 5;

    public Banco() {
        clientes = new Cliente[MAX_CLIENTES];
        contador = 0;
    }

    /**
     * Regista a los usuarios
     *
     * @param c
     */
    public void registrarCliente(Cliente c) {
        if (contador >= MAX_CLIENTES) {
            System.out.println("Se supero el limite de clientes");
        } else {
            clientes[contador] = c;
            contador++;
        }
    }

    public void transferir(Cliente remitente, Cliente destinatario, double cantidad) {
        if (remitente.getSaldo() >= cantidad) {
            destinatario.recibirTransferencia(cantidad);
            remitente.decrementarSaldo(cantidad);
        }
    }

    public Cliente buscarCliente(int numero) {
        if (clientes[numero] != null) {
            return clientes[numero];
        } else {
            return null;
        }

    }

    public void mostrarClientes() {
        for (int i = 0; i < contador; i++) {
            System.out.println((i + 1) + " - " + clientes[i].getNombre());
        }
    }
}
