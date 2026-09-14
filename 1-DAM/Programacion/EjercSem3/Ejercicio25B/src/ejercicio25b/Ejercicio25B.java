/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25b;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio25B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fraseAcertar, fraseEscribir = "", palabraOculta = "", actualizarContrasena = "";
        char letraAcertar = 0, letraEscribir;
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Jugador 1: Dime la contraseña:");
        fraseAcertar = sc.nextLine();

        for (int i = 0; i < fraseAcertar.length(); i++) {
            palabraOculta += "*";
        }

        do {
            System.out.println("Jugador 2: Dime la contraseña:");
            fraseEscribir = sc.nextLine();
            actualizarContrasena = "";

            if (fraseEscribir.length() != fraseAcertar.length()) {
                System.out.println("La contraseña debe tener " + fraseAcertar.length() + " caracteres.");
                contador--;
                continue;
            }

            for (int i = 0; i < fraseAcertar.length(); i++) {
                letraAcertar = fraseAcertar.charAt(i);
                letraEscribir = fraseEscribir.charAt(i);

                if (letraAcertar == letraEscribir) {
                    actualizarContrasena += letraAcertar;
                } else {
                    actualizarContrasena += palabraOculta.charAt(i);
                }
            }

            palabraOculta = actualizarContrasena;
            System.out.println("Progreso: " + palabraOculta);
            contador++;

        } while (!fraseAcertar.equals(palabraOculta));

        System.out.println("Has acertado la contraseña! Era: " + fraseAcertar);
        System.out.println("Lo has acertado en " + contador + " intentos");
    }

}
