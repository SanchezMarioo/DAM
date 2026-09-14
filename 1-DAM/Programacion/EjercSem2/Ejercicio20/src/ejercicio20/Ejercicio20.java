/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double numeroConversion, divisa, conversion;
        int numeroMenu;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad en euros: ");
        numeroConversion = sc.nextInt();
        System.out.println("MENU DIVISA ");
        System.out.println("1.Dolar Estadounidense (USD) ");
        System.out.println("2.Libra esterlina (GPD) ");
        System.out.println("3.Yen Japones (JPY) ");
        System.out.println("4.Peso Mexicano (MXN)");
        System.out.println("5. Franco Suizo (CHF)");
        System.out.print("Introduce un numero (1-5): ");
        numeroMenu = sc.nextInt();
        switch (numeroMenu) {
            case 1:
                divisa = 1.1739;
                break;
            
            case 2:
                divisa =  0.87315;
                break;
            
            case 3 :
                divisa =  173.79;
                break;
            
            case 4:
                divisa =  21.64;
                break;
            case 5:
                divisa =  0.9347;
                break;
            default:
                divisa =  1;
                break;
        }
        conversion = numeroConversion * divisa;
        System.out.println("La conversion es " + conversion);
    }

}
