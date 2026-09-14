/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decimal_binario;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Decimal_Binario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int decimal, divido = 0;
        int binario = 0;
        String binarioCadena = "";
        Scanner sc = new Scanner(System.in);
        decimal = sc.nextInt();
        while (decimal > 0) {
            int resto = decimal % 2;
            binarioCadena = resto + binarioCadena; // prepend para tener el orden correcto
            decimal = decimal / 2;
            

        }
        System.out.println(binarioCadena);
    }

}
