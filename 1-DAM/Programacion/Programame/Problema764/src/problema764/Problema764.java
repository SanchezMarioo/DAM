/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema764;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Problema764 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        do {
            int avesLiberadas = 0;
            int numero = sc.nextInt();
            if (numero == 0) {
                break;
            }
            for (int i = 0; i < numero; i++) {
                int numeroAves = sc.nextInt();
                int nAvesTurno = sc.nextInt();
                avesLiberadas += numeroAves - nAvesTurno;
            }
            System.out.println(avesLiberadas);
        } while (true);
    }

}
