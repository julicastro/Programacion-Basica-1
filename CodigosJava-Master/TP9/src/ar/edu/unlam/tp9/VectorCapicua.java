package ar.edu.unlam.tp9;
import java.util.Arrays;
import java.util.Scanner;
public class VectorCapicua {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingresar numero : " );
		String numero = teclado.nextLine();
		int vector [] = new int[numero.length()];
		int vectorVolteado[] = new int [numero.length()];
		boolean esCapicua= false;
		for (int i = 0; i < vector.length; i++) {
			vector[i] = 0;
			vectorVolteado[i] =0;
		}
		for (int i = 0; i < vector.length; i++) {
			vector[i] = Character.getNumericValue(numero.charAt(i));
			vectorVolteado[(numero.length()-1)-i] = vector[i];
		}
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i]);
		}
		
		System.out.println(" ");
		for (int i = 0; i < vectorVolteado.length; i++) {
			System.out.println(vectorVolteado[i]);
		}
		
			esCapicua = Arrays.equals(vector, vectorVolteado);
			System.out.println(" ");
			System.out.println("El numero es capicua ? " + esCapicua);
		
	}

}
