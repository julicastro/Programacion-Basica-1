package ar.edu.unlam;

public class PruebaEstadisticasDePersonas{

	public static void main(String[] args) {
	
	}
	
	private double pesoPromedio;
	private int personasConBajoPeso;
	private int personasConPesoNormal;
	private int personasConPesoAlto;
	private double promedioEdadPesoBajo;
	private double promedioEdadSobrePeso;
	
	private int cantidadPersonas = 0;
	
	private double calcularIMC;
	private double resultadoIMC;
	
	
	public PruebaEstadisticasDePersonas(String nombre, double peso, double altura, int edad){
		while(cantidadPersonas==50){
			this.calcularIMC=(peso/(altura*altura));
			if(this.calcularIMC<=20){
				this.resultadoIMC=-1;
				System.out.println("Peso bajo");
				personasConBajoPeso++;
			}else{if(this.calcularIMC>=20 && this.calcularIMC<=25){
				this.resultadoIMC=0;
				System.out.println("Peso normal");
				personasConPesoNormal++;
			}else{if(this.calcularIMC>=25){
				this.resultadoIMC=1;
				System.out.println("peso alto");
				personasConPesoAlto++;

					}
				}
			}
		cantidadPersonas++;
	}		

		promedioEdadPesoBajo=(personasConBajoPeso/cantidadPersonas);
		promedioEdadSobrePeso=(personasConPesoAlto/cantidadPersonas);
	
}
	
	public double getPromedioBajo(){
		return promedioEdadPesoBajo;
	}
	
	public double getPromedioAlto(){
		return promedioEdadSobrePeso;
	}
	
}

