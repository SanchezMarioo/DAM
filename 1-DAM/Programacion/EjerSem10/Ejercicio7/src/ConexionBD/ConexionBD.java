/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBD;
import java.sql.*;
/**
 *
 * @author mario.sanper.2
 */
public class ConexionBD {
    private final static String URL = "jdbc:mysql://localhost:3306/RegistrosEmails";
    private final static String user = "root";
    private final static String password = "ejemplo1234";
    
    public static Connection connect() throws SQLException{
        return DriverManager.getConnection(URL, user, password);
    }
}
