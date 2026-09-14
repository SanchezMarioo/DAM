/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fraseAcertar, fraseEscribir = "", palabraOculta = "";
        char letraAcertar = 0, letraEscribir;
        int numeroAcertar, numeroEscribir;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nJugador 1: Dime la contraseña: ");
        fraseAcertar = sc.nextLine();
        do {

            System.out.println("Jugador 2: Dime la contraseña: ");
            fraseEscribir = sc.nextLine();
            if (fraseAcertar.equals(fraseEscribir)) {
                System.out.println("Acertaste");
                break;
            } else {
                for (int i = 0; i < fraseAcertar.length(); i++) {
                    boolean igualLongitud = fraseAcertar.length() == fraseEscribir.length();
                    letraAcertar = fraseAcertar.charAt(i);
                    letraEscribir = fraseEscribir.charAt(i);

                    if (igualLongitud && (letraAcertar == letraEscribir)) {
                        palabraOculta += letraAcertar;
                    } else {
                        palabraOculta += "*";
                    }
                }
                System.out.println("La palabra oculta es: " + palabraOculta);
            }
        } while (true);
    }

}
