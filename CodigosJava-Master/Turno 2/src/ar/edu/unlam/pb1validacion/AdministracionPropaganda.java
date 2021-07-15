package ar.edu.unlam.pb1validacion;

import java.util.Scanner;

public class AdministracionPropaganda {

	
	public static void main(String[] args) {

		//Cree el objeto miCanal de tipo Canal 
		//Y complete el codigo del menu
		
		Canal miCanal = new Canal("Reo",10,3000);
		
		Scanner teclado = new Scanner(System.in);
		int opcion=0; 
		do {
		System.out.println("ingrese una opcion");
		System.out.println("1 agregar Propaganda ");
		System.out.println("2 Obtener el precio de una propaganda");
		System.out.println("3 inactivar una propaganda");
		System.out.println("0 salir");
		opcion = teclado.nextInt();
		teclado.nextLine();
		switch (opcion) {
		case 1:
			System.out.println("se crea una propaganada a un canal");
			//ingrese un propaganda a un canal
			//Informa si la propaganada se pudo agregar o  no 
			
			String codigoPropaganda, representante;
			int duracion, cantidadDeRepetcicionesDiaria;
			
			System.out.print("Ingrese codigo de propaganda: ");
			codigoPropaganda = teclado.nextLine();
			
			System.out.print("Ingrese representante: ");
			representante = teclado.nextLine();
			
			System.out.print("Ingrese duracion: ");
			duracion = teclado.nextInt();
			
			System.out.print("Ingrese cantidad de repeticiones diaria:");
			cantidadDeRepetcicionesDiaria = teclado.nextInt();
			
			if(miCanal.agregarPropaganda(new Propaganda(codigoPropaganda,representante,duracion,cantidadDeRepetcicionesDiaria))){
				System.out.println("Se ah cargado la propaganda.");
			}else
				System.out.println("No se ah podido cargar la propaganda");
			
			break;
		case 2:
			//Ingrese el codigo de una propaganda del canal e Informar el  precio de la misma  
			
			String codigoPropaganda1;
			
			System.out.println("ingrese el codigo de la propaganda que desea ver el precio: ");
			codigoPropaganda1 = teclado.nextLine();
			
			System.out.println("El precio de la propaganda es: "+miCanal.obtenerPrecioPropaganda(codigoPropaganda1));
			
			break;

		case 3:
			//Ingrese el codigo de una propaganda del canal para pasar su estado a inactivela
			
			String codigoPropaganda2;
			System.out.println("Ingrese el codigo de la propaganda que desea inactivar: ");
			codigoPropaganda2 = teclado.nextLine();
			
			miCanal.inactivarPropaganda(codigoPropaganda2);
			
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
