/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patas;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Patas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int casosPruebas = sc.nextInt();
        for (int i = 0; i < casosPruebas; i++) {
            int pollos = sc.nextInt();
            System.out.print(pollos + " " + (pollos * 2));
            System.out.println("");
        }
    }

}
