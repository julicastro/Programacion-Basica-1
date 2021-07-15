package ar.edu.unlam;

public class Persona{

	private String nombre;
	private String genero;
	private long dni;
	private double peso;
	private double altura;
	private int edad;
	private boolean viva = true;
	
	private boolean mayorDeEdad=false;
	
	private double calcularIMC;
	private double resultadoIMC;
	
	public Persona(String nombre, String genero, long dni, double peso, double altura){
		this.nombre=nombre;
		this.genero=genero;
		this.dni=dni;
		this.peso=peso;
		this.altura=altura;
	}
	
	public String toString(){
		return this.nombre + " es un/una " + this.genero + " cuyo dni es " + this.dni + ", pesa " + this.peso + " kilos y mide " + this.altura + ". tiene " + this.edad + " anos de edad.";
	}
	public void alimentar(double kilos){
		this.peso = this.peso + kilos;
	}
	public void crecer(double metros){
		this.altura = this.altura + metros;
	}
	public void cumplirAnos(int edad){
		int i;
		for(i=0;i<=edad;i++){
			this.edad=i;
			System.out.println("cumple " + i + " y su edad es" + this.edad);
		}
	}
	public boolean morir(){
		if(this.viva==true){
			this.viva=false;
		}return this.viva;
	}
	public double pesar(){
		return this.peso;
	}
	public boolean esMayorDeEdad(){
		if(this.edad>=18){
			this.mayorDeEdad=true;
		}else{
			this.mayorDeEdad=false;
		}return this.mayorDeEdad;
	}
	public void calcularIMC(){
		this.calcularIMC=(this.peso/(this.altura*this.altura));
		if(this.calcularIMC<=20){
			this.resultadoIMC=-1;
			System.out.println("Debajo de su peso ideal");
		}if(this.calcularIMC>=20 && this.calcularIMC<=25){
			this.resultadoIMC=0;
			System.out.println("Peso ideal :)");
		}if(this.calcularIMC>=25){
			this.resultadoIMC=1;
			System.out.println("sobre peso");
		}
		
	}
	
	
	
}