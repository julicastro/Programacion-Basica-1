package Si;

public class Vuelo {

	private final int CANTIDAD_DE_FILAS = 32;
	private final int CANTIDAD_DE_ASIENTOS_POR_FILA = 6;
	private String origen;
	private String destino;
	private Pasajero[] pasajeros;
	private Pasajero[][] asientos;
	
	private byte cantidadPasajeros = 0;
	
	
	public Vuelo(String origen, String destino, int cantidadPasajero) {
		/*
		* El constructor debe generar las acciones necesarias para garantizar el correcto funcionamiento de los objetos de la clase
		*/
		
		this.origen = origen;
		this.destino = destino;
		pasajeros = new Pasajero[cantidadPasajero];
		asientos = new Pasajero[CANTIDAD_DE_ASIENTOS_POR_FILA][CANTIDAD_DE_FILAS];
		
	}
	
	public boolean agregarPasajero(Pasajero pasajero) {
		/*
		* Incorpora un nuevo pasajero a la lista de pasajeros del vuelo. Devuelve true si se pudo agregar o false si la capacidad del vuelo se encuentra completa.
		*/
		
		if(cantidadPasajeros < pasajeros.length){
			
			pasajeros[cantidadPasajeros] = pasajero;
			cantidadPasajeros++;
			
			return true;
			
		}else
			return false;
		
	}
	
	public boolean verificarDisponibilidadAsiento(int fila, int columna) {
		/*
		* Verifica si el asiento indicado se encuentra disponible.
		*/
		
		if(asientos[columna][fila] == null){
			return true;
		}else 
			return false;
		
	}
	
	public Pasajero buscarPasajero(int dni) {
		/*
		* Busca un pasajero en la lista de pasajeros a partir del DNI. Si no lo encuentra devuelve null.
		*/
		for(int i = 0; i < cantidadPasajeros;i++){
			if(pasajeros[i].getDni() == dni)
				return pasajeros[i];
			
		}
		return null;
	}
	
	public boolean asignarAsiento(Pasajero pasajero, int fila, int columna) {
		
		if(verificarDisponibilidadAsiento(columna, fila) == true){
			
			siAsiento(pasajero); // PARA EVITAR Q HAYAN 2 PERSONAS EN MISMO ASCEINTO 
			asientos[columna][fila] = pasajero;
			
			return true;
		}else
			return false;
	}
	
	public void ordenarListaDePasajerosPorDNI() {
		/*
		* Ordena la lista de pasajeros por DNI.
		*/
		Pasajero aux = null;
		for(int i = 0; i < (cantidadPasajeros-1); i++){
			for(int f = 0; f < (cantidadPasajeros-1); f++){
				if(pasajeros[f].getDni() > pasajeros[f+1].getDni()){
					aux = pasajeros[f];
					pasajeros[f] = pasajeros[f+1];
					pasajeros[f+1] = aux;
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
		*/
		String s = "";
		for(int c = 0; c < asientos.length; c++){
			for(int f = 0; f < asientos[0].length; f++){
				if(verificarDisponibilidadAsiento(f, c))
					s += "L ";
				else
					s += "O ";
			}
			s += "\n";
		}
		
		return s;
	}
	
	public boolean siAsiento(Pasajero pasajero){
		for(int i = 0; i < asientos.length; i++){
			for(int j = 0; j < asientos[0].length; j++){
				if(asientos[i][j] != null){
					if(pasajero.getDni() == asientos[i][j].getDni()){
						
						asientos[i][j] = null;
						
						return true;
					}
				}
			}
		}
		return false;
	}
	
	public byte getCantPasajeros(){
		return cantidadPasajeros;
	}
	
}
