/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

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

    public void mostrarMsg(String msg) {
        System.out.println(msg);
    }

    public int pedirNumero(String msg) {
        mostrarMsg(msg);
        while (!sc.hasNextInt()) {
            mostrarMsg("Introduzca un numero");
            sc.nextLine();
            mostrarMsg(msg);
        }
        int numero  = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    public String pedirMsg(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }

    public double pedirNumeroDecimal(String msg) {
        mostrarMsg(msg);
        while (!sc.hasNextDouble()) {
            mostrarMsg("Introduzca un numero");
            sc.nextLine();
            mostrarMsg(msg);
        }
        return sc.nextDouble();
    }
}
