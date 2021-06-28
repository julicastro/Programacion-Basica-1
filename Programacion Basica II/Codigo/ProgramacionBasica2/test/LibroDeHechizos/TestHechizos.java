package LibroDeHechizos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHechizos {

	@Test
	public void queSePuedaAgregarUnHechizoAlLibroDeHechizos() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Expeliarmus desarme = new Expeliarmus("expeliarmus");
		libro.agregarHechizo(desarme);
		assertEquals(desarme, libro.buscar("expeliarmus"));

	}

	@Test
	public void verSiUnHechizableEstaHechizado() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Expeliarmus desarme = new Expeliarmus("expeliarmus");
		Animal perro = new Animal();
		libro.agregarHechizo(desarme);
		Hechizo hechizoBuscado = libro.buscar("expeliarmus");
		hechizoBuscado.aplicarHechizo(perro);
		assertEquals("Me desarmaron", perro.getEstado());
	}

	@Test
	public void verSiUnHechizableCrece() {
		LibroDeHechizos libro = new LibroDeHechizos();
		Agrandar crecer = new Agrandar("engorgio");
		Mueble mesa = new Mueble();
		libro.agregarHechizo(crecer);
		Hechizo hechizo = libro.buscar("engorgio");
		hechizo.aplicarHechizo(mesa);
		assertEquals("Ahora soy más grande", mesa.getEstado());
	}

}
