/*+
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package navidad_mario;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Navidad_Mario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int altura = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Introduce un numero entre 3 y 10:");
            altura = sc.nextInt();
            if (altura < 3 || altura > 10) {
                System.out.println("Altura invalida");
            }
        } while (altura < 3 || altura > 10);
        for (int i = 0; i <= altura; i++) {
            for (int j = 0; j >= (i - altura - 1); j--) {
                System.out.print(" "); // ESPACIOS
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*"); // ASTERISTICOS
            }
            System.out.println(); // SALTOS LINEA
        }
    }

}
