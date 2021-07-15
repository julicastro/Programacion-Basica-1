package ar.edu.unlam.pb1ae2.dominio;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.Scanner;

import org.junit.Test;

import ar.edu.unlam.pb1ae2.presentacion.Televisor;

public class TelevisorTest {


	@Test
	public void testQueCambiaCanal() {
		/*
		 * Las únicas dos entradas que permiten la visualización y modificación de
		 * canales son las de “Televisión de aire” y “Televisión por cable”
		 */

		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;
		int canalActual = 0;
		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		sony.encenderOApagar();
		
		char primerDigito = '0';
		char segundoDigito= '1';
		char tercerDigito = '0';
		char cuartoDigito = '0';
		sony.cambiarDeCanal(primerDigito, segundoDigito, tercerDigito, cuartoDigito);
		assertEquals(100, sony.getCanalActual());
	}

	
	@Test
	public void testNoCambiaCanalSiSuperaELCanalMaximos() {
		/*
		 * Las únicas dos entradas que permiten la visualización y modificación de
		 * canales son las de “Televisión de aire” y “Televisión por cable”
		 */

		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;
		int canalEsperado = 11;
		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);
		sony.encenderOApagar();
		
		char primerDigito = '0';
		char segundoDigito = '0';
		char tercerDigito = '1';
		char cuartoDigito = '1';
		
		sony.cambiarDeCanal(primerDigito, segundoDigito, tercerDigito, cuartoDigito);
		 primerDigito = '0';
		 segundoDigito = '2';
		 tercerDigito = '0';
		 cuartoDigito = '1';
		
//		sony.seleccionarEntrada(sony.getEntradaTelevisionPorCable());
		
		sony.cambiarDeCanal(primerDigito, segundoDigito, tercerDigito, cuartoDigito);
		
		assertEquals(canalEsperado, sony.getCanalActual());
	}

	@Test
	public void testCanalesMaximos() {
		/*
		 * Es importante señalar que la cantidad máxima de canales de la televisión
		 * abierta es de 127 mientras que para la televisión por cable es de 32767
		 * canales. Sin embargo, al momento de la instanciación de un televisor
		 * determinado, se realiza el proceso de sintonización. Esto consiste en
		 * determinar el máximo canal de aire y el máximo canal de cable.
		 */

		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);

		sony.encenderOApagar();

//		sony.seleccionarEntrada(Televisor.getEntradaTelevisionPorCable());
		// Modificar para que cuando llega al máximo empice del inicio.
		for (int i = 0; i < 200; i++) {
			sony.subirOBajarAnalogicamente('>');
		}
		assertEquals(canalMaximoTvPorCable, sony.getCanalActual());
	}

	@Test
	public void testLimitesVolumen() {

		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);

		sony.encenderOApagar();



		for (int i = 0; i < 200; i++) {
			sony.subirOBajarAnalogicamente('+');
		}
		assertEquals(100, sony.getVolumenActual());

		for (int i = 400; i > 0; i--) {
			sony.subirOBajarAnalogicamente('-');
		}
		assertEquals(0, sony.getVolumenActual());
	}


	@Test
	public void testEncender() {
		/*
		 * a. encenderOApagar [Botón Power]: Invierte el estado del televisor. Si se
		 * encuentra apagado, lo enciende, caso contrario lo apaga
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);

		assertFalse(sony.isEncendido());
		sony.encenderOApagar();
		assertTrue(sony.isEncendido());
		sony.encenderOApagar();
		assertFalse(sony.isEncendido());
	}

	@Test
	public void testToString() {
		/*
		 * b. toString [Botón Display]: Devuelvo la información con el estado actual del
		 * televisor
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);

		sony.encenderOApagar();

		assertFalse(sony.toString().startsWith("sony"));
	}



	@Test
	public void testSubirOBajarAnalogicamente() {
		/*
		 * d. subirOBajarAnalogicamente [+ / - / < / >] Según lo que recibe de parámetro
		 * sube o baja el volumen o de canal: i. ‘+’ Sube el volumen ii. ‘-‘ Baja el
		 * volumen iii. ‘>’ Sube de canal iv. ‘<’ Baja de canal
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;
		byte volumenActual;
		short canalActual;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);

		sony.encenderOApagar();


		volumenActual = sony.getVolumenActual();
		canalActual = sony.getCanalActual();
		sony.subirOBajarAnalogicamente('+');
		sony.subirOBajarAnalogicamente('+');
		assertEquals(2, sony.getVolumenActual());
		sony.subirOBajarAnalogicamente('-');
		assertEquals((1), sony.getVolumenActual());

		sony.subirOBajarAnalogicamente('>');
		assertEquals((++canalActual), sony.getCanalActual());
		sony.subirOBajarAnalogicamente('<');
		assertEquals((--canalActual), sony.getCanalActual());
	}

	@Test
	public void testCambiarDeCanalConCuatroDigito() {
		/*
		 * e. cambiarDeCanal: Disponible en varios formatos (Sólo disponible para las
		 * entradas de televisión de aire o cable): i. [0 – 9] Cambio digital un digito
		 * (recibe el canal deseado) ii. [10+] Cambio digital dos dígitos (recibe la
		 * decena y la unidad. A partir de ahí construye el canal deseado) iii. [100 +]
		 * Cambio digital tres dígitos (recibe la centana, la decena y la unidad, a
		 * partir de ahí construye el canal deseado) iv. [1000 +] Cambio digital cuatro
		 * dígitos (recibe los cuatro dígitos que formarán el canal)
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 2000;
		short canalDeseado = 4;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);

		sony.encenderOApagar();



		canalDeseado = (short) 0123;
		sony.cambiarDeCanal('0', '1', '2', '3');
		assertEquals(canalDeseado, sony.getCanalActual());

	}

	@Test
	public void testGetCanalActual() {
		/*
		 * i. Los gets que consideres absolutamente necesario para poder completar el
		 * desarrollo.
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;
		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);

		sony.encenderOApagar();

		assertEquals((short) 0, sony.getCanalActual());
	}

	@Test
	public void testGetVolumenActual() {
		/*
		 * i. Los gets que consideres absolutamente necesario para poder completar el
		 * desarrollo.
		 */
		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;
		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);

		sony.encenderOApagar();

		assertEquals((byte) 0, sony.getVolumenActual());

	}
	
	
	
}
