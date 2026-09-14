/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaexamencase;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class PruebaExamenCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nivel;
        double energia;
        boolean vip;
        char rol;

        System.out.println("Dime tu nivel de experiencia (0-100): ");
        nivel = sc.nextInt();
        System.out.println("Dime su energia actual (0-100): ");
        energia = sc.nextDouble();
        System.out.println("Dispone de pase VIP (true/false)");
        vip = sc.nextBoolean();
        System.out.println("Dime que rol tienes en la partida (G/M/I/A)");
        rol = sc.next().charAt(0);
        if (nivel < 18 && energia < 20.0) {
            System.out.println("Acceso denegado");
        } else {
            switch (rol) {
                case 'G':
                    if (energia >= 80) {
                        System.out.println("ESPADA DE TITANIO +20 ataque");
                    } else {
                        System.out.println("ESCUDO RECUPERADOR +10 defensa");
                    }
                    break;
                case 'M':
                    if (!vip && nivel <= 60) {
                        System.out.println("LIBRO DE HECHIZOS\n"
                                + "SOSPECHOSAMENTE ILEGAL");

                    } else {
                        System.out.println("Baston Arcano Nivel 1");
                    }
                    break;
                case 'I':
                    if (!vip && energia > 50) {
                        System.out.println("Kit de exploit ");
                    } else {
                        System.out.println("Baston arcono nivel2");
                    }
                    break;
                case 'A':
                    if (nivel >= 70 && energia >= 90) {
                        System.out.println("TABLET PREDICTIVA (probabilidad de\n"
                                + "victoria +12%");
                    } else {
                        System.out.println("EXCEL PORTÁTIL (versión gratuita con\n"
                                + "anuncios");
                    }
                    break;
                default:
                    System.out.println("ACCESO CONCEDIDO - RECOMPENSA: ROL DESCONOCIDO, SIN EQUIPO\n"
                            + "INICIAL");
            };
        }
    }

}
