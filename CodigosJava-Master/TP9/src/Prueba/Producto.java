package Prueba;

public class Producto {
	/*
	 * Identificar e incorporar los atributos necesarios.
	 */
	private int codigo;
	private String descripcion;
	private double precio;
	public Producto(Integer codigo, String descripcion, double precio) {
		/*
		 * Costructor de la clase.
		 */
		this.codigo =  codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public int getCodigo() {
		/*
		 * Devuelve el codigo del producto.
		 */
		return codigo;

	}

	public String getDescripcion() {
		/*
		 * Devuelve la descripcion del producto.
		 */
		return descripcion;
	}

	public Double getPrecio() {
		/*
		 * Devuelve el precio del producto.
		 */
		return precio;
	}
	
	public String toString() {
		/*
		 * Devuelve la informacion del producto (codigo y descripcion).
		 */
		String lista ="";
		lista += getCodigo() +" "+getDescripcion()+" "+getPrecio() + "\n ";
		return lista;
	}
}
