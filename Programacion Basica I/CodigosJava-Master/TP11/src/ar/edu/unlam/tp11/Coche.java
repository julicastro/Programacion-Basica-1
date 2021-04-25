package ar.edu.unlam.tp11;

public class Coche {
	private String marca;
	private String modelo;
	public Coche (String marca , String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
