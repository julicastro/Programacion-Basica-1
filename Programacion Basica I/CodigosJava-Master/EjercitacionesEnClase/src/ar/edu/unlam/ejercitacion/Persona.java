package ar.edu.unlam.ejercitacion;

public class Persona {
	String nombre;
	long dni=0;
	public Persona(String nombre , long dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	
	
}
