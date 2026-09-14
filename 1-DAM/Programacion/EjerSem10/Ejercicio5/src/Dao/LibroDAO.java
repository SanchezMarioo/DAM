/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import ConexionBD.ConexionBD;
import Modelo.Libro;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Mario
 */
public class LibroDAO {

    public ArrayList<Libro> getFirstLast() throws SQLException {
        ArrayList <Libro> libros = new ArrayList<>();
        try (Connection connect = ConexionBD.connect(); Statement stament = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); ResultSet set = stament.executeQuery("SELECT * FROM libros ORDER BY fecha_publicacion ASC")) {
            set.next();
            int idFirst = set.getInt("id");
            String tituloFirst = set.getString("titulo");
            String autorFirst = set.getString("autor");
            Date fecha = set.getDate("fecha_publicacion");
            byte disponible = set.getByte("disponible");
            libros.add(new Libro(idFirst, tituloFirst, autorFirst, fecha, disponible));
            set.afterLast();
            set.previous();
            int idLast = set.getInt("id");
            String tituloLast = set.getString("titulo");
            String autorLast = set.getString("autor");
            Date fechaLast = set.getDate("fecha_publicacion");
            byte disponibleLast = set.getByte("disponible");
            libros.add(new Libro(idLast, tituloLast, autorLast, fechaLast, disponibleLast));
        }
        return libros;
    }
}
