package ar.edu.unlam.pb1validacion;

public class Canal {

	private String nombre;
	private Programa programacion[];
	private int cantidadDeProgramas;

	
	
	// Complete el siguiente constructor
	public Canal(String nombre, int cantidadDeprogramas) {
		this.nombre=nombre;
		this.cantidadDeProgramas = cantidadDeprogramas;
		programacion = new Programa [cantidadDeprogramas];
	}


	public boolean agregarPrograma(Programa programa) {
	if(this.cantidadDeProgramas<programacion.length) {	
		if(programa.getNombre().charAt(0)=='#') {
			if(programa.getCantidadDeActores()>2) {
				cantidadDeProgramas++;
				return true;
				}
			}
		}
		return false;
		
		// Para poder agregar los programas se debe cumplir con las sigueintes reglas
		// Los nombres de los programas deben comenzar con #(numeral)
		// deben contener almenos 2 actores

	}

	public double obtenerLaDuracionPromedioDeTodosLosProgramas() {
		double promedio;
		for(int i=0;i<programacion.length;i++) {
			promedio = (this.programacion[i].getDuracion() / this.cantidadDeProgramas);
		}
		//Obtiene la duracion promedio de todos los porgrmas del canal
		
		return 0.0;
	}

	public void incrementarCantidadDeActores(String codigoDePrograma, int cantidadDeActoresAIncrementar) {
		for(int i=0;i<programacion.length;i++) {
			if(programacion[i].getNombre().equals(codigoDePrograma)) {
				programacion[i].setCantidadDeActores(programacion[i].getCantidadDeActores() + cantidadDeActoresAIncrementar);
			}
		}
		//Dado el codigo de programa incremta la cantidad de actores
		
		
		
	}

}
