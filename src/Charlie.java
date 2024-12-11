
public class Charlie extends Jugador{
	
	private static Accion accionRivalAnterior;
	private boolean primeraPartida;     

	public Charlie(int id) {
	   super(id);
	   this.primeraPartida = true;  
	   }

	   @Override
	   public Accion decidirAccion() {

	       if (primeraPartida) {
	           primeraPartida = false;
	           return Accion.COLABORAR; 
	       } 
	       else {
			   if (id == 1) accionRivalAnterior = Partida.getUltimaJugadaJ2();
			   else accionRivalAnterior = Partida.getUltimaJugadaJ1();
			   
	           return accionRivalAnterior;
	       }
	   }

}