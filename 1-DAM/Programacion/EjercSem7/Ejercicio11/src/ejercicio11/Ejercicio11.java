/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String codigo;
        do {
            codigo = sc.nextLine();
            if(codigo.equals("FIN")){
                break;
            }
            if(ValidarTexto.comprobarTexto(codigo)){
                System.out.println("Codigo valido.");
            } else{
                System.out.println("Codigo invalido");
            }
        } while (!codigo.equals("FIN"));
        sc.close();
    }
    
}
