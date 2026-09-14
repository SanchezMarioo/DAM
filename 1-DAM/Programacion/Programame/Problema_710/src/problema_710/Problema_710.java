/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema_710;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Problema_710 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int casosPrueba = sc.nextInt();
        for (int i = 0; i < casosPrueba; i++) {
            int max = sc.nextInt();
            int sum = 0;
            for (int j = 0; j < 6; j++) {
                int num = sc.nextInt();
                sum+=num;
            }
            int numero = max - sum;
            System.out.println(numero);
           
        }
        
    }
    
}
