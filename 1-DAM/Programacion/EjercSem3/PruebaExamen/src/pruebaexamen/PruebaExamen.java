/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaexamen;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class PruebaExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int nivel = 0;
        double energia = 0;
        boolean vip = false;
        char rol = 'W';
        boolean repetir = false;
        while (repetir != true) {
            System.out.println("Dime tu nivel de experiencia (0-100): ");
            nivel = sc.nextInt();
            System.out.println("Dime su energia actual (0-100): ");
            energia = sc.nextDouble();
            System.out.println("Dispone de pase VIP (true/false)");
            vip = sc.nextBoolean();
            System.out.println("Dime que rol tienes en la partida (G/M/I/A)");
            rol = sc.next().charAt(0);
            if (nivel < 0 && nivel >= 100) {
                System.out.println("Dime tu nivel de experiencia (0-100): ");
                nivel = sc.nextInt();
                
                if (energia < 0 && energia >= 100) {
                    System.out.println("Dime su energia actual (0-100): ");
                    energia = sc.nextDouble();
                    if (rol == 'G' && rol == 'M' && rol == 'I' && rol == 'A') {
                        System.out.println("Dime que rol tienes en la partida (G/M/I/A)");
                        rol = sc.next().charAt(0);
                    }
                }
            }
            System.out.println("Parar bucle: ");
            repetir = sc.nextBoolean();
        }
        if (nivel < 18 && energia < 20.0) {
            System.out.println("Acceso denegado");
        }
        if ((nivel > 50 && energia > 35) || vip == true) {
            System.out.println("ACCESO ACEPTADO");
            if (rol == 'G' && energia >= 80) {
                System.out.println("ESPADA TITANIO +20 ATAQUE");
            } else if (rol == 'G' && energia <= 80) {
                System.out.println("ESCUDO RECUPERADOR +10 DEFENSA");
            } else if (rol == 'M' && !vip && energia < 60) {
                System.out.println("LIBRO DE HECHICOS SOSPECHOSAMENTE ILEGAL");
            } else if (rol == 'M' && vip && energia > 60) {
                System.out.println("NASTPM ARCANO NIVEL 2");
            } else if (rol == 'I' && vip && energia > 50) {
                System.out.println("KIT EXPLOIT CERO DAY");
            } else if (rol == 'I' && !vip && energia < 50) {
                System.out.println("CAJA DE HERRAMIENTAS ANALOGICAS destornillador"
                        + "y paciencia");
            } else if (rol == 'A' && energia >= 90 || nivel >= 70) {
                System.out.println("TABLET PREDICTIVA (probabilidad de victoria +12%)");
            } else if (rol == 'A' && energia <= 90 || nivel <= 70) {
                System.out.println("EXCEL PORTATIL (version gratuita con anuncios)");
            }
        } else {
            System.out.println("ACCESO DENEGADO");
        }

    }

}
