package ar.edu.unlam.tp8;

public class Tragamonedas {
	Tambor tambor1 = new Tambor();
	Tambor tambor2 = new Tambor();
	Tambor tambor3 = new Tambor();
	
	public Tragamonedas() {
		
	}
	
	public int getPosicion() {
		int posicionGanadora= 0;
		if(tambor1.getPosicion() == tambor2.getPosicion() && tambor1.getPosicion() == tambor3.getPosicion()) {
			posicionGanadora = tambor1.getPosicion();
			System.out.println("Gano los 3 tambores estan en la posicion " + posicionGanadora );
		}else {
			System.out.println("Perdio , vuelva a intentarlo");
		}
		return posicionGanadora;
	}
	
	public void girar() {
		tambor1.girar();
		tambor2.girar();
		tambor3.girar();
	}
	
	
}
