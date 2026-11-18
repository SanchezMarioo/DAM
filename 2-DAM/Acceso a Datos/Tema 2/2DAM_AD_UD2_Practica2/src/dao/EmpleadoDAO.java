/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConexionBD.ConexionBD;
import Modelo.Empleado;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author mario.sanper.2
 */
public class EmpleadoDAO {
    public boolean insertarEmpleado(Empleado e) throws SQLException{
        String sql = "INSERT INTO empleados VALUES (?,?,?,?,?,?,?,?)";
        try(Connection connection = ConexionBD.conectar();
                PreparedStatement ps = connection.prepareStatement(sql)){
            
        }
    }
}
