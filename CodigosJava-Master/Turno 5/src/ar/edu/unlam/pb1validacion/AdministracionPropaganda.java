package ar.edu.unlam.pb1validacion;

import java.util.Scanner;

public class AdministracionPropaganda {

	
	public static void main(String[] args) {

		//Cree el objeto miCanal de tipo Canal 
		//Y complete el codigo del menu
		Canal miCanal = new Canal("Canal1", 6, 4000.0);
		Scanner teclado = new Scanner(System.in);
		int opcion=0; 
		do {
		System.out.println("ingrese una opcion");
		System.out.println("1 agregar Propaganda ");
		System.out.println("2 Obtener el precio de una propaganda");
		System.out.println("3 inactivar una propaganda");
		System.out.println("0 salir");
		opcion =teclado.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("se crea una propaganada a un canal");
			
			System.out.println("Ingrese codigo de propaganda");
			String codProp = teclado.next();
			
			System.out.println("Ingrese representante");
			String repre = teclado.next();
			
			System.out.println("Ingrese la duracion en segundos de la misma");
			int duracion = teclado.nextInt();
			
			System.out.println("Ingrese la cantidad de repeticiones diarias");
			int cantRepeDia = teclado.nextInt();
			
			if(miCanal.agregarPropaganda(new Propaganda(codProp, repre, duracion, cantRepeDia))) {
				System.out.println("Se agrego correctmente");
			}else {
				System.out.println("No se pudo agregar");
			}
			
			//ingrese un propaganda a un canal
			//Informa si la propaganada se pudo agregar o  no 
			break;
		case 2:
			System.out.println("Ingrese el codigo de la propaganda");
			String codigoPropaganda = teclado.next();
			System.out.println("El precio de la propaganda es: " + miCanal.obtenerPrecioPropaganda(codigoPropaganda));
			
			//Ingrese el codigo de una propaganda del canal e Informar el  precio de la misma  

			
			break;

		case 3:
			System.out.println("Ingrese el codigo de la propaganda");

			String codigoPropaganda2 = teclado.next();
			
			miCanal.inactivarPropaganda(codigoPropaganda2);
				
			
			
			//Ingrese el codigo de una propaganda del canal para pasar su estado a inactivela

			
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
