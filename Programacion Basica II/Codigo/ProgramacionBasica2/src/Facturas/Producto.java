package Facturas;

public class Producto {

	protected String nombreProducto;
	protected Double precioUnitario;
	protected Integer unidades;
	protected Double precioTotal;
	protected Double precioSinImpuesto;
	
	public Producto(String nombre, Double precio, Integer unidades) {
		this.nombreProducto = nombre;
		this.precioUnitario = precio;
		this.precioSinImpuesto = this.precioUnitario;
		this.unidades = unidades;
	}
	
	public void aplicarImpuestoVeintiunoPorciento() {
		Double impuesto = (this.precioUnitario * 21) / 100; 
		this.precioUnitario = this.precioUnitario + impuesto;
	}
	
	public Double calcularPrecioTotal() {
		this.precioTotal = this.precioUnitario * this.unidades;
		return this.precioTotal;
	}
	
	
	public Double getPrecioUnitario() {
		return this.precioUnitario; 
	}
	
	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Integer getUnidades() {
		return unidades;
	}

	public void setUnidades(Integer unidades) {
		this.unidades = unidades;
	}
	
	
	
	
}
