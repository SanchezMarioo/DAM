/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Mario
 */
public class ProductoDAO {
    public void write(String linea) throws IOException{
        try(BufferedWriter writter = new BufferedWriter(new FileWriter("registro_reparaciones.txt",true))){
            writter.write(linea);
            writter.newLine();
        }
    }
}
