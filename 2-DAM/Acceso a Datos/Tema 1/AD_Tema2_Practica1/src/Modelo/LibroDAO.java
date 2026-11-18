/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
/**
 *
 * @author mario.sanper.2
 */
public class LibroDAO {

    public ArrayList<Libro> selectTodosLibros() {
        String consulta = "SELECT * FROM libros";
        ArrayList<Libro> libros = new ArrayList<>();
        try (Connection con = ConexionBBDD.conexion(); Statement sentencia = con.createStatement(); ResultSet rs = sentencia.executeQuery(consulta)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                int anio = rs.getInt("anio");
                boolean disponible = rs.getBoolean("disponible");
                libros.add(new Libro(id, titulo, autor, anio, disponible));
            }
            return libros;
        } catch (SQLException ex) {
            System.out.println("Error en la consulta: " + ex.getMessage());
        }
        return libros;
    }

    public ArrayList<Libro> filtrarEntreAños(int añoIncio, int añoFin) {
        String consulta = "SELECT titulo, anio FROM libros WHERE anio > ? AND anio < ?";
        ArrayList<Libro> libros = new ArrayList<>();
        try (Connection con = ConexionBBDD.conexion(); PreparedStatement sentencia = con.prepareStatement(consulta)) {
            sentencia.setInt(1,añoIncio);
            sentencia.setInt(2,añoFin);
            try(ResultSet rs = sentencia.executeQuery()){
                while(rs.next()){
                    libros.add(new Libro(
                            rs.getString("titulo"), rs.getInt("anio")
                    ));
                    
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return libros;
    }
}
