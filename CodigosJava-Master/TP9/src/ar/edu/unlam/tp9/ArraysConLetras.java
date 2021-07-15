package ar.edu.unlam.tp9;
import java.util.Scanner;
public class ArraysConLetras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String vector [] = new String [26];
		int numero =0;		
		for (int i = 0; i < vector.length && numero != - 1; i++) {
			numero = teclado.nextInt();
			vector[i] =(char) ('A' + i) +" " + numero;
		}
		
		for (int i = 0; i < vector.length && vector[i]!=null; i++) {
			System.out.println(vector[i]);
		}

	}

}
