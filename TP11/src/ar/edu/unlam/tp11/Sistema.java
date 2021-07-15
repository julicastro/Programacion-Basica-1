package ar.edu.unlam.tp11;
import java.util.Scanner;
public class Sistema {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		
		Aula informatica = new Aula (300,5,5);
		boolean salir= false;
		do {
			mostrarMenu();
			switch (seleccionarOpcion()) {
			case 1:
				System.out.println("se pudo ocupar : " + informatica.ocuparEscritorio());
				break;
			case 2:
				System.out.println("La cantidad de alumnos en el aula es de " + informatica.getCantidadAlumnos());
				break;
			case 3: 
				System.out.println("La cantidad de escritorios libres es " + informatica.disponibilidadDeEscritorios());
				break;
			case 4 :
				System.out.println("El escritorio solicitado esta : " + informatica.consultarEstadoDelEscritorio());
			case 5 :
				System.out.println("El alumno buscado se encontro ? " + informatica.buscarAlumno());
				break;
			case 9:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Error");
				break;
			}
		}while(salir!= true);

	}
	
	public static void mostrarMenu() {
			System.out.println("Bienvenido");
			System.out.println("1- ocupar escritorio");
			System.out.println("2- cantidadDeAlumnos");
			System.out.println("3- escritorios libres");
			System.out.println("4- consultar estado del escritorio");
			System.out.println("5- buscar alumno");
			System.out.println("9- salir");

	}
	
	public static int seleccionarOpcion() {
		System.out.println("Seleccionar opcion : ");
		int opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;
	}

}
