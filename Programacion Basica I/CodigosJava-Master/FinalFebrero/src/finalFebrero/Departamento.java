package finalFebrero;

public class Departamento {
	
	private int dniDelPropietario;
	private String nombreDelPropietario;
	private double superficie;
	private int medidorDeAgua;
	private int medidorDeLuz;
	private int medidorDeGas;
	private double deudaExpensas;
	private double importeActual;
	
	public Departamento(int dniDelPropietario, String nombreDelPropietario, double superficie) {
		this.dniDelPropietario = dniDelPropietario;
		this.nombreDelPropietario = nombreDelPropietario;
		this.superficie = superficie;
	}
	
	public String toString() {
		
		return "propietario = " + this.nombreDelPropietario + ", deuda acomulada = " + this.deudaExpensas + ", Importe del período actual = "
				+ this.importeActual;
		/*
		 * Devuelve el detalle de un departamento:
		 * 		a. Identificación del propietario.
		 * 		b. Deuda acumulada.
		 * 		c. Importe del período actual.
		 */
	}
	
	private void calcularValorExpensasParaElPeriodoActual(double gastosComunes, double superficieEdificio, double tarifaLuz, double tarifaGas, double tarifaAgua) {
                double gastos = (this.superficie*100) / superficieEdificio;
		double porcentaje = gastos / 100;
		gastosComunes = superficie * porcentaje;
		double luz = tarifaLuz * medidorDeLuz;
		double gas = tarifaGas * medidorDeGas;
		double agua = tarifaAgua * medidorDeAgua;
		double servicios = luz + gas + agua;
		double expensas = gastosComunes + servicios;
		importeActual = expensas;
                
                
		/*
		 * Calcula las expensas para el periodo actual. El cálculo se obtiene de la sumatoria de los siguientes conceptos:
		 * 	a. Gastos comunes: Son los gastos a repartir por el conjunto del edificio. Cada departamento debe pagar un porcentaje 
		 * equivalente al porcentaje de la superficie del departamento en relación a la superficie del edificio. Por ejemplo:
		 * 			Para un edificio de 1000 m2, con 5000 pesos de gastos comunes;
			 * 			El departamento 'a' tiene 100 m2 (10% de la superficie del edificio), debe pagar 500 pesos
			 * 			El departamento 'b' tiene 200 m2 (20% de la superficie del edificio), debe pagar 1000 pesos
			 * 			El departamento 'c' tiene 700 m2 (70% de la superficie del edificio), debe pagar 3500 pesos
		 *  b. Servicios:
		 *  	Luz: Es el resultado de multiplicar la tarifa de luz por el consumo que se obtiene del medidor de luz
		 *  	Gas: Es el resultado de multiplicar la tarifa de gas por el consumo que se obtiene del medidor de gas
		 *  	Agua: Es el resultado de multiplicar la tarifa de agua por el consumo que se obtiene del medidor de agua
		 */		
	}
	
	public void resetearMedidores() {
                this.medidorDeAgua = 0;
		this.medidorDeGas = 0;
		this.medidorDeLuz = 0;
		/*
		 * Una vez liquidadas las expensas de un mes, se reinicia el contador de los medidores hasta el mes próximo
		 */
	}
	
	public void simuladorConsumo() {
		int min = 100;
		int max = 10000;
		medidorDeAgua = (int) Math.floor(Math.random()*(min-max+1)+max);	
		medidorDeLuz = (int) Math.floor(Math.random()*(min-max+1)+max);	
		medidorDeGas = (int) Math.floor(Math.random()*(min-max+1)+max);	
		
		/*
		 * Este método permite simular los consumos de luz, gas y agua hasta que se conecten los sensores correspondientes.
		 * Se deben generar valores aleatorios entre 100 y 10.000 (según unidad de medida) para cada uno de los medidores.
		 */
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	
	
	
	
	
	
}