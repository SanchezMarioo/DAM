/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mario.sanper.2
 */
public class EmpresaDAO {

    public ArrayList<Empleado> mostrarEmpleados() throws SQLException {
        String sql = "SELECT * from empleados";
        ArrayList<Empleado> empleados = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar(); 
                PreparedStatement statament = conn.prepareStatement(sql); 
                ResultSet set = statament.executeQuery()) {
            while (set.next()) {
                empleados.add(new Empleado(
                        set.getString("dni"),
                        set.getString("nombre"),
                        set.getString("apellidos"),
                        set.getString("puesto"),
                        set.getString("fecha_alta"),
                        set.getDouble("salario"),
                        set.getDouble("comision"),
                        set.getInt("id_departamento")
                ));
            }
        } 
        return empleados;
    }

    public ArrayList<Empleado> filtrarPorDni(String dni) throws SQLException {
        String sql = "SELECT * from empleados WHERE dni = ?";
        ArrayList<Empleado> empleados = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar();
                PreparedStatement statament = conn.prepareStatement(sql);) {
            statament.setString(1, dni);
            try (ResultSet set = statament.executeQuery()) {
                while (set.next()) {
                    empleados.add(new Empleado(
                            set.getString("dni"),
                            set.getString("nombre"),
                            set.getString("apellidos"),
                            set.getString("puesto"),
                            set.getString("fecha_alta"),
                            set.getDouble("salario"),
                            set.getDouble("comision"),
                            set.getInt("id_departamento")
                    ));
                }
            }

        } 
        return empleados;
    }

    public ArrayList<Empleado> filtrarPorSalarioSuperior(double salario) throws SQLException {
        String sql = "SELECT * from empleados WHERE salario > ?";
        ArrayList<Empleado> empleados = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar();
                PreparedStatement statament = conn.prepareStatement(sql);) {
            statament.setDouble(1, salario);
            try (ResultSet set = statament.executeQuery()) {
                while (set.next()) {
                    empleados.add(new Empleado(
                            set.getString("dni"),
                            set.getString("nombre"),
                            set.getString("apellidos"),
                            set.getString("puesto"),
                            set.getString("fecha_alta"),
                            set.getDouble("salario"),
                            set.getDouble("comision"),
                            set.getInt("id_departamento")
                    ));
                }
            }

        } 
        return empleados;
    }

    public ArrayList<Empleado> filtrarPorSalarioInferior(double salario) throws SQLException {
        String sql = "SELECT * from empleados WHERE salario <= ?";
        ArrayList<Empleado> empleados = new ArrayList<>();
        try (Connection conn = ConexionBD.conectar(); 
            PreparedStatement statament = conn.prepareStatement(sql);) {
            statament.setDouble(1, salario);
            try (ResultSet set = statament.executeQuery()) {
                while (set.next()) {
                    empleados.add(new Empleado(
                            set.getString("dni"),
                            set.getString("nombre"),
                            set.getString("apellidos"),
                            set.getString("puesto"),
                            set.getString("fecha_alta"),
                            set.getDouble("salario"),
                            set.getDouble("comision"),
                            set.getInt("id_departamento")
                    ));
                }
            }

        } 
        return empleados;
    }

}
