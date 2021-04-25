package ar.edu.unlam.pb1.ea3;

public class Jugador {

	private int numero;
	private String nombre;
	private double precio;
	
	public Jugador(int numero, String nombre, double precio) {
		this.nombre = nombre;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String toString() {
		return nombre;
	}
}
