package ar.edu.unlam.ejercitacion;

import java.util.Arrays;

public class OrdenamientoMatriz {

	public static void main(String[] args) {
		int vector[] = {15,10,4,48,3,2};
		int i,j,aux;
		for (i = 1; i < vector.length; i++) {
			for (j = 0; j < vector.length-1; j++) {
				if (vector[j]>vector[j+1]) {
					aux = vector[j+1];
					vector[j+1] = vector[j];
					vector[j] = aux;
				}
			}
		}
			System.out.println(Arrays.toString(vector));

	}

}
