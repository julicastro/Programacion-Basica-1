package ar.edu.unlam.pb1ae2.dominio;

public class Televisor {

	private static char ENTRADA_TELEVISION_DE_AIRE = 'A';
	private static char ENTRADA_TELEVISION_POR_CABLE = 'C';
	private static char ENTRADA_HDMI1 = '1';
	private static char ENTRADA_HDMI2 = '2';
	private static char ENTRADA_USB = 'U';

	private byte CANAL_MAXIMO_TELEVISION_ABIERTA;
	private short CANAL_MAXIMO_TELEVISION_POR_CABLE;
	private byte CANAL_MINIMO_TELEVISION;

	private final byte VOLUMEN_MINIMO = 0;
	private final byte VOLUMEN_MAXIMO = 100;
	
	private byte volumenActual;
	private byte volumenAnterior;
	
	private short canalActual;
	private short canalAnterior=0;
	
	private char entradaActual;
	
	private boolean encendido;
	
	
	public Televisor(byte canalMaximoTelevisionAbierta, short canalMaximoTelevisionPorCable) {
		this.CANAL_MAXIMO_TELEVISION_ABIERTA=canalMaximoTelevisionAbierta;
		this.CANAL_MAXIMO_TELEVISION_POR_CABLE=canalMaximoTelevisionPorCable;
	}

	public void encender(){
		this.encendido=true;
	}
	public void apagar(){
		this.encendido=false;
	}
	
	public void seleccionarEntrada(char entrada){
		if(encendido==true){
		switch(entrada){
		case 'A':
			this.ENTRADA_TELEVISION_DE_AIRE=entradaActual;
			break;
		case 'C':
			this.ENTRADA_TELEVISION_POR_CABLE=entradaActual;
			break;
		case '1': 
			this.ENTRADA_HDMI1=entradaActual;
			break;
		case '2':
			this.ENTRADA_HDMI2=entradaActual;
			break;
		case 'U':
			this.ENTRADA_USB=entradaActual;
			break;
		default:
			System.out.println("No se ha seleccionado ninguna entrada");
	}}this.entradaActual=entrada;}
	
	public void subirOBajarAnalogicamente (char caracter) {
		if(encendido==true){
		switch (caracter) {
		case '<':
			if(this.entradaActual=='A'&& canalActual<=CANAL_MAXIMO_TELEVISION_ABIERTA && canalActual>=CANAL_MINIMO_TELEVISION) {
				canalActual--;
				System.out.println("Canal de aire: "+ canalActual);
			}else {System.out.println("No se puede bajar mas");} 
				if(this.entradaActual=='C' && canalActual<=CANAL_MAXIMO_TELEVISION_POR_CABLE && canalActual>=CANAL_MINIMO_TELEVISION) {
					canalActual--;
				System.out.println("Canal de cable: "+ canalActual);
			} else {System.out.println("No se puede bajar mas");}
				break;
		case '>':
			if(this.entradaActual=='A'&& canalActual<=CANAL_MAXIMO_TELEVISION_ABIERTA) {
				canalActual++;
				System.out.println("Canal de aire: "+ canalActual);
			}else if(this.entradaActual=='C' && canalActual<=CANAL_MAXIMO_TELEVISION_POR_CABLE) {
				canalActual++;
				System.out.println("Canal de cable:  "+ canalActual);
				}else{System.out.println("No se puede subir mas");}
		break;
		case '-':
			this.volumenAnterior=this.volumenActual;
			if (volumenActual>=VOLUMEN_MINIMO){
				this.volumenActual--;
				System.out.println(volumenActual);
			if(volumenActual<=VOLUMEN_MINIMO) {
				System.out.println("No se puede bajar mas");
				
			}}
			break;
		case '+':
			this.volumenAnterior=this.volumenActual;
			if (volumenActual<=VOLUMEN_MAXIMO){
				this.volumenActual++;
				System.out.println(volumenActual);
			if(volumenActual>=VOLUMEN_MAXIMO) {
				System.out.println("No se puede subir mas");
			}
			break;
			}}}}
	
	public void cambiarDeCanal(char primerDigito, char segundoDigito, char tercerDigito, char cuartoDigito){
		if(encendido==true && this.entradaActual=='A'){
		short unidad = (short)(cuartoDigito - '0');
		short decena = (short)(tercerDigito - '0');
		short centena = (short)(segundoDigito - '0');
		short milena = (short)(primerDigito - '0');
		this.canalActual=(short)(milena*1000 + centena*100 + decena*10 + unidad*1);
		if(canalActual<=CANAL_MAXIMO_TELEVISION_ABIERTA) {
		System.out.println(this.canalActual);
		}else
		System.out.println("No se puede cambiar a ese canal");
	}}

	public short getCanalActual(){
		if(this.canalActual<=CANAL_MAXIMO_TELEVISION_ABIERTA) {
			return this.canalActual;
		}else
			return this.canalActual=0;
		
	}
	
	public short getVolumen(){
		return this.volumenActual;
	}
	
	public short getVolumenAnterior(){
		return this.volumenAnterior;
	}
	
}	
	

