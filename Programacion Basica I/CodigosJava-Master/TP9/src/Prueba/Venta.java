package Prueba;

public class Venta {
	private int dni;
	private Producto ventas[];
	private String nombreDelCliente;
	private double getImporteTotal;
	private int cantidadDeProductosComprados;
		/*
		 * Identificar e incorporar los atributos necesarios.
		 */	
		public Venta(Integer dni, String nombreDelCliente)  {
			/*
			 * Costructor de la clase.
			 */
			this.dni = dni;
			this.nombreDelCliente = nombreDelCliente;
			cantidadDeProductosComprados = 0;
			ventas = new Producto[10];

		}
		
		public int getDni() {
			/*
			 * Devuelve el dni del cliente.
			 */
			return dni;

		}
		
		public String getNombrDelCliente() {
			/*
			 * Devuelve el dni del cliente.
			 */
			return nombreDelCliente;
		}
		
		public void agregarItem(Producto producto) {
			/*
			 * Agrega un producto a la venta
			 */
			boolean sepudo=false;
			 for (int i = 0; i < ventas.length && sepudo==true; i++ ) {
				if (ventas[i]==null) {
					ventas[i]= producto;
					sepudo = true;
					
				}
			}

		}
		
		public int getCantidadDeProductosComprados() {
			/*
			 * Devuelve la cantidad de proctos comprados 
			 */
			return cantidadDeProductosComprados;
		}
		
		public double getImporteTotal() {
			/*
			 * Importe total de la venta o sumatoria del precio del producto
			 */
			return getImporteTotal;

		}
		
		public String toString() {
			/*
			 * Devuelve infomacion de la venta (Nombre del cliente e importe total)
			 */
			String lista ="";
			lista += getNombrDelCliente() +" " + getCantidadDeProductosComprados()+" " + getImporteTotal() + " "+getDni()+"\n "; 
			return lista;
		}
}
