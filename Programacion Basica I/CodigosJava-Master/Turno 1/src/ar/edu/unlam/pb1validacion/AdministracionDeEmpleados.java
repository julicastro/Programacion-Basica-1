package ar.edu.unlam.pb1validacion;



import java.util.Scanner;

public class AdministracionDeEmpleados {

	public static void main(String[] args) {
		
		//Cree el objeto miCanal de tipo Canal 
		//Y complete el codigo del menu
		
		Canal miCanal = new Canal("Canal 1",200);
		
		Scanner teclado = new Scanner(System.in);
		int opcion=0; 
		
		
		String nombre,codigo, apellido;
		double sueldo;
		
		do {
		System.out.println("ingrese una opcion");
		System.out.println("1 agregar Empleado ");
		System.out.println("2 Incrementar Sueldo a un empleado");
		System.out.println("3 informa Cantidad De Empleados Que cobran Mas De 50Mil y No Estan Jubilados ");
		
		System.out.println("0 salir");
		opcion =teclado.nextInt();
		teclado.nextLine();
		
		switch (opcion) {
		case 1:
			//Desarrolle la logica correspondiente para agregar un Empleado
			//Informa si el empleado  se pudo agregar o  no 
			
			System.out.println("Ingrese el codigo de empleado: ");
			codigo = teclado.nextLine();
			
			System.out.println("Ingrese el nombre: ");
			nombre = teclado.nextLine();
			
			System.out.println("Ingrese el apellido: ");
			apellido = teclado.nextLine();
			
			System.out.println("Ingrese el sueldo: ");
			sueldo = teclado.nextDouble();
			
			if(miCanal.agregarPersonal(new Empleado(codigo, nombre, apellido, sueldo)))
				System.out.println("Se ha cargado con exito al empleado.");
			else
				System.out.println("El empleado no cumple con los requerimientos.");
			
			
			
			break;
		case 2:
			//Desarrolle la logica correspondiente para incrementar el salario de un empleado
			//Para ello debe incresar el codigo del empleado y el monto que le desee Incrementar
			//Ej Si el empleado con codigo  XXX cobra 100 y le incrementa 50 el nuevo sueldo sera 150
			//E informar el nuevo monto del empleado 
			
			
			System.out.println("Ingrese el codigo del empleado que desea subir el sueldo: ");
			codigo = teclado.nextLine();
			
			System.out.println("Ingrese el monto a aumentar: ");
			sueldo = teclado.nextInt();
			
			double aumento = miCanal.IncrementarSueldoEmpleado(codigo, sueldo);
			
			if(aumento != 0){
				System.out.println("EL aumento fue de "+aumento);
			}else
				System.out.println("No se ah podido hacer el aumento");
				
			
			break;

		case 3:
			//informa Cantidad De Empleados Que cobran Mas De 50Mil y No Estan Jubilados
			
			System.out.println("La cantidad de empleados que cobran mas de 50mil y no estan jubilados son: ");
			System.out.println(miCanal.obtenerCantidadDeEmpleadosQuecobranMasDe50MilyNoEstanJubilados());
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
