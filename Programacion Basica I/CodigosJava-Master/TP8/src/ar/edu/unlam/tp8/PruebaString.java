package ar.edu.unlam.tp8;

public class PruebaString {

	public static void main(String[] args) {
		/*charAt(int index) : devuelve el caracter del indice especificado.
		* equals(String anotherString) : Compara este String con el objeto especificado.
		* equalsIgnoreCase(String anotherString) : Compara dos cadenas entre si pero ignora las mayusculas y minusculas
		* length(); Devuelve la cantidad de caracteres de la cadena.
		* substring(beginIndex, endIndex): Devuelve una nueva cadena que es una subcadena de la cadena.
		* split(String regex):Separa la cadena en distintas expresiones en base a la expresion informada pero con un limite
		* toLowerCase(): Convierte toda la cadena a minusculas usando las reglas locales del sistema
		* toUpperCase(): Convierte toda la cadena a mayusculas usando las reglas locales del sistema
		* trim():	Devuelve una copia de la cadena donde se omiten los espacios
		 */
		String cadena = "Hola";
		System.out.println("El texto a trabajar es " + cadena);
		char a = cadena.charAt(0);
		System.out.println(" " + a);
		char b = cadena.charAt(1);
		System.out.println(" " + b);
		char c = cadena.charAt(2);
		System.out.println(" " + c);
		char d = cadena.charAt(3);
		System.out.println(" " + d);
		
		int cantidad  = cadena.length();
		System.out.println("Cantidad de caracteres es : " + cantidad);
		
		String cadenaMayuscula =cadena.toUpperCase();
		System.out.println("La cadena en mayuscula es " + cadenaMayuscula);
	}
}
