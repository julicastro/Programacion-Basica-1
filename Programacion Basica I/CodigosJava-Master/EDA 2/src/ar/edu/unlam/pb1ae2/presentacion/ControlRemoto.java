package ar.edu.unlam.pb1ae2.presentacion;

import java.util.Scanner;

import ar.edu.unlam.pb1ae2.dominio.Televisor;

public class ControlRemoto {

	public static void main(String args[]){
		
		int opcion;
		byte volumenAnterior;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el maximo de aire");
		byte ma = entrada.nextByte();
		System.out.println("Ingrese el maximo de cable");
		short mc = entrada.nextShort();
		Televisor sony = new Televisor(ma,mc);
		sony.encender();
		sony.seleccionarEntrada('A');
		System.out.println("Bienvenido");
		do{
		System.out.println("**************************");
		System.out.println("Menu de opciones");
		System.out.println(" ");
		System.out.println("1 - Cambiar de canal ");
		System.out.println("2 - Subir el volumen n veces ");
		System.out.println("3 - bajar el bolumen n veces ");
		System.out.println("9 - Salir ");
		System.out.println("**************************");
		System.out.println("Ingrese una opcion: ");
		Scanner teclado = new Scanner (System.in);
		opcion = teclado.nextInt();
		switch(opcion){
		case 1:
			boolean cambioONo;
			System.out.println("cambiar canal");
			System.out.println("ingrese primer digito");
			char primerDigito=teclado.next().charAt(0);
			System.out.println("ingrese segundo digito");
			char segundoDigito=teclado.next().charAt(0);
			System.out.println("ingrese tercer digito");
			char tercerDigito=teclado.next().charAt(0);
			System.out.println("ingrese cuarto digito");
			char cuartoDigito=teclado.next().charAt(0);
		sony.cambiarDeCanal(primerDigito,segundoDigito,tercerDigito,cuartoDigito);
		System.out.println("el nuevo canal es " + sony.getCanalActual());
			if(sony.getCanalActual()!=0) {
				System.out.println(cambioONo=true);
			}else
				System.out.println(cambioONo=false);
		break;
		case 2:
			boolean subioONO;
			System.out.println("Subir el volumen n veces");
			Scanner volumenMas = new Scanner(System.in);
			System.out.println("Ingrese el volumen que desea subir: ");
			int cantidadDeVeces = volumenMas.nextInt();
			for(int i = 1;i<=cantidadDeVeces;i++){
			sony.subirOBajarAnalogicamente('+');
			}
			System.out.println("volumen actual: " + sony.getVolumen());
			if(sony.getVolumen()!=sony.getVolumenAnterior()){
				System.out.println(subioONO=true);
			}if(sony.getVolumen()==sony.getVolumenAnterior() || cantidadDeVeces==0){
				System.out.println(subioONO=false);
			}
			break;
		case 3:
			System.out.println("Bajar el volumen n veces");
			Scanner volumenMenos = new Scanner(System.in);
			System.out.println("Ingrese el volumen que desea bajar: ");
			int cantidadDeVeces1 = volumenMenos.nextInt();
			for(int i = 1;i<=cantidadDeVeces1;i++){
			sony.subirOBajarAnalogicamente('-');
			}
			System.out.println("volumen actual: " + sony.getVolumen());
			if(sony.getVolumen()!=sony.getVolumenAnterior()){
				System.out.println(subioONO=true);
			}if(sony.getVolumen()==sony.getVolumenAnterior()||cantidadDeVeces1==0){
				System.out.println(subioONO=false);
			}
		break;
		}
		}while(opcion!=9);	
		System.out.println("Usted ha salido del menu, que tenga un buen dia");
	}
	
//fin del main
	
	// public static void mostrarMenu() {
		
	//}

	//public static int seleccionarOpcion(){
		
	//}		
		
	//public static boolean cambiarCanal(char primerDigito, char segundoDigito, char tercerDigito, char cuartoDigito) {
		
	//}
	
	//public static boolean subirElVolumneNVeces(int cantidadDeVeces){
	
	//}

	//public static boolean bajarElVolumneNVeces(int cantidadDeVeces){

	//}
	
	
}



