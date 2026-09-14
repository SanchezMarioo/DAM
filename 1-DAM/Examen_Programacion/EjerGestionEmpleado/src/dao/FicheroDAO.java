/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import modelo.Turno;

/**
 *
 * @author Mario
 */
public class FicheroDAO {
    public ArrayList <Turno> leerFichero() throws FileNotFoundException, IOException{
        ArrayList <Turno> turnos = new ArrayList<>();
        try(BufferedReader lector = new BufferedReader(new FileReader("turnos.txt"))){
            String linea;
            while((linea = lector.readLine()) != null){
                String campos[] = linea.split(";");
                String codigo = campos[0];
                LocalDate fecha = LocalDate.parse(campos[1]);
                int hora = Integer.parseInt(campos[2]);
                turnos.add(new Turno(codigo, fecha, hora));
            }
        }
        return turnos;
    }
    public 
}
