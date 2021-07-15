package ar.edu.unlam.pb1validacion;

public class Canal {

	private String nombre;
	private Propaganda propagandas[];
	private double precioDelSegundoDeLaPropaganda;
	
	// Complete el siguiente constructor
	public Canal(String nombre, int cantidadDePropaganda, double precioPropaganda) {
		this.nombre = nombre;
		this.precioDelSegundoDeLaPropaganda = precioPropaganda;
		propagandas = new Propaganda [cantidadDePropaganda];
	}
	
	public boolean agregarPropaganda(Propaganda propaganda) {
		int contadorDePropaganda = 0;
		if(contadorDePropaganda>this.propagandas.length) {
		if(propaganda.getDuracion()>5) {
			if(propaganda.getCantidadDeRepetcicionesDiaria()>1) {
				if(propaganda.getCodigoPropaganda().charAt(0)=='p') {
					propagandas[contadorDePropaganda] = propaganda;
					contadorDePropaganda++;
					return true;
				}
			}
		}
		}
		// No se pueden agregar propaganda cuya duracion sea menor a 5s
		// que la cantidad de rpeticiones diarias sea menor a 1
		// Y los codigos de la propaganda deben comenzar con 'P'

		return false;

	}

	public double obtenerPrecioPropaganda(String CodigoPropaganda) {
		
		// dado el codigo de una propaganda se necesita calcular dicho Prcio
		// El precio Se calcula La cantidad de repeticiones diarias por la duracion de
		// la misma y por el precio del segundo establecido por el canal
		
		double precio = 0.0;
		for(int i=0;i<propagandas.length;i++) {
			if(propagandas[i].getCodigoPropaganda().equals(CodigoPropaganda)) {
				precio = propagandas[i].getCantidadDeRepetcicionesDiaria() * propagandas[i].getDuracion() * this.precioDelSegundoDeLaPropaganda;
				return precio;
			}
		}
		System.out.print("No existe la propaganda");
		return precio;

	}

	public void inactivarPropaganda(String codigoPropaganda) {
		for(int i =0;i<propagandas.length;i++) {
			if(propagandas[i].getCodigoPropaganda().equals(codigoPropaganda)) {
				propagandas[i].setActiva(false);
				System.out.println("Se ha inactivado la propaganda");
				break;
			}
		}
		// dado el codigo de la propaganda Inactivar la misma
		System.out.println("No se pudo incativar");
	}

}
