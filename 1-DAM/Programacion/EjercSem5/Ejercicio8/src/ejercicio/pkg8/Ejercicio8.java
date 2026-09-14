/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String formato1 = sc.nextLine();
        String[] arrayFormato = new String[2];
        String[] arrayFormato2 = new String[2];
        int mins2 = 0, mins = 0, horas = 0, hora2 = 0;
        if (!formato1.contains(":")) {
            System.out.println("El formato no contiene \":\" ");
        } else {
            arrayFormato = formato1.split(":");
            horas = Integer.parseInt(arrayFormato[0]);
            mins = Integer.parseInt(arrayFormato[1]);
        }
        String formato2 = sc.nextLine();
        if (!formato2.contains(":")) {
            System.out.println("El formato no contiene \":\" ");
        } else {
            arrayFormato2 = formato2.split(":");
            hora2 = Integer.parseInt(arrayFormato2[0]);
            mins2 = Integer.parseInt(arrayFormato2[1]);
        }
        int total = diferenciaMin(horas, mins, hora2, mins2);
        System.out.println(total);
    }

    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
        int totalMin1 = hora1 * 60 + minuto1;
        int totalMin2 = hora2 * 60 + minuto2;
        return Math.abs(totalMin1 - totalMin2);
    }
}
