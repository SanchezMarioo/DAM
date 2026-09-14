import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {
    private final int MAX_RUTAS = 4;
    private final int MAX_PAQUETES = 5;
    private Ruta[] rutas = new Ruta[MAX_RUTAS];
    private ArrayList<Paquete> paquetes = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    private Paquete[][] asignacionesPaquetes = new Paquete[MAX_PAQUETES][MAX_RUTAS];

    private void registrarRutas() {
        int numero = 0;
        String ruta = sc.nextLine();
        String ciudadOrigen = sc.nextLine();
        int capacidadMaxima = sc.nextInt();
        String ciudadDestino = sc.nextLine();


        rutas[numero] = new Ruta(ruta, ciudadOrigen, capacidadMaxima, ciudadDestino);
        numero++;
    }

    private void registrarPaquetes() {
        String codEnvio = sc.nextLine();
        if (!validarCodigo(codEnvio)) {
            System.out.println("El codigo de envio no es valido.");
            return;
        }
        String ciudad = sc.nextLine();
        int peso = sc.nextInt();
        if(peso > 0){
            System.out.println("El peso no tiene que ser negativo");
            return;
        }
        String estado = sc.nextLine();
    }

    private boolean validarCodigo(String codigo) {
        return codigo.matches("PK\\d{5} ");
    }
}
