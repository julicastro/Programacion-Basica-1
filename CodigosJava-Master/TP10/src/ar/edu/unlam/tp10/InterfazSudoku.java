package ar.edu.unlam.tp10;

import java.util.Scanner;

public class InterfazSudoku {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		Sudoku juego = null;
		int modo = 0;
		
		System.out.println("SUDOKU");
		
		juego = seleccionarModoJuego(teclado);
		
		System.out.println(juego);
		
		int fila , columna , numero; 
		do {
			System.out.println("fila: ");
			fila = teclado.nextInt();
			System.out.println("columna: ");
			columna = teclado.nextInt();
			System.out.println("numero: ");
			numero = teclado.nextInt();
			if(juego.validar(fila, columna, numero)) {
				juego.setValor(numero, fila, columna);
				System.out.println(juego);
			}
			else {
				juego.setValor(numero, fila, columna);
				System.err.println(juego);
			}
		} while (juego.algunaCeldaVacia()|| !juego.validar());
		System.out.println("Felicitaciones !! ");
	}
	
	private static Sudoku seleccionarModoJuego(Scanner teclado){
		Sudoku nuevo;
		int modo;
		System.out.println("Sellecione el modo");
		System.out.println("1- facil");
		System.out.println("2- intermedio");
		System.out.println("3- dificil");
		System.out.println("4- prueba");
		
		modo = teclado.nextInt();
		
		switch (modo) {
		case 1: 
			nuevo = new Sudoku(Dificultad.FACIL);
			break;
		case 2:
			nuevo = new Sudoku(Dificultad.INTERMEDIO);
			break;
		case 3 :
			nuevo = new Sudoku (Dificultad.DIFICIL);
			break;
		default:
			nuevo = new Sudoku();
			break;
		}
		
		return nuevo;
	}
}
