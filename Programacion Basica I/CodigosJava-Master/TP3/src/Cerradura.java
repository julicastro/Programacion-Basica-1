public class Cerradura{
	
	public int claveDeApertura;
	public int cantidadDeFallosConsecutivosQueLaBloquean;
	public boolean abierto=false;
	public int bloqueada; 
	public boolean puertaBloqueada=false;
		
	public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean){
		this.claveDeApertura=claveDeApertura;
		this.cantidadDeFallosConsecutivosQueLaBloquean=cantidadDeFallosConsecutivosQueLaBloquean;
	}
	public boolean abrir(int clave){
		if(this.abierto==false && this.claveDeApertura==clave && this.puertaBloqueada==false){
			this.abierto=true;
			System.out.println("La cerradura ha sido abierta");
		}else{
			this.abierto=false;
			this.bloqueada++;
			if(this.bloqueada==cantidadDeFallosConsecutivosQueLaBloquean){
				this.puertaBloqueada=true;
				System.out.println("CERRADURA BLOQUEADA");
			}
			System.out.println("Contraseña incorrecta");
		}return this.abierto;
	}
	public void cerrar(){
		if(this.abierto==true){
			this.abierto=false;
			System.out.println("Se ha cerrado la puerta");
		}else{
			System.out.println("La puerta ya esta cerrada");
		}
	}
	public boolean estaAbierta(){
		if(abierto==false){
			System.out.println("No esta abierta");
		}if(abierto==true){
			System.out.println("Esta abierta");
		}return this.abierto;
	}
	public boolean fueBloqueada(){
		if(puertaBloqueada==false){
			System.out.println("No esta bloqueada");
		}if(puertaBloqueada==true){
			System.out.println("Esta bloqueada");
		}return this.puertaBloqueada;
	}
	
}