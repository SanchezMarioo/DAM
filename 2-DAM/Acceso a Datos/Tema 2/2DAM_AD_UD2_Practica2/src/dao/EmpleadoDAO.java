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

    public boolean insertarEmpleado(Empleado e) throws SQLException {
        String sql = "INSERT INTO empleados VALUES (?,?,?,?,?,?,?,?)";
        try (Connection connection = ConexionBD.conectar(); PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(0, e.getDni());
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApellidos());
            ps.setString(3, e.getPuesto());
            ps.setString(4, e.getFechaAlta());
            ps.setDouble(5, e.getSalario());
            if(e.ge)
                ps.setNull(6, e.getComision());

            
            ps.setInt(7, e.getIdDepartamento());

            return ps.executeUpdate() > 0;
        }

    }
}
