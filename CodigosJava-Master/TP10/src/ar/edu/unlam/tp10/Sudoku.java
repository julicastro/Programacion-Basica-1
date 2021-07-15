package ar.edu.unlam.tp10;

public class Sudoku {
	private final int DIMENSIONES = 9 ;
	private final int DIMENSIONES_CUADRANTE = 3;
	
	private int tablero[][];
	
	public Sudoku() {
		tablero = new int [DIMENSIONES][DIMENSIONES];
	}
	
	/*public Sudoku(int tablero[][]) {
		this.tablero = tablero;
	}*/
	
	public Sudoku(Dificultad nivel) {
		switch (nivel) {
		case FACIL: 
			this.tablero = sencillo();
			break;
		case INTERMEDIO:
			this.tablero = intermedio();
			break;
		case DIFICIL:
			this.tablero = dificil();
			break;
		default :
			this.tablero = new int [DIMENSIONES][DIMENSIONES];
		}
	}
	
	public boolean validarFila(int fila , int valor) {
		for (int i = 0; i < DIMENSIONES; i++) {
			if(tablero[fila][i]==valor) {
				return false;
			}
		}
		return true;
	}
	public boolean validarColumna(int columna , int valor) {
		for (int i = 0; i < DIMENSIONES; i++) {
			if(tablero[i][columna]==valor) {
				return false;
			}
		}
		return true;
	}
	public boolean validarCuadrante(int fila , int columna , int valor) {
		int cuadranteI, cuadranteJ;
		int inicioCuadranteI , finCuadranteI;
		int inicioCuadranteJ , finCuadranteJ;
		
		cuadranteI =  (fila/DIMENSIONES_CUADRANTE);
		inicioCuadranteI = (cuadranteI*DIMENSIONES_CUADRANTE);
		finCuadranteI = (inicioCuadranteI + DIMENSIONES_CUADRANTE);
		
		cuadranteJ = (columna / DIMENSIONES_CUADRANTE);
		inicioCuadranteJ = (cuadranteJ*DIMENSIONES_CUADRANTE);
		finCuadranteJ = (inicioCuadranteJ+DIMENSIONES_CUADRANTE);
		
		for (int i = inicioCuadranteI; i < finCuadranteI; i++) {
			for (int j = inicioCuadranteJ; j < finCuadranteJ; j++) {
				if(tablero[i][j] == valor) {
					return false;
				}
			}
		}
		return true;
	}
	
	public boolean validar(int fila , int columna , int valor) {
		if(validarFila(fila, valor)==true && validarColumna(columna, valor)==true && validarCuadrante(fila, columna, valor)==true) {
			return true;
		}
		return false;
	}
	
	public boolean validar() {
		int auxiliar =0;
		if(algunaCeldaVacia()==true) {
			return false;
		}
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				auxiliar = tablero[i][j];
				tablero[i][j] = 0;
				if(validarFila(i, auxiliar)==false || validarColumna(j, auxiliar)==false || validarCuadrante(i, j, auxiliar)==false) {
					tablero[i][j]=auxiliar;
					return false;
				}
				tablero[i][j] =  auxiliar;
			}
		}
		return true;
	}
	
	public void resetear () {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				tablero[i][j]=0;
			}
		}
	}
	
	public void setValor(int valor , int fila , int columna) {
		if(valor >= 0 && valor <= DIMENSIONES) {
			tablero[fila][columna] = valor;
		}
	}
	
	public int [][] getTablero(){
		return tablero;
	}
	
	public boolean algunaCeldaVacia() {
		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				if(tablero[i][j]==0){
					return true;
				}
			}
		}
		return false;
	}
	
	public String toString() {
		String salida = "";
		salida += " \t   ";
		for (int j = 0; j < tablero.length; j++) {
			salida += j + "   ";
		}
		salida+="\n \t";
		for (int i = 0; i < tablero.length; i++) {
			salida+="____";
		}
		salida += " \n";
		for (int i = 0; i < tablero.length; i++) {
			salida +=i+"\t| ";
			for (int j = 0; j < tablero[i].length; j++) {
				if(tablero[i][j] != 0 ) {
					salida += tablero[i][j] + " | ";
				}else {
					salida += "  | ";
				}
			}
			salida += " \n";
		}
		
		salida += "   \t";
		for (int i = 0; i < tablero.length; i++) {
			salida += "----";
		}
		return salida;
	}
	
	private int[][] sencillo(){
		int [][] sencillo = {
				{0, 0, 0, 0, 9, 0, 1, 0, 5},
				{0, 0, 8, 0, 5, 4, 3, 2, 7},
				{0, 0, 5, 0, 1, 0, 0, 8, 6},
				{0, 8, 3, 7, 0, 6, 0, 0, 9},
				{5, 0, 6, 0, 3, 1, 0, 0, 0},
				{1, 2, 0, 0, 8, 0, 4, 0, 0},
				{6, 3, 1, 0, 0, 9, 0, 5, 2},
				{2, 7, 0, 5, 0, 0, 0, 0, 0},
				{8, 0, 0, 0, 7, 0, 0, 0, 0},
		};
		return sencillo;
	}
	
	private int[][] intermedio(){
		int [][] intermedio = {
				{5, 3, 0, 0, 7, 0, 0, 0, 0},
				{6, 0, 0, 1, 9, 5, 0, 0, 0},
				{0, 9, 8, 0, 0, 0, 0, 6, 0},
				{8, 0, 0, 0, 6, 0, 0, 0, 3},
				{4, 0, 0, 8, 0, 3, 0, 0, 1},
				{7, 0, 0, 0, 2, 0, 0, 0, 6},
				{0, 6, 0, 0, 0, 0, 2, 8, 0},
				{0, 0, 0, 4, 1, 9, 0, 0, 5},
				{0, 0, 0, 0, 0, 8, 0, 7, 9},
		};
		return intermedio;
	}
	
	private int[][] dificil(){
		int [][] dificil = {
				{0, 0, 6, 8, 0, 0, 0, 9, 4},
				{0, 2, 0, 0, 6, 0, 7, 0, 0},
				{7, 0, 0, 4, 0, 2, 0, 0, 0},
				{0, 0, 0, 0, 0, 0, 0, 1, 0},
				{6, 4, 0, 0, 2, 8, 3, 5, 0},
				{0, 9, 0, 5, 0, 1, 0, 0, 2},
				{4, 0, 2, 6, 0, 3, 0, 0, 5},
				{0, 0, 0, 0, 1, 0, 0, 0, 3},
				{8, 0, 9, 0, 0, 0, 1, 2, 0},
		};
		return dificil;
	}
}
