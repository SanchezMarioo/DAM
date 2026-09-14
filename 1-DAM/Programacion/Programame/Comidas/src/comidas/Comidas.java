/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comidas;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Comidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numCalorias = 0;
        int numVeces = 0;
        int numRep = -1;
        int calorias = 0;
        double totalCalorias = 0;
        while (numRep != 0) {
            totalCalorias = 0;
            numCalorias = sc.nextInt();
            if (numCalorias == 0) {
                break;
            }
            numVeces = sc.nextInt();

            for (int i = 0; i < numVeces; i++) {
                calorias = sc.nextInt();
                totalCalorias += calorias;
            }
            totalCalorias = totalCalorias / numCalorias;
            if(totalCalorias % 1 != 0){
                totalCalorias+=1;
            }
            System.out.println((int) totalCalorias);

        }
    }

}
