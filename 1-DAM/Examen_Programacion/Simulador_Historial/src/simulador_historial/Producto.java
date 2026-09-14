/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador_historial;

/**
 *
 * @author Mario
 */
public class Producto {

    private String codigo;
    private String nombre;
    private Categoria categoria;
    private int cantidad;
    private double precioUnitario;

    public Producto(String codigo, String nombre, Categoria categoria, int cantidad, double precioUnitario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", categoria=" + categoria + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + '}';
    }

    public void añadirStock(int stock) {
        if (stock < 0) {
            cantidad += stock;
        }
    }

    public boolean disminuirStock(int stock) {
        if (cantidad > stock) {
            cantidad -= stock;
            return true;
        } else{
            return false;
        }
    }

}
