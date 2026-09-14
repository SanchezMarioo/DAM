public class Ruta {
    private String ruta;
    private String ciudadOrigen;
    private String ciudadDestino;
    private int capacidadMaxima;

    public Ruta(String ruta, String ciudadOrigen, int capacidadMaxima, String ciudadDestino) {
        this.ruta = ruta;
        this.ciudadOrigen = ciudadOrigen;
        this.capacidadMaxima = capacidadMaxima;
        this.ciudadDestino = ciudadDestino;
    }
}
