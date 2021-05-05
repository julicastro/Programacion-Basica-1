package Empleados;

public class Empleado {

	private String nombre;
	private String apellido;
	private Double salario;
	private String fechaNacimiento;
	private Gerente gerente;
	 
	public Empleado(String nombre, String apellido, Double salario, String fechaNacimiento,Gerente gerente) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
		this.gerente=gerente;
	}

	public Double obtenerSalario() {
		return this.salario;
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
	
	
	public Double getSalario() {
		return salario;
	}
	
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	public Gerente getGerente() {
		return gerente;
	}
	
	
	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}
	
	
	}
