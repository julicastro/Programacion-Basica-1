package Empleados;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class EmpleadoTest{
	
	@Test
	public void queSePuedaCrearUnEmpleado() {

		String nombre= "elMulo";
		String apellido= "perez";
		Double salario= 1000.0;
		String fechaNacimiento= "21/2/1990";
		String tipoEmpleado="Empleado";
		Gerente gerentePrincipal = new Gerente("el capo", "garcia", 20000.0, "20/5/1965", null, "c5");
		Gerente subGerente = new Gerente("el segundo", "perez", 20000.0, "20/5/1965", gerentePrincipal, "c5");
		Empleado empleado= new Empleado (nombre,apellido,salario,fechaNacimiento,gerentePrincipal);
		assertNotNull(empleado);
		assertEquals(20000.0,gerentePrincipal.obtenerSalario(),0.01);
		
		Ingeniero ingeniero = new Ingeniero("el segundo", "perez",1000.0, "20/5/1965", gerentePrincipal, 100.0);
		assertEquals(1100.0,ingeniero.obtenerSalario(),0.01);
	}
	
	
	
	
}
