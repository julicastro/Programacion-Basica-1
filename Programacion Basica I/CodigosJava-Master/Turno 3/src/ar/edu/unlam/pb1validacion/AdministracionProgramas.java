package ar.edu.unlam.pb1validacion;

import java.util.Scanner;

public class AdministracionProgramas {

	public static void main(String[] args) {
		

		//Cree el objeto miCanal de tipo Canal 
		//Y complete el codigo del menu
		String nombre= "Anonimo"; 
		int cantidadDeprogramas = 40;
		
		 Canal canal = new Canal (nombre,  cantidadDeprogramas);
		Scanner teclado = new Scanner(System.in);
		int opcion=0; 
		do {
		System.out.println("ingrese una opcion");
		System.out.println("1 agregar programa ");
		System.out.println("2 Obtener la duracion promedio de todos los programas");
		System.out.println("3 Incrementar la cantidad de actores");
		System.out.println("0 salir");
		opcion =teclado.nextInt();
		switch (opcion) {
		case 1:
			//crear un programa y agreguelo al canal creado 
			//Informar si se pudo cargar o no el programa creado
			agregarprograma(canal);
			
			break;
		case 2:
			//Informar la duracion promedio de todos los programas del canal

			ObtenerDuracionPromedioDeLosProgramas(canal);
			
			
			break;

		case 3:
			//Ingrese el codigo de un programa del canal y la cantidad de actores que sumara a dicho programa 
			//Ejemplo si el programa xxx tiene 5 actores y le ingresa 3 el mismo pasara a 8
			incermentarCantidadDeActores(canal);
			
			break;
			
		case 0:
			System.out.println("salir");
			break;

			
		default:
			System.out.println("opcion no valida");
			break;
		}
		
		
		}	while (opcion!=0);
		

	
	}

	private static void incermentarCantidadDeActores(Canal canalActual) {
		Scanner teclado = new Scanner(System.in);
		String codigoDePrograma;
		int cantidadDeActoresAIncrementar;
		
		System.out.println("Ingrese el nombre del programa");
		codigoDePrograma = teclado.next();
		System.out.println("Ingrese la cantidad de actores a incrementar");
		cantidadDeActoresAIncrementar = teclado.nextInt();
		canalActual.incrementarCantidadDeActores(codigoDePrograma, cantidadDeActoresAIncrementar);
		
	}

	private static void ObtenerDuracionPromedioDeLosProgramas(Canal canalActual) {
		System.out.println(canalActual.obtenerLaDuracionPromedioDeTodosLosProgramas());
		
	}

	private static void agregarprograma(Canal canalActual) {
		Scanner teclado = new Scanner(System.in);
		 int horario;
		 int duracion; 
		 int cantidadDeActores;
		 String nombre;
		 String diaDeTransmicion;
		System.out.println("Ingrese horario del programa.");
		horario = teclado.nextInt();
		System.out.println("Ingrese duracion del programa.");
		duracion = teclado.nextInt();
		System.out.println("Ingrese cantidad DE ACTORES.");
		cantidadDeActores = teclado.nextInt();
		System.out.println("Ingrese nombre del programa.");
		nombre = teclado.next();
		System.out.println("Infgrese Dia de transmicion del programa.");
		diaDeTransmicion = teclado.next();
		
	if(canalActual.agregarPrograma(new Programa (nombre, diaDeTransmicion, horario, duracion, cantidadDeActores)) ==true) {
		System.out.println("Se agrego correctamente el programa.");
	} else {
		System.out.println("NO se agrego el programa.");
	}
		
	}
}
