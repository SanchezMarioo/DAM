package ConexionBD;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author mario.sanper.2
 */
public class ConexionBD {

    public static Connection conectarServidor() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
    }

    public static Connection conectar() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/torneo", "root", "");
    }
}
