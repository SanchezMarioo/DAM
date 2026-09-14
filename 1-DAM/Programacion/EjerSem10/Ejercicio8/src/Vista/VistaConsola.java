/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class VistaConsola {

    private Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println();
        System.out.println("=========================================");
        System.out.println("  1. Eliminar una dirección de email");
        System.out.println("  2. Mostrar todas las direcciones");
        System.out.println("  3. Salir");
        System.out.println("=========================================");
        System.out.print("  Opción: ");
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public int pedirNumero() {
        while (!sc.hasNextInt()) {
            System.out.println("No es numero");
            sc.nextLine();
        }
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    public String pedirEmail() {
        return sc.nextLine();
    }

    public void mostrarCorreos(ArrayList<String> correos) {
        if (correos == null || correos.size() < 0) {
            System.out.println("La lista esta vacia");
        } else {
            for (String correo : correos) {
                System.out.println(correo);
            }
        }

    }
}
