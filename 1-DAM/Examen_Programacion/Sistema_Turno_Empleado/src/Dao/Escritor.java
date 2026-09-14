/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Modelo.Empleado;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author MARIO
 */
public class Escritor {
    
    public ArrayList <Empleado> escritor(String ruta) throws IOException{
        ArrayList <Empleado> empleados = new ArrayList<>();
        try(BufferedReader lector = new BufferedReader(new FileReader(ruta))){
            String linea;
            while((linea = lector.readLine() ) != null){
                String texto[] = linea.split(linea);
                LocalDate LocalDate.parse(linea);
            }
        }
        return empleados;
    }
    public void escribirEnFichero(String texto, String rutaSalida) throws IOException{
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(rutaSalida,true))){
            escritor.write(texto);
            escritor.newLine();
  
            
        }
    }
}
