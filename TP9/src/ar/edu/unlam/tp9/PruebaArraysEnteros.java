package ar.edu.unlam.tp9;
import java.util.Scanner;
public class PruebaArraysEnteros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
	
		
		int vector [] = new int [5];
		
		for (int i = 0; i < vector.length; i++) {
			vector[i]=0;
		}
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println("Ingrese un valor");
			vector[i] = teclado.nextInt();
		}
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i] + " en la posicion : " + i);
		}
		

	}

}
