/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuaciones;

/**
 *
 * @author MARIO
 */
public abstract class Ecuacion implements Solucion{
    private int a;
    private int b;
    private int c;

    public Ecuacion(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    public abstract double calcularDiscriminante();
    public boolean esDiscriminantePositivo(){
        return calcularDiscriminante() > 0;
    }
    
}
