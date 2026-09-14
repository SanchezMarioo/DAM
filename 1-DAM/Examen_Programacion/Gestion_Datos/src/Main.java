import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroTemperatura = 0;
        int sumaTemperatura = 0;
        int mediaTemperatura = 0;
        int temperaturaMaxima = 0;
        int temperaturaMinima = 0;
        int contadorSumaTemp = 0;
        do {
            numeroTemperatura = sc.nextInt();
        } while (numeroTemperatura < 5 || numeroTemperatura > 20);
        int temperatura[] = new int[numeroTemperatura + 1];
        int matrizTemperatura[][] = new int[3][temperatura.length];
        for (int i = 0; i < temperatura.length; i++) {
            int numeroInsertar = sc.nextInt();
            temperatura[i] = numeroInsertar;
        }
        for (int i = 0; i < temperatura.length; i++) {
            for (int j = 0; j < temperatura.length - 1 - i; j++) {
                if (temperatura[j] > temperatura[j + 1]) {
                    int aux = temperatura[j];
                    temperatura[j] = temperatura[j + 1];
                    temperatura[j + 1] = aux;
                }
            }
        }
        int insertarPosicion = sc.nextInt();
        temperatura[numeroTemperatura] = insertarPosicion;
        for (int i = 0; i < temperatura.length - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < temperatura.length; j++) {
                if (temperatura[j] < temperatura[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int aux = temperatura[i];
            temperatura[i] = temperatura[indiceMinimo];
            temperatura[indiceMinimo] = aux;


        }
        System.out.print("Array final ordenado: ");
        for (int i = 0; i < temperatura.length; i++) {
            System.out.print(temperatura[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < matrizTemperatura.length; i++) {
            for (int j = 0; j < numeroTemperatura; j++) {
                // Evita que salga 4 espacios al principio
                // Metemos los numeros del array ordenado a la matriz
                if (i == 0) {
                    matrizTemperatura[i][j] = temperatura[j];
                }
                // Depende de la temperatura se clasifica
                if (i == 1) {
                    if (temperatura[j] < 0) {
                        matrizTemperatura[i][j] = 1;
                    } else if (temperatura[j] == 0) {
                        matrizTemperatura[i][j] = 2;
                    } else {
                        matrizTemperatura[i][j] = 3;
                    }
                }
                if (i == 2) {
                    if (temperatura[j] < -5 || temperatura[j] > 35) {
                        matrizTemperatura[i][j] = 1;
                    } else {
                        matrizTemperatura[i][j] = 0;
                    }
                }
                if (j == 0) {
                    System.out.print("Fila " + i + " : ");
                    System.out.print(matrizTemperatura[i][j]);
                } else {
                    System.out.printf("%4d", matrizTemperatura[i][j]);
                }
            }

            System.out.println();

        }
        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] < -5 || temperatura[i] > 35) {
                sumaTemperatura += temperatura[i];
                contadorSumaTemp++;
            }
        }
        mediaTemperatura = (contadorSumaTemp * 100) / temperatura.length;
        System.out.println("Porcentaje de temperaturas críticas: " + mediaTemperatura + "%");
        temperaturaMinima = temperatura[0];
        temperaturaMaxima = temperatura[0];
        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] < temperaturaMinima) {
                temperaturaMinima = temperatura[i];
            }
            if (temperatura[i] > temperaturaMaxima) {
                temperaturaMaxima = temperatura[i];
            }
        }
        System.out.println("Temperatura mínima: " + temperaturaMinima);
        System.out.println("Temperatura máxima: " + temperaturaMaxima);
    }
}
