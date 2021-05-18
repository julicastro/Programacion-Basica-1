package Facturas;

public class Perfume extends Producto implements ImpuestoQuincePorciento{

	public Perfume(String nombre, Double precio, Integer unidades) {
		super(nombre, precio, unidades);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double aplicarImpuestoDelQuincePorciento() {
		Double impuesto = (this.precioSinImpuesto * 15) / 100;
		this.precioUnitario = this.precioUnitario + impuesto;
		return this.precioUnitario;
	}	
	
}