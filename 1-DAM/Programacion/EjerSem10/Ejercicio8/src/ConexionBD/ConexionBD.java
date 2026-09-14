/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBD;
import java.sql.*;
/**
 *
 * @author Mario
 */
public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3308/RegistrosEmails";
    private static final String USER = "root";
    private static final String PASSWORD = "ejemplo1234";
    public static Connection connect() throws SQLException{
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
