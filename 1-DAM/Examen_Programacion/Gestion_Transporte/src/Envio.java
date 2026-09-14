public abstract class Envio {
    private String codEnvio;
    private double kilos;
    private String direccionDestino;
    private final int precioBaseEnvio = 5;
    private final double precioExtraPorKG = 1.5;

    public Envio(String codEnvio, double kilos, String direccionDestino) throws ValidatorException {
        if (codEnvio == null || codEnvio == "" || codEnvio.isEmpty()) {
            throw new ValidatorException("El codigo envio no puede ser nula");
        } else {
            this.codEnvio = codEnvio;
        }
        if (kilos <= 0.0) {
            throw new ValidatorException("Los kilos no pueden ser negativos");
        } else {
            this.kilos = kilos;
        }
        if (direccionDestino == null || direccionDestino == "") {
            throw new ValidatorException("La direccion no puede ser nula");
        } else {
            this.direccionDestino = direccionDestino;
        }
    }

    public String getCodEnvio() {
        return codEnvio;
    }

    public double getKilos() {
        return kilos;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public double calcularPrecioBaseEnvio() {
        return precioBaseEnvio + (kilos * precioExtraPorKG);
    }

    @Override
    public String toString() {
        return codEnvio + " | " + kilos + " | " + direccionDestino + " | " + calcularPrecioBaseEnvio();
    }

    public abstract double calcularCoste();
}
