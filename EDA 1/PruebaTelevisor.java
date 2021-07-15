public class PruebaTelevisor{
	
	public static void main (String args[]){
		
	Televisor sony = new Televisor(127, 32767, 1234, 30, 8);
	
	sony.encender();
	System.out.println(sony.encendido());
	
	System.out.println("Televisor encendido: " + sony.encendido());
		
	System.out.println(sony.toString());	
		
	sony.seleccionarEntrada('A');
	System.out.println(sony.toString());	
	sony.seleccionarEntrada('C');
	System.out.println(sony.toString());
	
	
	System.out.println("canal actual: "+ sony.getCanalActual());
	System.out.println("volumen: " + sony.getVolumen());
	
	sony.subirOBajarAnalogicamente('+');
	sony.subirOBajarAnalogicamente('+');
	sony.subirOBajarAnalogicamente('+');
	sony.subirOBajarAnalogicamente('+');
	
	sony.subirOBajarAnalogicamente('>');
	sony.subirOBajarAnalogicamente('>');
	sony.subirOBajarAnalogicamente('>');
	
	System.out.println("canal actual: " + sony.getCanalActual());
	System.out.println("volumen: "+sony.getVolumen());
	
	System.out.println("Canales: ");
	sony.cambiarDeCanal('8');
	sony.cambiarDeCanal('2','3');
	sony.cambiarDeCanal('2','3','4');
	sony.cambiarDeCanal('2','3','4','8');
	
	System.out.println(" ");
	
	System.out.println(" CANALES +18: " + sony.getCanalesParaAdultos());
	System.out.println("CONTROL PARENTAL: " + sony.getControlParentalActivado());
	sony.activarControlParenterla('1','2','3','4');
	System.out.println("CONTROL PARENTAL: " + sony.getControlParentalActivado());
	System.out.println(" CANALES +18: " + sony.getCanalesParaAdultos());
	
	System.out.println(" ");
	
	System.out.println("SILENCIANDO TV: ");
	sony.silenciar();
	System.out.println("VOLUMEN ACTUAL: " + sony.getVolumen());
	sony.subirOBajarAnalogicamente('+');
	sony.subirOBajarAnalogicamente('+');
	sony.subirOBajarAnalogicamente('+');
	System.out.println("VOLUMEN ACTUAL: " + sony.getVolumen());
	
	System.out.println(" ");
	
	sony.volverAlCanalAnterior();
	System.out.println("canal actual: " + sony.getCanalActual());
	
	System.out.println(" ");
	
	System.out.println("TV AIRE: " + sony.getEntradaTelevisionDeAire());
	System.out.println("TV CABLE: " + sony.getEntradaTelevisionPorCable());
	System.out.println("HDMI 1: " + sony.getEntradaHdmi1());
	System.out.println("HDMI 2: " + sony.getEntradaHdmi2());
	System.out.println("USB: " + sony.getEntradaUsb());
	System.out.println("ENTRDA ACTUAL: " + sony.getEntradaActual());
	System.out.println("NRO DE SERIE: " + sony.getNumeroDeSerie());
	

	
	
	}

}