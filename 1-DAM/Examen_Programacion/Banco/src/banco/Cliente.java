/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author Mario
 */
public class Cliente {
    private String nombre;
    private double saldo;
    private Banco banco;

    public double getSaldo() {
        return saldo;
    }

    public String getNombre() {
        return nombre;
    }
    public void consultarSaldo(){
        System.out.println("Dinero: " + saldo);
    }
    public void enviarDinero(double cantidad, Cliente destinatario){
        banco.transferir(this, destinatario, cantidad);
    }
    public void recibirTransferencia(double cantidad){
        this.saldo+=cantidad;
    }
    public void decrementarSaldo(double cantidad){
        this.saldo-=cantidad;
    }
}
