package ar.edu.unlam.tp11;
import java.util.Scanner;

public class Concesionaria {
	Scanner teclado = new Scanner(System.in);
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
	
	public String buscarPormarca(String marca) {
		String resultado = "";
		for (int i = 0; i < flota.length; i++) {
			if(flota[i]!= null) {
				if(flota[i].getMarca() == marca) {
				//resultado = resultado + flota[i].getMarca() +" " + flota[i].getModelo();
					resultado = resultado + flota[i].getMarca();
				}
			}
		}
		return resultado;
	}
	
	public String buscarPorMarca() {
		String resultado="";
		System.out.println("Seleccione que marca desea buscar");
		String marcaBuscada = teclado.next();
		for (int i = 0; i < flota.length; i++) {
			if(flota[i] != null) {
				if(flota[i].getMarca()==marcaBuscada) {
				resultado = resultado + flota[i].getMarca();
				}
			}
		}
		return resultado;
	}

}
