/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Model.Empleado;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class EmpleadoDAO {

    public ArrayList<Empleado> read() throws FileNotFoundException, IOException {
        ArrayList <Empleado> empleados = new ArrayList<>();
        String linea;
        try (BufferedReader lector = new BufferedReader(new FileReader("empleados.txt"))) {
            while ((linea = lector.readLine()) != null) {
                String[] campos = linea.split(";");
                int id = Integer.parseInt(campos[0]);
                String nombre = campos[1];
                LocalDate fechaNacimiento = LocalDate.parse(campos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalDate fechaIncorporacion = LocalDate.parse(campos[3],DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                empleados.add(new Empleado(id, nombre, fechaNacimiento, fechaIncorporacion));
            }
        }
        return empleados;
    }
}
