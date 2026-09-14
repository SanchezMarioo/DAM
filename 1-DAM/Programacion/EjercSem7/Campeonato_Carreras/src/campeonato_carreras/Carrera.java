package campeonato_carreras;

import java.util.ArrayList;

/**
 * Representa una carrera con distancia fija y lista de pilotos inscritos.
 */
public class Carrera {

    private final int PUNTOS_GANADOR = 10;
    private String nombre;
    private double distancia;
    private ArrayList<Piloto> inscritos;
    private double vueltas;
    private double distanciaPorVuelta;

    /**
     * Crea una carrera con su nombre y distancia total.
     *
     * @param nombre nombre de la carrera
     * @param distancia distancia total en metros
     */
    public Carrera(String nombre, double distancia, double vueltas, double distanciaPorVuelta) {
        this.nombre = nombre;
        this.distancia = distancia;
        inscritos = new ArrayList<>();
        this.vueltas = vueltas;
        this.distanciaPorVuelta = distanciaPorVuelta;
    }

    /**
     * Obtiene el nombre de la carrera.
     *
     * @return nombre de la carrera
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la distancia total de la carrera.
     *
     * @return distancia en metros
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * Inscribe un piloto en la carrera.
     *
     * @param p piloto a inscribir
     */
    public void inscribirPiloto(Piloto p) {
        for (Piloto inscrito : inscritos) {
            if(p.equals(inscrito)){
                System.err.println("El piloto ya esta inscrito.");
                return;
            }
        }
        inscritos.add(p);
    }

    /**
     * Indica si hay pilotos inscritos.
     *
     * @return true si hay inscritos; false en caso contrario
     */
    public boolean hayPilotos() {
        if (inscritos.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Ejecuta la carrera y calcula el ganador en funcion del menor tiempo.
     *
     * @return piloto ganador, o null si no hay inscritos
     */
    public Piloto inciarCarrera() {
        if (!hayPilotos()) {
            System.out.println("No hay pilotos inscritos en la carrera.");
            return null;
        } else {
            ArrayList<Double> tiempo = new ArrayList<>();
            // Se calculan los tiempos para añadirlos a un array
            for (int i = 0; i < vueltas; i++) {
                for (int j = 0; i < inscritos.size(); i++) {
                    Piloto piloto = inscritos.get(j);
                    Coche coche = piloto.getCoche();
                    if (j == 0) {
                        tiempo.add(coche.avanzar(distanciaPorVuelta));

                    } else {
                        double tiempoActual = tiempo.get(j);
                        tiempo.add(coche.avanzar(distanciaPorVuelta) + tiempoActual);
                    }

                }
            }

            // Obtenemos el piloto con menos tiempo
            Piloto pilotoGanador = inscritos.get(posMinimoTiempo(tiempo));
            return pilotoGanador;
        }
    }

    private int posMinimoTiempo(ArrayList<Double> tiempo) {
        double minimoTiempo = tiempo.get(0);
        int posicion = 0;
        for (int i = 0; i < tiempo.size(); i++) {
            if (minimoTiempo < tiempo.get(i)) {
                minimoTiempo = tiempo.get(i);
                posicion = i;
            }
        }
        return posicion;
    }

}
