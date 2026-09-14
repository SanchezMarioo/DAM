import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros = sc.nextInt();
        int datos[] = new int[numeros];
        int pares = 0;
        int impares = 0;
        int contadorPares = 0;
        int contadorImpares = 0;

        // Contamos pares e impares para calcular la array y añadimos a la array principal
        for (int i = 0; i < datos.length; i++) {
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
            datos[i] = numero;
        }
        int paresArray[] = new int[pares];
        int imparesArray[] = new int[impares];
        for (int i = 0; i < datos.length; i++) {
            if (datos[i] % 2 == 0) {
                paresArray[contadorPares] = datos[i];
                contadorPares++;

            } else {
                imparesArray[contadorImpares] = datos[i];
                contadorImpares++;
            }
        }
        for (int i = 0; i < paresArray.length; i++) {
            for (int j = 0; j < paresArray.length - 1; j++) {
                if (paresArray[j] < paresArray[j + 1]) {
                    int aux = paresArray[j];
                    paresArray[j] = paresArray[j + 1];
                    paresArray[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < paresArray.length; i++) {
            System.out.print(paresArray[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < imparesArray.length; i++) {
            for (int j = 0; j < imparesArray.length - 1; j++) {
                if (imparesArray[j] > imparesArray[j + 1]) {
                    int aux = imparesArray[j + 1];
                    imparesArray[j + 1] = imparesArray[j];
                    imparesArray[j] = aux;

                }
            }
        }
        for (int i = 0; i < imparesArray.length; i++) {
            System.out.print(imparesArray[i] + "\t");
        }
        contadorPares = 0;
        contadorImpares = 0;
        for (int i = 0; i < datos.length; i++) {
            if (i % 2 == 0 && contadorPares < paresArray.length) {
                datos[i] = paresArray[contadorPares];
                contadorPares++;
            } else if(contadorImpares < imparesArray.length) {
                datos[i] = imparesArray[contadorImpares];
                contadorImpares++;
            }
        }
        System.out.println();
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + "\t");
        }
    }
}