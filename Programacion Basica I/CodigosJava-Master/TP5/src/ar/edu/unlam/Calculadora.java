package ar.edu.unlam;

public class Calculadora{

	private double operador1;
	private double operador2;
	private double resultado;
	
	public Calculadora(){
	}
	
	public Calculadora(double operador1, double operador2){
		this.operador1=operador1;
		this.operador2=operador2;
	}
		
	public double sumar(){
		return this.operador1 + this.operador2;
	}
	
	public double sumar(double operador1, double operador2){
		return operador1 + operador2;
		
	}
	
	public double restar(){
		return this.operador1 - this.operador2;
	} 
	
	public double restar(double operador1, double operador2){
		return operador1 - operador2;
	}
	
	public double multiplicar(){
		return this.operador1 * this.operador2;
	}

	public double multiplicar(double operador1, double operador2){
		return operador1 * operador2;
	}

	public double dividir(){
		if(this.operador2<=0){
			System.out.println("Error capo! ");
			return 0;
		}
		return this.operador1 / this.operador2;
		
	}

	public double dividir(double operador1, double operador2){
		if(operador2<=0){
			System.out.println("Error capo! ");
			return 0;
		}
		return operador1 / operador2;
	}
		public double esPositivo(){
	if(this.resultado > 0){
	System.out.println ("El resultado es positivo");
	}
	
	if(this.resultado < 0){
	System.out.println("El resultado es negativo");
	}
	return this.resultado;
	}	
	
	// POTENCIA
	public void potencia(double base, double exponente){
		this.operador1=base;
		this.operador2=exponente;
	for(int i=0;i <=operador2;i++){
		resultado = (int)Math.pow(this.operador1,i);
	System.out.println("el operador: "+this.operador1+" elevado a "+i+" es igual a: "+resultado);
	}
	System.out.println("el resultado es: "+resultado);
	}
	// SUMATORIA
	public void sumatoria(int limite){// INT LIMITE ES EL PARAMETRO
		for(int i=0;i<=limite;i++){
			this.resultado=this.resultado+i;
			System.out.println("la sumatoria es " + i + " y el resultado es " + resultado);
		}
		System.out.println("el resultado es: " + this.resultado);
	}
	//SUMATORIA 2
	public void sumatoria(int limiteInferior, int limiteSuperior){
		for(int i=limiteInferior;i<=limiteSuperior;i++){
		this.resultado=this.resultado+i;
			System.out.println("la sumatoria es " + i + " y el resultado es " + resultado);
		}
		System.out.println("el resultado es: "+ this.resultado);
	}
	// PRODUCTORIA
	public void productoria(int limite){
		for(int i=1;i<=limite;i++){
		this.resultado=this.resultado*i;
		System.out.println("la productoria es " + i + " y el resultado es " + resultado);
		}
		System.out.println("el resultado es: "+ this.resultado);
	}
	//PRODUCTORIA 2
	public void productoria(int limiteInferior, int limiteSuperior){
		for(int i=limiteInferior;i<=limiteSuperior;i++){
		this.resultado=this.resultado*i;
			System.out.println("la productoria es " + i + " y el resultado es " + resultado);
		}
		System.out.println("el productoria es: "+ this.resultado);
	}
	//CONTAR DIVISORES
	public void contarDivisores(int numero){
		for(int i=1;i<=numero;i++){
			if(numero%i==0){
				this.resultado=i;
				System.out.println("divisrioes: " + this.resultado);
			}
		}
	}
	

}	