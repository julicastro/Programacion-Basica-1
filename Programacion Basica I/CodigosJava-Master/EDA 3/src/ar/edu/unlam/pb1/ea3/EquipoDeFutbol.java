package ar.edu.unlam.pb1.ea3;

public class EquipoDeFutbol {
	private String nombre;
	private Jugador jugadores[];
	
	public EquipoDeFutbol(String nombre) {
		this.nombre=nombre;
		System.out.println("Nombre del equipo" + nombre);
	}

	public boolean agregarJugador(Jugador jugador) {
		Jugador jugadorEncontrado=buscar(jugador.getNombre());
		if(jugadorEncontrado==null)
			for(int i=0;i<jugadores.length;i++) {
				if(jugadores[i]==null) {
					this.jugadores[i]=jugador;
					System.out.println("Agrego a " +jugadores[i].getNombre());
					return true; 
				}
			}
		System.out.println("No se puede agregar a " + jugador);
		return false;
	}

	public boolean cambiarJugador(Jugador saliente, Jugador entrante) {
		for(int i = 0;i<jugadores.length;i++) {
			if(this.jugadores[i]!=null)
			if(this.jugadores[i].getNombre().equalsIgnoreCase(saliente.getNombre())) {
				this.jugadores[i]=entrante;
				System.out.println("Sale " + saliente);
				System.out.println("Entra" + entrante);
				return true;
			}
		}
		System.out.println("No hubo cambio");
		return false;
	}

	public Jugador[] getJugadores() {
		Jugador[]equipo=new Jugador[this.jugadores.length];
			int cantidadDeJugadores=0;
		for(int i=0;i<jugadores.length;i++) {
			if(this.jugadores[i]==null) {
				System.out.println("Cantidad de jugadores: "+cantidadDeJugadores);
				return this.jugadores;
			}else {
				equipo[cantidadDeJugadores]=this.jugadores[i];
				cantidadDeJugadores++;
				System.out.println(jugadores[i].getNombre());
			}System.out.println("Cantidad de jugadores: "+cantidadDeJugadores);
			return this.jugadores;
		}
		return null;
	}

	public Jugador buscar(int numero) {
		for(int i=0;i<jugadores.length;i++) {
			if(this.jugadores[i]!=null)
			if(this.jugadores[i].getNumero()==numero) {
				System.out.println("Se encontro el numero de " + this.jugadores[i]);
				return this.jugadores[i];
			}
		}
		System.out.println("No se encontro "+numero);
		return null;
	}
		
	public Jugador buscar(String nombre) {
		for(int i=0;i<jugadores.length;i++) {
			if(this.jugadores[i]!=null)
			if(this.jugadores[i].getNombre()==nombre) {
				System.out.println("Se encontro el nombre de " + this.jugadores[i]);
				return this.jugadores[i];
			}
		}
		System.out.println("No se encontro "+nombre);
		return null;

	}

		
	
	public double calcularElValorDelEquipo() {
		double valorDelEquipo = 0;
		double valorIndividual = 0;
		for(int i=0;i<jugadores.length;i++) {
			valorIndividual=jugadores[i].getPrecio();
			valorDelEquipo=valorDelEquipo+valorIndividual;
		}
		System.out.println("valor del team: ");
		return valorDelEquipo;
	}
	

	public double calcularElPrecioPromedio() {
		double valorDelEquipo = 0;
		double valorIndividual = 0;
		double promedioDelEquipo = 0;
		for(int i =0;i<jugadores.length;i++) {
			valorIndividual=jugadores[i].getPrecio();
			valorDelEquipo=valorDelEquipo+valorIndividual;
			promedioDelEquipo=valorDelEquipo/jugadores.length;
		}
		System.out.println("promedio del team: ");
		return promedioDelEquipo;
	}
	
	
}
