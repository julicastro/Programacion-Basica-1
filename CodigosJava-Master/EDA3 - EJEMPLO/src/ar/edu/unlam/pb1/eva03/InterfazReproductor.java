package ar.edu.unlam.pb1.eva03;

import java.util.Scanner;

public class InterfazReproductor {
	
	public static void main(String args[]) {
			
	System.out.println("Bienvenido al reproductor de la Unlam");
	Usuario elUsuarioDeEsteDispositivo = new Usuario(null, 0, 0);
	Cancion cancionero[] = obtenerCancionesDisponibles();

	System.out.println("************************");
	System.out.println("Menu de opciones\n");
	System.out.println("1 - Guardar mis datos personales");
	System.out.println("2 - Crear una lista de reproduccion ");
	System.out.println("3 - Agregar canciones a una lista");
	System.out.println("4 - Reproducir una lista");
	System.out.println("9 - Salir");
	System.out.println("************************");
}

public static Cancion[] obtenerCancionesDisponibles() {
	
	Cancion cancionero [] = {new Cancion("Latinoamerica", "Rock", 120, "Calle 13"),
			new Cancion("Latinoamerica", "Rock", 120, "Calle 13"),
			new Cancion("Dime mentiras", "Pop", 85, "Carla Morrison"),
			new Cancion("Antes y Después", "Rock", 63, "Ciro y los Persas"),
			new Cancion("Ala Delta", "Rock", 50, "Divididos"),
			new Cancion("La Rueda Mágica", "Rock", 63, "Fito Paez"),
			new Cancion("Moscas en la casa", "Latino", 94, "Shakira"),
			new Cancion("San Jaureche", "Rock", 122, "Los Piojos"),
			new Cancion("Come As You Are", "Rock", 86, "Nirvana"),
			new Cancion("Una Lady Como tú", "Desconocido", 45, "Manuel Turizo"),
			new Cancion("Smells Like Teen Spirit", "Rock", 93, "Nirvana"),
			new Cancion("Verte Reír", "Rock", 85, "No te va a gustar"),
			new Cancion("Ji Ji Ji", "Rock", 76, "Patricio Rey y sus redonditos de Ricota"),
			new Cancion("Una cervez", "Cumbia", 33, "Ráfaga"),
			new Cancion("La leyenda del Hada", "Rock", 113, "Rata Blanca"),
			new Cancion("Me extrañarás", "Cuarteto ", 85, "Ulises Bueno"),
			new Cancion("Si te vas ", "Latino", 93, "Shakira"),
			new Cancion("Sea of Teeth", "Funk", 85, "Sparkehorse"),
			new Cancion("Hello Sunshine", "Chill Out", 76, "Super Furry Animals"),
			new Cancion("It's not the end of the world", "Chill Out", 90, "Super Furry Animals"),
			new Cancion("No se llama amor", "Rock", 83, "Turf"),
			new Cancion("Pasos al costado", "Rock", 93, "Turf"),
			new Cancion("November Rain", "Rock", 110, "Guns & Roses"),
			new Cancion("Way Back Into Love", "Movies", 90, "Hugh Grant & Drew Barrymore"),
			new Cancion("Auto Rojo", "Retro", 87, "Vilma Palma e Vampiros"),
			new Cancion("Bella", "Pop", 80, "Wolfine"),
			new Cancion("True to Myself", "Reagee", 120, "Ziggy Marley"),
			new Cancion("See Dem Fake Lead", "Reagee", 56, "Ziggy Marley"),
			new Cancion("Casi Nadie", "Rock", 116, "Los Caballeros de la Quema"),
			new Cancion("Sombra de Tí", "Pop", 110, "Shakira"),
			new Cancion("Don't Stop Me Now", "Rock", 116, "Queen"),
			new Cancion("Huelga de Princesas", "Rock", 110, "Los Caballeros de la Quema"),
			};
	
		return cancionero;
	}
}
