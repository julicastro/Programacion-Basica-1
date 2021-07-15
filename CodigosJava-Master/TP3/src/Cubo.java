public class Cubo{

	private float longitudLado;
	private float volumen;
	private float superficieCara;
	
	public Cubo(float lado){
		this.longitudLado=lado;
	}
	public float getLongitudLado(){
		return this.longitudLado;
	}
	public void setLongitudLado(float longitudLado){
		this.longitudLado=longitudLado;
	}
	public void setSuperficieCara(float superficieCara){
		this.superficieCara=superficieCara;
	}
	public float getSuperficieCara(){
		return superficieCara;
	}
	public void setVolumen(float volumen){
		this.volumen=volumen;
	}
	public float getVolumen(){
		return volumen;
	}

}