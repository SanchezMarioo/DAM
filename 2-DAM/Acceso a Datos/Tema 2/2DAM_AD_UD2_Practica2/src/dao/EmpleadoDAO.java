/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import ConexionBD.ConexionBD;
import Modelo.Empleado;
import Modelo.EmpleadoDepartamento;
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
            ps.setString(1, e.getDni());
            ps.setString(2, e.getNombre());
            ps.setString(3, e.getApellidos());
            ps.setString(4, e.getPuesto());
            ps.setString(5, e.getFechaAlta());
            ps.setDouble(6, e.getSalario());
            ps.setObject(7, e.getComision());
            ps.setInt(8, e.getIdDepartamento());
            return ps.executeUpdate() > 0;
        }
    }

    public Empleado filtrarPorDNI(String dni) throws SQLException {
        String sql = "SELECT * FROM empleados WHERE dni = ?";
        try (Connection connection = ConexionBD.conectar(); PreparedStatement ps = connection.prepareStatement(sql)) {

            ps.setString(1, dni);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Empleado(
                            rs.getString("dni"),
                            rs.getString("nombre"),
                            rs.getString("apellidos"),
                            rs.getString("puesto"),
                            rs.getString("fecha_alta"),
                            rs.getDouble("salario"),
                            rs.getDouble("comision"),
                            rs.getInt("id_departamento")
                    );
                }
            }
        }
        return null; // Si no encuentra ningún empleado con ese DNI
    }

    public boolean eliminarEmpleado(String dni) throws SQLException {
        String sql = "DELETE FROM empleados WHERE dni = ? ";
        try (Connection connection = ConexionBD.conectar(); PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, dni);
            return ps.executeUpdate() > 0;

        }
    }

    public boolean modificarSueldo(String dni, double salario) throws SQLException {
        String sql = "UPDATE empleados SET salario =  ?   where dni  = ?";
        try (Connection connection = ConexionBD.conectar(); PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setDouble(1, salario);
            ps.setString(2, dni);
            return ps.executeUpdate() > 0;

        }
    }

    public ArrayList<EmpleadoDepartamento> consultarEmpleadoDepartamento() throws SQLException {
        ArrayList<EmpleadoDepartamento> empleados = new ArrayList<>();
        // siempre poner espacios al final de cada linea si no peta
        String sql = "SELECT e.dni, e.nombre, e.apellidos, e.puesto, "
                + "d.nombre AS departamentoNombre, d.localidad "
                + "FROM empleados e "
                + "INNER JOIN departamentos d ON d.id_departamento = e.id_departamento";
        try (Connection connection = ConexionBD.conectar(); PreparedStatement ps = connection.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                empleados.add(new EmpleadoDepartamento(
                        rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("apellidos"),
                        rs.getString("puesto"),
                        rs.getString("departamentoNombre"),
                        rs.getString("localidad")
                ));
            }

        }
        return empleados;

    }

    public boolean actualizarEmpleadoDepartamento(String dni, int idDepartamento) throws SQLException {
        if (!existeDepartamento(idDepartamento)) {
            return false;
        }
        String sql = "UPDATE  empleados	SET id_departamento = ? WHERE dni = ? ";
        try (Connection connection = ConexionBD.conectar(); PreparedStatement ps = connection.prepareStatement(sql)) {
                ps.setInt(1, idDepartamento);
            ps.setString(2, dni);
            
            return ps.executeUpdate() > 0;
        }

    }

    public boolean existeDepartamento(int id) throws SQLException {
        String sql = "SELECT id_departamento FROM departamentos WHERE id_departamento = ?" ;
        try (Connection connection = ConexionBD.conectar(); PreparedStatement ps = connection.prepareStatement(sql);) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
}
