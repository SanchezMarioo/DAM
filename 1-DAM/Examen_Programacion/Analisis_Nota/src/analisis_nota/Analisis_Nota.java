/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analisis_nota;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Analisis_Nota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numeroAlumno = sc.nextInt();
        int numeroDia = sc.nextInt();
        int matriz[][] = new int[numeroAlumno][numeroDia];
        int asistencias[][] = new int[numeroAlumno][numeroDia];
        double sumaPromedio[] = new double[numeroAlumno];
        int sumaAsistencia[] = new int[numeroAlumno];
        double numerosOrdenados[] = new double[numeroAlumno];
        boolean[] yaImpreso = new boolean[numeroAlumno];
        double sumaMedia = 0;
        int numeroAsistencias = 0;
        int numeroAusencias = 0;
        for (int i = 0; i < numeroAlumno; i++) {
            for (int j = 0; j < numeroDia; j++) {
                int numero = sc.nextInt();
                matriz[i][j] = numero;

            }
        }
        for (int i = 0; i < numeroAlumno; i++) {
            for (int j = 0; j < numeroDia; j++) {
                int numero = sc.nextInt();
                asistencias[i][j] = numero;

            }
        }
        for (int i = 0; i < numeroAlumno; i++) {
            sumaMedia = 0;
            numeroAsistencias = 0;
            numeroAusencias = 0;
            for (int j = 0; j < numeroDia; j++) {
                if (asistencias[i][j] == 1) {
                    sumaMedia += matriz[i][j];
                    numeroAsistencias++;
                } else if (asistencias[i][j] == 0) {
                    numeroAusencias++;
                }
            }
            sumaAsistencia[i] = numeroAusencias;
            sumaPromedio[i] = sumaMedia / numeroAsistencias;
        }
        for (int i = 0; i < numerosOrdenados.length; i++) {
            numerosOrdenados[i] = sumaPromedio[i];
        }
        for (int i = 0; i < numerosOrdenados.length; i++) {
            for (int j = 0; j < numerosOrdenados.length - 1; j++) {
                if (numerosOrdenados[j] < numerosOrdenados[j + 1]) {
                    double aux = numerosOrdenados[j + 1];
                    numerosOrdenados[j + 1] = numerosOrdenados[j];
                    numerosOrdenados[j] = aux;
                }
            }
        }
        for (int i = 0; i < numerosOrdenados.length; i++) {
            System.out.println(numerosOrdenados[i]);
        }
        double sumaPromedioNum = 0;
        for (int i = 0; i < numerosOrdenados.length; i++) {
            int alumno = 0;
            
            for (int j = 0; j < numerosOrdenados.length; j++) {
                if (!yaImpreso[j] && (numerosOrdenados[i] == sumaPromedio[j])) {
                    alumno = j;
                    yaImpreso[j] = true;
                }
            }

            System.out.println("Alumno " + (alumno + 1) + ": Promedio = " + numerosOrdenados[i] + ", Días ausentes = " + sumaAsistencia[alumno]);

            sumaPromedioNum += numerosOrdenados[i];
        }
        sumaPromedioNum = sumaPromedioNum / numeroAlumno;
        System.out.printf("Promedio de todos %.2f", sumaPromedioNum);
    }

}
