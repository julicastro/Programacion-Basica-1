package ar.edu.unlam.tp8;

public class Tambor {
	private final int POSICION_MINIMA = 1;
	private final int POSICION_MAXIMA = 8;
	private int posicion = 0;
	
	public int getPosicion() {
		return posicion;
	}
	
	public void girar() {
		posicion = (int) (Math.random()*POSICION_MAXIMA + POSICION_MINIMA);
	}
	
}
