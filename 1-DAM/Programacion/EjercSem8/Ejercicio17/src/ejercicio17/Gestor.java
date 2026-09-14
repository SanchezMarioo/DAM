/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Gestor {

    private String edadCadena = "";
    private Scanner sc;

    public Gestor() {
        sc = new Scanner(System.in);
    }

    public void init() {
        try {
            String edadCadena = sc.nextLine();
            int edad = Integer.parseInt(edadCadena);
            Asistente asistente = new Asistente(edad);
            if (asistente.esMayorEdad()) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
        } catch (NumberFormatException e) {
            System.out.println("No es un numero");
            System.err.println(e.getMessage());
        }
        sc.close();
    }

}
