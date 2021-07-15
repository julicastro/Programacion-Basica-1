package ejercitacionPrueba.EjercicioExamenMañana;

public class Canal {
	private Empleado personal[];
	private String nombre;
	private int cantidadActualDeEmpleados;
	//Complete el siguiente constructor
	
	public Canal(String nombre, int cantidadDePersonal) {
		this.nombre = nombre;
		personal = new Empleado [cantidadDePersonal];
		this.cantidadActualDeEmpleados = 0;
	}
	public boolean agregarPersonal(Empleado empleado) {
		for (int i = 0; i < personal.length; i++) {
			if(personal[i]==null) {
				if(empleado.getApellido()!=null && empleado.getCodigoEmpleado().charAt(0)!='@') {
					personal[i] = empleado;
					cantidadActualDeEmpleados++;
					return true;
				}
			}
		}
		return false;
		// Agregar el empleado si solo si cumple con las siguientes validaciones
		// El apellido nopuede ser nullo
		// ni el codigo puede comenzar con '@'
	}

	public double IncrementarSueldoEmpleado(String codigoDeEmpelado, double montoAaumentar) {
		double sueldoIncrementado = 0.0;
		boolean sePudo = false;
		for (int i = 0; i < cantidadActualDeEmpleados; i++) {
			if(personal[i]!=null && personal[i].getCodigoEmpleado().equals(codigoDeEmpelado)) {
					sueldoIncrementado = personal[i].getSueldo() + montoAaumentar;
					personal[i].setSueldo(sueldoIncrementado);
			}
		}
		//Dado el codigo del empleado un empleado incrementar el sueldo segun el montoAincrementar 
		//El metodo debe devolver el nuevo sueldo del empleado 
		
		return sueldoIncrementado;
	}
	
	
	public int obtenerCantidadDeEmpleadosQuecobranMasDe50MilyNoEstanJubilados() {
		//obtener la candidad de empleados que cobranMas de 50Mil y no estan jubilados
		int cantidad=0;
		for (int i = 0; i < personal.length; i++) {
			if(personal[i]!= null) {
				if(personal[i].getSueldo()>50000.0 && personal[i].isEstaJubilado() == false) {
					cantidad++;
				}
			}
		}
		
		return cantidad;
	}
}
