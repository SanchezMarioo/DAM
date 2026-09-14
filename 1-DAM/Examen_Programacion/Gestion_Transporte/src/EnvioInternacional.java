public class EnvioInternacional extends Envio {
    private String paisDestino;
    private double costeAduanas;

    public EnvioInternacional(String codEnvio, double kilos, String direccionDestino, String paisDestino, double costeAduanas) throws ValidatorException {
        super(codEnvio, kilos, direccionDestino);
        if (paisDestino == null || paisDestino.isEmpty())
            throw new ValidatorException("El pais de destino no puede ser nulo o vacio");
        this.paisDestino = paisDestino;
        if (costeAduanas < 0.0) throw new ValidatorException("El coste de las aduanas no puede ser negativo");
        this.costeAduanas = costeAduanas;
    }

    @Override
    public String toString() {
        return "Codigo envio: " + getCodEnvio() + " | " + "Kilos: " + getKilos() + " | " + "Direccion de destino: " + getDireccionDestino()
                + " | " + "Pais destino: " + paisDestino + " | " + "Coste aduanas: "
                + " | " + "Coste del envio: " + calcularCoste();
    }

    @Override
    public double calcularCoste() {
        return calcularPrecioBaseEnvio() + costeAduanas;
    }
}
