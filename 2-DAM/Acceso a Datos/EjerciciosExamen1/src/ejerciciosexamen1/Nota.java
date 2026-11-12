/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosexamen1;

/**
 *
 * @author Mario
 */
import java.io.Serializable;

public class Nota implements Serializable {
    private static final long serialVersionUID = 1L;
    private String modulo;
    private double valor;

    public Nota(String modulo, double valor) {
        this.modulo = modulo;
        this.valor = valor;
    }

    public String getModulo() { return modulo; }
    public double getValor() { return valor; }

    @Override
    public String toString() {
        return "Nota{" + "modulo=" + modulo + ", valor=" + valor + '}';
    }
    
}
