public class EnvioEstandar extends Envio {
    public EnvioEstandar(String codEnvio, double kilos, String direccionDestino) throws ValidatorException {
        super(codEnvio, kilos, direccionDestino);
    }

    @Override
    public String toString() {
        return "Codigo envio: " + getCodEnvio() + " | " + "Kilos: " + getKilos() + " | " + "Direccion de destino: " + getDireccionDestino()
                + " | " + "Coste del envio: "+calcularCoste();
    }

    @Override
    public double calcularCoste() {
        return calcularPrecioBaseEnvio();
    }
}
