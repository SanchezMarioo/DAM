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
 * @author Mario
 */
public class ConexionBD {
    private static String url = "jdbc:mysql://localhost:3306/DBEjemplo";
    private static String user = "root";
    private static String password = "ejemplo1234";
    
    
    public static Connection conectar() throws SQLException{
        return DriverManager.getConnection(url, user, password);
    }
}
