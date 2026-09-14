/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mario.sanper.2
 */
public class ConexionBD {

    private static String URL = "jdbc:mysql://localhost:3306/DBEjemplo";
    private static String usuario = "root";
    private static String contrasena = "ejemplo1234";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, usuario, contrasena);
    }
}
