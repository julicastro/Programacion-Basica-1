package ar.edu.unlam.pb1.eva03;

public class ListaDeReproduccion {

	private String nombre;
	private Cancion [] canciones;
	
	public ListaDeReproduccion(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	
	public boolean agregarCancion(Cancion nueva) {
		Cancion cancionEncontrada = buscarNombre(nueva.getNombre());
		if(cancionEncontrada==null)
		for(int i=0;i<canciones.length;i++) {
			if(canciones[i]==null) {
				canciones[i]=nueva;
					return true;
			}
		}
		return false;
	}
	
	public boolean eliminarCancion(String nombreDeLaCancion) {
		
		for(int i=0;i<canciones.length;i++) {
			if(canciones[i]!=null&&canciones[i].getNombre()==nombreDeLaCancion) {
				canciones[i]=null;
					return true;
			}
		}
		return false;
	}
	
	public Cancion buscarNombre(String nombre) {
		for(int i=0;i<canciones.length;i++) {
			if(canciones[i].getNombre()==nombre) {
				return canciones[i];
			}
		}
		
		return null;
	}
	
	public String toString() {
		return "nombre de la lista " + this.nombre + ", canciones: " + canciones.toString();
		
	}
	
}
