/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroprimo;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0 ;
        Scanner sc = new Scanner (System.in);
        numero = sc.nextInt();
        for (int i = 2; i < numero; i++) {
                if (numero % i == 0){
                    break;
                } else {
                    System.out.println("Es primo");
                }
            }
        }
    
}
