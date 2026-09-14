/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundelaflota;

/**
 *
 * @author Mario
 */
public class HundeLaFlota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matrizUsuario = new int[8][8];
        int[][] matrizInterna = new int[8][8];
        int numeroRandom = 0;
        int numeroRandom2 = 0;

        for (int i = 4; i >= 2; i--) {
            int posicionBarco = (int) (Math.random() * 2);
            boolean esHorizontal = posicionBarco == 0 ? true : false;
            if (!esHorizontal) {
                numeroRandom = 0;
                numeroRandom2 = (int) (Math.random() * 8);
            } else {
                numeroRandom2 = 0;
                numeroRandom = (int) (Math.random() * 8);
            }

            switch (i) {
                case 4:
                    if (!esHorizontal) {
                        numeroRandom2 = (int) Math.random() * 1 + 4;
                    } else {
                        numeroRandom = (int) Math.random() * 1 + 4;
                    }
                    for (int j = 0; j <= 3; j++) {
                        matrizInterna[numeroRandom][numeroRandom2] = i;
                        if (!esHorizontal) {
                            numeroRandom2++;
                        } else {
                            numeroRandom++;
                        }

                    }
                    break;
                case 3:
                    if (!esHorizontal) {
                        numeroRandom2 = (int) Math.random() * 1 + 3;
                    } else {
                        numeroRandom = (int) Math.random() * 1 + 3;
                    }
                    numeroRandom = (int) Math.random() * 1 + 3;
                    for (int j = 0; j <= 2; j++) {
                        matrizInterna[numeroRandom][numeroRandom2] = i;
                        if (!esHorizontal) {
                            numeroRandom2++;
                        } else {
                            numeroRandom++;
                        }
                    }
                    break;
                case 2:
                    if (!esHorizontal) {
                        numeroRandom2 = (int) (Math.random() * 1 + 2);
                    } else {
                        numeroRandom = (int) Math.random() * 1 + 2;
                    }
                    numeroRandom = (int) Math.random() * 1 + 2;
                    for (int j = 0; j <= 1; j++) {
                        matrizInterna[numeroRandom][numeroRandom2] = i;
                        if (!esHorizontal) {
                            numeroRandom2++;
                        } else {
                            numeroRandom++;
                        }
                    }
                    break;
            }
        }

        for (int i = 0; i < matrizInterna.length; i++) {
            for (int j = 0; j < matrizInterna.length; j++) {
                System.out.print(matrizInterna[i][j] + " ");
            }
            System.out.println();
        }

    }

}
