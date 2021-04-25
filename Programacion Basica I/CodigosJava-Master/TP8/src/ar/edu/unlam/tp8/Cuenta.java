package ar.edu.unlam.tp8;
import java.util.Scanner;

public class Cuenta {
	private double saldoFinal = 0.0;
	private double saldoInicial = 0.0;

	
	public Cuenta (double saldoInicial){
		saldoFinal= saldoInicial;
		this.saldoInicial =  saldoInicial;
	}
	
	public void menu() {
		System.out.println("Bienvenidos");
		System.out.println("************");
		System.out.println(" ");
		System.out.println("A - Depositas");
		System.out.println("B - Extraer");
		System.out.println("C - Consultar");
		System.out.println("D - Salir");
	}
	
	public char seleccionarOpcion () {
		char opcion ;
		Scanner teclado = new Scanner (System.in);
		opcion = teclado.next().charAt(0);
		return opcion;
	}
	
	public double monto() {
		double monto = 0;
		Scanner ingreso = new Scanner (System.in);
		monto = ingreso.nextDouble();
		return monto;
	}

	public void ingreso (double ingreso){
		if(ingreso>=0){
			this.saldoFinal = this.saldoFinal +  ingreso;
		}
	}

	public void retirar (double retiro){
		if (retiro <= this.saldoFinal){
			this.saldoFinal = this.saldoFinal - retiro;
		}else {
			System.out.println("Saldo insuficiente.");
		}
	}

	public double verSaldo (){
		return this.saldoFinal;
	}

	public double verSaldoIncial (){
		return this.saldoInicial;
	}


}
