/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConexionBD.ConexionBD;
import Exceptions.AlumnoNotValid;
import Modelo.Alumno;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Mario
 */
/**
 *
 * @author Mario
 */
public class AlumnoDAO {

    public ArrayList<Alumno> select() throws SQLException {
        String query = "SELECT * FROM alumno";
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try (Connection connect = ConexionBD.connect(); Statement stament = connect.createStatement(); ResultSet set = stament.executeQuery(query)) {
            while (set.next()) {
                int id = set.getInt("id");
                String nombre = set.getString("nombre");
                String dni = set.getString("dni");
                alumnos.add(new Alumno(id, nombre, dni));
            }

        }
        return alumnos;
    }

    public void insert(Alumno alumno) throws SQLException, AlumnoNotValid {
        String query = "INSERT INTO alumno(id,nombre,dni) VALUES (" + alumno.getId() + "," + "\"" + alumno.getNombre() + "\"" + "," + "\"" + alumno.getDni() + "\"" + ");";
        int numero;
        try (Connection conect = ConexionBD.connect(); Statement sentencia = conect.createStatement();) {
            numero = sentencia.executeUpdate(query);

        }
        if (numero == 0) {
            throw new AlumnoNotValid("El alumno no existe");
        }
    }

    public void deleteFromID(int id) throws SQLException, AlumnoNotValid {
        String query = "DELETE FROM alumno WHERE id= " + id;
        int numero;
        try (Connection connect = ConexionBD.connect(); Statement sentecia = connect.createStatement();) {
            numero = sentecia.executeUpdate(query);

        }
        if (numero == 0) {
            throw new AlumnoNotValid("El alumno no existe");
        }
    }
}
