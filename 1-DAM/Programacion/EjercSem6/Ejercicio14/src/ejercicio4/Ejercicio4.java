/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gestor gestor1 = new Gestor("Laura", 600111222, 2000);
        Gestor gestor2 = new Gestor("Carlos", 699888777);
        CuentaCorriente.setBanco("Revolut");
        CuentaCorriente c1 = new CuentaCorriente("Mario", "12345678A", 1500);
        CuentaCorriente c2 = new CuentaCorriente("Ana", "87654321B", 2200);
        CuentaCorriente c3 = new CuentaCorriente("Luis", "11223344C", 500);
        c2.asignarGestor(gestor2);

        c1.mostrarInformacion();
        c2.mostrarInformacion();
        c3.mostrarInformacion();

        // Cambiar gestor de la primera cuenta

    }
}
