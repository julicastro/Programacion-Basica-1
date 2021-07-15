package ejercitacionPrueba.EjercicioExamenMañana;

import java.util.Scanner;

public class AdministracionPropaganda {

	public static void main(String[] args) {
		// Cree el objeto miCanal de tipo Canal
		// Y complete el codigo del menu
		Canal2 canalTrece = new Canal2("Canal trece", 10, 5);
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("ingrese una opcion");
			System.out.println("1 agregar Propaganda ");
			System.out.println("2 Obtener el precio de una propaganda");
			System.out.println("3 inactivar una propaganda");
			System.out.println("0 salir");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				agregarPropaganda(canalTrece);
				// ingrese un propaganda a un canal
				// Informa si la propaganada se pudo agregar o no
				break;
			case 2:
				// Ingrese el codigo de una propaganda del canal e Informar el precio de la
				// misma
				precioDeLaPropaganda(canalTrece);
				break;

			case 3:
				// Ingrese el codigo de una propaganda del canal para pasar su estado a
				// inactivela
				inactivarPublicacion(canalTrece);
				break;

			case 0:
				System.out.println("salir");
				break;

			default:
				System.out.println("opcion no valida");
				break;
			}

		} while (opcion != 0);

	}
	
	public static void agregarPropaganda(Canal2 actual) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingresar codigo: ");
		String codigoPropaganda = teclado.nextLine();
		System.out.print("Ingresar representante: ");
		String representante = teclado.nextLine();
		System.out.print("Ingresar duracion: ");
		int duracion = teclado.nextInt();
		System.out.print("Ingresar repeticiones: ");
		int cantidadDeRepetcicionesDiaria = teclado.nextInt();
		Propaganda samsung = new Propaganda(codigoPropaganda, representante, duracion, cantidadDeRepetcicionesDiaria);
		if (actual.agregarPropaganda(samsung) == true) {
			System.out.println("Se agrego propaganda");
		}else {
			System.out.println("No se pudo agregar");
		}
	}
	
	public static void precioDeLaPropaganda(Canal2 actual) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingresar codigo: ");
		String codigoPropaganda = teclado.nextLine();
		System.out.println("$" + actual.obtenerPrecioPropaganda(codigoPropaganda));
	}
	
	public static void inactivarPublicacion (Canal2 actual) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingresar codigo: ");
		String codigoPropaganda = teclado.nextLine();
		actual.inactivarPropaganda(codigoPropaganda);
		System.out.println("inavilitada");
	}
}
