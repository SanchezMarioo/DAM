/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulador_votacion;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Simulador_Votacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String caracteres = "";
        String candidato = "";
        int contAna = 0, contLuis = 0, contOmar = 0, contNulos = 0;
        do {
            caracteres = sc.nextLine();
            if (caracteres.length() != 3) {
                candidato = sc.nextLine();
                if (candidato.equals("Ana")){
                    contAna++;
                } else if (candidato.equals("Luis")){
                    contLuis++;
                }  else if (candidato.equals("Omar")){
                    contOmar++;
                } else {
                    contNulos++;
                } 
            } else {
                contNulos++;
            }
        } while (!"FIN".equals(caracteres));
        System.out.println("Ana : " + contAna);
        System.out.println("Luis : " + contLuis);
        System.out.println("Omar : " + contOmar);
        System.out.println("Nulo : " + contNulos);
        
    }

}
