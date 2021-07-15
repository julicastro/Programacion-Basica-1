package ar.edu.unlam.tp9;

public class Jugador {
	private final int CANTIDAD_DE_VIDA=6;
	private String nombre;
	private String palabraAdivinarPorAdversario;
	private char palabraAdivinarPorMi[];
	private int vidas;
	public Jugador(String nombre) {
		this.nombre = nombre;
		vidas = CANTIDAD_DE_VIDA;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getPalabraAdivinarPorAdversario() {
		return palabraAdivinarPorAdversario;
	}
	public char[] getPalabraAdivinarPorMi() {
		return palabraAdivinarPorMi;
	}
	public void setPalabraAdivinarPorMi(char[] palabraAdivinarPorMi) {
		this.palabraAdivinarPorMi = palabraAdivinarPorMi;
	}
	public void setPalabraAdivinarPorAdversario(String palabraAdivinarPorAdversario) {
		this.palabraAdivinarPorAdversario = palabraAdivinarPorAdversario;
	}
	
	public void inicializarPalabraAdvinarPorMi() {
		for (int i = 0; i < palabraAdivinarPorMi.length; i++) {
			palabraAdivinarPorMi[i] = '\0';
		}
	}
	public String mostrarPalabraAdivinar() {
		String textoAMostrar = "";
		for (int i = 0; i < palabraAdivinarPorMi.length; i++) {
			if(palabraAdivinarPorMi[i] == '\0') {
				textoAMostrar += " _ ";
			}else {
				textoAMostrar += palabraAdivinarPorMi[i];
			}
		}
		return textoAMostrar;
	}
	
	public void ingresarLetra(char letra , int posicion) {
		for (int i = 0; i < palabraAdivinarPorMi.length; i++) {
			palabraAdivinarPorMi[posicion] = letra;
			
		}
	}
	
	public void perderVidas() {
		vidas = --vidas;
	}
	
	public int getVidas() {
		return vidas;
	}
}
