package ar.edu.unlam.tp8;
import java.util.Scanner;

public class Password {
	private int longitud = 0;
	private final int LONGITUD_POR_DEFAULT = 8;
	private String contrasena ;
	private int minuscula =0;
	private int mayuscula = 0;
	private int numero = 0;
	
	public Password(int longitud) {
		this.longitud = longitud;
	}
	
	public Password() {
		
	}

	public boolean esFuerte() {
		for(int i = 0 ; i < contrasena.length() ; i++) {
			if (contrasena.charAt(i) >= 48 && contrasena.charAt(i) <= 57) {
				numero ++;
			}else if(contrasena.charAt(i) > 64 && contrasena.charAt(i) < 91 ){
				mayuscula ++;
			}else if(contrasena.charAt(i) > 96 && contrasena.charAt(i) < 123 ) {
				minuscula ++;
			}
		}
		
		if (numero >= 5 && mayuscula >= 2 && minuscula >= 1) {
			return true;
		}else {
			return false;
		}
	}
	

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getConstrasena() {
		return contrasena;
	}

	public void generarPassword() {
		boolean correcto = true;
			Scanner teclado = new Scanner (System.in);
			String contrasenaSinLimite = teclado.nextLine();
				if(contrasenaSinLimite.length() == LONGITUD_POR_DEFAULT || contrasenaSinLimite.length() == longitud) {
					contrasena = contrasenaSinLimite;
				}else {
					do{
						System.out.println("No cumple el requisito de la longitud");
						System.out.println("Reingrese contrasena : ");
						String contrasenaReingreso = teclado.nextLine();
						if(contrasenaReingreso.length() == LONGITUD_POR_DEFAULT ||  contrasenaReingreso.length() == longitud) {
							contrasena = contrasenaReingreso;
							correcto = true;
						}else {
							correcto= false;
						}
					}while(correcto == false);
				}
		}
}
