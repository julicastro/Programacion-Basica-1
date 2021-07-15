package ar.edu.unlam.ejercitacion;

public class Vuelo {
	private final int CANTIDAD_DE_FILAS = 32;
	private final int CANTIDAD_DE_ASIENTOS_POR_FILA = 6;
	private String origen;
	private String destino;
	private Pasajero[] pasajeros;
	private Pasajero[][] asientos;
	private int cantidadActualDePasajeros = 0;
	
	
	public Vuelo(String origen, String destino, int cantidadPasajero) {
		
		this.origen = origen;
		this.destino = destino;
		pasajeros = new Pasajero [cantidadPasajero];
		asientos = new Pasajero[CANTIDAD_DE_ASIENTOS_POR_FILA][CANTIDAD_DE_FILAS];
		limpiarMatriz();
		limpiarArrays();
	/*
	* El constructor debe generar las acciones necesarias para garantizar el correcto funcionamiento de los objetos de la clase
	*/
	}

	public boolean agregarPasajero(Pasajero pasajero) {
		/*
		 * Incorpora un nuevo pasajero a la lista de pasajeros del vuelo. Devuelve true
		 * si se pudo agregar o false si la capacidad del vuelo se encuentra completa.
		 */
		for (int i = 0; i < pasajeros.length; i++) {
			if (pasajeros[i] == null) {
				pasajeros[i] = pasajero;
				cantidadActualDePasajeros++;
				return true;
			}

		}
		return false;
	}

	public boolean verificarDisponibilidadAsiento(int fila, int columna) {
	/*
	* Verifica si el asiento indicado se encuentra disponible.
	*/
		if (asientos[fila][columna] == null) {
			return true;
		}
		return false;
	}
	public Pasajero buscarPasajero(int dni) {
	/*
	* Busca un pasajero en la lista de pasajeros a partir del DNI. Si no lo encuentra devuelve null.
	*/
		//Pasajero pasajeroABuscar = null;
		for (int i = 0; i < (this.pasajeros.length -1); i++) {
			if(pasajeros[i].getDni()== dni) {
				//pasajeroABuscar = pasajeros[i];
				return pasajeros[i];
			}
			
		}
		return null;
		
	}
	public boolean asignarAsiento(Pasajero pasajero, int fila, int columna) {
		/*
		* Asigna el asiento al pasajero recibido por parámetro. Devuelve true si lo pudo a[signar o false en caso que el asiento no se encuentre disponible.
		*/
		if(verificarDisponibilidadAsiento(fila, columna) == true) {
			asientos[fila][columna] = pasajero;
			return true;
		}
		return false;
		}
		public void ordenarListaDePasajerosPorDNI() {
		/*
		* Ordena la lista de pasajeros por DNI.
		*/
		Pasajero auxiliar;
		for (int i = 1; i <= cantidadActualDePasajeros; i++) {

			for (int j = 0; j < cantidadActualDePasajeros; j++) {
				if(pasajeros[j + 1] != null) {
				if (pasajeros[j].getDni() > pasajeros[j + 1].getDni()) {
					auxiliar = pasajeros[j];
					pasajeros[j] = pasajeros[j + 1];
					pasajeros[j + 1] = auxiliar;

				}
			}  
			}
			}
		}
		public Pasajero[] getPasajeros() {
		/*
		* Devuelve la lista de pasajeros
		*/
			return pasajeros;
		}
		public String toString() {
		/*
		* Devuelve un mapa de los asientos del vuelo indicando por cada uno si se encuentra libre "L" u ocupado "O".
		*/String disponibilidadAsientos = "El vuelo con orien: " + origen +" con destino: " + destino + "\n";
		for (int i = 0; i < CANTIDAD_DE_ASIENTOS_POR_FILA; i++) {
	        for (int j = 0; j <  CANTIDAD_DE_FILAS; j++) {
			            if (asientos[i][j]== null) {
			            disponibilidadAsientos +="[L]";
			            }else {
			            	disponibilidadAsientos +="[O]";
			            }
			        }
			        disponibilidadAsientos += "\n";
			        if(i == 2) {
			        	disponibilidadAsientos += "------------------------------------------------------------------------------------------------ \n";
			        }
			    }
		return disponibilidadAsientos;	
		}
	
		
		
		private void limpiarMatriz() {
			 for (int i = 0; i < CANTIDAD_DE_ASIENTOS_POR_FILA; i++) {
			        for (int j = 0; j <  CANTIDAD_DE_FILAS; j++) {
			            asientos[i][j]= null;
			            }
			            
			        }
			        
			    }
		
		private void limpiarArrays() {
			for (int i = 0; i < pasajeros.length; i++) {
					pasajeros[i] = null;
				}
		}
}
