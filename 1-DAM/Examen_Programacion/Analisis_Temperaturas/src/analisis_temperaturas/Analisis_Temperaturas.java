/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisis_temperaturas;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Analisis_Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroDias = 0;
        int contador = 0;
        int temp = 0;
        int hum = 0;
        String codigo = "";
        int[] arrayTemperaturas = new int[7];
        int[] arrayHum = new int[7];
        String[] arrayCodigo = new String[7];
        int tempMaxima = 0;
        int tempMinima = 0;
        int humedadMedia = 0;
        int primerCAL = 0;
        int vientoNorte = 0;
        int codigoCorrecto = 0;
        int estable = 0;
        int frio = 0;
        int calido = 0;
        int humedosExtremos = 0;
        int otros = 0;
        int porcentajeEstable = 0;
        boolean tendeciaAscedente = false;
        boolean encontroCAL = false;
        boolean tempEstable = false;
        boolean humedadEstable = false;
        int sumaMediaHumedad = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el numero de dias: ");
        numeroDias = sc.nextInt();
        System.out.println("Escribe lo siguente (temp hum codigo) : " + numeroDias + " veces");
        do {
            temp = sc.nextInt();
            arrayTemperaturas[contador] = temp;
            hum = sc.nextInt();
            arrayHum[contador] = hum;
            codigo = sc.next();
            arrayCodigo[contador] = codigo;

            contador++;
        } while (numeroDias != contador);

        // Haremos un for para recorrer el array y sacar todo lo relacionado con las temperatiras
        for (int i = 0; i < arrayTemperaturas.length; i++) {
            tempEstable = false;
            humedadEstable = false;
            if (i == 0) {
                tempMaxima = arrayTemperaturas[i];
                tempMinima = arrayTemperaturas[i];

            }
            if (tempMaxima < arrayTemperaturas[i]) {
                tempMaxima = arrayTemperaturas[i];
            }
            if (tempMinima > arrayTemperaturas[i]) {
                tempMinima = arrayTemperaturas[i];
            }
            if (!encontroCAL) {
                if (arrayCodigo[i].equals("CAL")) {
                    primerCAL = i;
                    encontroCAL = true;
                }
            }
            char letraUltima = arrayCodigo[i].charAt(0);
            if (letraUltima == 'N') {
                vientoNorte = i;
            }

            tempEstable = (arrayTemperaturas[i] >= 15 && arrayTemperaturas[i] < 25) ? true : false;
            humedadEstable = (arrayHum[i] >= 40 && arrayHum[i] < 60) ? true : false;

            if (tempEstable && humedadEstable) {
                estable++;
                continue;
            }
            if (arrayHum[i] > 80) {
                humedosExtremos++;
                continue;
            }
            if (arrayTemperaturas[i] < 15) {
                frio++;
                continue;
            }
            if (arrayTemperaturas[i] > 25) {
                calido++;
                continue;
            }

        }
        // Hallar humedad media
        for (int j = 0; j < arrayHum.length; j++) {
            sumaMediaHumedad += arrayHum[j];
        }
        humedadMedia = sumaMediaHumedad / 7;
        porcentajeEstable = (estable * 100) / 7;
        System.out.println("Temp maxima " + tempMaxima);
        System.out.println("Temp minima " + tempMinima);
        System.out.println("Humedad media : " + humedadMedia);
        System.out.println("Primer CAL: dia " + (primerCAL + 1));
        System.out.println("Ultimo viento norte: dia " + (vientoNorte + 1));
        System.out.println("Estables : " + estable);
        System.out.println("Frios : " + frio);
        System.out.println("Calido : " + calido);
        System.out.println("Porcentaje estables: " + porcentajeEstable);
        System.out.println("Humedos extremos: " + humedosExtremos);

    }

}
