/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] palabra = {'p', 'o', 'r', 'g', 'a', 'm', 'r', 'a'};
        int comparaciones = 0;
        for (int i = 0; i < palabra.length - 1; i++) {
            int indiceMin = i;
            for (int j = i + 1; j < palabra.length; j++) {
                if (palabra[j] < palabra[indiceMin]) {
                    comparaciones++;
                    indiceMin = j;
                }
                char aux = palabra[indiceMin];
                palabra[indiceMin] = palabra[i];
                palabra[i] = aux;

            }
        }
        for (int i = 0; i < palabra.length; i++) {
            System.out.print(palabra[i] + " ");
            
        }
        System.out.println("\n" + comparaciones);

    }

}
