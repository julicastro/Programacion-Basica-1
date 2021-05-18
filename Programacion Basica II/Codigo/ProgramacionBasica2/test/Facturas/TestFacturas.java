package Facturas;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFacturas {

	@Test
	public void queSePuedanCrearTodasLasClases() {
		Producto producto1 = new Articulo("Alfajor", 150.0, 3);
		Producto producto2 = new Perfume("Armani", 1500.0, 3);
		Producto producto3 = new Bebida("Sprite", 70.0, 3);
		Negocio negocio = new Negocio ("Walmart");
		assertNotNull(producto1);
		assertNotNull(producto2);
		assertNotNull(producto3);
		assertNotNull(negocio);
	}

	@Test
	public void queSePuedanAgregarProductosAlNegocio() {
		Producto producto1 = new Articulo("Alfajor", 150.0, 3);
		Producto producto2 = new Perfume("Armani", 1500.0, 3);
		Producto producto3 = new Bebida("Sprite", 70.0, 3);
		Negocio negocio = new Negocio ("Walmart");
		negocio.agregarProdcuto(producto1);
		negocio.agregarProdcuto(producto2);
		negocio.agregarProdcuto(producto3);
		assertNotNull(negocio.getProductos());
	}
	
	@Test
	public void queSePuedaCalcularElPrecioTotalDeUnProductoSinAplicarNingunImpuesto() {
		Producto producto1 = new Articulo("Alfajor", 150.0, 4);
		Double ve = 600.0;
		Double vo = producto1.calcularPrecioTotal();
		assertEquals(ve, vo);
	}

	@Test
	public void queSePuedaAplicarImpuestoDelVeintiunoALosPreciosUnitarios() {
		Producto producto1 = new Articulo("Alfajor", 1000.0, 1);
		Double ve = 1210.0;
		producto1.aplicarImpuestoVeintiunoPorciento();
		Double vo = producto1.getPrecioUnitario();
		assertEquals(ve, vo);
	}
	
	@Test
	public void queSePuedaAplicarAmbosImpuestosAPerfumesYBebidas() {
		Perfume perfume = new Perfume("Armani", 1000.0, 3);
		Bebida bebida = new Bebida("Sprite", 1000.0, 3);
		Double ve = 1360.0;
		perfume.aplicarImpuestoVeintiunoPorciento();
		perfume.aplicarImpuestoDelQuincePorciento();
		bebida.aplicarImpuestoVeintiunoPorciento();
		bebida.aplicarImpuestoDelQuincePorciento();
		Double vo1 = perfume.getPrecioUnitario();
		Double vo2 = bebida.getPrecioUnitario();
		assertEquals(ve, vo1);
		assertEquals(ve, vo2);
	}
	
	@Test
	public void queSeApliquenMalAmbosImpuestos() {
		Perfume perfume = new Perfume("Armani", 1000.0, 3);
		Bebida bebida = new Bebida("Sprite", 1000.0, 3);
		Double ve = 1370.0;
		perfume.aplicarImpuestoVeintiunoPorciento();
		perfume.aplicarImpuestoDelQuincePorciento();
		bebida.aplicarImpuestoVeintiunoPorciento();
		bebida.aplicarImpuestoDelQuincePorciento();
		Double vo1 = perfume.getPrecioUnitario();
		Double vo2 = bebida.getPrecioUnitario();
		assertNotEquals(ve, vo1);
		assertNotEquals(ve, vo2);
	}

	@Test
	public void queSePuedaCalcularElPrecioTotalConLosImpuestosCorrespondientes() {
		Articulo articulo = new Articulo("Alfajor", 1000.0, 3);
		Perfume perfume = new Perfume("Armani", 1000.0, 3);
		Bebida bebida = new Bebida("Sprite", 1000.0, 3);
		// aplicar impuestos
		articulo.aplicarImpuestoVeintiunoPorciento();
		perfume.aplicarImpuestoVeintiunoPorciento();
		perfume.aplicarImpuestoDelQuincePorciento();
		bebida.aplicarImpuestoVeintiunoPorciento();
		bebida.aplicarImpuestoDelQuincePorciento();
		// calcular valor todal por precio unitario
		Double ve1 = 3630.0;
		Double ve2= 4080.0;
		Double ve3 = 4080.0;
		assertEquals(ve1, articulo.calcularPrecioTotal());
		assertEquals(ve2, perfume.calcularPrecioTotal());
		assertEquals(ve3, bebida.calcularPrecioTotal());
	}
	
	@Test
	public void queNoSePuedaCalcularElPrecioTotalConLosImpuestosCorrespondientes() {
		Articulo articulo = new Articulo("Alfajor", 1000.0, 3);
		Perfume perfume = new Perfume("Armani", 1000.0, 3);
		Bebida bebida = new Bebida("Sprite", 1000.0, 3);
		// aplicar impuestos
		articulo.aplicarImpuestoVeintiunoPorciento();
		perfume.aplicarImpuestoVeintiunoPorciento();
		perfume.aplicarImpuestoDelQuincePorciento();
		bebida.aplicarImpuestoVeintiunoPorciento();
		bebida.aplicarImpuestoDelQuincePorciento();
		// calcular valor todal por precio unitario
		Double ve1 = 3670.0;
		Double ve2= 4090.0;
		Double ve3 = 4090.0;
		assertNotEquals(ve1, articulo.calcularPrecioTotal());
		assertNotEquals(ve2, perfume.calcularPrecioTotal());
		assertNotEquals(ve3, bebida.calcularPrecioTotal());
	}

	
	
	
	
}
