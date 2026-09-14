/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author MARIO
 */
public class AlumnoDAO {

    private final static String RUTA = "notasAlumnos.txt";

    public ArrayList<Alumno> lectura() throws IOException, NotaNoValidaException {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try (BufferedReader lectura = new BufferedReader(new FileReader(RUTA))) {
            String texto;
            while ((texto = lectura.readLine()) != null) {
                String[] partes = texto.split(";");
                if (partes.length == 2) {
                    String nombreAlumno = partes[0];
                    double nota = Double.parseDouble(partes[1]);
                    alumnos.add(new Alumno(nombreAlumno, nota));
                } else {
                    throw new IOException("Error al leer el archivo");
                }

            }
        }
        return alumnos;
    }

    public static String getRUTA() {
        return RUTA;
    }

    public void escritura(String texto) throws IOException {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(RUTA, true))) {
            escritor.write(texto);

        }
    }

    public void escritura(ArrayList<Alumno> texto) throws IOException {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(RUTA))) {
            for (Alumno alumno : texto) {
                escritor.write(alumno.toFile());
            }

        }
    }

    public void limpiarArchivo() throws IOException {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(RUTA))) {
            escritor.write("");

        }
    }
}
