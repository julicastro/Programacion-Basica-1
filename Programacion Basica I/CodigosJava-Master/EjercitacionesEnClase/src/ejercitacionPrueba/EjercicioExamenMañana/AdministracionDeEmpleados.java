package ejercitacionPrueba.EjercicioExamenMañana;

import java.util.Scanner;

public class AdministracionDeEmpleados {

	public static void main(String[] args) {
		// Cree el objeto miCanal de tipo Canal
		// Y complete el codigo del menu
		Canal canalTelefe = new Canal("Canal telefe", 100); 
		Scanner teclado = new Scanner(System.in);
		int opcion = 0;
		do {
			System.out.println("ingrese una opcion");
			System.out.println("1 agregar Empleado ");
			System.out.println("2 Incrementar Sueldo a un empleado");
			System.out.println("3 informa Cantidad De Empleados Que cobran Mas De 50Mil y No Estan Jubilados ");

			System.out.println("0 salir");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				agregarEmpleado(canalTelefe);
				// Desarrolle la logica correspondiente para agregar un Empleado
				// Informa si el empleado se pudo agregar o no
				break;
			case 2:
				aumentarSalario(canalTelefe);
				// Desarrolle la logica correspondiente para incrementar el salario de un
				// empleado
				// Para ello debe incresar el codigo del empleado y el monto que le desee
				// Incrementar
				// Ej Si el empleado con codigo XXX cobra 100 y le incrementa 50 el nuevo sueldo
				// sera 150
				// E informar el nuevo monto del empleado
				break;

			case 3:
				System.out.println(canalTelefe.obtenerCantidadDeEmpleadosQuecobranMasDe50MilyNoEstanJubilados());
				// informa Cantidad De Empleados Que cobran Mas De 50Mil y No Estan Jubilados
				break;

			case 0:
				System.out.println("salir");
				break;

			default:
				System.out.println("opcion no valida");
				break;
			}

		} while (opcion != 0);

	}
	
	public static void agregarEmpleado(Canal canalIngresado) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese codigo del empleado : ");
		String codigoEmpleado = teclado.nextLine();
		System.out.println("Ingrese el nombre: ");
		String nombre = teclado.nextLine();
		System.out.println("Ingrese el apellido: ");
		String apellido = teclado.nextLine();
		System.out.println("Ingrese el sueldo: ");
		double sueldo = teclado.nextDouble();
		Empleado nuevo = new Empleado(codigoEmpleado, nombre, apellido, sueldo);
		if(canalIngresado.agregarPersonal(nuevo)) {
			System.out.println("Se pudo agregar personal");
		}else {
			System.out.println("No se pudo agregar");
		}
	}
	
	public static void aumentarSalario(Canal canalIngresado) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el codigo del empleado: ");
		String codigoDeEmpelado = teclado.nextLine();
		System.out.print("Ingrese el monto a incrementar: ");
		double montoAaumentar = teclado.nextDouble();
		System.out.println(canalIngresado.IncrementarSueldoEmpleado(codigoDeEmpelado, montoAaumentar));
	}

}
