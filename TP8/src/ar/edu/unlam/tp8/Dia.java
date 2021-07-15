package ar.edu.unlam.tp8;

public class Dia {
		diasDeLaSemana elDia = diasDeLaSemana.LUNES;
		

		public Dia(diasDeLaSemana elDia){
			 this.elDia = elDia;
		}

		public String diaDeLaSemana(){
			String elDiaEs;
			switch(elDia){
				case DOMINGO:
				elDiaEs = "Domingo";
				break;
				case LUNES:
				elDiaEs = "Lunes";
				break;
				case MARTES:
				elDiaEs = "Martes";
				break;
				case MIERCOLES:
				elDiaEs = "Miercoles";
				break;
				case JUEVES:
				elDiaEs = "Jueves";
				break;
				case VIERNES:
				elDiaEs = "Viernes";
				break;
				case SABADO:
				elDiaEs = "Jueves";
				break;
				default:
				elDiaEs = "el dia ingresado es incorrecto";
			}
			return elDiaEs;
		}

		public void setDia (diasDeLaSemana nuevoDia){
			elDia = nuevoDia;
		}
}
