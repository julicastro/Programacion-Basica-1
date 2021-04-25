package ar.edu.unlam.tp8;


public class PruebaMath {

	public static void main(String[] args) {
		/*abs(int a):Devuelve el valor absoluto de un numero en int
		 *abs(double a):Devuelve el valor absoluto de un numero en doble
		 *abs(float a):Devuelve el valor absoluto de un numero en float
		 *abs(long a):Devuelve el valor absoluto de un numero en long
		 *pow(double a, double b):Devuelve un número elevado a un exponente.
		 *random():Devuelve un número aleatorio entre 0 y 1. Se pueden cambiar el rango de generación
		 *round(float a):Devuelve el entero más cercano en float
		 *round(double a):Devuelve el entero más cercano en double
		 *sqrt(double a):Devuelve la raíz cuadrada de un número.
		*/
		
		int numeroEntero =  4;
		double numeroNegativo = -7;
		double numeroElevado = Math.pow(numeroEntero, 2);
		System.out.println("El resultado de elevar al cuadrado a " + numeroEntero + " es " +numeroElevado);
		System.out.println("el valor absoluto de : " + numeroNegativo +" es " + Math.abs(numeroNegativo));
		System.out.println("La raiz de "+  numeroElevado + " es " + Math.sqrt(numeroElevado));
		
		
	}

}
