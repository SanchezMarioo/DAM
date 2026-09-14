package ejercicio15;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MARIO
 */
public class Hora {

    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public void avanzarSegundos(int n) {
        for (int i = 0; i < n; i++) {
            if (segundo < 59) {
                segundo++;
            } else if (segundo == 59) {
                minuto++;
                segundo = 0;
            }
            if (minuto == 60) {
                minuto = 0;
                hora++;
            }
            if (hora == 24) {
                hora = 0;
            }
            System.out.printf("%02d:%02d:%02d %n", hora, minuto, segundo);
        }

    }
}
