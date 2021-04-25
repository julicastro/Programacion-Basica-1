package ar.edu.unlam.tp9;


public class ElAhorcado {
	private Jugador jugadorUno;
	private Jugador jugadorDos;
	private Jugador turnoActual;
	public ElAhorcado(String jugadorUno, String jugadorDos) {
		this.jugadorUno = new Jugador(jugadorUno);
		this.jugadorDos = new Jugador(jugadorDos);
	}
	
	public void elegirInicidor() {
		double valorAleatorio = Math.random();
		if(valorAleatorio<0.5) {
			turnoActual = jugadorUno;
		}else {
			turnoActual = jugadorDos;
		}
	}
	
	public boolean arriesgarLetra(char letraArriesgada) {
		boolean letraEncontrada = false;
		Jugador adversario;
		if (turnoActual == jugadorUno) {
			adversario = jugadorDos;
		}else {
			adversario = jugadorUno;
		}
		
		String palabraAAdivinar = adversario.getPalabraAdivinarPorAdversario();
		for (int i = 0; i < palabraAAdivinar.length(); i++) {
			char letraActual = palabraAAdivinar.charAt(i);
			if(letraActual == letraArriesgada) {
				turnoActual.ingresarLetra(letraArriesgada,i);
				letraEncontrada = true;
			}
		}
		return letraEncontrada;
	}
	
	public boolean arriesgarPalabra(String palabraArriesgada) {
		String palabraAdversario;
		Jugador adversario;
		if (turnoActual == jugadorUno) {
			adversario = jugadorDos;
		}else {
			adversario = jugadorUno;
		}
		if (adversario.getPalabraAdivinarPorAdversario().equals(palabraArriesgada)) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public Jugador getTurnoActual() {
		return turnoActual;
	}

	public void setPalabraAAdivinarJugador2(String palabraAdivinarPorAdversario) {
		char palabraAAdivinar[]= new char [palabraAdivinarPorAdversario.length()];
		for (int i = 0; i < palabraAAdivinar.length; i++) {
			palabraAAdivinar[i]=palabraAdivinarPorAdversario.charAt(i);
		}
		jugadorDos.setPalabraAdivinarPorMi(palabraAAdivinar);
		jugadorUno.setPalabraAdivinarPorAdversario(palabraAdivinarPorAdversario);
		jugadorDos.inicializarPalabraAdvinarPorMi();
		
	}
	
	public void setPalabraAAdivinarJugador1(String palabraAdivinarPorAdversario) {
		char palabraAAdivinar[]= new char [palabraAdivinarPorAdversario.length()];
		for (int i = 0; i < palabraAAdivinar.length; i++) {
			palabraAAdivinar[i]=palabraAdivinarPorAdversario.charAt(i);
		}
		jugadorUno.setPalabraAdivinarPorMi(palabraAAdivinar);
		jugadorDos.setPalabraAdivinarPorAdversario(palabraAdivinarPorAdversario);
		jugadorUno.inicializarPalabraAdvinarPorMi();
	}
	public void cambiarTurno() {
		if(turnoActual == jugadorUno) {
			turnoActual = jugadorDos;
		}else {
			turnoActual = jugadorUno;
		}
	}
	
	public int getVidasActual() {
		return turnoActual.getVidas();
	}
	
	
}
