public class Televisor{

	private char ENTRADA_TELEVISION_DE_AIRE = 'A';
	private char ENTRADA_TELEVISION_POR_CABLE = 'C';
	private char ENTRADA_HDMI1 = '1';
	private char ENTRADA_HDMI2 = '2';
	private char ENTRADA_USB = 'U';
	
	private short canalDeseado; // es = a canalActual
	private short canalAnterior; 
	private short numeroDeSerie = 0;
	
	private char entrada;
	private short canalDeAire;
	private short canalDeCable;
	private byte volumen; 
	private byte volumenAnterior;
	private boolean encendido;
	private boolean controlParental=false;
	
	private short claveControlParenteral;
	private short canalParaMayoresInicial;
	private short canalParaMayoresFinal;
	
	private short canalMaximoTvAbierta;
	private short canalMaximoTvPorCable;
	
	public Televisor(int canalMaximoTvAbierta, int canalMaximoTvPorCable){
		this.canalMaximoTvAbierta=(byte)canalMaximoTvAbierta;
		this.canalMaximoTvPorCable=(short)canalMaximoTvPorCable;
	}
	public Televisor(int canalMaximoTvAbierta, int canalMaximoTvPorCable, int claveControlParenteral,int canalParaMayoresInicial,int canalParaMayoresFinal){
		this.canalMaximoTvAbierta=(byte)canalMaximoTvAbierta;
		this.canalMaximoTvPorCable=(short)canalMaximoTvPorCable;
		this.claveControlParenteral=(short)claveControlParenteral;
		this.canalParaMayoresInicial=(short)canalParaMayoresInicial;
		this.canalParaMayoresFinal=(short)canalParaMayoresFinal;
		this.canalDeCable=1;
		this.canalDeAire=1;
		this.volumen=0;
	}
	public void encender(){
		this.encendido=true;
	}
	public void apagar(){
		this.encendido=false;
	}
	public String toString(){
		if(encendido==true){
	}return "Canal Actual: " + this.canalDeseado + ", volumen: " + this.volumen + ", Entrada: " + this.entrada + ", Control Parental: " + this.controlParental + ", Canales +18: " + this.canalParaMayoresInicial;
	}
	
	public void seleccionarEntrada(char entrada){
		if(encendido==true){
		switch(entrada){
		case 'A':
			this.ENTRADA_TELEVISION_DE_AIRE=entrada;
			break;
		case 'C':
			this.ENTRADA_TELEVISION_POR_CABLE=entrada;
			break;
		case '1': 
			this.ENTRADA_HDMI1=entrada;
			break;
		case '2':
			this.ENTRADA_HDMI2=entrada;
			break;
		case 'U':
			this.ENTRADA_USB=entrada;
			break;
		default:
			System.out.println("No se ha seleccionado ninguna entrada");
	}}this.entrada=entrada;}
	
	public void subirOBajarAnalogicamente (char caracter) {
		if(encendido==true){
		switch (caracter) {
		case '<':
			if(this.entrada=='A'&& canalDeseado<=127 && canalDeseado>=0) {
				canalDeseado--;
				System.out.println("Canal de aire: "+ canalDeseado);
			}else {System.out.println("No se puede bajar mas");} 
				if(this.entrada=='C' && canalDeseado<=32767 && canalDeseado>=0) {
					canalDeseado--;;
				System.out.println("Canal de cable: "+ canalDeseado);
			} else {System.out.println("No se puede bajar mas");}
				break;
		case '>':
			if(this.entrada=='A'&& canalDeseado<=127) {
				canalDeseado++;
				System.out.println("Canal de aire: "+ canalDeseado);
			}else if(this.entrada=='C' && canalDeseado<=32767) {
				canalDeseado++;
				System.out.println("Canal de cable:  "+ canalDeseado);
				}else{System.out.println("No se puede subir mas");}
		break;
		case '-':
			if(volumen>0)
			volumen--;
			volumenAnterior=volumen;
			System.out.println("Volumen: "+ volumen);
		break;
		case '+':
			if (volumen<100)
			volumen++;
			volumenAnterior=volumen;
			System.out.println("Volumen: "+ volumen);
		break;
	}}}
	
