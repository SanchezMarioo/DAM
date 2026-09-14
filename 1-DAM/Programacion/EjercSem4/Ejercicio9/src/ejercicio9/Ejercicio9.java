/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] datos = {12, 3, 2, 45, 7, 1, 28, 9};
        for (int i = 0; i < datos.length - 1; i++) {
            System.out.println(datos[i]);
            for (int j = 0; j < datos.length - 1 - i; j++) {
                if (datos[j] > datos[j + 1]) {
                    int aux = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = aux;
                    System.out.print("Intercambio (pos" + j + " y " + (j + 1) + ")" + "[");
                    for (int k = 0; k < datos.length - 1; k++) {
                        System.out.print(datos[k]);
                        if (k < datos.length - 1) {
                            System.out.print(",");
                        }

                    }
                    System.out.print("]\n");
                }
            }
        }
        for (int i = 0; i < datos.length - 1; i++) {
            System.out.print(datos[i] + " ");
        }
    }

}
