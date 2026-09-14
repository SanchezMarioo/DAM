/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema823;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Problema823 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numCasos = sc.nextInt();

        for (int i = 0; i < numCasos; i++) {
            int chelin = 0;
            int peniques = 0;
            int libras = 0;
            int antiguoCarruajeDentro = sc.nextInt();
            if (antiguoCarruajeDentro > 0) {
                chelin += 1 * antiguoCarruajeDentro;
            }

            int antiguoCarruajeFuera = sc.nextInt();
            if (antiguoCarruajeFuera > 0) {
                peniques += 9 * antiguoCarruajeFuera;
            }
            int nCarruajeDentro = sc.nextInt();
            if (nCarruajeDentro > 0) {
                chelin += (1 * nCarruajeDentro);
                peniques += 6 * nCarruajeDentro;
            }
            int nCarruajeFuera = sc.nextInt();
            if (nCarruajeFuera > 0) {
                chelin += 1 * nCarruajeFuera;
            }
            while (peniques >= 12) {
                peniques -= 12;
                chelin++;
            }
            while (chelin >= 20) {
                chelin -= 20;
                libras++;
            } 
            System.out.println(libras + " " + chelin + " " + peniques);
        }

    }

}
