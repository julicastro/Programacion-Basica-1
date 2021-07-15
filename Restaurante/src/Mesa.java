

public class Mesa {
	private int capacidad;
	private boolean disponibilidad ;
	private int numeroDeMesa;
	

	private double consumoTotal;
	
	public Mesa(int capacidad, int numeroDeMesa) {
		this.capacidad = capacidad;
		this.numeroDeMesa = numeroDeMesa;
		disponibilidad = true;
	}
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public int getNumeroDeMesa() {
		return numeroDeMesa;
	}
	public double getConsumoTotal() {
		return consumoTotal;
	}
	public void setConsumoTotal(double consumoTotal) {
		this.consumoTotal = consumoTotal;
	}

	public void setNumeroDeMesa(int numeroDeMesa) {
		this.numeroDeMesa = numeroDeMesa;
	}

	
	
	
}
