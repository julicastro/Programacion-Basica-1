public class PruebaTennis{

	public static void main(String[] args){
		
		PartidoTennis juego = new PartidoTennis(" A "," B ",1,7,2,4,4,2);
				
		System.out.println(juego.primerSet());
		System.out.println(juego.segundoSet());
		System.out.println(juego.tercerSet());
		System.out.println(juego.ganador());
		
	}
}