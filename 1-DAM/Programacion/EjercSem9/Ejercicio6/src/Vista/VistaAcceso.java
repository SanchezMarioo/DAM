/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class VistaAcceso {

    private Scanner sc;

    public VistaAcceso() {
        sc = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public int pedirOpcion() {
        mostrarMensaje("1. Registrar un nuevo intento de acceso");
        mostrarMensaje("2. Mostrar todos los accesos registrados");
        mostrarMensaje("3. Mostrar únicamente los accesos válidos");
        mostrarMensaje("4. Mostrar únicamente los accesos inválidos");
        mostrarMensaje("5. Mostrar cuántos intentos de acceso ha realizado un usuario concreto");
        mostrarMensaje("6. Salir del programa");
        mostrarMensaje("Elige una opcion: ");
        while (!sc.hasNextInt()) {
            mostrarMensaje("Introduce un numero");
            sc.nextLine();
            mostrarMensaje("Elige una opcion: ");
        }
        int opcion = pedirNumero();
        sc.nextLine();
        return opcion;
    }

    public String pedirMensaje(String mensaje) {
        mostrarMensaje(mensaje);
        return sc.nextLine();
    }
    public int pedirNumero(){
        return sc.nextInt();
    }

}
