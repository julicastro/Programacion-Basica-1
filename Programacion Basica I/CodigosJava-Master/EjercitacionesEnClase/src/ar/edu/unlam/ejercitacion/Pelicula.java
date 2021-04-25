package ar.edu.unlam.ejercitacion;

public class Pelicula {
	private String titulo;
	private double duracion;
	private short edadMinima;
	private String director;
	
	public Pelicula(String titulo,double duracion ,short edadMinima,String director) {
		this.titulo = titulo;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
		this.director = director;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public short getEdadMinima() {
		return edadMinima;
	}

	public void setEdadMinima(short edadMinima) {
		this.edadMinima = edadMinima;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
}
