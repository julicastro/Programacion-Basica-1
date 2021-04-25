package ar.edu.unlam.ejercitacion;
import java.util.Scanner;

public class funcionDeCine {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		Cine funcion = new Cine (150);
		Pelicula peliculaATransmitir = peliculaATransmitir();
		
		boolean salir = false;
		do {
			mostrarMenu();
			switch (seleccionarOpcion()) {
			case 1:
				agregarEspectador(funcion , peliculaATransmitir);
				break;
			case 2:
				sentarEspectador(funcion);
				break;
			case 3: 
				informacionDeLaPelicula(peliculaATransmitir);
				break;
			case 4:
				recaudacionTotal(funcion);
				break;
			case 5:
				System.out.println(funcion.isDisponibilidad());
			case 6:
				System.out.println("Saliendo...");
				salir = true;
				break;
			default:
				System.out.println("Error , ingrese nuevamente");
				break;
			}
		} while (salir == false);

	}
	
	public static void mostrarMenu() {
		System.out.println("Sistema de Hoyts");
		System.out.println("*****************");
		System.out.println("1- Agregar espectador");
		System.out.println("2- Sentar espectador");
		System.out.println("3- Pelicula que se va a transmitir");
		System.out.println("4- Recaudacion");
		System.out.println("5- Disponibilidad");
		System.out.println("6- Salir");
	}
		
	public static int seleccionarOpcion() {
		System.out.print("Seleccionar opcion: ");
		int opcion = teclado.nextInt();
		teclado.nextLine();
		return opcion;
	}
	
	public static Pelicula peliculaATransmitir () {
		System.out.print("Que pelicula se va a transmitir: ");
		String titulo = teclado.nextLine();
		System.out.print("Duracion de la pelicula: ");
		double duracion = teclado.nextDouble();
		teclado.nextLine();
		System.out.print("Edad minima para ingresar: ");
		short edadMinima = teclado.nextShort();
		teclado.nextLine();
		System.out.println("Nombre del director");
		String director = teclado.nextLine();
		Pelicula peliculaATransmitir = new Pelicula(titulo, duracion, edadMinima, director);
		return peliculaATransmitir;
	}
	
	public static void informacionDeLaPelicula(Pelicula aTransmitir) {
		System.out.println("La pelicula que se va a transmitir : " + aTransmitir.getTitulo());
		System.out.println("Su director es : " + aTransmitir.getDirector());
		System.out.println("Su duracion es : " +  aTransmitir.getDuracion() + " horas");
		System.out.println("Su edad minima para verla es : "+ aTransmitir.getEdadMinima() + " anios");
	}
	
	public static void agregarEspectador(Cine actual , Pelicula peliculaATransmitir) {
		System.out.print("Ingrese nombre del espectador: ");
		String nombre = teclado.nextLine();
		System.out.print("Ingrese la edad: ");
		int edad = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Ingrese el dinero con el que cuenta: ");
		int dinero = teclado.nextInt();
		teclado.nextLine();
		Espectador nuevo = new Espectador (nombre , edad , dinero);
		if(actual.agregarespectador(nuevo)== true && edad > peliculaATransmitir.getEdadMinima() && dinero > actual.getPrecioDeLaEntrada()) {
			System.out.println("Se ingreso espectador exitosamente");
		}else{
			System.out.println("No se pudo agregar espectador");
		}
	}
	
	public static void sentarEspectador (Cine actual) {
		Espectador nuevo;
		System.out.print("Ingrese el nombre del espectador a sentar: ");
		String nombre = teclado.nextLine();
		nuevo = actual.buscarEspectador(nombre);
		if(nuevo != null) {
			System.out.print("Ingrese fila del asciento");
			int fila = teclado.nextInt();
			teclado.nextLine();
			System.out.print("Ingrese columna del asciento");
			int columna = teclado.nextInt();
			if(actual.asignarAsciento(nuevo, fila, columna)== true) {
				System.out.println("El espectador se sento");
			}else {
				System.out.println("No se pudo sentar");
			}
		}else {
			System.out.println("No se encontro el espectador");
		}
	}
	
	public static void recaudacionTotal (Cine actual) {
		System.out.println("La recaudacion de esta sala es : " + actual.getRecaudacion());
	}
}
