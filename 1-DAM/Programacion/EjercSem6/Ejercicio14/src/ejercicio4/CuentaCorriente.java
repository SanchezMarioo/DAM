/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author mario.sanper.2
 */
public class CuentaCorriente {

    String dni;
    public String nombreTitular;
    private double dinero;
    private static String banco;
    private Gestor gestor;

    /**
     *
     * @param dni DNI
     * @param nombreTitular Nombre del titular
     * @param dinero Dinero incial
     */
    CuentaCorriente(String dni, String nombreTitular, double dinero) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.dinero = dinero;
    }

    CuentaCorriente(String titular) {
        this(titular, "Titular cuenta", 0.0);
    }

    CuentaCorriente(String titular, double dinero) {
        this(titular, "Titular conocido", dinero);
    }

    /**
     * Este metodo incrementa el dinero
     *
     * @param dinero se le pasa por parametro el dinero a incrementar
     */
    void ingresarDinero(double dinero) {
        if (dinero < 0) {
            System.err.println("No puedes introducir una cantidad negativa");
            return;
        }
        this.dinero += dinero;
        System.out.println("Has ingresado " + dinero);
    }

    static void setBanco(String banco) {
        if (banco != null || !banco.trim().isEmpty()) {
            CuentaCorriente.banco = banco;
        } else {
            System.out.println("El campo esta vacio o es nulo.");
        }
    }

    public static String getBanco() {
        return banco;
    }

    public void asignarGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    /**
     * La funcion permite retirar dinero
     *
     * @param dinero variable que sacar el dinero
     */
    // Utilizar boolean es mejor practica
    void retirarDinero(double dinero) {
        if (dinero > this.dinero && dinero > 0) {
            System.err.println("No puedes sacar mas dinero del que tienes melon!");
            return;
        }
        this.dinero -= dinero;
        System.out.println("Has retirado " + dinero);
    }

    /**
     * Muestra la informacion al usuario
     */
    void mostrarInformacion() {
        System.out.println("Titular: " + nombreTitular);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + this.dinero);
        System.out.println("Banco: " + banco);

        if (gestor != null) {
            System.out.println("Gestor: " + gestor.nombre);
            System.out.println("Teléfono gestor: " + gestor.getTelefono());
            System.out.println("Importe maximo autorizado " + gestor.maximoAutorizado);
        } else {
            System.out.println("Gestor: No asignado");
        }
        System.out.println("---------------------------");
    }
}
