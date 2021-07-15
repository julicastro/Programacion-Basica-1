package ar.edu.unlam.pb1.eva03;

public class Usuario {

	private String nombre;
	private int edad;
	private ListaDeReproduccion [] misListasDeReproduccion;
	private int cantidadDeListas;
	
	
	public Usuario(String nombre, int edad, int cantidadDeListas) {
		this.nombre=nombre;
		this.edad=edad;
		this.cantidadDeListas=cantidadDeListas;
		misListasDeReproduccion=new ListaDeReproduccion[cantidadDeListas];
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public boolean agregarNuevaLista(String nombreDeLaLista) {
		for(int i=0;i<misListasDeReproduccion.length;i++) {
			misListasDeReproduccion[i]= new ListaDeReproduccion(nombreDeLaLista);
			return true;
		}
	return false;
		
		
	}

	public ListaDeReproduccion[] getMisListasDeReproduccion() {
		ListaDeReproduccion [] nueva = new ListaDeReproduccion[this.misListasDeReproduccion.length];
		int cantidadDeListas = 0;
		for(int i=0;i<misListasDeReproduccion.length;i++) {
			if(this.misListasDeReproduccion[i]==null) {
				System.out.println("Canctidad de listas" + cantidadDeListas);
				return this.misListasDeReproduccion;
			}else {
				nueva[cantidadDeListas]=this.misListasDeReproduccion[i];
				cantidadDeListas++;
				System.out.println(misListasDeReproduccion[i].getNombre());
			}
			System.out.println("cantidad de listas: " + cantidadDeListas);
			return this.misListasDeReproduccion;
			
			
		}
		
		return null;
		

	
	}
	
	public String verMisListasDeReproduccion() {
		
		for(int i=0;i<misListasDeReproduccion.length;i++) {
			
			System.out.println(misListasDeReproduccion[i].toString());
		}
	
		return null;

	}
	
	public String reproducirLista(int numeroDeLista) {
		
		return misListasDeReproduccion[numeroDeLista-1].getNombre();
	
	}
	
	
	
	
	
}
