/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador_historial;

/**
 *
 * @author Mario
 */
public class Movimiento {

    private String codProducto;
    private String tipo;
    private int cantidad;
    private int dia;
    private int mes;
    private int anio;

    public Movimiento(String codProducto, String tipo, int cantidad, int dia, int mes, int anio) {
        this.codProducto = codProducto;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String getCodProducto() {
        return codProducto;
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
        } else {
            return false;
        }
    }

}
