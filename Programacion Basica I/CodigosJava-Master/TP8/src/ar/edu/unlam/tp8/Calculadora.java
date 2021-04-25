package ar.edu.unlam.tp8;
import java.util.Scanner;
public class Calculadora {
	private int operador1;
	private double operador2;
	Scanner teclado = new Scanner(System.in);
	public Calculadora (){	
	}
	
	public void IngresoDeValores() {
		System.out.println("Introduce el primer valor : ");
		operador1 = teclado.nextInt();
		System.out.println("Introduce el segundo valor : ");
		operador2 = teclado.nextInt();
	}
	
	public void Menu() {
			System.out.println("1-  Sumar");
			System.out.println("2-  Restar");
			System.out.println("3 - Multiplicar");
			System.out.println("4-  Dividir");
	}
	
	public int seleccionarOpcion() {
		int seleccionarOpcion = teclado.nextInt();
		return seleccionarOpcion;
	}

	public double sumar(){
		double sumar = 0;
		sumar = operador1 + operador2;
		return sumar;
	}

	public double resta(){
		double resta = 0;
		resta = operador1 - operador2;
		return resta;
	}

	public double multiplicar (){
		double multiplicar = 0;
		multiplicar = operador1 * operador2;
		return multiplicar;
	}

	public double dividir (){
		double dividir = 0;
		if (operador2 != 0){
		dividir = operador1 / operador2;
	}
		return dividir;
	}

	public boolean esPositivo (double valor){
		if (valor > 0){
			return true;
		}else{
			return false;
		}
	}
}
