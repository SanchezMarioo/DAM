/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import modelo.Reserva;

/**
 *
 * @author MARIO
 */
public class ReservaDAO {

    public ArrayList<Reserva> lectura() throws FileNotFoundException, IOException {
        ArrayList<Reserva> reservas = new ArrayList<>();
        String linea = "";
        try (BufferedReader lector = new BufferedReader(new FileReader("reservas.txt"))) {
            while ((linea = lector.readLine()) != null) {
                int id = Integer.parseInt(contenido[0]);
                String[] contenido = linea.split(";");
                String nombreUsuario = contenido[1];
                String tituloUsuario = contenido[2];
                int diasReserva = Integer.parseInt(contenido[3]);
                reservas.add(new Reserva(id, nombreUsuario, tituloUsuario, diasReserva));
            }
        }
        return reservas;
    }

    public void escritura(Reserva r) throws IOException {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("reservas.txt", true))) {
            escritor.write(r.toString());
        }
    }

    public void borrarPorID(int id) throws IOException {
        ArrayList<Reserva> reservas = lectura();
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("reservas.txt"))) {
            for (Reserva reserva : reservas) {
                if (reserva.getId() != id) {
                    escritor.write(reserva.toString());
                }
            }
        }
    }

    public void crearFicheroEjemplo() {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("reservas.txt"))) {
            escritor.write("1;Ana García;El Quijote;14");
            escritor.newLine();
            escritor.write("2;Carlos Pérez;Cien años de soledad;7");
            escritor.newLine();
            escritor.write("3;Lucía Martín;La sombra del viento;21");
            escritor.newLine();
            escritor.write("4;Mario López;El nombre de la rosa;10");
            escritor.newLine();
            escritor.write("5;Elena Torres;1984;5");
            escritor.newLine();
            escritor.write("6;Javier Ruiz;Rayuela;30");
            escritor.newLine();
            escritor.write("7;Sofía Díaz;El principito;3");
            escritor.newLine();
            escritor.write("8;Pablo Sánchez;Los pilares de la tierra;14");
            escritor.newLine();
            escritor.write("9;Laura Gómez;Beloved;7");
            escritor.newLine();
            escritor.write("10;Diego Fernández;Don Quijote de la Mancha;21");
            escritor.newLine();
        } catch (IOException e) {
            System.out.println("Error al crear el fichero de ejemplo: " + e.getMessage());
        }
    }

}
