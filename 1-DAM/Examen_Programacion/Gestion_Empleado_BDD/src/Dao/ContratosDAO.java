/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;
import ConexionBD.ConexionBD;
import Model.Contrato;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author Mario
 */
public class ContratosDAO {
    public ArrayList <Contrato> select() throws SQLException{
        ArrayList <Contrato> contratos = new ArrayList<>();
        try(Connection connect = ConexionBD.conectar();Statement sentencia = connect.createStatement();
            ResultSet set = sentencia.executeQuery("SELECT * FROM contratos")){
            while(!set.next()){
                int idContrato = set.getInt("id_contrato");
                int idEmpleado = set.getInt("id_empleado");
                String tipo = set.getString("tipo");
                LocalDate fechaIncio = set.getDate("fecha_inicio").toLocalDate();
                LocalDate fechaFin = set.getDate("fecha_fin").toLocalDate();
                contratos.add(new Contrato(idContrato, idEmpleado, tipo, fechaIncio, fechaFin));
            }
            
        }
        return contratos;
    }
}
