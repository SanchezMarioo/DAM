public class Ordenadacion_Array {
    public static void main(String[] args) {
        int[] datos = {12, 3, 2, 45, 7, 1, 28, 9};
        for (int i = 0; i < datos.length; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < datos.length; j++) {
                if (datos[j] < datos[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            int aux = datos[indiceMinimo];
            datos[indiceMinimo] = datos[i];
            datos[i] = aux;
        }
        for (int i = 0; i < datos.length ; i++) {
            System.out.print(datos[i] + "\t");
        }
    }

}
