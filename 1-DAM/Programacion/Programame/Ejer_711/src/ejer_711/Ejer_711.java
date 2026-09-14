/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer_711;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejer_711 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int maxNum = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < maxNum; i++) {
            String numString = sc.nextLine();
            int valorNum = numString.length();
            int num = Integer.parseInt(numString);
            for (int j = valorNum * 2; j > valorNum; j--) {
                if (j != 0) {
                    int c = num % (10 * j);
                    System.out.println(c);
                }
            }
        }

    }

}
