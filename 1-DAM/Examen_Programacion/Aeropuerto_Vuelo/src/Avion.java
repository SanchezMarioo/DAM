public class Avion {
    // En caso de estar vuelo estara a true
    private boolean estadoAvion;
    private Aeropuerto aeropuerto;
    public Avion(Aeropuerto aeropuerto){
        this.aeropuerto = aeropuerto;
        estadoAvion = false;
    }
    public void setEstadoAvion(boolean estadoAvion) {
        this.estadoAvion = estadoAvion;
    }

    public boolean isEstadoAvion() {
        return estadoAvion;
    }
    public void despegarAvion(int pistaAvion){
        aeropuerto.despegarAvion(pistaAvion,this);
    }
    public void aterrizarAvion(int pistaAvion){
        aeropuerto.aterrizarAvion(pistaAvion,this);
    }
}
