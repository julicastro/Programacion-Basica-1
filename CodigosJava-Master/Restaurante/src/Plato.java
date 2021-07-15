

public class Plato {
	private String nombreDelPlato;
	private double precioDelPlato;
	
	public Plato(String nombreDelPlato , double precioDelPlato) {
		this.nombreDelPlato = nombreDelPlato;
		this.precioDelPlato = precioDelPlato;
	}

	public String getNombreDelPlato() {
		return nombreDelPlato;
	}

	public void setNombreDelPlato(String nombreDelPlato) {
		this.nombreDelPlato = nombreDelPlato;
	}

	public double getPrecioDelPlato() {
		return precioDelPlato;
	}

	public void setPrecioDelPlato(double precioDelPlato) {
		this.precioDelPlato = precioDelPlato;
	}
	
	
}
