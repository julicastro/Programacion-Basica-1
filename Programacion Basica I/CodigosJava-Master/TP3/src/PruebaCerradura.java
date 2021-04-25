public class PruebaCerradura{

	public static void main(String args[]){
		
		Cerradura pentagono = new Cerradura(12345,5);
		
	System.out.println(pentagono.estaAbierta());
	System.out.println(pentagono.fueBloqueada());
		
	System.out.println("");

	pentagono.abrir(12345);
	System.out.println(pentagono.estaAbierta());	
		
	System.out.println("");

	pentagono.cerrar();
	System.out.println(pentagono.estaAbierta());		
	
	pentagono.abrir(44444);
	pentagono.abrir(44444);
	pentagono.abrir(44444);
	pentagono.abrir(44444);
	pentagono.abrir(44444);
	
	System.out.println("");
	
	System.out.println(pentagono.fueBloqueada());	
	
	
		
	}

}