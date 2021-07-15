
public class PartidoTennis{

	private String jugador1;
	private String jugador2;
	
	private int puntosJ1PrimerSet;
	private int puntosJ2PrimerSet;
	private int puntosJ1SegundoSet;
	private int puntosJ2SegundoSet;
	private int puntosJ1TercerSet;
	private int puntosJ2TercerSet;
	
	private int setsGanadosJ1 = 0;
	private int setsGanadosJ2 = 0;
	
	private String ganador;
	
	public PartidoTennis(String jugador1, String jugador2, int puntosJ1PrimerSet, int puntosJ2PrimerSet, int puntosJ1SegundoSet, int puntosJ2SegundoSet, int puntosJ1TercerSet, int puntosJ2TercerSet){
		this.jugador1=jugador1;
		this.jugador2=jugador2;
		this.puntosJ1PrimerSet=puntosJ1PrimerSet;
		this.puntosJ1SegundoSet=puntosJ1SegundoSet;
		this.puntosJ1TercerSet=puntosJ1TercerSet;
		this.puntosJ2PrimerSet=puntosJ2PrimerSet;
		this.puntosJ2SegundoSet=puntosJ2SegundoSet;
		this.puntosJ2TercerSet=puntosJ2TercerSet;
	}
	public String primerSet(){
		if(this.puntosJ1PrimerSet>this.puntosJ2PrimerSet){
			this.setsGanadosJ1++;
			this.ganador=this.jugador1;
		}if(this.puntosJ1PrimerSet<this.puntosJ2PrimerSet){
			this.setsGanadosJ2++;
			this.ganador=this.jugador2;
		}return this.ganador + "gana el primer set ";
	}
	public String segundoSet(){
		if(this.puntosJ1SegundoSet>this.puntosJ2SegundoSet){
			this.setsGanadosJ1++;
			this.ganador=this.jugador1;
		}if(this.puntosJ1SegundoSet<this.puntosJ2SegundoSet){
			this.setsGanadosJ2++;
			this.ganador=this.jugador2;
		}return this.ganador + "gana el segundo set ";
	}
	public String tercerSet(){
		if(this.puntosJ1TercerSet>this.puntosJ2TercerSet){
			this.setsGanadosJ1++;
			this.ganador=this.jugador1;
		}if(this.puntosJ1TercerSet<this.puntosJ2TercerSet){
			this.setsGanadosJ2++;
			this.ganador=this.jugador2;
		}return this.ganador + "gana el tercer set ";
	}
	public String ganador(){
		if(this.setsGanadosJ1>this.setsGanadosJ2){
			this.ganador=this.jugador1;
		}if(this.setsGanadosJ1<this.setsGanadosJ2){
			this.ganador=this.jugador2;
		}return this.ganador + "Es el ganador del juego";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}