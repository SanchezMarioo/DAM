/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulador_historial;

import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class Inventario {

    private final int MAX_PRODUCTOS = 50;
    private Producto stockProducto[];
    private ArrayList<Movimiento> movimientos = new ArrayList<>();
    private int contadorProductos = 0;

    public Inventario() {
        stockProducto = new Producto[MAX_PRODUCTOS];
        movimientos = new ArrayList<>();
    }

    public boolean validarCodigo(String codigo) {
        return codigo.matches("[A-Z]{2}-\\d{4}");
    }

    public boolean añadirProducto(Producto p) {
        if (p == null) {
            return false;
        } else {
            stockProducto[contadorProductos] = p;
            contadorProductos++;
            return true;
        }
    }

    public Producto buscarPorCodigo(String codigo) {
        for (Producto producto : stockProducto) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
    }

    public ArrayList<Producto> buscarPorNombre(String fragmento) {
        ArrayList<Producto> listaCoincidencias = new ArrayList<>();
        for (Producto producto : stockProducto) {
            if (producto.getNombre().contains(fragmento)) {
                listaCoincidencias.add(producto);
            }
        }
        return listaCoincidencias;
    }

    public void registrarEntrada(String codigo, int cantidad, int d, int m, int a) {
        movimientos.add(new Movimiento(codigo, codigo, cantidad, a, m, a));
    }

    public boolean registrarSalida(String codigo, int cantidad, int d, int m, int a) {
        Producto producto = buscarPorCodigo(codigo);
        if(producto != null){
            if(producto.disminuirStock(cantidad)){
                return true;
            }
        }
        return false;
    }
