package finalFebrero;


import java.util.Iterator;

import java.util.Scanner;

public class AdministradorDeConsorcios {
	
	private static int CANTIDAD_DE_EDIFICIOS_ADMINISTRADOS = 10;

	public static void main(String[] args) {
		System.out.println("Bienvenido ");
		
		Edificio edificios[] = new Edificio[CANTIDAD_DE_EDIFICIOS_ADMINISTRADOS];

		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
			case 1: 
				registrarNuevoEdificio(edificios);
				break;
			case 2: 
				actualizarDatosDeUnDepartamento(edificios);
				break;
			case 3:
				realizarLaLiquidacionDeLasExpensas(edificios);
				break;
			case 9:
				break;
			default:
				System.out.println("Opción Invalida");
				break;
			}

		} while (opcion != 9);
	}
	
	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada=0;
		
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Registrar nuevo edificio");
		System.out.println("2 - Actualizar datos de un departamento");
		System.out.println("3 - Realizar la liquidación de las expensas");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		
		opcionSeleccionada = teclado.nextInt();
		
		return opcionSeleccionada;
	}
	
	private static void registrarNuevoEdificio(Edificio edificios[]) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese la direccion");
		String direccion = teclado.next();
		System.out.println("Ingrese cantidad de pisos");
		int cantidadDePisos = teclado.nextInt();
		System.out.println("Ingrese cantidadDeDepartamentosPorPiso");
		int cantidadDeDepartamentosPorPiso = teclado.nextInt();
		Edificio nuevo = new Edificio(direccion, cantidadDePisos, cantidadDeDepartamentosPorPiso);
		
            	for(int i = 0;i<edificios.length;i++) {
			if(edificios[i]==null) {
			edificios[i]=nuevo; 
                           System.out.println("se agrego");
                        break;
                         
                   }
			System.out.println("No se agrego");
		}
		
		
		/*
		 * Interfaz de usuario encargada de dar de alta un edificio en el administrador de consorcios  
		 */


	}

	private static void actualizarDatosDeUnDepartamento(Edificio edificios[]) { 
		
		/*
		 * Interfaz de usuario encargada de actualizar los datos de un departamento. Primero se debe seleccionar el edificio deseado, 
		 * luego ingresar el piso y departamento y por último ingresar los datos del departamento 
		 */
		Scanner teclado = new Scanner(System.in);
		
	}
	
	private static void realizarLaLiquidacionDeLasExpensas(Edificio edificios[]) {
                
		
	}
		  

             // realizarLaLiquidacionDeLasExpensas
                
		/*
		 * Interfaz de usuario encargada de liquidar las expensas de un edificio. El proceso consiste en lo siguiente:
		 * 1. Se ingresa el periodo a liquidar
		 * 2. Se debe seleccionar el edificio deseado.
		 * 3. De manera automática se calculan las expensas del edificio. Para eso se deben enviar los valores actualizados de las 
		 * 		tarifas de:
		 * 			a. Luz
		 * 			b. Gas
		 * 			c. Agua
		 * 4. Se muestra por pantalla, en forma de grilla (filas y columnas), el detalle por departamento:
		 * 		a. Identificación del propietario.
		 * 		b. Deuda acumulada.
		 * 		c. Importe del período actual.
		 */
		
	
    }

   
