/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author mario.sanper.2
 */
public class ConexionBBDD {
    public static Connection conexion() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "1234");
    }
}
