/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos = {12, 3, 2, 45, 7, 1, 28, 9};
        for (int i = 0; i < datos.length - 1; i++) {
            int indiceMin = i;
            for (int j = i + 1; j < datos.length; j++) {
                if (datos[j] < datos[indiceMin]) {
                    indiceMin = j;
                }
            }
            int aux = datos[indiceMin];
            datos[indiceMin] = datos[i];
            datos[i] = aux;
            System.out.print("Intercambio" + indiceMin + " y " + i);
            System.out.println();
        }
        for (int i = 0; i < datos.length - 1; i++) {
            System.out.print(datos[i] + " ");
        }
    }

}
