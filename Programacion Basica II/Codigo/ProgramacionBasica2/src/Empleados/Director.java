package Empleados;

public class Director extends Gerente {

	private Double sueldoExtra;
	
	public Director(String nombre, String apellido, Double salario, String fechaNacimiento, Gerente gerente,
			String cochera,Double sueldoExtra) {
		super(nombre, apellido, salario, fechaNacimiento, gerente, cochera);
		this.sueldoExtra=sueldoExtra;
		
		
	}
	
	

}
