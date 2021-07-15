package ar.edu.unlam;

public class Automovil{

	private int velocidad; //MRU DISTANCIA,TIEMPO,VELOCIDAD
	private double horas;
	private int aceleracion; 
	private int tiempo = 0;
		
	public Automovil(int velocidad, double horas){
	this.velocidad = velocidad;
	this.horas = horas /60;
	}
	
	public Automovil(int velocidad, int horas){
	this.velocidad = velocidad;
	this.horas =  (double)horas /60;
	}
			
	// distancia = velocidad * hora
	
	public int alcanzarVelocidadMaxima(int aceleracion,int velocidadMax) {
		int velocidadAux;
		
		while(velocidad<=velocidadMax) {
			for(int i = 0;i<100;i++) {
				velocidadAux=0+aceleracion*i;
				tiempo++;
				i++;
				velocidad=+velocidadAux;
				if(velocidad<=velocidadMax) {
					System.out.println("Velocidad: "+velocidad+ " \nEl tiempo en acelerar fue:" + i);
				}
			}
		}
		return tiempo;
	}
	
	public String toString() {
		System.out.println("Distancia, velocidad, horas: ");
		double distancia=velocidad*horas;
		return distancia + " " + this.velocidad + " " + this.horas;
 
	}
	
	public double getDistancia(){
		double distancia=velocidad*horas;
		return distancia;
	}
	public double getVelocidad(){
		return this.velocidad;
	}
	public double getHoras(){
		return this.horas;
	}
	
} 
