package ar.edu.unlam.pb1validacion;

public class Canal {

	private String nombre;
	private Propaganda propagandas[];
	private double precioDelSegundoDeLaPropaganda;
	private int contadorDePropagandas;

	// Complete el siguiente constructor
	public Canal(String nombre, int cantidadDePropaganda, double precioPropaganda) {
		this.nombre = nombre;
		propagandas = new Propaganda[cantidadDePropaganda];
		this.precioDelSegundoDeLaPropaganda = precioPropaganda;
		
		contadorDePropagandas = 0;
		
	}

	public boolean agregarPropaganda(Propaganda propaganda) {
		// No se pueden agregar propaganda cuya duracion sea menor a 5s
		// que la cantidad de rpeticiones diarias sea mayor a 1
		// Y los codigos de la propaganda deben comenzar con 'P'
		
		if(contadorDePropagandas < propagandas.length){
			if(propaganda.getDuracion() > 5){
				if(propaganda.getCantidadDeRepetcicionesDiaria() >= 1){
					if(propaganda.getCodigoPropaganda().charAt(0) == 'P'){
						
						propagandas[contadorDePropagandas] = propaganda;
						contadorDePropagandas++;
						
						return true;
					}
				}
			}
		}
		
		return false;

	}

	public double obtenerPrecioPropaganda(String CodigoPropaganda) {

		// dado el codigo de una propaganda se necesita calcular dicho Prcio
		// El precio Se calcula La cantidad de repeticiones diarias por la duracion de
		// la misma
		// y por el precio del segundo establecido por el canal
		double precio = 0.0;
		
		for(int i = 0; i < propagandas.length; i++){
			if(propagandas[i].getCodigoPropaganda().equals(CodigoPropaganda)){
				precio = this.precioDelSegundoDeLaPropaganda * propagandas[i].getCantidadDeRepetcicionesDiaria() * propagandas[i].getDuracion();
				return precio;
			}
		}
		
		System.out.println("No existe ninguna propaganda con ese codigo.");
		
		return precio;

	}

	public void inactivarPropaganda(String codigoPropaganda) {
		// dado el codigo de la propaganda Inactivar la misma
		
		for(int i = 0; i < propagandas.length; i++){
			if(propagandas[i].getCodigoPropaganda().equals(codigoPropaganda)){
				propagandas[i].setActiva(false);
				System.out.println("Se ah inavilitado la propaganda.");
				break;
			}
		}
		
	}

}
