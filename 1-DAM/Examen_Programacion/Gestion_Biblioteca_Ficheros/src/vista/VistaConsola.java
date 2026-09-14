/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class VistaConsola {

    private Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in);
    }

    public void mostrarMsg(String msg) {
        System.out.println(msg);
    }

    public int pedirNumero() {
        while (!sc.hasNextInt()) {
            System.out.println("No es numero.");
            sc.nextLine();
        }
        int numero = sc.nextInt();
        return numero;
    }

    public void mostrarMenu() {
        System.out.println("=== MENÚ PRINCIPAL ===");
        System.out.println("1. Mostrar todas las reservas");
        System.out.println("2. Añadir una nueva reserva");
        System.out.println("3. Eliminar una reserva por ID");
        System.out.println("4. Mostrar reservas largas (más de 15 días)");
        System.out.println("5. Salir");
    }

}
