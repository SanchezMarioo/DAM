/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author mario.sanper.2
 */
public class Circulo extends Figura {

    private double radio;

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }
    

    public double calcularArea() {
        return Math.PI * (radio * radio);
    }
    public void cambiarColor(String color){
        this.color = color;
    }
    public void mostrarInformacion(){
        System.out.println(radio);
        System.out.println(color);
        System.out.printf("%.2f%n",calcularArea());
        
    }
}
