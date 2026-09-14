public class Paquete {
    private String codEnvio;
    private int peso;
    private String ciudad;
    private String estadoPaquete;

    public Paquete(String codEnvio, String ciudad, int peso, String estadoPaquete) {
        this.codEnvio = codEnvio;
        this.ciudad = ciudad;
        this.peso = peso;
        this.estadoPaquete = estadoPaquete;
    }
}
