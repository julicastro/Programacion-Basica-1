package ar.edu.unlam.pb1.eva03;

public class Cancion {

	private String nombre;
	private String genero;
	private long duracionEnSegundos;
	private String artista;
	
	public Cancion(String nombre, String genero, long duracionEnSegundos, String artista) {
		this.nombre = nombre;
		this.genero = genero;
		this.duracionEnSegundos = duracionEnSegundos;
		this.artista = artista;
	}

	public String getNombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public long getDuracionEnSegundos() {
		return duracionEnSegundos;
	}

	public String getArtista() {
		return artista;
	}

	public String toString() {
		return "Cancion [nombre=" + nombre + ", genero=" + genero + ", duracionEnSegundos=" + duracionEnSegundos
				+ ", artista=" + artista + "]";
	}

	
	
	
	
	
}
