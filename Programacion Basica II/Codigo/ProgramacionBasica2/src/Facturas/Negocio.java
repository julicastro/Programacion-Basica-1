package Facturas;

import java.util.ArrayList;
import java.util.List;

public class Negocio {

	private String nombre;
	private List <Producto> productos;
	private Double precioTotal = 0.0;
	
	public Negocio(String nombre) {
		this.nombre = nombre;
		this.productos = new ArrayList<>();
	}
	
	public void agregarProdcuto(Producto producto) {
		this.productos.add(producto);
	}
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public Double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}
	
	
	
	
	
	
	
	
}
