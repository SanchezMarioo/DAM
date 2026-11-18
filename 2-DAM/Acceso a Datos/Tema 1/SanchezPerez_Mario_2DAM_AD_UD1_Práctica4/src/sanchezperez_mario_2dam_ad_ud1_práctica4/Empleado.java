/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sanchezperez_mario_2dam_ad_ud1_práctica4;

/**
 *
 * @author mario.sanper.2
 */
public class Empleado {
    private String nif;       // 9 caracteres
    private String nombre;    // 10 caracteres
    private String apellidos; // 10 caracteres
    private double salario;   // 8 bytes

    public Empleado(String nif, String nombre, String apellidos, double salario) {
        this.nif = ajustarTamano(nif, 9);
        this.nombre = ajustarTamano(nombre, 10);
        this.apellidos = ajustarTamano(apellidos, 10);
        this.salario = salario;
    }

    // Método auxiliar para ajustar cadenas a un tamaño fijo rellenando con espacios
    private String ajustarTamano(String texto, int tamano) {
        if (texto == null) {
            texto = "";
        }
        if (texto.length() > tamano) {
            return texto.substring(0, tamano);
        }
        return String.format("%-" + tamano + "s", texto);
    }

    public String getNif() { return nif.trim(); }
    public void setNif(String nif) { this.nif = ajustarTamano(nif, 9); }

    public String getNombre() { return nombre.trim(); }
    public void setNombre(String nombre) { this.nombre = ajustarTamano(nombre, 10); }

    public String getApellidos() { return apellidos.trim(); }
    public void setApellidos(String apellidos) { this.apellidos = ajustarTamano(apellidos, 10); }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}