/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia, ano, mes;
        Scanner sc = new Scanner(System.in);
        System.out.print("Dime el dia del mes: ");
        dia = sc.nextInt();
        System.out.print("Dime el mes del año (1,2,3...): ");
        mes = sc.nextInt();
        System.out.print("Dime el año (2024..): ");
        ano = sc.nextInt();
        int eleccion = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                31;
            case 4, 6, 9, 11 ->
                30;
            case 2 ->
                28;
            default ->
                0;
        };
        dia++;
        if (dia > eleccion) {
            dia = 1;
            mes += 1;
        }
        if (mes > 12){
            ano+=1;
            mes = 1;
        }

        System.out.println(dia + " " + mes + " " + " " + ano);

    }

}
