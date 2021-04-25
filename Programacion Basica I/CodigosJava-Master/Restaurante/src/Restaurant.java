

public class Restaurant {
	Mozo mozosDelRestaurant[];
	Plato platosDelRestaurant[];
	Mesa mesasDelRestaurant[][];
	String nombre;
	
	public Restaurant(String nombre) {
		this.nombre = nombre;
		platosDelRestaurant = new Plato[3];
		mozosDelRestaurant = new Mozo[5];
		mesasDelRestaurant = new Mesa[5][5];
		limpiarArray();
		limpiarMatriz();
	} 
	
	public boolean agregarMozo(Mozo nuevo) {
		
		for (int i = 0; i < mozosDelRestaurant.length; i++) {
			if (mozosDelRestaurant[i] == null) {
				mozosDelRestaurant[i] = nuevo;
				return true;
			}

		}
		return false;
	}
	
	public Mozo[] getMozosDelRestaurant() {
		return mozosDelRestaurant;
	}
	public void setMozosDelRestaurant(Mozo[] mozosDelRestaurant) {
		this.mozosDelRestaurant = mozosDelRestaurant;
	}
	public Mesa[][] getMesasDelRestaurant() {
		return mesasDelRestaurant;
	}
	public void setMesasDelRestaurant(Mesa[][] mesasDelRestaurant) {
		this.mesasDelRestaurant = mesasDelRestaurant;
	}
	
	public void listadoDePlato () {
		platosDelRestaurant[0] = new Plato ("arroz con pollo" , 150.0);
		platosDelRestaurant[1] = new Plato ("Milanesa" , 100.0);
		platosDelRestaurant[2] = new Plato ("pizza" , 50.5);
		//platosDelRestaurant[3] = new Plato ("helado" , 40.0);
		
	}
	
	public double armarPedido(int codigo , int cantidad){
		double total;
		listadoDePlato();
		total=(platosDelRestaurant[codigo].getPrecioDelPlato()*cantidad);
		return total;
	}
	
	public void limpiarArray(){
		String nombreDelMozo;
		for (int i = 0; i < mozosDelRestaurant.length; i++) {
			mozosDelRestaurant[i]= null;
		}
	}
	public void limpiarMatriz() {
		int contador = 1;
		for (int i = 0; i < mesasDelRestaurant.length; i++) {
			for (int j = 0; j < mesasDelRestaurant.length; j++) {
				mesasDelRestaurant[i][j] = new Mesa(4, contador++);
			}
		}
	}
}
