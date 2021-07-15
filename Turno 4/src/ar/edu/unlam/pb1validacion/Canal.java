package ar.edu.unlam.pb1validacion;

public class Canal {

	
	private Empleado personal[];
	private String nombre;

	//Complete el siguiente constructor
	
	public Canal(String nombre, int cantidadDePersonal) {
		this.nombre = nombre;
		personal = new Empleado[cantidadDePersonal];
		
		
	}
	public boolean agregarPersonal(Empleado empleado) {
			if(empleado.getApellido()!=null) {
				if(empleado.getCodigoEmpleado().charAt(0)!='@') {
					return true;
				}
			}
			return false;
		
		// Agregar el empleado si solo si cumple con las siguientes validaciones
		// El apellido no puede ser nullo
		// ni el codigo puede comenzar con '@'
	}
	
	public double IncrementarSueldoEmpleado(String codigoDeEmpelado, double montoAaumentar) {
		for(int i =0;i<personal.length;i++) {
			if(personal[i].getCodigoEmpleado().equals(codigoDeEmpelado)) {
				personal[i].setSueldo(personal[i].getSueldo() + montoAaumentar);
				return personal[i].getSueldo();
			}
		}
		//Dado el codigo del empleado un empleado incrementar el sueldo segun el montoAincrementar 
		//El metodo debe devolver el nuevo sueldo del empleado 
		
		return 0.0;
	}
	
	
	public int obtenerCantidadDeEmpleadosQuecobranMasDe50MilyNoEstanJubilados() {

		//obtener la candidad de empleados que cobranMas de 50Mil y no estan jubilados
		
		int cantidad=0;
		for(int i=0;i<personal.length;i++) {
			if(personal[i].getSueldo()>50000) {
				if(!personal[i].isEstaJubilado()) {
					cantidad++;
				}
			}
		}
		
		return cantidad;
		
	}
	
	
}
