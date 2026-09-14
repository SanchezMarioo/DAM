/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean sonAmigos = numerosAmigos(num1, num2);
        if(sonAmigos){
            System.out.println("Son amigos");
        } else{
            System.out.println("NO lo son");
        }
    }

    static boolean numerosAmigos(int num1, int num2) {
        int sumaDiv = 0;
        int sumaDiv2 = 0;
        boolean sonAmigos = false;
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                sumaDiv += i;
            }
        }
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                sumaDiv2 += i;
            }
        }
        if ((sumaDiv == num2) && (sumaDiv2 == num1)) {
            sonAmigos = true;
        }
        return sonAmigos;
    }
}
