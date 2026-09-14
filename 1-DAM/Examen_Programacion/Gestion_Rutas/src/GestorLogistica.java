import java.util.ArrayList;
import java.util.Scanner;

public class GestorLogistica {
    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private int[][] rutas;

    private void pedirDatosVehiculo(int numVehiculos) {
        for (int i = 0; i < numVehiculos; i++) {
            String matricula = sc.nextLine().trim();
            if (!validarMatricula(matricula)) {
                System.out.println("Error: La matrícula " + matricula + " no tiene un formato válido.");
            } else {
                int cargaCamion = sc.nextInt();
                listaVehiculos.add(new Vehiculo(matricula, cargaCamion));
            }

        }
    }

    private void pedirDatosRuta(int dimensionesArray) {
        for (int i = 0; i < dimensionesArray; i++) {
            for (int j = 0; j < dimensionesArray; j++) {
                int n = sc.nextInt();
                rutas[i][j] = n;
            }
        }
    }

    public boolean validarMatricula(String matricula) {
        if (matricula.matches("\\d{4}[A-Z]{3}")) {
            return true;
        } else {
            return false;
        }
    }

}
