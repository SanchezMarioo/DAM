/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repetidor_palabras;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Repetidor_Palabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra = "", palabraCortar = "";
        int numero = -1;
        Scanner sc = new Scanner(System.in);
        palabra = sc.nextLine();
        numero = sc.nextInt();
        for (int i = palabra.length(); i >= numero; i--) {
            palabraCortar = palabra.substring(0, i);
            System.out.println(palabraCortar);
        }
    }

}
