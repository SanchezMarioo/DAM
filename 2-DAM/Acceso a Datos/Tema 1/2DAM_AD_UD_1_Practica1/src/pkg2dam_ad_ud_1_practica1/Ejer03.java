/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2dam_ad_ud_1_practica1;

import java.io.File;

/**
 *
 * @author Mario
 */
public class Ejer03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File archivo = new File("2DAM/AD/P1.txt");
        File destino = new File("2DAM/AD/practica1.txt");
    }
    static void renombrarArchivo(File archivo,File destino){
        if(destino.renameTo(destino)){
            System.out.println("Se ha renombrado correctamente");
        } else{
            System.out.println("No se ha renombrado correctamente.");
        }
        
    }
}
