public class Alarma{

	private boolean sensorDeMovimiento;
	private boolean sensorDeContacto;
	private boolean sensorDeSonido;
	private boolean encendida;
	private int codigoDeSeguridad;
	private boolean sonarAlarma;
	
	public Alarma(int codigoDeSeguridad){
		this.codigoDeSeguridad=codigoDeSeguridad;
	}
	
	public void encender(){
		if(this.encendida==false){
		this.encendida=true;
		}
	}
	public void apagar(){
		if(this.encendida==true){
			this.encendida=false;
		}
	}
	public void activarSensores(){
		if(this.encendida==true){
			this.sensorDeContacto=true;
			this.sensorDeMovimiento=true;
			this.sensorDeSonido=true;
			this.sonarAlarma=true;
		}
	}
	public void desactivarSensores(int codigoDeSeguridad){
		if(this.encendida==true && this.codigoDeSeguridad==codigoDeSeguridad){
			this.sensorDeContacto=false;
			this.sensorDeMovimiento=false;
			this.sensorDeSonido=false;
			this.sonarAlarma=false;
		}
	}
	public boolean getSensorSonido(){
		return this.sensorDeSonido;
	}
	public boolean getSensorMovimiento(){
		return this.sensorDeMovimiento;
	}
	public boolean getSensorContacto(){
		return this.sensorDeContacto;
	}
	public boolean getEncendida(){
		return this.encendida;
	}
	public boolean alarma(){
		return this.alarma();
	}
}