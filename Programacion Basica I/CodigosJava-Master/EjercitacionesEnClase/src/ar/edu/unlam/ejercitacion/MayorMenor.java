package ar.edu.unlam.ejercitacion;
import java.util.Scanner;
public class MayorMenor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int vector [] = {3,11,33,9,15, 8, 22, 44,5,18};
		int numeroMayor = vector[0];
		int numeroMenor = vector[0];
		int buscado = vector[0];
		System.out.println("Ingresar valor a buscar");
		int numeroBuscar = teclado.nextInt();
		for (int i = 0; i < vector.length; i++) {
			if(vector[i] > numeroMayor) {
				numeroMayor = vector[i];
			}else if(vector[i]<numeroMenor) {
				numeroMenor = vector[i];
			}else if (vector[i] == numeroBuscar) {
				buscado = vector[i];
			}
			
		}
		System.out.println(numeroMayor + " " + numeroMenor+ " " + buscado);

	}

}
