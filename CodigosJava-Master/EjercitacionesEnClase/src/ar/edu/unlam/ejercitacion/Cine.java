package ar.edu.unlam.ejercitacion;

public class Cine {
//	Del cine nos interesa conocer la película que se está reproduciendo y el precio de la entrada en el cine
	private Espectador espectadoresEnLaSala [];
	private Espectador ascientosEnLaSala [][];
	private Pelicula peliculaEnReproducion;
	private int precioDeLaEntrada;
	private final int CANTIDAD_DE_FILAS = 8;
	private final int CANTIDAD_DE_COLUMNAS = 9;
	private static int recaudacion = 0;
	

	public Cine(int precioDeLaEntrada) {
		this.precioDeLaEntrada = precioDeLaEntrada;
		ascientosEnLaSala = new Espectador [CANTIDAD_DE_FILAS][CANTIDAD_DE_COLUMNAS];
		espectadoresEnLaSala = new Espectador [CANTIDAD_DE_FILAS*CANTIDAD_DE_COLUMNAS];
		limpiarMatriz();
		limpiarVector();
	}
	
	public int getPrecioDeLaEntrada() {
		return precioDeLaEntrada;
	}

	public boolean agregarespectador(Espectador nuevo) {
		for (int i = 0; i < espectadoresEnLaSala.length; i++) {
			if(espectadoresEnLaSala[i]== null){
				espectadoresEnLaSala[i] = nuevo;
				return true;
			}
		}
		return false;
	}
	
	public boolean asignarAsciento(Espectador nuevo , int fila , int columna) {
		if(nuevo != null) {
			ascientosEnLaSala[fila][columna]= nuevo;
			recaudacion += precioDeLaEntrada;
			return true;
		}
		return false;
	}
	
	public Espectador buscarEspectador(String nombre) {
		Espectador buscado=null;
		for (int i = 0; i < espectadoresEnLaSala.length; i++) {
			if(espectadoresEnLaSala[i]!= null) {
				if(nombre.equals(espectadoresEnLaSala[i].getNombre())) {
					buscado = espectadoresEnLaSala[i];
				}
			}	
		}
		return buscado;
	}
	
	public static int getRecaudacion() {
		return recaudacion;
	}
	
	public String isDisponibilidad() {
		 String lista="";
		 int filas = CANTIDAD_DE_FILAS;
		for (int i = 0; i < CANTIDAD_DE_FILAS; i++) {
			for (int j = 0; j < CANTIDAD_DE_COLUMNAS; j++) {
				if(ascientosEnLaSala[i][j]== null) {
					lista +=(char) ('A' + j) +"" +(char) ('8'- i) + " " ;
				}else {
					lista += "   ";
				}
			}
			lista += "\n";
		}
		return lista;
	}
	
	public void limpiarVector () {
		for (int i = 0; i < espectadoresEnLaSala.length; i++) {
			espectadoresEnLaSala[i]= null;
		}
	}
	public void limpiarMatriz() {
		for (int i = 0; i < CANTIDAD_DE_FILAS; i++) {
			for (int j = 0; j < CANTIDAD_DE_COLUMNAS; j++) {
				ascientosEnLaSala[i][j] = null;
			}
		}
	}

	
}
