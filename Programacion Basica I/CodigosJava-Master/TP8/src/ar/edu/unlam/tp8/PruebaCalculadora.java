package ar.edu.unlam.tp8;

public class PruebaCalculadora {

	public static void main(String[] args) {
		Calculadora prueba = new Calculadora ();
		prueba.IngresoDeValores();
		prueba.Menu();
		switch (prueba.seleccionarOpcion()) {
			case 1:
				System.out.println("El resultado de la suma es : " + prueba.sumar());
				break;
			case 2:
				System.out.println("El resultado de la resta es : " + prueba.resta());
				break;
			case 3:
				System.out.println("El resultado de la multiplicacion es : " + prueba.multiplicar());
				break;
			case 4:
				System.out.println("El resultado de la division es : " + prueba.dividir());
				break;
			default :
				System.out.println("Error , ingrese nuevamente");
				break;
		}

	}

}
