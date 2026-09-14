/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionbd;
import java.sql.*;
/**
 *
 * @author Mario
 */
public class ConexionBD {

    private final static String URL = "jdbc:mysql://localhost:3306/DBEmpleados";
    private final static String user = "root";
    private static final String password = "ejemplo1234";
    
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL, user, password);
    }
}
