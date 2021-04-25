package ar.edu.unlam.tp9;
import java.util.Scanner;
public class PruebaPartida {

	public static void main(String[] args) {
		String jugadorUno,jugadorDos,palabraAAdivinarJugador1,palabraAAdivinarJugador2;
		int opcionSelecionada = 0;
		boolean elActualAdivino=false , elActualPerdio=false;
		ElAhorcado partidaNueva;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese nombre del Primer jugador");
		jugadorUno = teclado.nextLine();
		System.out.println("Ingrese nombre del segundo jugador");
		jugadorDos = teclado.nextLine();
		
		partidaNueva = new ElAhorcado(jugadorUno,jugadorDos); 
		
		System.out.println("Ingrese la palabra del jugador 1");
		palabraAAdivinarJugador1 = teclado.nextLine();
		partidaNueva.setPalabraAAdivinarJugador1(palabraAAdivinarJugador1);

		limpiarPantalla();
		
		System.out.println("Ingrese la palabra del jugador 2");
		palabraAAdivinarJugador2 = teclado.nextLine();
		partidaNueva.setPalabraAAdivinarJugador2(palabraAAdivinarJugador2);
		
		limpiarPantalla();
		
		partidaNueva.elegirInicidor();
		do {
			partidaNueva.cambiarTurno();
			System.out.println("Turno de " + partidaNueva.getTurnoActual().getNombre());
			System.out.println("Palabra a buscar " + partidaNueva.getTurnoActual().mostrarPalabraAdivinar());
			do {
				mostrarMenu();
				opcionSelecionada = teclado.nextInt();
			} while (opcionSelecionada != 1 && opcionSelecionada != 2);
			if (opcionSelecionada == 1) {
				char letraArriesgada;
				System.out.println("Ingrese la letra a arriesgar");
				letraArriesgada = teclado.next().charAt(0);
				if(partidaNueva.arriesgarLetra(letraArriesgada) == true) {
					System.out.println("Correcto");
					System.out.println("Palabra a buscar " + partidaNueva.getTurnoActual().mostrarPalabraAdivinar());
				}else {
				System.out.println("Incorrecto");
				partidaNueva.getTurnoActual().perderVidas();
					if(partidaNueva.getVidasActual() <= 0 ) {
						System.out.println(partidaNueva.getTurnoActual().getNombre() + " perdio se quedo sin vidas");
					}
				}
			}else {
				String palabraArriesgada;
				System.out.println("Ingrese la palabra a arriesgar : ");
				palabraArriesgada = teclado.next();
				if (partidaNueva.arriesgarPalabra(palabraArriesgada)== true) {
					elActualAdivino = true;
					System.out.println(partidaNueva.getTurnoActual() .getNombre()+ " gano");
				}else {
					elActualPerdio = true;
					System.out.println(partidaNueva.getTurnoActual().getNombre() + " perdio");
				}
			}		
		}while (elActualPerdio == false && partidaNueva.getVidasActual() > 0 && elActualAdivino == false);
	}
	
	public static void limpiarPantalla() {
		for (int i = 0; i < 1000; i++) {
			System.out.println();
		}
	}
	
	public static void mostrarMenu() {
		System.out.println("seleccione la opcion deseada");
		System.out.println("1- Ingresar letra");
		System.out.println("2- Arriesgar");
	}

}
