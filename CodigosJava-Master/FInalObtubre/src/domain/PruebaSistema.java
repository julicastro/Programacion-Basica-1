package domain;

import java.util.Scanner;

public class PruebaSistema {
	public static void main(String[] args) {
		Usuario nuevo = new Usuario("juan", "unlamPB1%", "IGNACIO", "CHARLIN", 25, false, false);
		Usuario nuevo2 = new Usuario("Pedro", "S4asd%23", "gabriel", "charlin", 65, false, false);
		Sistema unlam = new Sistema("unlam", 10);
		System.out.println(unlam.loguearUsuario("juan", "qW4&ASDq23"));
		mostrarMenu();
		boolean salir = false;
		do {
			Scanner teclado = new Scanner(System.in);
			int opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				System.out.println(nuevo.laContrasenaEsValida("S4asd%23"));
				System.out.println(nuevo.cambiarContrasenia("qW4&ASDq23"));
				System.out.println(nuevo.loguear("qW4&ASDq23"));
				System.out.println(nuevo2.loguear("S4asd%23"));
				System.out.println(unlam.agregarUsuario(nuevo));
				System.out.println(unlam.agregarUsuario(nuevo2));
				break;

			case 2:
				System.out.println("cantida de usuario logeados: " + unlam.calcularLaCantidadDeUsuariosLogueados());
				System.out.println("cantidad de usuario bloqueados: " + unlam.calcularLaCantidadDeUsuariosBloqueados());
				System.out
						.println("porcentaje de alumnos logueados: " + unlam.calcularElPorcentajeDeUsuariosLogueados());
				System.out.println("Edad promedio de los usuario logeados : " + unlam.calcularEdadPromedio());
				break;
			case 3:
				System.out.println(unlam.loguearUsuario("juan", "qW4&ASDq23"));
				System.out.println(unlam.loguearUsuario("Pedro", "S4asd%23"));
				break;
			default:
				System.out.println("error");
				salir=true;
				break;
			}
		} while (salir == false);
	}

	public static void IngresarUsuario() {

	}

	public static void mostrarMenu() {
		System.out.println("Bienvenido al menu para administradores");
		System.out.println("1. Registrar nuevos usuarios en el Sistema");
		System.out.println("2. Ver estadisticas del Sistema");
		System.out.println("3. Loguear un usario al Sistema");
		System.out.println("9. Salir");
		System.out.print("Seleccione una opcion: ");

	}
}