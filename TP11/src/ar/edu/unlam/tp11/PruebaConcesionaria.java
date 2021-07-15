package ar.edu.unlam.tp11;
import java.util.Scanner;
public class PruebaConcesionaria {
	private static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		Concesionaria luxcar = new Concesionaria("luxcar" , 100);
		Coche bmw =  new Coche("bmw","318");
		Coche fiat =  new Coche("fiat","uno");
		Coche ford =  new Coche("ford","focus");
		Coche vw =  new Coche("fiat","gol");
		System.out.println(luxcar.agregarVehiculo(bmw));
		System.out.println(luxcar.agregarVehiculo(fiat));
		System.out.println(luxcar.agregarVehiculo(ford));
		System.out.println(luxcar.agregarVehiculo(vw));
		System.out.println(luxcar.toString());
		System.out.println(luxcar.buscarPorCodigo(1));
		buscador();
		switch(seleccionarOpcion()) {
			case 2:
				System.out.print("Ingresar marca");
				String marcabuscada = teclado.nextLine();
				teclado.nextLine();
				
				//System.out.println(luxcar.buscarPormarca(marcaBuscada));
				System.out.println(luxcar.buscarPormarca(marcabuscada));
				break;
		}
		
		
		
	}
	
	private static void buscador() {
		System.out.println("1- buscar coche por rango de precio");
		System.out.println("2- buscar por marca");
		System.out.println("3- buscar por modelo");
	}
	private static int seleccionarOpcion() {
		System.out.println("Seleccionar opcion : ");
		int opcionSeleccionada = teclado.nextInt();
		return opcionSeleccionada;
	}

}
