package ar.edu.unlam.tp7;

public class Calculadora {
	private int operador1;
	private double operador2;

	public Calculadora (int operador1 , double operador2){
		this.operador1 = operador1;
		this.operador2 = operador2;
	}

	public double potencia (){
		double potencia =1;
		for (int i = 1 ; i<=operador2 ; i++){
			potencia = potencia * operador1;
		}
		return potencia;
	}

	public int sumatoria (int limite){
		int resultado = 0;
		for(int i = 0 ; i<limite ; i++){
			resultado = resultado + i;
		}
		return resultado;
	}

	public int sumatoria (int limiteInferior , int limiteSuperior){
		int resultado = 0;
		for(int i = limiteInferior ; i <= limiteSuperior; i++){
			resultado = resultado + i;
		}
		return resultado;
	}

	public int productoria (int limite){
		int resultado = 1;
		for (int i = 1 ; i < limite ; i++){
			resultado = resultado * i;
		}
		return resultado;
	}

	public int productoria (int limiteInferior , int limiteSuperior){
		int resultado = 1;
		for(int i = limiteInferior ; i <= limiteSuperior; i++){
			resultado = resultado * i;
		}
		return resultado;
	}

	public void contarDivisores ( int limite){
		double resto = 0.0;
		int divisores=0;
		for (int i =1; i<= limite ; i++){
			resto=limite%i;
			if(resto == 0){
				divisores = i;
				System.out.println("Lo numeros divisores de " + limite + " son : " + divisores);
			}
		}
	}
	
	public void factorial(int numero) {
		int resultado = 1;
		do {
			resultado = resultado * numero;
			numero--;
		}while(numero != 0);
		System.out.println("El numero a factorizar es : " + numero + " y su resultado es : " + resultado);
	}
}
