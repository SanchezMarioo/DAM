import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Gestor {
    private ArrayList<Envio> envios = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void init() {
        int opcion = 0;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine();
            logicaMenu(opcion);
        } while (opcion != 4);


    }

    private void mostrarMenu() {
        System.out.println("===== MENÚ =====");
        System.out.println("1. Añadir envios");
        System.out.println("2. Mostrar envios");
        System.out.println("3. Mostrar envio por codigo");
        System.out.println("4. Salir");
    }

    private void logicaMenu(int opcion) {
        switch (opcion) {
            case 1 -> añadirPedidos();
            case 2 -> mostarEnvios();
            case 3 -> mostrarEnvioPorCodigo();
            case 4 -> System.out.println("Saliendo programa...");
        }

    }

    private void mostrarEnvioPorCodigo() {
        System.out.println("Codigo del producto: ");
        String codigo = sc.nextLine();
        for (Envio envio : envios) {
            if (envio.getCodEnvio().equalsIgnoreCase(codigo)) {
                System.out.println(envio);
                return;
            }
        }
        System.out.println("Envio no encontrado");
    }

    private void mostarEnvios() {
        for (Envio envio : envios) {
            System.out.println(envio);
        }
    }

    private void añadirPedidos() {
        System.out.println("Introduce tipo de envío (1-Estándar, 2-Urgente, 3-Internacional)");
        int tipoEnvio = sc.nextInt();
        sc.nextLine();
        switch (tipoEnvio) {
            case 1 -> añadirEnvioEstandar();
            case 2 -> añadirEnvioUrgente();
            case 3 -> añadirEnvioInternacional();
            default -> System.out.println("Opcion no valida.");
        }
    }

    private EnvioEstandar leerDatosEstandar() throws ValidatorException {
        EnvioEstandar envio = null;

        try {
            System.out.println("Dime el codigo del envio: ");
            String codEnvio = leerCadena();
            System.out.println("Dime los kilos del envio: ");
            double kilos = sc.nextDouble();
            sc.nextLine();
            System.out.println("Dime la direccion de destino: ");
            String direccionDestino = leerCadena();
            envio = new EnvioEstandar(codEnvio, kilos, direccionDestino);
        } catch (ValidatorException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: dato no válido");
            sc.nextLine(); // LIMPIA EL BUFFER
        }

        return envio;
    }

    private EnvioUrgente leerDatosUrgentes() throws ValidatorException {
        try {
            EnvioEstandar envio = leerDatosEstandar();
            System.out.println("Dime la prioridad entre 1 y 3: ");
            int prioridad = sc.nextInt();
            sc.nextLine();
            return new EnvioUrgente(envio.getCodEnvio(), envio.getKilos(), envio.getDireccionDestino(), prioridad);
        } catch (ValidatorException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
    private String leerCadena(){
       return sc.nextLine().trim();
    }
    private EnvioInternacional leerDatosInternacional() throws ValidatorException {
        try {
            EnvioEstandar envio = leerDatosEstandar();
            System.out.println("País destino: ");
            String paisDestino = leerCadena();

            System.out.println("Coste aduanas: ");
            double costeAduanas = sc.nextDouble();
            sc.nextLine();

            return new EnvioInternacional(envio.getCodEnvio(), envio.getKilos(), envio.getDireccionDestino(), paisDestino, costeAduanas);
        } catch (ValidatorException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    private void añadirEnvioEstandar() {
        try {
            EnvioEstandar e = leerDatosEstandar();
            if (e == null) {
                throw new ValidatorException("El envio no es valido");
            }
            envios.add(e);
        } catch (ValidatorException e) {
            System.err.println(e.getMessage());
        }
    }

    private void añadirEnvioUrgente() {
        try {
            EnvioUrgente e = leerDatosUrgentes();
            if (e == null) {
                throw new ValidatorException("El envio no es valido");
            }
            envios.add(e);
        } catch (ValidatorException e) {
            System.err.println(e.getMessage());
        }
    }

    private void añadirEnvioInternacional() {
        try {

            EnvioInternacional e = leerDatosInternacional();
            if (e == null) {
                throw new ValidatorException("El envio no es valido");
            }
            envios.add(e);
        } catch (ValidatorException e) {
            System.err.println(e.getMessage());
        }
    }
}
