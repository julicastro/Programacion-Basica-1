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
		 * Las �nicas dos entradas que permiten la visualizaci�n y modificaci�n de
		 * canales son las de �Televisi�n de aire� y �Televisi�n por cable�
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
		 * Las �nicas dos entradas que permiten la visualizaci�n y modificaci�n de
		 * canales son las de �Televisi�n de aire� y �Televisi�n por cable�
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
		 * Es importante se�alar que la cantidad m�xima de canales de la televisi�n
		 * abierta es de 127 mientras que para la televisi�n por cable es de 32767
		 * canales. Sin embargo, al momento de la instanciaci�n de un televisor
		 * determinado, se realiza el proceso de sintonizaci�n. Esto consiste en
		 * determinar el m�ximo canal de aire y el m�ximo canal de cable.
		 */

		byte canalMaximoTvAbierta = 13;
		short canalMaximoTvPorCable = 200;

		Televisor sony = new Televisor(canalMaximoTvAbierta, canalMaximoTvPorCable);

		sony.encenderOApagar();

//		sony.seleccionarEntrada(Televisor.getEntradaTelevisionPorCable());
		// Modificar para que cuando llega al m�ximo empice del inicio.
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
		 * a. encenderOApagar [Bot�n Power]: Invierte el estado del televisor. Si se
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
		 * b. toString [Bot�n Display]: Devuelvo la informaci�n con el estado actual del
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
		 * d. subirOBajarAnalogicamente [+ / - / < / >] Seg�n lo que recibe de par�metro
		 * sube o baja el volumen o de canal: i. �+� Sube el volumen ii. �-� Baja el
		 * volumen iii. �>� Sube de canal iv. �<� Baja de canal
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
		 * e. cambiarDeCanal: Disponible en varios formatos (S�lo disponible para las
		 * entradas de televisi�n de aire o cable): i. [0 � 9] Cambio digital un digito
		 * (recibe el canal deseado) ii. [10+] Cambio digital dos d�gitos (recibe la
		 * decena y la unidad. A partir de ah� construye el canal deseado) iii. [100 +]
		 * Cambio digital tres d�gitos (recibe la centana, la decena y la unidad, a
		 * partir de ah� construye el canal deseado) iv. [1000 +] Cambio digital cuatro
		 * d�gitos (recibe los cuatro d�gitos que formar�n el canal)
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
