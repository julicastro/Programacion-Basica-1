package ar.edu.unlam.ejercitacion;

public class MatrizPrueba {

	public static void main(String[] args) {
		final int filas = 4;
		final int columnas = 4;
		int contador = 1;
		int matriz[][] = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j]=contador;
				contador++;
				System.out.print("[" + matriz[i][j]+"]");
			}
			System.out.println(" ");
		}
		
		
	}

}
