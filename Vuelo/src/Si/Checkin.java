package Si;

import java.util.Scanner;

public class Checkin {

	public static void main(String[] args) {
		
		System.out.println("Bienvenido ");
		int CantidadPasajero = 192;
		Vuelo vuelo = new Vuelo("Buenos Aires", "Bariloche", CantidadPasajero);
		int opcion = 0;
		do {
		opcion = seleccionarOpcion();
			switch (opcion) {
				case 1:
				registrarPasajero(vuelo);
				break;
				case 2:
				elegirAsiento(vuelo);
				break;
				case 3:
				listarPasajeros(vuelo);
				break;
				default:
				System.out.println("Opción Invalida");
				break;
			}
		}while (opcion != 9);
		
	}
	
	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada=0;
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Registrar pasajero");
		System.out.println("2 - Elegir Asiento");
		System.out.println("3 - Listar pasajeros");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;
	}
		
	public static void registrarPasajero(Vuelo actual) {
		/*
		* Interfaz de usuario encargada de cargar un pasajero al vuelo. Debe ingresar los datos necesarios e informar por pantalla el resultado de la operación
		*/
		Scanner teclado = new Scanner(System.in);
		String nombre, apellido;
		int dni;
		
		System.out.println("Ingrese el nombre del pasajero: ");
		nombre = teclado.nextLine();
		
		System.out.println("Ingrese el apellido del pasajero: ");
		apellido = teclado.nextLine();
		
		System.out.println("Ingrese el dni del pasajero: ");
		dni = teclado.nextInt();
		
		if(!actual.agregarPasajero(new Pasajero(dni,nombre,apellido)))
			System.out.println("VUELO LLENO");
	}
		
	private static void elegirAsiento(Vuelo actual) {
		/*
		* Interfaz de usuario encargada de gestionar la asignación de asientos en el vuelo. Debe permitir el ingreso de los datos y mostrar por pantalla el resultado de la operación
		*/
		Scanner teclado = new Scanner(System.in);
		int dni, fila, columna;
		Pasajero pasajeroASentar;
		
		System.out.println(actual.toString());
		
		System.out.println("Ingrese el dni de la persona que quiere asignarle un asiento");
		dni = teclado.nextInt();
		
		if(actual.buscarPasajero(dni) != null){
			pasajeroASentar = actual.buscarPasajero(dni);
			
			System.out.println("Ingrese el numero de la columna ");
			columna = teclado.nextInt();
			
			System.out.println("Ingrese el numero de la fila ");
			fila = teclado.nextInt();
			
			if(actual.verificarDisponibilidadAsiento(fila, columna)){
				actual.asignarAsiento(pasajeroASentar, (fila-1), (columna-1));
				System.out.println("El pasajero: " + pasajeroASentar.toString());
				System.out.println("Se lo ubico en el asiento: columna: "+columna+" , fila: "+fila );
			}else
				System.out.println("Lugar ocupado");
		}else
			System.out.println("No existe un pasajero con ese dni.");
		
		
	}
	
	private static void listarPasajeros(Vuelo actual) {
		/*
		* Se debe mostrar la lista de pasajeros registrados para éste vuelo ordenados por DNI
		*/
		
		actual.ordenarListaDePasajerosPorDNI();
		
		if(actual.getCantPasajeros()!= 0){
			for(int i = 0; i < actual.getCantPasajeros();i++){
				if(actual.getPasajeros()[i]!= null){
					System.out.println(actual.getPasajeros()[i].toString());
				}
			}
		}else
			System.out.println("No hay pasajeros registrados.");
	}
	
	
}
