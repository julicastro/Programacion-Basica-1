package turnoNoche;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestGrupo03 {

	@Test
	void queSePuedaAgregarUnAlumno() {
		Alumno camila = new Alumno("Camila");
		Materia pb1 = new Materia("Programacion Basica I");
		
		pb1.agregarAlumno(camila);

		assertEquals(1, pb1.getCantidadDeAlumnos());
	}
	
	
	@Test
	void queUnAlumnoPuedaRendirUnParcial() {
		Materia pb1 = new Materia("Programacion Basica I");
		Alumno camila = new Alumno("Camila");

		pb1.agregarAlumno(camila);

		camila.rendir(0, 8.0);

		assertEquals(8.0, pb1.calcularElPromedioDelParcial(0));
	}
	
	@Test
	void queUnAlumnoPromocione() {
		Materia pb1 = new Materia("Programacion Basica I");
		Alumno camila = new Alumno("Camila");

		pb1.agregarAlumno(camila);

		camila.rendir(0, 7.0);
		camila.rendir(1, 8.0);
		
		
		assertEquals(true, pb1.obtenerAlumno(0).promociono());
	}
	
	@Test
	void queElPromedioDeUnParcialSea7() {
		Materia pb1 = new Materia("Programacion Basica I");
		Alumno camila = new Alumno("Camila");
		Alumno juan = new Alumno("Juan");

		pb1.agregarAlumno(camila);
		pb1.agregarAlumno(juan);

		camila.rendir(0, 7.0);
		juan.rendir(0, 7.0);
		
		
		assertEquals(7.0, pb1.calcularElPromedioDelParcial(0), 0.01);
	}
	
	@Test
	void queLaCantidadDeAprobadosSea1() {
		Materia pb1 = new Materia("Programacion Basica I");
		Alumno camila = new Alumno("Camila");
		Alumno juan = new Alumno("Juan");

		pb1.agregarAlumno(camila);
		pb1.agregarAlumno(juan);


		camila.rendir(0, 7.0);
		juan.rendir(0, 4.0);
		
		camila.rendir(1, 7.0);
		juan.rendir(1, 8.0);
		
		
		assertEquals(1, pb1.calcularLaCantidadDeAprobados());
	}

}