	public void cambiarDeCanal(char canalDeseado){
		if(encendido==true){
		if(this.entrada=='A' || this.entrada == 'C'){	
		short unidad = (short)(canalDeseado - '0');
		this.canalDeseado=(short)(unidad*1);
		System.out.println(this.canalDeseado);
		this.canalDeseado=canalAnterior;
	}}}
	public void cambiarDeCanal(char primerDigito, char segundoDigito){
		if(encendido==true){
		if(this.entrada=='A' || this.entrada == 'C'){	
		short unidad = (short)(segundoDigito - '0');
		short decena = (short)(primerDigito - '0');
		this.canalDeseado=(short)(decena*10 + unidad*1);
		System.out.println(this.canalDeseado);
		this.canalDeseado=canalAnterior;
	}}}
	public void cambiarDeCanal(char primerDigito, char segundoDigito, char tercerDigito){
		if(encendido==true){
		if(this.entrada=='A' || this.entrada == 'C'){	
		short unidad = (short)(tercerDigito - '0');
		short decena = (short)(segundoDigito - '0');
		short centena = (short)(primerDigito - '0');
		this.canalDeseado=(short)(centena*100 + decena*10 + unidad*1);
		System.out.println(this.canalDeseado);
		this.canalDeseado=canalAnterior;
	}}}	
	public void cambiarDeCanal(char primerDigito, char segundoDigito, char tercerDigito, char cuartoDigito){
		if(encendido==true){
		if(this.entrada=='A' || this.entrada == 'C'){	
		short unidad = (short)(cuartoDigito - '0');
		short decena = (short)(tercerDigito - '0');
		short centena = (short)(segundoDigito - '0');
		short milena = (short)(primerDigito - '0');
		this.canalDeseado=(short)(milena*1000 + centena*100 + decena*10 + unidad*1);
		System.out.println(this.canalDeseado);
		this.canalDeseado=canalAnterior;
	}}}	
	public void volverAlCanalAnterior(){
		if(encendido==true){
		if(this.entrada=='A' || this.entrada == 'C'){	
		this.canalDeseado=canalAnterior;
	}}}
	public void silenciar(){
		if(encendido==true){
		this.volumen=0;
		switch(this.volumen){
			case '+':
			this.volumenAnterior++;
			case '-':
			this.volumenAnterior--;
	}}}
	public void activarControlParenterla(char primerDigitoDeLaClave, char segundoDigitoDeLaClave, char tercerDigitoDeLaClave, char cuartoDigitoDeLaClave){
		if(encendido==true){
		if(controlParental==false){
		short unidad = (short)(cuartoDigitoDeLaClave - '0');
		short decena = (short)(tercerDigitoDeLaClave - '0');
		short centena = (short)(segundoDigitoDeLaClave - '0');
		short milena = (short)(primerDigitoDeLaClave - '0');
		this.claveControlParenteral=(short)(milena*1000 + centena*100 + decena*10 + unidad*1);
		if(this.claveControlParenteral==claveControlParenteral){
		this.controlParental=true;
		}}}}
	public void desactivarControlParenterla(char primerDigitoDeLaClave, char segundoDigitoDeLaClave, char tercerDigitoDeLaClave, char cuartoDigitoDeLaClave){
		if(encendido==true){
		if(controlParental==true){
		short unidad = (short)(cuartoDigitoDeLaClave - '0');
		short decena = (short)(tercerDigitoDeLaClave - '0');
		short centena = (short)(segundoDigitoDeLaClave - '0');
		short milena = (short)(primerDigitoDeLaClave - '0');
		this.claveControlParenteral=(short)(milena*1000 + centena*100 + decena*10 + unidad*1);
		if(this.claveControlParenteral==claveControlParenteral){
		this.controlParental=false;
		}}}}
		
	public boolean encendido(){
		return this.encendido;
	}	
		
	public char getEntradaTelevisionDeAire(){
		return this.ENTRADA_TELEVISION_DE_AIRE;
	}	
	public char getEntradaTelevisionPorCable(){
		return this.ENTRADA_TELEVISION_POR_CABLE;
	}
	public char getEntradaHdmi1(){
		return this.ENTRADA_HDMI1;
	}
	public char getEntradaHdmi2(){
		return this.ENTRADA_HDMI2;
	}
	public char getEntradaUsb(){
		return this.ENTRADA_USB;
	}
	public char getEntradaActual(){
		return this.entrada;
	}
	public short getCanalActual(){
		return this.canalDeseado;
	}
	public short getVolumen(){
		return this.volumen;
	}
	public short getNumeroDeSerie(){
		return this.numeroDeSerie;
	}
	public boolean getControlParentalActivado(){
		if(controlParental==false){
			return this.controlParental=false;
		}else
			return this.controlParental=true;
	}
	public short getCanalesParaAdultos(){
		if(this.controlParental==false){
			return this.canalParaMayoresInicial;
		}else
			return this.canalParaMayoresFinal;
	}
	
}	
	

	
	
	
	
	
	
	
	
	
	

	
