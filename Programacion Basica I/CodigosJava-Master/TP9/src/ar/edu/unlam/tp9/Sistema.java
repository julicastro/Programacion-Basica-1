package ar.edu.unlam.tp9;
import java.util.Scanner;
public class Sistema {
	private String contrasenaLogin , usuarioLogin ;
	private int cantidadUsuario=0;
	private int usuarioAIngresar=0;
	private Usuario usuarios [];
	Scanner teclado = new Scanner(System.in);
	private String nombre;
	
	public Sistema() {
	}
	public void ingresoDelNombreDelSistema() {
		System.out.println("Ingrese el nombre del sistema");
		teclado.nextLine();
		nombre = teclado.nextLine();
	}
	
	
	public boolean IngresoDeUsuario(Usuario usuarioNuevo) {
		for (int i = 0; i < usuarios.length; i++) {
			if(usuarios[i] == null) {
				usuarios[i] = usuarioNuevo;
				return true;
			}
		}
		return false;
	}
	
	public int cuantosUsuarioAIngresar() {
		System.out.println("Cuantos usuarios va a ingresar? ");
		usuarioAIngresar = teclado.nextInt();
		usuarios = new Usuario [usuarioAIngresar];
		return usuarioAIngresar;
	}
	
	public boolean loguearUsuario() {
		
	    System.out.println("Ingrese Usuario");
	    usuarioLogin = teclado.next();
	    System.out.println("Ingrese contrasena");
	    contrasenaLogin = teclado.next();
	    for (int i = 0; i < usuarios.length; i++) {
	    	if(usuarios[i] != null) {
	    		if(usuarioLogin.equals(usuarios[i].getNombre()) && contrasenaLogin.equals(usuarios[i].getContrasena())){
	    			return true;
	    		}
	    	}	
		}
	    return false;
	}
	
	public void mostarMenu() {
		System.out.println("1 - Ingresar nombre del Sistema.");
		System.out.println("2 - Agregar usuario nuevo.");
		System.out.println("3 - Loguearte al sistema.");
		System.out.println("4 - Salir.");
	}
	
	public int seleccionarOpcion() {
		int opcionSelecionada = 0;
		opcionSelecionada = teclado.nextInt();
		while(opcionSelecionada > 4 || opcionSelecionada < 0) {
			System.out.println("error , ingrese nuevamente");
			opcionSelecionada =  teclado.nextInt();
		}
		return opcionSelecionada;
	}
	
}
