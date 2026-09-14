/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinalafrase;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class AdivinaLaFrase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String contraseña = "", adivinarContraseña = "", actualizarContraseña = "", palabraOculta = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la contraseña: ");
        contraseña = sc.nextLine();

        int contador = 0;
        char letraContraseña, letraAdivinar;
        for (int i = 0; i < contraseña.length(); i++) {
            palabraOculta += "*";
        }
        do {
            System.out.println(palabraOculta);
            System.out.println("Introduce la palabra secreta: ");
            adivinarContraseña = sc.nextLine();
            actualizarContraseña = "";
            for (int i = 0; i < contraseña.length(); i++) {
                letraContraseña = contraseña.charAt(i);
                letraAdivinar = adivinarContraseña.charAt(i);
                if (letraContraseña == letraAdivinar) {
                    actualizarContraseña += letraAdivinar;
                } else {
                    actualizarContraseña += palabraOculta.charAt(i);
                }

            }
            palabraOculta = actualizarContraseña;
            contador++;
        } while (contador <= 10);
    }

}
