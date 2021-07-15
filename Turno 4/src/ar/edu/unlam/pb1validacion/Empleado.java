package ar.edu.unlam.pb1validacion;

public class Empleado {
	private String codigoEmpleado;
	private String nombre;
	private String apellido;
	private boolean estaJubilado;
	private double sueldo;
	
	
	public Empleado(String codigoEmpleado, String nombre, String apellido, double sueldo) {
	
		this.codigoEmpleado = codigoEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.estaJubilado=false;
	}


	public boolean isEstaJubilado() {
		return estaJubilado;
	}


	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	
	
	
	public void setEstaJubilado(boolean estaJubilado) {
		this.estaJubilado = estaJubilado;
	}
	
	
	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}

	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	

}
