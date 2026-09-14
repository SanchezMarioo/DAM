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

    private static final String URL = "jdbc:mysql://localhost:3307/DBEjemplo";
    private static final String USUARIO  = "root";
    private static final String PASSWORD = "ejemplo1234";
    
    public static Connection getConexion() throws SQLException{
        return DriverManager.getConnection(URL, USUARIO, PASSWORD);
    }
}
