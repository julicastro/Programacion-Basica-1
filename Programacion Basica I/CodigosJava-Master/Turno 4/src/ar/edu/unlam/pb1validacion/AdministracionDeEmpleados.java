package ar.edu.unlam.pb1validacion;

import java.util.Scanner;

public class AdministracionDeEmpleados {


	
	public static void main(String[] args) {
		
		//Cree el objeto miCanal de tipo Canal 
		//Y complete el codigo del menu
		Canal miCanal = new Canal("Canal9",200);
		Scanner teclado = new Scanner(System.in);
		
		int opcion=0; 
		do {
		System.out.println("ingrese una opcion");
		System.out.println("1 agregar Empleado ");
		System.out.println("2 Incrementar Sueldo a un empleado");
		System.out.println("3 informa Cantidad De Empleados Que cobran Mas De 50Mil y No Estan Jubilados ");
		
		System.out.println("0 salir");
		opcion =teclado.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("Escriba el codigo del empleado");
			String codigo = teclado.next();
			
			System.out.println("Escriba el nombre del empleado");
			String nombre = teclado.next();
			
			System.out.println("Escriba el apellido del empleado");
			String apellido = teclado.next();
			
			System.out.println("Escriba el sueldo del empleado");
			double salario = teclado.nextDouble();
			
			if(miCanal.agregarPersonal(new Empleado(codigo, nombre, apellido,salario))) {
				System.out.println("Empleado agregado");
			}else {
				System.out.println("No se pudo agregar");
			}		
			//Desarrolle la logica correspondiente para agregar un Empleado
			//Informa si el empleado  se pudo agregar o  no 
			break;
		case 2:
			System.out.println("Escriba el codigo del empleado");
			String codigo2 = teclado.next();
			
			System.out.println("Escriba monto a aumentar");
			double salario2 = teclado.nextDouble();

			double aumento = miCanal.IncrementarSueldoEmpleado(codigo2, salario2);
			
			if(aumento != 0) {
				System.out.println("El nuevo sueldo es" + aumento);
			}else {
				System.out.println("No se pudo aumentar");
			}

			//Desarrolle la logica correspondiente para incrementar el salario de un empleado
			//Para ello debe incresar el codigo del empleado y el monto que le desee Incrementar
			//Ej Si el empleado con codigo  XXX cobra 100 y le incrementa 50 el nuevo sueldo sera 150
			//E informar el nuevo monto del empleado 
			break;

		case 3:
			System.out.println(miCanal.obtenerCantidadDeEmpleadosQuecobranMasDe50MilyNoEstanJubilados());
			//informa Cantidad De Empleados Que cobran Mas De 50Mil y No Estan Jubilados
			break;

		case 0:
			System.out.println("salir");
			break;

			
		default:
			System.out.println("opcion no valida");
			break;
		}
		
		
		}	while (opcion!=0);
		

	
	}

}
