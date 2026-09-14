/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import conexionbd.ConexionBD;
import modelo.Empleado;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class EmpleadoDAO {

    public Empleado selectLastEmpleado() throws SQLException {
        String query = "SELECT * FROM empleados";
        try (Connection conexion = ConexionBD.getConnection(); PreparedStatement statment = conexion.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); ResultSet set = statment.executeQuery()) {
            if (set.last()) {
                String codigo = set.getString("codigo");
                String nombre = set.getString("nombre");
                String apellidos = set.getString("apellidos");
                String categoria = set.getString("categoria");
                double salarioHora = set.getDouble("salario_hora");
                return new Empleado(codigo, nombre, apellidos, categoria, salarioHora);
            }
        }
        return null;
    }

    public ArrayList<Empleado> select() throws SQLException {
        ArrayList <Empleado> empleados = new ArrayList<>();
        String query = "SELECT * FROM empleados";
        try (Connection conexion = ConexionBD.getConnection(); PreparedStatement statment = conexion.prepareStatement(query, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY); ResultSet set = statment.executeQuery()) {

            if (set.next()) {
                String codigo = set.getString("codigo");
                String nombre = set.getString("nombre");
                String apellidos = set.getString("apellidos");
                String categoria = set.getString("categoria");
                double salarioHora = set.getDouble("salario_hora");
                
                empleados.add(new Empleado(codigo, nombre, apellidos, categoria, salarioHora));
            }
        }
        return empleados;
    }

}
