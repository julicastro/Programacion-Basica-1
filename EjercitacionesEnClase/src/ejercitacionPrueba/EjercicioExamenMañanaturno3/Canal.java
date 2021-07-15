package ejercitacionPrueba.EjercicioExamenMañanaturno3;

public class Canal {
	private String nombre;
	private Programa programacion[];
	private int cantidadDePorgramas;
	
	
	// Complete el siguiente constructor
	public Canal(String nombre, int cantidadDeprogramas) {
		this.nombre = nombre;
		programacion = new Programa [cantidadDeprogramas];
		cantidadDeprogramas = 0;
	}


	public boolean agregarPrograma(Programa programa) {
		for (int i = 0; i < programacion.length; i++) {
			if (programacion[i] == null && programa.getNombre().charAt(0) == '#' && programa.getCantidadDeActores()>= 2){
				programacion[i] = programa;
				cantidadDePorgramas++;
				return true;
			}
		}
		// Para poder agregar los programas se debe cumplir con las sigueintes reglas
		// Los nombres de los programas deben comenzar con #(numeral)
		// deben contener almenos 2 actores

		
		
		return false;

	}

	public double obtenerLaDuracionPromedioDeTodosLosProgramas() {
		double promedio = 0.0;
		for (int i = 0; i < cantidadDePorgramas; i++) {
			if (programacion[i]!=null) {
				promedio += programacion[i].getDuracion();
			}
		}
		promedio = (promedio/cantidadDePorgramas);
		//Obtiene la duracion promedio de todos los porgrmas del canal
		
		return promedio;
	}

	public void incrementarCantidadDeActores(String codigoDePrograma, int cantidadDeActoresAIncrementar) {
		for (int i = 0; i < cantidadDePorgramas; i++) {
			if(programacion[i]!= null && programacion[i].getNombre().equals(codigoDePrograma)) {
				int actores = programacion[i].getCantidadDeActores()+cantidadDeActoresAIncrementar;
				programacion[i].setCantidadDeActores(actores);
			}
		}
		//Dado el codigo de programa incremta la cantidad de actore
		
	}
	
	public String toString() {
		String listado ="";
		for (int i = 0; i < cantidadDePorgramas; i++) {
			listado += programacion[i].getNombre() +" "+programacion[i].getDiaDeTransmicion()+" " + programacion[i].getCantidadDeActores() + "\n";
		}
		return listado;
	}

}
