// Clase para manejar una partida entre dos jugadores
class Partida {
	static Accion ultimaJugadaJ1;
	static Accion ultimaJugadaJ2;
	
    private Thread jugador1;
    private Thread jugador2;

    public Partida(Thread jugador1, Thread jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        
    }

    public void jugar() throws InterruptedException {
        // Arrancar ambos jugadores en hilos diferentes
        jugador1.start();
        jugador2.start();

        // Esperar que ambos terminen
        jugador1.join();
        jugador2.join();

        
    }

	public static Accion getUltimaJugadaJ1() {
		return ultimaJugadaJ1;
	}

	public static void setUltimaJugadaJ1(Accion ultimaJugadaJ1) {
		Partida.ultimaJugadaJ1 = ultimaJugadaJ1;
	}

	public static Accion getUltimaJugadaJ2() {
		return ultimaJugadaJ2;
	}

	public static void setUltimaJugadaJ2(Accion ultimaJugadaJ2) {
		Partida.ultimaJugadaJ2 = ultimaJugadaJ2;
	}
    
    
}
