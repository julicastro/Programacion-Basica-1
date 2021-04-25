package ar.edu.unlam.tp8;

public class Temperatura {
	
		private double valor = 0.0;
		UnidadesDeTemperatura unidad = UnidadesDeTemperatura.KELVIN;
		public Temperatura (double valor){
			this.valor = valor;
		}

		public double setValor (double valor){
			this.valor = valor;
			return valor;
		}

		public String setValor (double valor , UnidadesDeTemperatura unidad){
			//pasar todos los valores ingresados en celsius
			switch(unidad){
				case CELSIUS:
					this.valor = valor;
					break;
				case FARENHEIT:
					this.valor = (valor - 32) * 0.556;
					break;
				case KELVIN:
					this.valor = valor - 273.15;
					break;
				}
			
			return "Convirtiendo en CELSIUS";
		}

		public double getValor(){
			return valor;
		}

		public double convertir(UnidadesDeTemperatura unidad){
			//elegir el valor en celsius a que unidad pasarlo
				
				switch(unidad){
					case FARENHEIT:
						this.valor = (valor * 1.8)+32;
						break;
					case KELVIN:
						this.valor = valor +  273.15;
						break;
				}
				return valor;
			
		}
	
}
