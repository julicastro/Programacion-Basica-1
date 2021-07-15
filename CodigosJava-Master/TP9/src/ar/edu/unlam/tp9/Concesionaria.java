package ar.edu.unlam.tp9;
import java.util.Scanner;

public class Concesionaria {
	private String nombre ;
	private Coche flota[];
	private int cantidadDeAutos;
	public Concesionaria(String nombre,int cantidadMaximaDeCoches){
		this.nombre = nombre;
		this.flota= new Coche[cantidadMaximaDeCoches];
		cantidadDeAutos = 0;
	}
	
	public boolean agregarVehiculo(Coche luxcar) {
		for (int i = 0; i < flota.length; i++) {
			if(flota[i] == null) {
				flota[i] = luxcar;
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		String cadena = "";
		for (int i = 0; i < flota.length; i++) {
			if(flota[i]!= null) {
			cadena +="["+ i + "] " + flota[i].getMarca() + " " + flota[i].getModelo()+ "\n";
			}
		}
		return cadena;
	}
	
	public String buscarPorCodigo(int codigo) {
		String resultado = null;
		for (int i = 0; i < flota.length; i++) {
			if(i == codigo) {
				resultado = flota[i].getMarca() +" " + flota[i].getModelo();
			}
		}
		return resultado;
	}

}
/*Menú de opciones para ofrecer las funcionalidades del mismo:
i. Ingresar un nuevo vehículo (Se relacionará el índice del array como el
código del vehículo.
ii. Mostrar listado de vehículos. Se mostrará código (índice del array, marca y
modelo)
iii. Mostrar detalle de un código particular. Se debe ingresar el código, y se
muestra por pantalla toda la información que se dispone del vehículo.*/