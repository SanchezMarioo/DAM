/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author mario.sanper.2
 */
public class ConsultasSQL {
    public ArrayList<Libro> consultar(){
        String consulta = "SELECT * FROM libros";
        ArrayList<Libro> libros = new ArrayList<>();
        try (Connection con = ConexionBBDD.conexion();
             Statement sentencia = con.createStatement();
             ResultSet rs = sentencia.executeQuery(consulta)) {

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
}
