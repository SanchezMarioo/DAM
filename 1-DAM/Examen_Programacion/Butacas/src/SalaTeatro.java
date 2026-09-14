import java.util.ArrayList;

public class SalaTeatro {
    private ArrayList<String> reservasHistorico = new ArrayList<>();
    private final int NUM_FILAS;
    private final int NUM_COLUMNAS;
    private char[][] salaCine;

    public SalaTeatro(int NUM_FILAS, int NUM_COLUMNAS) {
        this.NUM_FILAS = NUM_FILAS;
        this.NUM_COLUMNAS = NUM_COLUMNAS;
        salaCine = new char[NUM_FILAS][NUM_COLUMNAS];
        rellenarMatrizDefecto();

    }

    private void rellenarMatrizDefecto() {
        for (int i = 0; i < NUM_FILAS; i++) {
            for (int j = 0; j < NUM_COLUMNAS; j++) {
                salaCine[i][j] = 'L';
            }
        }
    }

    public void mostrarMatriz() {
        for (int i = 0; i < NUM_FILAS; i++) {
            for (int j = 0; j < NUM_COLUMNAS; j++) {
                System.out.print(salaCine[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void buscarAsientosLibres(int asientos) {
        boolean yaReservado = false;
        for (int i = 0; i < NUM_FILAS; i++) {
            int numAsientosLibres = 0;
            if (yaReservado) {
                return;
            }
            for (int j = 0; j < NUM_COLUMNAS; j++) {
                if (salaCine[i][j] == 'L') {
                    numAsientosLibres++;
                } else {
                    numAsientosLibres = 0;
                }
                if (asientos == numAsientosLibres) {
                    System.out.println("Reserva confirmada: " + "[" + (i) + "," + (j - asientos + 1) + "]" + " - " + i + j);
                    yaReservado = true;
                    for (int k = j - asientos + 1; k <= j; k++) {
                        salaCine[i][k] = 'O';
                    }
                }
            }
        }
        System.out.println("No hay asientos disponibles");
    }
}
