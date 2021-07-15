package ar.edu.unlam.pb1validacion;

public class Programa {
	
	
	private int horario; //hora de transmicion ejemplo 19, 20 
	private int duracion; //Duracion en minutos;
	private int cantidadDeActores;
	private String nombre;
	private String diaDeTransmicion;
	
	
	public Programa(String nombre, String diaDeTransmicion, int horario, int duracion, int cantidadDeActores) {
	
		this.nombre = nombre;
		this.diaDeTransmicion = diaDeTransmicion;
		this.horario = horario;
		this.duracion = duracion;
		this.cantidadDeActores = cantidadDeActores;
	}
	public int getCantidadDeActores() {
		return cantidadDeActores;
	}
	public void setCantidadDeActores(int cantidadDeActores) {
		this.cantidadDeActores = cantidadDeActores;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDiaDeTransmicion() {
		return diaDeTransmicion;
	}
	public void setDiaDeTransmicion(String diaDeTransmicion) {
		this.diaDeTransmicion = diaDeTransmicion;
	}
	public int getHorario() {
		return horario;
	}
	public void setHorario(int horario) {
		this.horario = horario;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	
	
}
