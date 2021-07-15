package ar.edu.unlam.pb1validacion;

public class Canal {

	private String nombre;
	private Programa programacion[];
	private final int CANTIDAD_DE_PROGRAMAS;
	private final int CANTIDAD_MINIMA_ACTORES = 2;
	private int cantidadActualDeProgramas;
	
	
	// Complete el siguiente constructor
	public Canal(String nombre, int cantidadDeprogramas) {
		this.nombre = nombre;
		this.CANTIDAD_DE_PROGRAMAS = cantidadDeprogramas;
		programacion = new Programa [this.CANTIDAD_DE_PROGRAMAS];
		this.cantidadActualDeProgramas =0;
	}


	public boolean agregarPrograma(Programa programa) {
		// Para poder agregar los programas se debe cumplir con las sigueintes reglas
		// Los nombres de los programas deben comenzar con #(numeral)
		// deben contener almenos 2 actores
		if (this.cantidadActualDeProgramas < programacion.length) {
		if(programa.getNombre().charAt(0) == '#') {
			if(programa.getCantidadDeActores() >= CANTIDAD_MINIMA_ACTORES) {
				programacion [this.cantidadActualDeProgramas]= programa;
				this.cantidadActualDeProgramas++;
				return true;
				}
			}
		}		
		
		return false;

	}

	public double obtenerLaDuracionPromedioDeTodosLosProgramas() {
		
		//Obtiene la duracion promedio de todos los porgrmas del canal
		double promedio = 0.0;
		for (int i = 0; i <this.cantidadActualDeProgramas ; i++) {
			promedio = (programacion[i].getDuracion() / this.cantidadActualDeProgramas);
		}
		
		return promedio;
	}

	public void incrementarCantidadDeActores(String codigoDePrograma, int cantidadDeActoresAIncrementar) {

		//Dado el codigo de programa incremta la cantidad de actores
		for (int i = 0; i < this.cantidadActualDeProgramas; i++) {
			if(programacion[i].getNombre().equals(codigoDePrograma)){
			programacion[i].setCantidadDeActores(programacion[i].getCantidadDeActores() + cantidadDeActoresAIncrementar);
			
			}
		}
		
		
	}

}
