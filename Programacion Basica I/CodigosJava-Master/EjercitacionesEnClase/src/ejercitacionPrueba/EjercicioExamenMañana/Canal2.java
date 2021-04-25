package ejercitacionPrueba.EjercicioExamenMañana;

public class Canal2 {
	private String nombre;
	private Propaganda propagandas[];
	private double precioDelSegundoDeLaPropaganda;
	private int cantidadDePropagandas;

	// Complete el siguiente constructor
	public Canal2(String nombre, int cantidadDePropaganda, double precioPropaganda) {
		this.nombre = nombre;
		propagandas = new Propaganda[cantidadDePropaganda];
		this.cantidadDePropagandas = 0;
	}

	public boolean agregarPropaganda(Propaganda propaganda) {
		for (int i = 0; i < propagandas.length; i++) {
			if (propagandas[i]== null) {
				if (propaganda.getDuracion()<5 && propaganda.getCantidadDeRepetcicionesDiaria() > 1 && propaganda.getCodigoPropaganda().charAt(0) == 'p') {
					propagandas[i] = propaganda;
					cantidadDePropagandas++;
					return true;
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
		// la misma
		// y por el precio del segundo establecido por el canal
		double precio = 0.0;
		for (int i = 0; i < cantidadDePropagandas; i++) {
			if(propagandas[i].getCodigoPropaganda().equals(CodigoPropaganda) && propagandas[i]!= null) {
				precio = (propagandas[i].getCantidadDeRepetcicionesDiaria()*propagandas[i].getDuracion());
			}
		}
		return precio;

	}

	public void inactivarPropaganda(String codigoPropaganda) {
		// dado el codigo de la propaganda Inactivar la misma
		for (int i = 0; i < cantidadDePropagandas; i++) {
			if(propagandas[i].getCodigoPropaganda().equals(codigoPropaganda) && propagandas[i]!= null) {
				propagandas[i].setActiva(false);
			}
		}
	}


}
