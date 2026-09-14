/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia, ano, mes;
        boolean fechaCorrecta = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el dia del mes: ");
        dia = sc.nextInt();
        System.out.print("Dime el mes del año (1,2,3...): ");
        mes = sc.nextInt();
        System.out.print("Dime el año (2024..): ");
        ano = sc.nextInt();
        if (dia < 0) {
            System.out.println("El dia " + dia + " no existe");
            fechaCorrecta = false;
        }
        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia > 31) {
                    System.out.println("El mes no puede tener mas de 31 dias");
                    fechaCorrecta = false;
                }
                break;
            case 2:
                if (dia > 28) {
                    System.out.println("El mes no puede tener mas de 28 dias ");
                    fechaCorrecta = false;
                }
                break;
            case 4, 6, 9, 11:
                if (dia > 30) {
                    System.out.println("El mes no puede tener mas de 30 dias");
                    fechaCorrecta = false;
                }
                break;
            default:
                System.out.println("Ese mes no existe");
                fechaCorrecta = false;
                break;
        }
        if (fechaCorrecta == true) {
            System.out.println("Esta fecha es correcta");
        }
    }
}
