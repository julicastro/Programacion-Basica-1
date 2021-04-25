package ar.edu.unlam.tp9;

public class PruebaSistema {
	public static void main(String[] args) {
		Sistema UNLAM = new Sistema();
		Usuario usuarioUno = new Usuario("perez", "carlos");
		Usuario usuarioDos = new Usuario("rodriguez", "luis");
		Usuario usuarioTres = new Usuario("montes", "roberto");
		Usuario usuarioCuatro = new Usuario("gonzales", "federico");
		Usuario usuarioCinco = new Usuario("nunez", "jose");
		boolean salir = false;
		do {
			UNLAM.mostarMenu();
			switch(UNLAM.seleccionarOpcion()) {
				case 1: 
					UNLAM.ingresoDelNombreDelSistema();
					break;
				case 2 : 
					UNLAM.cuantosUsuarioAIngresar();
					System.out.println("se pudo ingresar usuario "+ usuarioUno.getNombre()+ " " + UNLAM.IngresoDeUsuario(usuarioUno));
					System.out.println("se pudo ingresar usuario "+ usuarioDos.getNombre()+ " " + UNLAM.IngresoDeUsuario(usuarioDos));
					System.out.println("se pudo ingresar usuario "+ usuarioTres.getNombre()+ " " + UNLAM.IngresoDeUsuario(usuarioTres));
					System.out.println("se pudo ingresar usuario "+ usuarioCuatro.getNombre()+ " " + UNLAM.IngresoDeUsuario(usuarioCuatro));
					System.out.println("se pudo ingresar usuario "+ usuarioCinco.getNombre()+ " " + UNLAM.IngresoDeUsuario(usuarioCinco));
					break;
				case 3 :
					System.out.println("Inicio cesion " + UNLAM.loguearUsuario());
					break;
				case 4 :
					salir = true;
					System.out.println("Saliendo...");
					break;
				default :
				System.out.println("error");
			}	
		}while (salir != true);
		
	}

}
