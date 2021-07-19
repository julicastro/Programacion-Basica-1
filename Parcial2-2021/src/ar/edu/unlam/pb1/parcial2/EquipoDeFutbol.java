package ar.edu.unlam.pb1.parcial2;

import java.util.Iterator;

public class EquipoDeFutbol {
	private String nombre;
	private Jugador jugadores[];
	private int cantidadJugadores;
	
	public EquipoDeFutbol(String nombre) {
		this.nombre = nombre;
		this.jugadores=new Jugador[5];
		this.cantidadJugadores=0;
	}

	/*
	 * La capacidad máxima de un equipo es 5. No se permiten jugadores repetidos (ya sea el número o nombre del jugador)
	 * Se retorna el resultado de la operación
	 */
	public boolean agregarJugador(Jugador nuevo) {
		
		boolean existeJugador = false;
		for (int j = 0; j < jugadores.length; j++) {
			if(jugadores[j]!=null) {
				if (jugadores[j].getNombre() == nuevo.getNombre() && jugadores[j].getNumero() == nuevo.getNumero()) {
					existeJugador = true;
				}
			}
		}
		if(existeJugador) {
			return false;
		}
		else {
			for (int i = 0; i < jugadores.length; i++) {
				if(jugadores[i]==null) {
					jugadores[i] = nuevo;
					cantidadJugadores++;
					i=jugadores.length;
						}
					}
			return true;
		}
	
	}
	
	/*
	 * Permite buscar un jugador por su numero. 
	 * 
	 */
	public Jugador buscar(int numero) {
		for (int i = 0; i < jugadores.length; i++) {
			if(jugadores[i]!=null) {
				if(jugadores[i].getNumero()==numero) {
					return jugadores[i];
				}
			}
		}
		return null;
	}
	
	/*
	 * Permite buscar un jugador por su nombre. 
	 * 
	 */
	public Jugador buscar(String nombre) {
		for (int i = 0; i < jugadores.length; i++) {
			if(jugadores[i]!=null) {
				if(jugadores[i].getNombre()==nombre) {
					return jugadores[i];
				}
			}
		}
		return null;
	}
	
	/*
	 * Calcula el valor del equipo. 
	 * 
	 */
	public double calcularLaEdadPromedioDelEquipo() {
		double contador=0;
		double totalEdad=0;
		for (int i = 0; i < jugadores.length; i++) {
			if(jugadores[i]!=null) {
				totalEdad=totalEdad+jugadores[i].getEdad();
				contador++;
			}
		}
		
		
		return totalEdad/contador;
	}
	
	/*
	 * Calcula el valor del equipo
	 * 
	 */
	public double calcularElValorDelEquipo() {
		double total=0;
		for (int i = 0; i < jugadores.length; i++) {
			if(jugadores[i]!=null) {
				total=total+jugadores[i].getPrecio();
			}
		}
		
		return total;
	}
	
	public String toString() {
		return this.nombre;
	}
	
}
