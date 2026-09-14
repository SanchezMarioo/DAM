/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calendario_llena;

/**
 *
 * @author Mario
 */
public class Calendario_Llena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int año = 365;
        int contadorLunas = 0;

        for (int dia = 1; dia <= año; dia++) {

            // Comprobar si es domingo (cada 7 días)
            if (dia % 7 == 0) {
                System.out.println("Día " + dia + ": Día de descanso (domingo)");
            }

            // Comprobar si hay luna llena (cada 29 días)
            if (dia % 29 == 0) {
                contadorLunas++;
                System.out.println("🌕 Luna llena #" + contadorLunas + " en el día " + dia);
            }
        }

        // Mostrar total al final
        System.out.println("\nTotal de lunas llenas en el año: " + contadorLunas);
    }

}
