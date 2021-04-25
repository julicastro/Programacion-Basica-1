package ar.edu.unlam.tp9;
import java.util.Scanner;
public class Usuario {
	Scanner teclado = new Scanner(System.in);
	private String nombre;
	private String contrasena;
	public Usuario(String nombre , String contrasena) {
		this.nombre  = nombre;
		this.contrasena = contrasena;
	}
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	public String getNombre() {
		return nombre;
	}
	public String getContrasena() {
		return contrasena;
	}

}
