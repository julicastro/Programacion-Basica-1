package ar.edu.unlam.pb1ae2.presentacion;

public class Televisor {

	private static final char ENTRADA_TELEVISION_DE_AIRE = 'A';
//	private static final char ENTRADA_TELEVISION_POR_CABLE = 'C';
//	private static final char ENTRADA_HDMI1 = '1';
//	private static final char ENTRADA_HDMI2 = '2';
//	private static final char ENTRADA_USB = 'U';

	private byte CANAL_MAXIMO_TELEVISION_ABIERTA;
	private short CANAL_MAXIMO_TELEVISION_POR_CABLE;
	private final byte CANAL_MINIMO_TELEVISION = 0;

	private final byte VOLUMEN_MINIMO = 0;
	private final byte VOLUMEN_MAXIMO = 100;
	private boolean encendido;
	private byte volumenActual;
	private byte volumenAnterior;
	private short canalActual;
	private char entradaActual;
	private short canalAnterior;

	public Televisor(byte canalMaximoTelevisionAbierta, short canalMaximoTelevisionPorCable) {

		if (canalMaximoTelevisionAbierta > 0 && canalMaximoTelevisionAbierta < 128) {
			CANAL_MAXIMO_TELEVISION_ABIERTA = canalMaximoTelevisionAbierta;
		} else {
					CANAL_MAXIMO_TELEVISION_ABIERTA = 0;
				}
		if (canalMaximoTelevisionPorCable > 0 && canalMaximoTelevisionPorCable < 32768) {
			CANAL_MAXIMO_TELEVISION_POR_CABLE = canalMaximoTelevisionPorCable;
		} else {
					this.CANAL_MAXIMO_TELEVISION_POR_CABLE = 0;
				}
	}
	
	public void encenderOApagar(){
		this.encendido =! this.encendido;
	}
	
	public void seleccionarEntrada (char entradaDeseada){
		if(encendido == true){
			switch (entradaDeseada){
			case 'A' :
				entradaActual = ENTRADA_TELEVISION_DE_AIRE;
				break;
			}
		}
	}
	
	public void subirOBajarAnalogicamente(char operacion){
		if(encendido == true){
			switch (operacion){
			case '+':
				if(volumenActual>=VOLUMEN_MINIMO && volumenActual<VOLUMEN_MAXIMO){
					volumenActual = ++volumenActual;
				}
				break;
			case '-':
				if(volumenActual>=VOLUMEN_MINIMO && volumenActual<=VOLUMEN_MAXIMO){
					volumenActual = --volumenActual;
				}
				break;
			case '>':
				canalAnterior = canalActual;
				canalActual ++;
				break;
			case '<':
				canalAnterior = canalActual;
				canalActual -- ;
				break;

			}
		}
	}

	private short convertirAShort(char primerDigito, char segundoDigito, char tercerDigito, char cuartoDigito) {
		final short MILENA = 1000;
		final short CENTENA = 100;
		final short DECENA = 10;

		short claveRecibida = (short) ((short) (convertirAShort(primerDigito) * MILENA)
				+ (short) (convertirAShort(segundoDigito) * CENTENA) + (short) (convertirAShort(tercerDigito) * DECENA)
				+ (short) (convertirAShort(cuartoDigito)));

		return claveRecibida;
	}

	private short convertirAShort(char primerDigito, char segundoDigito, char tercerDigito) {
		final short CENTENA = 100;
		final short DECENA = 10;

		short claveRecibida = (short) ((short) (convertirAShort(primerDigito) * CENTENA)
				+ (short) (convertirAShort(segundoDigito) * DECENA) + (short) (convertirAShort(tercerDigito)));

		return claveRecibida;
	}

	private short convertirAShort(char primerDigito) {
		final short DECENA = 10;
		final short ASCII_CERO = 48;
		short claveRecibida = (short) (((short) primerDigito) - ASCII_CERO);
		return claveRecibida;
	}

	public void cambiarDeCanal(char primerDigito, char segundoDigito, char tercerDigito, char cuartoDigito) {
		if(encendido == true){
			canalAnterior = canalActual;
			short canalCambiado = convertirAShort(primerDigito, segundoDigito, tercerDigito, cuartoDigito);
			if (canalCambiado <= CANAL_MAXIMO_TELEVISION_ABIERTA && canalCambiado >= CANAL_MINIMO_TELEVISION) {
				this.canalActual = canalCambiado;
			}
		}
	}
	
	public boolean isEncendido () {
		if (encendido == true) {
			return true;
		}else {
			return false;
		}
	}
	
	public short getCanalActual() {
		return canalActual;
	}
	
	public byte getVolumenActual() {
		return volumenActual;
	}

	public byte getVOLUMEN_MAXIMO(){
		return VOLUMEN_MAXIMO;
	}

	public byte getVOLUMEN_MINIMO(){
		return VOLUMEN_MINIMO;
	}	

}