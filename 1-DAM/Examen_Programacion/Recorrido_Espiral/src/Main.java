import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroMatriz = sc.nextInt();
        int numero = 0;
        int matriz[][] = new int[numeroMatriz][numeroMatriz];
        int matrizUni[] = new int[numeroMatriz * numeroMatriz];
        int contadorUni = 0;
        int maximoFila = numeroMatriz;
        int minFila = 0;
        int minCol = 0;
        int maximoColumna = numeroMatriz;
        // Bucle añadir numeros
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                numero = sc.nextInt();
                matriz[i][j] = numero;
            }
        }
        // Primera vuelta
        while (minFila != maximoFila || minCol != maximoFila) {
            if (contadorUni >= 35) {
                break;
            }
            if (minFila == 0) {
                for (int i = 0; i < maximoFila; i++) {
                    matrizUni[contadorUni] = matriz[minFila][i];
                    contadorUni++;
                }
                minFila++;
            }
            for (int i = 0; i < maximoColumna; i++) {
                matrizUni[contadorUni] = matriz[maximoFila][i];
                contadorUni++;
            }


        }
        for (int i = 0; i < matrizUni.length; i++) {
            System.out.print(matrizUni[i] + " ");
        }

    }
}