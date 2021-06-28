package ar.edu.unlam;

public class Motor{

	private int tipoBomba;
	private String tipoFluido; 
	private String combustible;
	
	public Motor(int tipoBomba, String tipoFluido, String combustible){
		this.tipoBomba=tipoBomba;
		this.tipoFluido=tipoFluido;
		this.combustible=combustible;
	}
	
	public int dimeTipoMotor(){
		switch(this.tipoBomba){
			case 0:
				System.out.println("No hayestablecido un valor definido para el tipo de bomba");
				break;
			case 1: 
				System.out.println("La bomba es una bomba de agua");
				break;
			case 2: 
				System.out.println("La bomba es una bomba de gasolina");
				break;
			case 3:
				System.out.println("La bomba es una bomba de hormig�n");
				break;
			case 4:
				System.out.println("La bomba es una bomba de pasta alimenticia");
				break;
			default:
				System.out.println("No existe un valor v�lido para tipo de bomba");
		}
		return this.tipoBomba;
		
	}



}