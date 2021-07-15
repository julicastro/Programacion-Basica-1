package ar.edu.unlam.tp7;

public class PruebaCalculadora {

	public static void main(String[] args) {
		Calculadora prueba = new Calculadora (5, 2);
		System.out.println("El resultado de la potencia es  : " + prueba.potencia());
		System.out.println("La sumatoria total es : " + prueba.sumatoria(9));
		System.out.println("La sumatoria total es : " + prueba.sumatoria(2,5));
		System.out.println("La multiplicacion total es : " + prueba.productoria(6));
		System.out.println("La multiplicacion total es : " + prueba.productoria(3,6));
		prueba.contarDivisores(6);
		prueba.factorial(6);
	}

}
