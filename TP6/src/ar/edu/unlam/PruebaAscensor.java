package ar.edu.unlam;

import java.util.Scanner;

public class PruebaAscensor {

	public static void main(String[] args) {
		
		Ascensor subito = new Ascensor();
		
		subito.abrirPuerta();
		subito.subir();
		subito.subir();
		subito.subir();
		subito.cerrarPuerta();
		subito.bajar();
		subito.bajar();
		subito.bajar();
		subito.subir();
		subito.subir();
		
		System.out.println("Indique a que piso desea ir:");
		Scanner teclado = new Scanner(System.in);
		int IrAlPisoDeseado = teclado.nextInt();
		subito.irAlPiso(IrAlPisoDeseado);
		System.out.println("Piso actual: " + subito.getPisoActual());
		
		System.out.println("El ascenso está en el piso " + subito.obtenerPisoActual());
		if(subito.laPuertaEstaAbierta()){
			System.out.println("La puerta está abierta");
		}
		else{
			System.out.println("La puerta está cerrada");
		}
		
	}

}
