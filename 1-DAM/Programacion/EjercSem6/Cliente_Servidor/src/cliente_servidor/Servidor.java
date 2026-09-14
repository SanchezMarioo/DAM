/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cliente_servidor;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Servidor {

    private String ip;
    private final int MAX_CLIENTES = 10;
    private final String IP_DEFECTO = "127.0.0.1";
    private Cliente[] lista_cliente;
    private int contadorClientes;

    public Servidor(String ip) {
        // Comprobar si la IP es correcta
        // Incializar el array de clientes 
        lista_cliente = new Cliente[MAX_CLIENTES];
        setIp(ip);
        contadorClientes = 0;
    }

    /**
     * Mostrar el menu del servidor
     */
    static public void init() {
        System.out.println("1. Mostrar lista de clientes conectados.");
        System.out.println("2. Simular un ping a un cliente concreto.");
        System.out.println("3. Simular un ping a todos los clientes.");
        System.out.println("4.Salir del programa.");
    }

    public void respuesta(int numeroCliente) {
        if (numeroCliente < 0 || numeroCliente >= contadorClientes) {
            System.out.println("El número debe estar entre 0 y " + (contadorClientes - 1));
            return;
        }

        if (lista_cliente[numeroCliente].ping()) {
            System.out.println("El ping se ha hecho bien");
        } else {
            System.out.println("El ping no es correcto");
        }
    }

    public void respuestaTodos() {
        for (int i = 0; i < contadorClientes; i++) {
            if (lista_cliente[i].ping()) {
                System.out.println("El ping desde el ordenador " + (i + 1) + "es correcto");
            } else {
                System.out.println("El ping desde el ordenador " + (i + 1) + " NO es correcto");
            }
        }
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        if (ValidarIP.comprobarIP(ip)) {
            this.ip = ip;
        } else {
            this.ip = IP_DEFECTO;
        }
    }

    public void enlazarCliente(Cliente cliente) {
        // Comprobar si tiene espacio 
        if (contadorClientes >= MAX_CLIENTES) {
            System.err.println("No puedes establecer mas clientes del maximo ");
            return;
        }

        // Comprobar que la IP de el cliente no esta repetida
        for (int i = 0; i < contadorClientes; i++) {
            if (lista_cliente[i] != null && lista_cliente[i].getIp().equals(cliente.getIp())) {
                // Ya existe esa IP
                System.err.println("La IP del cliente ya está registrada");
                return; // Salir del método
            }
        }
        // -> ok -> Asigna a su listado de clientes el nuevo cliente y le notifica que es su servidor 
        cliente.setServidor(this);
        lista_cliente[contadorClientes] = cliente;
        System.out.println("El cliente se ha unido el servidor");
        // -> Error -> rehusa del cliente => no hacer nada. Muestra un mensaje de error 
        contadorClientes++;
    }

    public void iniciarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (true) {
            // Mostrar menú
            init();
            opcion = sc.nextInt();
            sc.nextLine();
            // Leer opción
            switch (opcion) {
                case 1:
                    // Mostrar lista de clientes
                    if (contadorClientes == 0) {
                        System.out.println("No hay clientes conectados.");
                    } else {
                        System.out.println("Clientes conectados:");
                        for (int i = 0; i < contadorClientes; i++) {
                            System.out.println((i + 1) + ". " + lista_cliente[i].getIp());
                        }
                    }
                    break;

                case 2:
                    // Ping a un cliente concreto
                    if (contadorClientes == 0) {
                        System.out.println("No hay clientes conectados.");
                        break;
                    }
                    System.out.print("Introduce el número del cliente (1-" + contadorClientes + "): ");
                    int numCliente = sc.nextInt();
                    respuesta(numCliente);
                    break;


                case 3:
                    // Ping a todos
                    if (contadorClientes == 0) {
                        System.out.println("No hay clientes conectados.");
                        break;
                    }
                    respuestaTodos();
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    return; // Salir del bucle y del menú

                default:
                    System.out.println("Opción no válida. Debes elegir entre 1 y 4.");
            }
        }
    }

}
