/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConexionBD;

import java.sql.*;

/**
 *
 * @author MARIO
 */
public class ConexionBD {

    private static final String URL = "jdbc:mysql://localhost:3306/DBEjemplo";
    private static final String user = "root";
    private static final String password = "ejemplo1234";

    public static Connection connection() throws SQLException {
        return DriverManager.getConnection(URL, user, password);
    }
}
