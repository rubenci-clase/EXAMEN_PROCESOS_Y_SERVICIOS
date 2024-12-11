
public class Bob extends Jugador{

	static int partidaAnterior = 0;
	
	public Bob(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Accion decidirAccion() {
		// TODO Auto-generated method stub
		partidaAnterior++;
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (partidaAnterior%2 == 0) return Accion.COLABORAR;
		else return Accion.ROBAR;
	}
}
