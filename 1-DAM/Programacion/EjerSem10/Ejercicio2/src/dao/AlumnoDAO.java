/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConexionBD.ConexionBD;
import Modelo.Alumno;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mario.sanper.2
 */
public class AlumnoDAO {

    public ArrayList<Alumno> select() throws SQLException {
        String query = "SELECT * from alumno";
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        try (Connection con = ConexionBD.getConexion(); Statement setencia = con.createStatement(); ResultSet set = setencia.executeQuery(query)) {

            while (set.next()) {
                int id = set.getInt("id");
                String nombre = set.getString("nombre");
                String dni = set.getString("dni");
                alumnos.add(new Alumno(id, nombre, dni));
            }
        }
        return alumnos;
    }

}
