package ar.edu.unlam.pb1validacion;

import java.util.Scanner;

public class AdministracionProgramas {

	public static void main(String[] args) {
		

		//Cree el objeto miCanal de tipo Canal 
		//Y complete el codigo del menu
		Canal miCanal = new Canal("Canal13", 10);
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
			System.out.println("Escriba el nombre del programa");
			String nombre = teclado.next();
			
			System.out.println("Escriba el diaDeTrasmicion");
			String diaDeTransmicion = teclado.next();
			
			System.out.println("Escriba el horario del programa");
			int horario = teclado.nextInt();
			
			System.out.println("Escriba la duracion del programa");
			int duracion = teclado.nextInt();

			System.out.println("Escriba la cantidad de actores");
			int cantidadDeActores = teclado.nextInt();

			if(miCanal.agregarPrograma(new Programa(nombre, diaDeTransmicion, horario, duracion, cantidadDeActores ))) {
				System.out.println("Se agrego el programa");
			}else {
				System.out.println("No se agrego");
			}
			//crear un programa y agreguelo al canal creado 
			//Informar si se pudo cargar o no el programa creado
			break;
			
		case 2:
			//Informar la duracion promedio de todos los programas del canal
		
			System.out.println("La duracion promedio es: " + miCanal.obtenerLaDuracionPromedioDeTodosLosProgramas() + " minutos");

			
			break;

		case 3:
			System.out.println("Escriba el codigo del programa");
			String codigo = teclado.next();
			
			System.out.println("Escriba la cantidad de actores a sumar");
			int cantidadASumar = teclado.nextInt();
			
			miCanal.incrementarCantidadDeActores(codigo, cantidadASumar);
			
			//Ingrese el codigo de un programa del canal y la cantidad de actores que sumara a dicho programa 
			//Ejemplo si el programa xxx tiene 5 actores y le ingresa 3 el mismo pasara a 8
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
}
