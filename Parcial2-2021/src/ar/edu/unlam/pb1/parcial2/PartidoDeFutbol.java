package ar.edu.unlam.pb1.parcial2;

import java.util.Arrays;

public class PartidoDeFutbol {
	private EquipoDeFutbol local;
	private EquipoDeFutbol visitante;
	private Evento goles[];
	private Evento amontestados[];
	private Evento expulsados[];
	
	public PartidoDeFutbol(EquipoDeFutbol local, EquipoDeFutbol visitante) {
		this.local = local;
		this.visitante = visitante;
		this.goles=new Evento[10];
		this.amontestados=new Evento[10];
		this.expulsados=new Evento[10];
		
	}
	
	/*
	 * Se debe marcar un nuevo Gol Dependiendo del autor (según al equipo que
	 * pertenezca) y del tipo (si es a favor o en contra) se sabrá a quien
	 * contabilizarlo
	 */
	public void marcar(Evento gol) {
		int contadorGoles = 0;
		switch (gol.getTipo()) {
		case GOL_A_FAVOR:
		case GOL_EN_CONTRA:
			for (int i = 0; i < goles.length; i++) {
				if (goles[i] != null) {
					goles[i] = gol;
					i = goles.length;
				}
			}	

		break;
		}

	}

	
	
	/*
	 * Se registra un nuevo amonestado en el partido. 
	 * Si el mismo ya poseía una amonestación previa, se lo debe expulsar. 
	 * El método devuelve la cantidad de amonestaciones del jugador. 
	 * Los valores posibles de retorno son:
	 * 1 - Si no tenía amonestación previa o 
	 * 2 - Si ya poseía una amonestación previa y termina siendo expulsado
	 * 
	 */
	public int amonestar(Evento amonestado) {
		int retorno=0;
		switch (amonestado.getTipo()) {
		case AMONESTACION:
			for (int i = 0; i < amontestados.length; i++) {
				if(amontestados[i]!=null) {
					if(amontestados[i].getAutor().equals(amonestado.getAutor())) {
						retorno++;
					}
				}
			}
			for (int i = 0; i < amontestados.length; i++) {
				if(amontestados[i]==null) {
					amontestados[i]=amonestado;
					i=amontestados.length;
					retorno++;
					
				}
			}
			break;
		}
		if(retorno==2) {
			this.expulsar(amonestado);
		}
		return retorno;
	}
	
	/*
	 * Se registra un nuevo expulsado en el partido. 
	 */
	public void expulsar(Evento expulsado) {
		for (int i = 0; i < amontestados.length; i++) {
			if(amontestados[i]!=null) {
				amontestados[i]=expulsado;
				i=amontestados.length;
			}
		}
	}
	
	/*
	 * Se cuentan la cantidad de goles por equipo (Se debe considerar si el gol resultó a favor o en contra), y devuelve el equipo ganador (Si hubo un empate retorna null) 
	 */
	public EquipoDeFutbol getGanador() {
		int cantidadGolesLocal=0;
		int cantidadGolesVisitante=0;
		for (int i = 0; i < goles.length; i++) {
			if(goles[i]!=null) {
				if(local.buscar(goles[i].getAutor().getNombre())!=null){
						cantidadGolesLocal++;
				}
				else {
					cantidadGolesVisitante++;
					}	
				}
			}
		if(cantidadGolesLocal>cantidadGolesVisitante) {
			return local;
		}
		else if(cantidadGolesLocal<cantidadGolesVisitante) {
			return visitante;
		}
		else {
			return null;
		}
	}
	
	/*
	 * El método toString debe describir el ESTADO del partido (Equipos que se enfrentan, los goles realizados, los amonestado y expulsados).
	 */
	/*public String toString() {
		String resultado = "";
		resultado= "Se enfrenta el equipo: " + local + " Contra: " + visitante+ " Goles: "+ goles +" Amonestados:" +amontestados+" Expulsados: "+ expulsados;
		
		return resultado;
	}*/
	
	
	

	public EquipoDeFutbol getLocal() {
		return local;
	}

	
	

	@Override
	public String toString() {
		return "PartidoDeFutbol [local=" + local + ", visitante=" + visitante + ", goles=" + Arrays.toString(goles)
				+ ", amontestados=" + Arrays.toString(amontestados) + ", expulsados=" + Arrays.toString(expulsados)
				+ "]";
	}

	public EquipoDeFutbol getVisitante() {
		return visitante;
	}

}
