package ar.edu.unlam;

import java.util.Scanner;

public class Hacker{
	
	public static void main(String args[]) {
		
		Cuenta julian = new Cuenta();
		
	
	Scanner entradaNombre = new Scanner(System.in);
	System.out.println("Introduzca titular, saldo, deposito: ");
	String titular = entradaNombre.next();
	julian.setTitular(titular);
	Scanner entradaSaldo = new Scanner(System.in);
	double plata = entradaSaldo.nextDouble();
	julian.setSaldo(plata);
	Scanner entradaDeposito = new Scanner(System.in);
	double plataXMes = entradaDeposito.nextDouble();
	julian.setDepositoMensual(plataXMes);
	System.out.println("Titutal: " + julian.getTitular() + ", saldo: " + julian.getSaldoInicial() + ", deposito: " + julian.getDeposito());
	
	System.out.println(" ");
	
	System.out.println("Intrduzca el dinero a robar: ");
	Scanner robado = new Scanner(System.in);
	
	double dineroARobar = robado.nextDouble();					
	double dineroTotal; 					
	double maximoRobado = 100*(julian.saldoActual()/10);
			
	while(dineroARobar<maximoRobado) {	
		if(julian.saldoActual()>julian.getSaldoInicial()/2) {
			dineroTotal = julian.saldoActual() - dineroARobar;
			System.out.println("El robo fue de " + dineroARobar + " y el saldo actual es " + dineroTotal);
		}else {
				System.out.println("No se puede robar man");
			}
		}
	
	
		
	}
}


//public class Hacker {
//	private String cuent="";
//	private int plata;
//	private int deposito;
//	
//	public Hacker (String nombre, int saldoInicial, int depositoPorMes) {
//		cuent=nombre;
//		plata=saldoInicial;
//		deposito=depositoPorMes;
//		System.out.println("Saldo Inicial: "+plata+ "   Depositado al mes:  " +deposito);
//	}
//	
//	public static void main (String[]arg) {
//		
//		Scanner teclado=new Scanner (System.in);
//		System.out.println("Ponga nombre de la cuenta/Saldo inicial/Y el deposito por mes");
//		String cue1=teclado.nextLine();
//		int ini = teclado.nextInt();
//		int mes= teclado.nextInt();
//		
//		Hacker cuenta= new Hacker (cue1, ini, mes);
//		int dineroRobado = 0;
//		int extraccion;
//		int actual=cuenta.deposito+cuenta.plata;
//		int inicial=cuenta.plata;
//		int porMEs=cuenta.deposito;
//		
//		System.out.println("¿Y cuanto dinero desea robarle aproximadamente?");
//		int robomax=teclado.nextInt();
//		
//		while(dineroRobado<robomax) {
//		
//			if(actual>inicial/2)
//		{	System.out.println("Se puede hacer la extraccion");
//			extraccion=actual/10;
//			System.out.println("Robaste "+ extraccion);
//			actual=actual-extraccion;
//			System.out.println("El saldo en cuenta "+actual);
//			inicial=actual;
//			System.out.println("Su nuevo saldo inicial es: " +inicial);
//			actual=actual+porMEs;
//			System.out.println("El saldo con su deposito del mes: "+cuenta.deposito+" Entonces es: "+actual);
//		 	dineroRobado=+extraccion;
//			System.out.println("Total del dinero robado: "+dineroRobado);
//		}else {
//			System.out.println("No se puede robar");
//			dineroRobado=robomax;
//			  }	
//		}	
//	}
//}


