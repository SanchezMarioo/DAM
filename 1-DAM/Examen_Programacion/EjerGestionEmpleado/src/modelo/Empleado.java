/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Mario
 */
public class Empleado {

    private String codigo;
    private String nombre;
    private String apellidos;
    private String categoria;
    private double salarioHora;
    private int totalHoras;
    private double salarioBruto;

    public Empleado(String codigo, String nombre, String apellidos, String categoria, double salario_hora) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.categoria = categoria;
        this.salarioHora = salario_hora;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setTotalHoras(int totalHoras) {
        this.totalHoras = totalHoras;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public int getTotalHoras() {
        return totalHoras;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }
    
}
