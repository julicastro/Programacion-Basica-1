package ar.edu.unlam.pb1.ea3;

public class EquipoDeFutbol {
	private String nombre;
	private final int CANTIDAD_MAXIMA_JUGADORES = 23;
	private Jugador jugadores[];
	private int cantidadActualDeJugadores;
	
	public EquipoDeFutbol(String nombre) {
		this.nombre  = nombre;
		this.jugadores = new Jugador[CANTIDAD_MAXIMA_JUGADORES];
		cantidadActualDeJugadores = 0;
	}

	/*
	 * La capacidad máxima de un equipo es 23. No se permiten jugadores repetidosa
	 * Se retorna el resultado de la operación
	 */
	public boolean agregarJugador(Jugador jugador) {
			boolean resultado = false;
			if(jugadorRepetido(jugador) == false) {
				if(cantidadActualDeJugadores<jugadores.length) {
					jugadores[cantidadActualDeJugadores++] = jugador;
					resultado = true;
				}
			}
			return resultado;
	}
	
	
	public boolean jugadorRepetido(Jugador jugador) {
		for (int i = 0; i < CANTIDAD_MAXIMA_JUGADORES; i++) {
			if(jugadores[i] != null) {
				if(jugadores[i].getNombre().equals(jugador.getNombre())) {
					return true;
				}
			}
		}
		return false;
	}


	/*
	 * Permite cambiar cualquier jugador. 
	 * Para que el cambio se produzca, el jugador saliente debe estar presente en el equipo
	 */
	public boolean cambiarJugador(Jugador saliente, Jugador entrante) {
		boolean resultado = false;
		for (int i = 0; i < cantidadActualDeJugadores; i++) {
			if(jugadores[i].getNombre() == saliente.getNombre()) {
			jugadores[i] = entrante;
			resultado = true;
			}
		}	
		return resultado;
	}

	public Jugador[] getJugadores() {
		return jugadores;
	}
	
	
	/*
	 * Permite buscar un jugador por su numero. 
	 * 
	 */
	public Jugador buscar(int numero) {
		return jugadores[numero];
	}
	
	/*
	 * Permite buscar un jugador por su nombre. 
	 * 
	 */
	public Jugador buscar(String nombre) {
		Jugador jugadorBuscado = null;
		for (int i = 0; i < jugadores.length; i++) {
			if(jugadores[i].getNombre().equals(nombre)) {
				jugadorBuscado = jugadores[i];
			}
		}
		return jugadorBuscado;
	}
	
	/*
	 * Calcula el valor del equpo. 
	 * 
	 */
	public double calcularElValorDelEquipo() {
		double valorTotalDelEquipo = 0.0;
		for (int i = 0; i < cantidadActualDeJugadores; i++) {
			valorTotalDelEquipo = valorTotalDelEquipo + jugadores[i].getPrecio();
		}
		return valorTotalDelEquipo;
	}
	
	/*
	 * Calcula el precio promedio de sus jugadores 
	 * 
	 */
	public double calcularElPrecioPromedio() {
		double jugadoresParaPromedio=0;
		for (int i = 0; i < cantidadActualDeJugadores; i++) {
			if(jugadores[i] != null) {
				jugadoresParaPromedio++;
			}
		}
		    return calcularElValorDelEquipo()/jugadoresParaPromedio;
	}
	
	
}
