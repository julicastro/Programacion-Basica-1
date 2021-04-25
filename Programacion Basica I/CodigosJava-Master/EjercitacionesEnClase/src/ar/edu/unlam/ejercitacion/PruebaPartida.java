package ar.edu.unlam.ejercitacion;
import java.util.Scanner;

public class PruebaPartida {

	public static void main(String[] args) {
		String jugadorUno , jugadorDos, palabraDelJugadorUno , palabraDelJugadorDos;
		Scanner teclado =  new Scanner(System.in);
		System.out.println("Ingrese nombre del jugador uno : ");
		jugadorUno = teclado.nextLine();
		System.out.println("Ingrese nombre Del jugador dos : ");
		jugadorDos = teclado.nextLine();
		System.out.println("Ingrese palabra el jugador UNO ");
		palabraDelJugadorUno = teclado.nextLine();
		for (int i = 0; i < 1000; i++) {
			System.out.println(" ");
		}
		System.out.println("Ingrese palabra el jugador DOS");
		palabraDelJugadorDos = teclado.nextLine();
		for (int i = 0; i < 1000; i++) {
			System.out.println(" ");
		}
		

	}

}
