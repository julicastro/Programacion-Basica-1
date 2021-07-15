package ar.edu.unlam.ejercitacion;
import java.util.Scanner;
public class SumatoriaMatriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int matrizA [][] = new int [2][2];
		int matrizB [][]= new int [2][2];
		int matrizC [][]= new int [2][2];
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB.length; j++) {
				System.out.println("Ingresar valores de la matriz A");
				matrizA[i][j]= teclado.nextInt();
			}
		}
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB.length; j++) {
				System.out.println("Ingresar valores de la matriz B");
				matrizB[i][j]= teclado.nextInt();
			}
		}
 
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC.length; j++) {
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
		
		for (int i = 0; i < matrizC.length; i++) {
			for (int j = 0; j < matrizC.length; j++) {
				System.out.println(matrizC[i][j]);
			}
		}
	}

}
