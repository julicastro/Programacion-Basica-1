package Usuario;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsuarioTest {

	@Test
	public void queLaPasswordIngresadaSeaFuerte() {
		Usuario usuario1 = new Usuario("J34kf32fad35");
		assertTrue(usuario1.esFuerte());
	}	
	
	@Test
	public void queNoHayDosPasswordIguales() {
		Usuario usuario1 = new Usuario("J34kf32fad35");
		Usuario usuario2 = new Usuario("J34kf32fad35");
		assertEquals(usuario1, usuario2);
	}
	
	@Test
	public void queNoSeaFuerteSiNoCumploLosRequisitos() {
		Usuario usuario1 = new Usuario("1111213141245");
		assertFalse(usuario1.esFuerte());
	}

	@Test
	public void siNoTieneMasDeOchoCaracteresNoEsFuerte() {
		Usuario usuario1 = new Usuario("J34k");
		assertFalse(usuario1.esFuerte());
	}
	@Test
	public void siNoTieneUnaMayusculaNoEsFuerte() {
		Usuario usuario1 = new Usuario("asdfdfsd25352efsd");
		assertFalse(usuario1.esFuerte());
	}
	@Test
	public void siNoTieneUnaMinusculaNoEsFuerte() {
		Usuario usuario1 = new Usuario("ASFF23SEGF32F");
		assertFalse(usuario1.esFuerte());
	}
	
	

}