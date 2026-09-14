/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package par_impar;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Par_Impar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        String cad = esPar(numero);
        System.out.println(cad);
    }

    static String esPar(int numero) {
        String cad = "";
        if (numero % 2 == 0) {
            cad = "PAR";
        } else {
            cad = "IMPAR";
        }
        return cad;
    }

}
