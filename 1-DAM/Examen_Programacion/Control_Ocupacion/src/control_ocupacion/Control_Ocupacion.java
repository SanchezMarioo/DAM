/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control_ocupacion;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Control_Ocupacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        String numeros[] = new String[3];
        String cad = "";
        int filas = 0;
        int columnas = 0;
        int accion = 0;
        do {
            cad = sc.next();
            if (cad.charAt(1) != ',' || cad.charAt(3) != ',') {
                System.out.println("Formato incorrecto (fila,columna,accion)");
                continue;
            }
            if (cad.length() != 5) {
                System.out.println("Formato incorrecto (fila,columna,accion) long");
            }
            numeros = cad.split(",");
            for (int i = 0; i < numeros[0].length(); i++) {
                if (numeros[0].charAt(i) < '0' || numeros[0].charAt(i) > '4') {
                    System.out.println("Formato incorrecto (fila,columna,accion) filas");
                    continue;
                }
            }

            for (int i = 0; i < numeros[1].length(); i++) {
                if (numeros[1].charAt(i) < '0' || numeros[1].charAt(i) > '4') {
                    System.out.println("Formato incorrecto (fila,columna,accion) columnas");
                    continue;
                }
            }
            for (int i = 0; i < numeros[2].length(); i++) {
                if (numeros[2].charAt(i) != '0' && numeros[0].charAt(i) != '1') {
                    System.out.println("Formato incorrecto (fila,columna,accion) accion");
                    continue;
                }
            }
            filas = Integer.parseInt(numeros[0]);
            columnas = Integer.parseInt(numeros[1]);
            accion = Integer.parseInt(numeros[2]);
            if(accion == 1){
                matriz[filas][columnas] = 1;
            } else {
                matriz[filas][columnas] = 0;
            }
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    System.out.print(matriz[i][j] + "\t");
                }
                System.out.println("");
            }
            
        } while (!cad.equals("FIN"));

    }

}
