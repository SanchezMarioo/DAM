public class Bubble_Sort {
    public static void main(String[] args) {
        int[] datos = {12, 3, 2, 45, 7, 1, 28, 9};
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos.length - 1; j++) {
                if (datos[j] > datos[j + 1]) {
                    int aux = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + "\t");
        }
    }
}
