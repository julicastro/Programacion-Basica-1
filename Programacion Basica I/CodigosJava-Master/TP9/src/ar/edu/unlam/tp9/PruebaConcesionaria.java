package ar.edu.unlam.tp9;

public class PruebaConcesionaria {

	public static void main(String[] args) {
		Concesionaria luxcar = new Concesionaria("luxcar" , 100);
		Coche bmw =  new Coche("bmw","318");
		Coche fiat =  new Coche("fiat","uno");
		Coche ford =  new Coche("ford","focus");
		Coche vw =  new Coche("vw","gol");
		System.out.println(luxcar.agregarVehiculo(bmw));
		System.out.println(luxcar.agregarVehiculo(fiat));
		System.out.println(luxcar.agregarVehiculo(ford));
		System.out.println(luxcar.agregarVehiculo(vw));
		System.out.println(luxcar.toString());
		System.out.println(luxcar.buscarPorCodigo(1));
	}

}
