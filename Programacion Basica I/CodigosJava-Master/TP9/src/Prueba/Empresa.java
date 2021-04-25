package Prueba;
	
public class Empresa {
	private String nombre;
	private Producto producto[];
	private Venta ventas[];
	public Empresa(String nombre) {
		this.nombre = nombre;
		producto = new Producto[10];
		ventas = new Venta[10];
		/*
		 * 
		 * Costructor de la clase.
		 */
		

	}
	
	public String getNombre() {
		/*
		 * Devuelve el nombre de la empresa.
		 */
		return nombre;

	}
	
	public void agregarProducto(Producto nuevo) {
		/*
		 * Agrega un producto al catalogo
		 */
		for (int i = 0; i < producto.length; i++) {
			if(producto[i]!=null) {
				producto[i]=nuevo;
			}
		}
	}
	
	public void realizarVenta(Venta nueva) {
		/*
		 * Registra una venta
		 */
		 int contadorDeVentas= 0 ;
	     ventas[contadorDeVentas++]= nueva;

	}
	
	public Producto getProductoPorNombre(String nombreDelProducto) {
		/*
		 * Busca y devuelve un producto basado en su nombre
		 */
		for (int i = 0; i < producto.length; i++) {
			if(producto[i].getDescripcion().equals(nombreDelProducto)) {
				return producto[i];
			}
		}
		return null;

	}
	
	public double getImportePromedioDeVentas() {
		return 0;
		/*
		 * Busca y devuelve un producto basado en su nombre
		 */


	}
	
	public void ordenarLosProductosPorCodigo() {
		/*
		 * Ordena el catalogo de productos por codigo
		 */
		for (int i = 0; i < producto.length; i++) {
			for (int j = 0; j < producto.length; j++) {
				if (producto[j+1]!= null) {
					if (producto[j].getCodigo()<producto[j+1].getCodigo()) {
						Producto aux= producto[j+1];
						producto[j+1] = producto[j];
						producto[j]= aux;
					}
				}
			}
		}

	}
	
	public String toString() {
		/*
		 * Devuelve un listado con el catalogo de productos 
		 */
		String lista = " ";
		lista += getNombre()+" "+getImportePromedioDeVentas() + "\n ";
		return lista;
	}
}
