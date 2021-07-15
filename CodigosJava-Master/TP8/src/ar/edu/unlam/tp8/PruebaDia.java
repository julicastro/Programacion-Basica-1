package ar.edu.unlam.tp8;

public class PruebaDia {

	public static void main(String[] args) {
		diasDeLaSemana hoy = diasDeLaSemana.LUNES;
		Dia almanaque = new Dia(hoy);
		System.out.println(almanaque.diaDeLaSemana());
		almanaque.setDia(diasDeLaSemana.VIERNES);
		System.out.println(almanaque.diaDeLaSemana());

	}

}
