
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26b;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio26B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int altura = 0, ancho = 0;
        Scanner sc = new Scanner (System.in);
        altura = sc.nextInt();
        ancho = sc.nextInt(); 
        for (int i = 0; i <= altura; i++) {
            System.out.println(" ");
            for (int j = 0; j <= ancho; j++) {
                if(j == 0 || i == 0 || j == ancho || i == altura  ){
                    System.out.print("*");
                } else{
                    System.out.print(".");
                }
            }
        }
    }
    
}
