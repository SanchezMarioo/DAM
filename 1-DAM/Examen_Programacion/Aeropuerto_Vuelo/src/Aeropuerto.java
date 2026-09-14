public class Aeropuerto {
    Avion avion[];
    private final int MAX_AVIONES = 5;
    private final boolean[] pistasAviones = new boolean [MAX_AVIONES];
    private int contador = 0;

    public Aeropuerto() {
        avion = new Avion[MAX_AVIONES];
    }
    public void registarAviones(Avion avion){
        if (MAX_AVIONES > contador){
            this.avion[contador] = avion;
            contador++;
        }
    }
    public void despegarAvion(int pistaAvion, Avion avion){
        if(!pistasAviones[pistaAvion]){
            avion.setEstadoAvion(true);
            System.out.println("El avion ha despegado correctamente ");
            pistasAviones[pistaAvion] = false;
        } else{
            System.out.println("No puede tomar tierra el avion la pista esta ocupada.");
        }
    }
    public void aterrizarAvion(int pistaAvion, Avion avion){
        if(!pistasAviones[pistaAvion]){
            avion.setEstadoAvion(false);
            pistasAviones[pistaAvion] = true;
        } else{
            System.out.println("No puede tomar tierra el avion la pista esta ocupada.");
        }
    }



}
