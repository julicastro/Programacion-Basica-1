package ar.edu.unlam.pb1ae2.presentacion;

import java.util.Scanner;

public class ControlRemoto {
	private static Televisor sony;
	private static int opcionDeseada;
	private static  Scanner teclado;
	private static byte bajarVolumen = 0;
	
	public static void main(String[] args) {
		sony = new Televisor((byte)125,(short) 234);
		sony.seleccionarEntrada('A');
		final int CAMBIAR_DE_CANAL = 1;
		final int SUBIR_DE_VOLUMEN_N_VECES = 2;
		final int BAJAR_DE_VOLUMEN_N_VECES = 3;
		final int SALIR = 9;
		
		// Ingrese Los datos necesarios para crear un TV
		// Luego prenda la tv
		// Seleccione La entrada de aire ya que todos los cambios de canales
		// seran sobre esta entrada
		sony.encenderOApagar();
		if(sony.isEncendido() == true) {
			boolean salir =  false;
			do{
				mostrarMenu();
				switch (seleccionarOpcion()) {
					case CAMBIAR_DE_CANAL:
					teclado = new Scanner(System.in);
					char primerDigito, segundoDigito, tercerDigito, cuartoDigito;
					System.out.println("ingrese el primer digito");
					primerDigito = teclado.next().charAt(0);
					System.out.println("ingrese el segundo digito");
					segundoDigito = teclado.next().charAt(0);
					System.out.println("ingrese el tercer digito");
					tercerDigito = teclado.next().charAt(0);
					System.out.println("ingrese el cuarto digito");
					cuartoDigito = teclado.next().charAt(0);
					if (cambiarCanal(primerDigito, segundoDigito, tercerDigito, cuartoDigito) == false) {
						System.out.println("No se pudo cambiar de canal ");
					}
					System.out.println("Canal Actual : " + sony.getCanalActual());
					break;
					case SUBIR_DE_VOLUMEN_N_VECES:
					System.out.println("Ingrese cuantas veces quiere subir el volumen: ");
					if (subirElVolumneNVeces(seleccionarOpcion()) == false) {
						System.out.println("No se pudo subir el volumen");
					}
					System.out.println("Volumen actual : " + sony.getVolumenActual());
					break;
					case BAJAR_DE_VOLUMEN_N_VECES:
					System.out.println("Ingrese cuantas veces quiere bajar el volumen: ");
					if (bajarElVolumneNVeces(seleccionarOpcion()) == false) {
						System.out.println("No se pudo bajar el volumen");
					}
					System.out.println("Volumen actual : " + sony.getVolumenActual());
					break;
					case SALIR:
					System.out.println("Saliendo...");
					salir = true;
					break;
					default :
					System.out.println("Error , ingrese nuevamente");
				}
			}while(salir == false);
		}
	}
 
	/*
	 * 
	 * devuelve la opcion seleccionada  
	 */
	
	private static void mostrarMenu() {
		System.out.println("\n");
		System.out.println("Bienvenido");
		System.out.println("*************************");
		System.out.println("Menu de opciones");
		System.out.println();
		System.out.println("1 - Cambiar de canal");
		System.out.println("2 - Subir el volumen n veces");
		System.out.println("3 - Bajar el volumen n veces");
		System.out.println("9 - Salir");
		System.out.println("*************************");
		System.out.println("Ingrese una opción : ");			
	}
	/*
	 * Se Ingresa una opcion por teclado y se devuelve la misma
	 */
	private static int seleccionarOpcion() {
		teclado = new Scanner(System.in);
		opcionDeseada = teclado.nextInt();
		return opcionDeseada;
	}
	/*
	 *  Si Puede cambiar de canal devuelve un true en caso contrario false
	 */
	public static boolean cambiarCanal(char primerDigito, char segundoDigito, char tercerDigito, char cuartoDigito) {
		short canalActual = sony.getCanalActual();
		sony.cambiarDeCanal(primerDigito, segundoDigito, tercerDigito, cuartoDigito);
		if (canalActual == sony.getCanalActual()) {
			return false;
		}
		else {
			return true;
		}
	}

	/*
	 * / Sube el volumen N veces en caso si puede incrementar / las cantidad de
	 * veces devuelve true sino deveulve false
	 */
	public static boolean subirElVolumneNVeces(int cantidadDeVeces) {
		byte subirVolumen = 0;
		subirVolumen = sony.getVolumenActual();
		if ((cantidadDeVeces + subirVolumen)  <= sony.getVOLUMEN_MAXIMO()) {
			for (int i = 0; i <cantidadDeVeces; i++) {
				sony.subirOBajarAnalogicamente('+');
				}
			return true;

		}
		return false;
	}

	/*
	 * baja el volumen N veces en caso si puede decrementar las cantidad de veces
	 * devuelve true sino deveulve false
	 */
	public static boolean bajarElVolumneNVeces(int cantidadDeVeces) {
		bajarVolumen = (byte) ((byte) sony.getVolumenActual() - (byte)cantidadDeVeces);
		if (bajarVolumen >= sony.getVOLUMEN_MINIMO()) {
			for (int i = 0; i < cantidadDeVeces; i++) {
				sony.subirOBajarAnalogicamente('-');
			}
			return true;
		} else {
			return false;
		}

	}
	
}

