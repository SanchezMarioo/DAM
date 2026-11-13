/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.DriverManager;
import java.sql.Driver;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author mario.sanper.2
 */
public class ConexionBD {

    public static Connection conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/empresa";
        String user = "root";
        String pass = "1234";
        return DriverManager.getConnection(url, user, pass);
    }
    
}
