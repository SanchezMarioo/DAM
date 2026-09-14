import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int longitudArray = sc.nextInt();
        int arrayNumeros[] = new int[longitudArray];
        int numeroMaximo = 0;
        for (int i = 0; i < arrayNumeros.length; i++) {
            int numeroAñadir = sc.nextInt();
            arrayNumeros[i] = numeroAñadir;
        }
        numeroMaximo = arrayNumeros[0];
        for (int i = 0; i < arrayNumeros.length; i++) {
            if (arrayNumeros[i] > numeroMaximo) {
                numeroMaximo = arrayNumeros[i];
            }
        }
        System.out.println(numeroMaximo);
        for (int i = 0; i < arrayNumeros.length; i++) {
            for (int j = 0; j < arrayNumeros.length - 1; j++) {
                if (arrayNumeros[j] > arrayNumeros[j + 1]) {
                    int aux = arrayNumeros[j];
                    arrayNumeros[j] = arrayNumeros[j + 1];
                    arrayNumeros[j + 1] = aux;

                }
            }
        }
        for (int i = 0; i < arrayNumeros.length; i++) {
            int principio = (numeroMaximo - arrayNumeros[i]) / 2;
            int fin = (numeroMaximo - principio) - arrayNumeros[i];
            for (int j = 0; j < principio; j++) {
                int contador= 0;
                contador++;
                System.out.print(" ");
            }
            for (int j = 0; j < arrayNumeros[i]; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < fin; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < numeroMaximo; i++) {
            System.out.print(i + " ");
        }
    }
}