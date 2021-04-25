package ar.edu.unlam.tp11;

public class Mozo {
	private String nombre;
	private int numeroDeMesa;
	
	public Mozo(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroDeMesa() {
		return numeroDeMesa;
	}

	public void setNumeroDeMesa(int numeroDeMesa) {
		this.numeroDeMesa = numeroDeMesa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
