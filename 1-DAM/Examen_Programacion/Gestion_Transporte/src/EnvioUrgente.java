public class EnvioUrgente extends Envio {
    private int prioridad;

    public EnvioUrgente(String codEnvio, double kilos, String direccionDestino, int prioridad) throws ValidatorException {
        super(codEnvio, kilos, direccionDestino);
        if (prioridad < 0 || prioridad > 3) {
            throw new ValidatorException("La prioridad debe de ser esta entre 1 y 3");
        }
        this.prioridad = prioridad;

    }

    @Override
    public String toString() {
        return "Codigo envio: " + getCodEnvio() + " | " + "Kilos: " + getKilos() + " | " + "Direccion de destino: " + getDireccionDestino() + " | " + "Prioridad: " + prioridad
                + " | " + "Coste del envio: "+calcularCoste();
    }

    @Override
    public double calcularCoste() {
        double costePrioridad = 0;
        switch (prioridad) {
            case 1 -> costePrioridad = 2;
            case 2 -> costePrioridad = 5;
            case 3 -> costePrioridad = 10;

        }
        return calcularPrecioBaseEnvio() + costePrioridad;
    }
}
