package finalFebrero;



public class Edificio {
	
	
	private final int CANTIDAD_DE_PISOS = 10;
	private final int CANTIDAD_DE_DEPARTAMENTOS_POR_PISO = 4;

	private String direccion;
	private Departamento[][] departamentos;
	private double gastosComunes;

	public Edificio(String direccion, int cantidadDePisos, int cantidadDeDepartamentosPorPiso) {
		this.direccion = direccion;
		departamentos = new Departamento[cantidadDePisos][cantidadDeDepartamentosPorPiso];
		/* 
		 * El constructor debe generar las acciones necesarias para garantizar el correcto funcionamiento de los objetos de la clase.
		 * 
		 */
	}

	public boolean ingresarDepartamento(int piso, int departamento, Departamento nuevoDepartamento) {
		if(nuevoDepartamento != null) {
			if(piso<=CANTIDAD_DE_PISOS && departamento<=CANTIDAD_DE_DEPARTAMENTOS_POR_PISO) {
				departamentos[piso][departamento]= nuevoDepartamento;
				return true;
			}
			
		}
		return false;
	}
	
	public String toString() {
		
		return "lista de departamentos =" + departamentos + ", direccion = " + direccion + ", gastos = " + gastosComunes;
		/*
		 * Devuelve String con la identificación por departamento y el detalle de su liquidación actual.
		 */
	}
	
	public double getSuperficieTotal() {
            double superficie = 0.0;
		for(int i = 0; i<departamentos.length;i++){
                    for(int j = 0;i<departamentos.length;j++){
                       superficie += this.departamentos[i][j].getSuperficie();
                    }
                }
                return superficie;
		/*
		 * Devuelve la superficie del edificio, que es la sumatoria de la superficie de los departamentos que lo componen
		 */
	}
	
	public void realizarLaLiquidacionDeLasExpensas(double tarifaLuz, double tarifaGas, double tarifaAgua) {
            for(int i = 0; i<departamentos.length;i++){
                    for(int j = 0;i<departamentos.length;j++){
                        if(this.departamentos[i][j]!=null){
                            this.departamentos[i][j].simuladorConsumo();
                        }
                        }
                    }
		/*
		 * Realiza la liquidación de las expensas de la siguiente manera:
		 * 	1. Se simula los consumos por cada departamento (hasta que estén disponibles los sensores)
		 *  2. Se calcula el valor de las expensas por departamento para el periodo actual (se deben enviar los gastos comumnes y la 
		 *  	superficie del edificio)
		 */
	}
	
}
