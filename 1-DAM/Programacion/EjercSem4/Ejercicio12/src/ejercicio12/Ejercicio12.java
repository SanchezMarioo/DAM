/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] letras = {'d', 'a', 'c', 'f', 'b', 'e'};
        for (int i = 0; i < letras.length - 1; i++) {
            for (int j = 0; j < letras.length - 1 - i; j++) {
                if (letras[j] > letras[j + 1]) {
                    char aux = letras[j + 1];
                    letras[j + 1] = letras[j];
                    letras[j] = aux;
                }
            }
        }
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i] + " ");
        }
    }

}
