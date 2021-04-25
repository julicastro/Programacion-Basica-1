package Prueba;

import static org.junit.Assert.*;

import org.junit.Test;


public class Prueba {

	@Test
	public void pruebaGeneral() {
		Empresa samsung = new Empresa("Samsung");
		samsung.agregarProducto(new Producto(90, "S10", 100000.0));
		samsung.agregarProducto(new Producto(20, "Note", 90000.0));
		samsung.agregarProducto(new Producto(10, "Heladera", 80000.0));
		samsung.agregarProducto(new Producto(50, "Televisor", 50000.0));
		
		Venta nueva = new Venta(1000, "Camila");
		nueva.agregarItem(samsung.getProductoPorNombre("S10"));
		nueva.agregarItem(samsung.getProductoPorNombre("Televisor"));
		samsung.realizarVenta(nueva);
		assertEquals(150000.0, nueva.getImporteTotal(), 0.01);
		assertEquals(2, nueva.getCantidadDeProductosComprados());
		
		
		nueva = new Venta(2000, "Celeste");
		nueva.agregarItem(samsung.getProductoPorNombre("Heladera"));
		samsung.realizarVenta(nueva);
		assertEquals(80000.0, nueva.getImporteTotal(), 0.01);
		assertEquals(1, nueva.getCantidadDeProductosComprados());

		nueva = new Venta(3000, "Lucas");
		nueva.agregarItem(samsung.getProductoPorNombre("Note"));
		samsung.realizarVenta(nueva);
		assertEquals(90000.0, nueva.getImporteTotal(), 0.01);
		assertEquals(1, nueva.getCantidadDeProductosComprados());
		
		assertEquals(106666.66, samsung.getImportePromedioDeVentas(), 0.01);
		
		samsung.ordenarLosProductosPorCodigo();
		
		System.out.println(samsung);
	}	

}
