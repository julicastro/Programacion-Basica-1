package ar.edu.unlam.tp9;
import java.util.Scanner;
public class PruebaArraysAleatrorio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double promedio = 0.0;
		System.out.println("ingrese cantidad de numeros a ingresar en el vector:");
		int cantidadDeNumerosAIngresar = teclado.nextInt();
		
		int vector [] = new int [cantidadDeNumerosAIngresar];
		for (int i = 0; i < vector.length; i++) {
			vector [i] = 0;
		}
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] =(int) (Math.random()*100 + 1);
		}
		
		for (int i = 0; i < vector.length; i++) {
			System.out.println(vector[i] + " y su posicion es : " + i);
			promedio +=  vector[i];
		}
		System.out.println("El promedio es " + promedio/cantidadDeNumerosAIngresar);
	}

}
