package ar.edu.unlam.tp8;

public class PruebaPassword {

	public static void main(String[] args) {
		Password facebook = new Password();
		System.out.println("Ingrese contrasena : ");
		facebook.generarPassword();
		System.out.println("La contrasena es fuerte? : " + facebook.esFuerte());
		
		Password twitter = new Password(8);
		twitter.setLongitud(10);
		System.out.println("La longitud pedida es : " + twitter.getLongitud());
		System.out.println("Ingrese contrasena : ");
		twitter.generarPassword();
		System.out.println("La contrasena es fuerte ? " + twitter.esFuerte());
	}

}
