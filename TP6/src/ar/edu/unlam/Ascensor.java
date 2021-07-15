package ar.edu.unlam;

	public class Ascensor {
		
		private final int PISO_MAXIMO = 10;
		private final int PISO_MINIMO = 0;
		private int pisoActual = 0;
		private boolean puertaAbierta = false;
		//
		public void subir(){
			if(pisoActual < PISO_MAXIMO && !puertaAbierta){
				pisoActual++;
			}
		}
		
		public void bajar(){
			if(pisoActual > PISO_MINIMO && !puertaAbierta){
				pisoActual--;
			}
		}
		
		public int obtenerPisoActual(){
			return pisoActual;
		}
		
		public void abrirPuerta(){
			puertaAbierta = true;
		}
		
		public void cerrarPuerta(){
			puertaAbierta = false;	
		}
		
		public boolean laPuertaEstaAbierta(){
			return puertaAbierta;
		}
		
		public int irAlPiso(int pisoDeseado) {
			while(pisoActual<PISO_MAXIMO && pisoActual>PISO_MINIMO){
				pisoActual = pisoDeseado; 
			}
				return this.pisoActual;
			}
		
		public int getPisoActual(){
			return this.pisoActual;
		}
	}


