/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import ConexionBD.ConexionBD;
import Modelo.EmailModel;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Mario
 */
public class EmailDAO {

    public boolean insert(EmailModel correo) throws SQLException {
        String insert = "INSERT INTO registros(email,fecha) VALUES (?,?)";
        try (Connection connect = ConexionBD.connect(); PreparedStatement statament = connect.prepareStatement(insert)) {
            statament.setString(1, correo.getNombre());
            statament.setTimestamp(2, Timestamp.valueOf(correo.getFecha()));
            return statament.executeUpdate() > 0;
        }
    }

    public boolean existeCorreo(String correo) throws SQLException {
        String select = "SELECT COUNT(*) AS cuenta FROM registros WHERE email = ?";
        try (Connection connect = ConexionBD.connect(); PreparedStatement statement = connect.prepareStatement(select)) {
            statement.setString(1, correo);
            try (ResultSet set = statement.executeQuery()) {
                if (set.next()) {
                    int cuenta = set.getInt("cuenta");
                    return cuenta > 0;
                }
            }

            return false;

        }
    }

    public int delete(String correo) throws SQLException {
        String queryDelete = "DELETE FROM registros WHERE email = ?";
        try (Connection connect = ConexionBD.connect(); PreparedStatement statament = connect.prepareStatement(queryDelete);) {
            statament.setString(1, correo);
            return statament.executeUpdate();
        }
    }

    public ArrayList<String> selectCorreos() throws SQLException {
        ArrayList<String> correos = new ArrayList<>();
        String query = "SELECT * FROM registros";
        try (Connection connect = ConexionBD.connect(); PreparedStatement statament = connect.prepareStatement(query); ResultSet set = statament.executeQuery()) {
            while (set.next()) {
                String correo = set.getString("email");
                correos.add(correo);
            }
        }
        return correos;
    }
}
