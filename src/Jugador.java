// Superclase Jugador
abstract class Jugador implements Runnable {
    protected int id;
    protected Accion accion;

    // Constructor para asignar un ID al jugador
    public Jugador(int id) {
        this.id = id;
    }

    // Método que debe ser implementado por las subclases
    public abstract Accion decidirAccion();

    @Override
    public void run() {
        // Se obtiene la acción decidida por el jugador
        accion = decidirAccion();
        
        if (id == 1) Partida.setUltimaJugadaJ1(accion);
        else Partida.setUltimaJugadaJ2(accion);
        
        // Mostrar la acción tomada por el jugador
        System.out.println("Jugador " + id + " eligió: " + accion);
    }
    
}


