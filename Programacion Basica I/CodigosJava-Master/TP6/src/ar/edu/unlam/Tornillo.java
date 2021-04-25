package ar.edu.unlam;

public class Tornillo {

	private final char TIPO_DE_CABEZA;
	private final int LONGITUD;
	private final int CANTIDAD_DE_ROSCA;
	private int posicionActual = 0;
	
	// lo puedo hacer con Scanner en el main
	public Tornillo(char tipoDeCabeza, int cantidadDeRoscas) {
		this.LONGITUD = 0;
		this.TIPO_DE_CABEZA=tipoDeCabeza;
		this.CANTIDAD_DE_ROSCA=cantidadDeRoscas;
	}
	
	public int getLongitud() {
		return this.LONGITUD;
	}
	
	public char getTipoDeCabeza() {
		return this.TIPO_DE_CABEZA;
	}
	
	public boolean girar(char sentido){
		boolean gira=false; 
		while(this.posicionActual<this.CANTIDAD_DE_ROSCA&&this.posicionActual>=0) {
		switch(sentido) {
		case 'H':
			posicionActual++;
			System.out.println("Cantidad de giros Horario" + posicionActual);
			gira = true;
			break;
		case 'A':
			posicionActual--;
			System.out.println("Cantidad de giros AntiHorario" + posicionActual);
			while(posicionActual>=0) {
				gira=true;
				}
			break;
			}
		}	
			return gira;
	}
}
