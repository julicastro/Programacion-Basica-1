package ejercitacionPrueba.EjercicioExamenMañana;

public class Propaganda {
	private String CodigoPropaganda;
	private String representante; // nombre del representante
	private int duracion; //Duracion en segundo 
	private int cantidadDeRepetcicionesDiaria;
	private boolean activa;
	
	
	public Propaganda(String codigoPropaganda, String representante, int duracion, int cantidadDeRepetcicionesDiaria) {
		
		CodigoPropaganda = codigoPropaganda;
		this.representante = representante;
		this.duracion = duracion;
		this.cantidadDeRepetcicionesDiaria = cantidadDeRepetcicionesDiaria;
		this.activa=true;
	}

	public String getCodigoPropaganda() {
		return CodigoPropaganda;
	}

	public void setCodigoPropaganda(String codigoPropaganda) {
		CodigoPropaganda = codigoPropaganda;
	}

	public String getRepresentante() {
		return representante;
	}

	public void setRepresentante(String representante) {
		this.representante = representante;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getCantidadDeRepetcicionesDiaria() {
		return cantidadDeRepetcicionesDiaria;
	}

	public void setCantidadDeRepetcicionesDiaria(int cantidadDeRepetcicionesDiaria) {
		this.cantidadDeRepetcicionesDiaria = cantidadDeRepetcicionesDiaria;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}
}
