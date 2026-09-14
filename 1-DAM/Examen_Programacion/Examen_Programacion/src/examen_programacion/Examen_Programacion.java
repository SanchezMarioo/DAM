/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_programacion;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Examen_Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int eleccion;
        boolean noEntra = false;
        String frase = "", fraseModificada = "";
        do {
            System.out.println("\nSELECCIONA UNA OPCION");
            System.out.println("*************************");
            System.out.println("1. Dibuja la figura");
            System.out.println("2. Modifica el string");
            System.out.println("3. Octal ");
            System.out.println("4. Salir");
            System.out.println("*************************");
            System.out.println("Elige una opcion: ");
            eleccion = sc.nextInt();
            switch (eleccion) {
                case 1:
                    int n = 0;

                    System.out.println("Dime el numero N:");
                    int c = sc.nextInt();
                    int nDup = c;
                    int lado = c * 2 - 1;
                    for (int i = 0; i < lado; i++) {
                        nDup = c;
                        noEntra = false;
                        System.out.println();
                        for (int j = 0; j < lado; j++) {
                            if (nDup > 1 && !noEntra) {
                                System.out.print(nDup);
                                nDup--;
                            } else if (nDup == 1 || noEntra) {
                                System.out.print(nDup);
                                nDup++;
                                noEntra = true;

                            }
                        }
                    }
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Dime la frase: ");
                    frase = sc.nextLine();
                    frase = frase.toLowerCase();
                    fraseModificada = ""; // Limpieza obligatoria
                    for (int i = 0; i < frase.length(); i++) {
                        char letra = frase.charAt(i);
                        if (letra == 'a') {
                            letra = '4';
                        } else if (letra == 'e'){
                            letra = '3';
                        } else if (letra == 'i'){
                            letra = '1';
                        } else if (letra == 'o'){
                            letra = '0';
                        } else if (letra == ' '){
                            letra = '_';
                        }
                        fraseModificada += letra;
                    }
                    System.out.println(fraseModificada);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (eleccion != 4);

    }

}
