/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio26;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la frase: ");
        String frase = sc.nextLine();
        String[] fraseCortada = frase.split(" ");
        String fraseSinEspacios = fraseSinEspacios(fraseCortada);
        boolean esPalindroma =compararFrase(fraseSinEspacios);
        if(esPalindroma){
            System.out.println("Es palindroma");
        } else{
            System.out.println("NO lo es ");
        }
    }

    static String fraseSinEspacios(String[] fraseCortada) {
        String fraseSinEspacios = "";
        for (int i = 0; i < fraseCortada.length; i++) {
            fraseSinEspacios += fraseCortada[i];
        }
        return fraseSinEspacios.toLowerCase();
    }

    static boolean compararFrase(String fraseSinEspacios) {
        String fraseReves = "";
        for (int i = fraseSinEspacios.length() - 1; i >= 0; i--) {
            fraseReves+=fraseSinEspacios.charAt(i);
        }
        if(fraseSinEspacios.equals(fraseReves)){
            return true;
        } else{
            return false;
        }
    }

}
