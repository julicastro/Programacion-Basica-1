package ar.edu.unlam.tp8;

public class PruebaTemperatura {

	public static void main(String[] args) {
		
			Temperatura prueba = new Temperatura(15);
			System.out.println(prueba.getValor());
			System.out.println(prueba.setValor(20));
			System.out.println(prueba.setValor(32,UnidadesDeTemperatura.KELVIN));
	 		System.out.println(prueba.convertir(UnidadesDeTemperatura.FARENHEIT));
	 		
		
	}

}
