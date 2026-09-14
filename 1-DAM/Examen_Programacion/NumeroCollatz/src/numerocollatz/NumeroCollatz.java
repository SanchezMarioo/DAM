/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerocollatz;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class NumeroCollatz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m = 1, num = 0, pasos = 0, prevPasos = 1, maxPasos = 0, iNum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hasta que numero queremos ejecutar el algoritmo: ");
        m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            num = i;
            pasos = 0;
            for (int j = 0; num > 1; j++) {

                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = num * 3 + 1;
                }

                pasos++;
                
            }
            if (pasos > maxPasos) {
                maxPasos = pasos;
                iNum = i;
            }
        }
        System.out.println(maxPasos);

        System.out.println(iNum);
    }

}
