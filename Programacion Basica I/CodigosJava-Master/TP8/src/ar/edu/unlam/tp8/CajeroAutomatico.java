package ar.edu.unlam.tp8;

import java.util.Scanner;

public class CajeroAutomatico {

	public static void main(String[] args) {
		final char DEPOSITAR ='A';
		final char EXTRAER = 'B';
		final char CONSULTAR = 'C';
		final char SALIR = 'D';
		boolean salirDelMenu = false;
				Cuenta credicoop = new Cuenta (0);
				do {
				credicoop.menu();
					switch(credicoop.seleccionarOpcion()) {
						case DEPOSITAR : 
							System.out.println("Monto a depositar : ");
							credicoop.ingreso(credicoop.monto());
							System.out.println("Su saldo actual es " + credicoop.verSaldo());
						break;
						case EXTRAER :
							System.out.println("Monto a retirar : ");
							credicoop.retirar(credicoop.monto());
							System.out.println("Su saldo actual es " + credicoop.verSaldo());
						break;
						case CONSULTAR :
							System.out.println("Su saldo actual es " + credicoop.verSaldo());
						break;
						case SALIR:
							System.out.println("Saliendo ...");
							salirDelMenu = true;
						break;
						default:
							System.out.println("Error , ingrese nuevamente");
					}
				}while(salirDelMenu == false);
	}

}
