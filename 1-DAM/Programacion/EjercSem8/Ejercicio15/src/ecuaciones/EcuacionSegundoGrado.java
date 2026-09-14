/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecuaciones;

/**
 *
 * @author MARIO
 */
public class EcuacionSegundoGrado extends Ecuacion {

    public EcuacionSegundoGrado(int a, int b, int c) {
        super(a, b, c);
    }

    @Override
    public double calcularDiscriminante() {
        return getB() * getB() - 4 * getA() * getC();
    }

    @Override
    public String obtenerSoluciones() {
        if(getA() == 0){
            return "No es una ecuacion de segundo grado";
        }
        if (calcularDiscriminante() == 0) {
            double x = (-getB()) / (2 * getA());
            return "La solucion es: " + x;
        } else if (esDiscriminantePositivo()) {
            double x1 = (-getB() + Math.sqrt(calcularDiscriminante())) / (2 * getA());
            double x2 = (-getB() - Math.sqrt(calcularDiscriminante())) / (2 * getA());
            return "Soluciones: " + x1 + " y " + x2;
        } else {
            return "No hay soluciones disponibles";
        }
    }

}
