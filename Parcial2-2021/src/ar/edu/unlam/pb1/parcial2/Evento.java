package ar.edu.unlam.pb1.parcial2;

public class Evento {
	private int minuto;
	private Jugador autor;
	private TipoDeEvento tipo;
	
	public Evento(int minuto, Jugador autor, TipoDeEvento tipo) {
		this.minuto = minuto;
		this.autor = autor;
		this.tipo = tipo;
	}
	
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	public Jugador getAutor() {
		return autor;
	}
	public void setAutor(Jugador autor) {
		this.autor = autor;
	}
	public TipoDeEvento getTipo() {
		return tipo;
	}
	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}

}
