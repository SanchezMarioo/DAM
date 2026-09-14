/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz_menu;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Matriz_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int[][] matrizNumeros = new int[3][3];
        boolean numeroRep = false;
        int numeroRelleno = 0;
        int contadorI = 0;
        int contadorJ = 0;
        int numeroMaximo = 0;
        int numeroMinimo = 0;
        int sumaColumna = 0;
        int sumaDiagonal = 0;
        int posicionI = 0;
        int posicionJ = 0;
        int posicionMaximaI = 0;
        int posicionMaximaJ = 0;
        do {
            opcion = 0;
            System.out.println("1. Rellenar la matriz sin numeros repetidos");
            System.out.println("2. Mostrar la matriz");
            System.out.println("3. Mostrar máximo y minimo");
            System.out.println("4. Suma de columnas ");
            System.out.println("5. Suma de diagonales ");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    do {
                        numeroRep = false;
                        
                        if (contadorJ > 2) {
                            break;
                        }
                        System.out.print("Numero " + "[" + contadorJ + "]" + "[" + contadorI + "]" + ": ");
                        int numeroElegir = sc.nextInt();

                        for (int i = 0; i < matrizNumeros.length; i++) {
                            for (int j = 0; j < matrizNumeros.length; j++) {
                                if (numeroElegir == matrizNumeros[i][j]) {
                                    numeroRep = true;
                                    numeroRelleno--;
                                    System.out.println("El numero " + numeroElegir + " ya esta en la matriz");
                                    continue;
                                }
                            }
                        }
                        if (contadorI == 0 && contadorJ == 0) {
                            matrizNumeros[contadorJ][contadorI] = numeroElegir;
                            contadorI++;
                            continue;
                        }
                        if (!numeroRep) {
                            matrizNumeros[contadorJ][contadorI] = numeroElegir;
                            if (contadorI < 2) {
                                contadorI++;
                            } else {
                                contadorI = 0;
                                contadorJ++;
                            } 

                        } else{
                            numeroRelleno++;
                        }

                    } while (numeroRelleno <= 9);
                    break;
                case 2:
                    for (int i = 0; i < matrizNumeros.length; i++) {
                        for (int j = 0; j < matrizNumeros.length; j++) {
                            System.out.print(matrizNumeros[i][j] + "\t");
                        }

                        System.out.println("");
                    }
                    break;
                case 3:
                    numeroMaximo = -1;
                    numeroMinimo = -1;
                    for (int i = 0; i < matrizNumeros.length; i++) {
                        for (int j = 0; j < matrizNumeros.length; j++) {
                            if (i == 0 && j == 0) {
                                numeroMaximo = matrizNumeros[i][j];
                            }
                            if (numeroMaximo < matrizNumeros[i][j]) {
                                numeroMaximo = matrizNumeros[i][j];
                                posicionI = i;
                                posicionJ = j;

                            }
                        }
                    }
                    System.out.println("El numero maximo es: " + numeroMaximo);
                    for (int i = 0; i < matrizNumeros.length; i++) {
                        for (int j = 0; j < matrizNumeros.length; j++) {
                            if (i == 0 && j == 0) {
                                numeroMinimo = matrizNumeros[i][j];
                            }
                            if (numeroMinimo > matrizNumeros[i][j]) {
                                numeroMinimo = matrizNumeros[i][j];
                                posicionI = i;
                                posicionJ = j;
                            }
                        }
                    }
                    System.out.println("El numero minimo es: " + numeroMinimo);
                    break;
                case 4:
                    for (int i = 0; i < matrizNumeros.length; i++) {
                        for (int j = 0; j < matrizNumeros.length; j++) {
                            sumaColumna += matrizNumeros[j][i];
                        }
                        System.out.println("La suma de la columna " + i + " " + sumaColumna);
                        sumaColumna = 0;
                    }
                    break;
                case 5:
                    for (int i = 0; i < matrizNumeros.length; i++) {
                        for (int j = 0; j < matrizNumeros.length; j++) {
                            if (i == j) {
                                sumaDiagonal += matrizNumeros[j][i];
                            }
                        }
                    }
                    System.out.println("La suma de la diagonal " + sumaDiagonal);
                    break;

            }
        } while (opcion != 6);

    }

}
