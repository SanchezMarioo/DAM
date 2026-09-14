/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConexionBD.ConexionBD;
import java.util.ArrayList;
import modelo.Libro;
import java.sql.*;
import java.time.LocalDate;

/**
 *
 * @author MARIO
 */
public class BibliotecaDAO {

    public ArrayList<Libro> select() throws SQLException {

        ArrayList<Libro> libros = new ArrayList<>();
        String sentencia = "SELECT * FROM libros";
        try (Connection connection = ConexionBD.connection(); PreparedStatement statament = connection.prepareStatement(sentencia); ResultSet resultado = statament.executeQuery()) {
            while (!resultado.next()) {
                int id = resultado.getInt("id");
                String titulo = resultado.getString("titulo");
                String autor = resultado.getString("autor");
                LocalDate fechaCompra = resultado.getDate("fecha_compra").toLocalDate();
                double precio = resultado.getDouble("precio");
                libros.add(new Libro(id, titulo, autor, fechaCompra, precio));
            }
            return libros;
        }
    }
}
